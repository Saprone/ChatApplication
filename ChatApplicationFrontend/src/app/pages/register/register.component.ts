import { Component } from '@angular/core';
import {RegisterRequest} from "../../models/register-request";
import {AuthenticationResponse} from "../../models/authentication-response";
import {AuthenticationService} from "../../services/authentication.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss']
})
export class RegisterComponent {

  registerRequest: RegisterRequest = {};
  authResponse: AuthenticationResponse = {};
  message = '';

  constructor(private authService: AuthenticationService, private router: Router) {
  }

  registerUser() {
    this.message = '';

    this.authService.register(this.registerRequest)
      .subscribe({
        next: (response) => {
          if (response) {
            this.authResponse = response;
          } else {
            this.message = 'Account created successfully\nYou will be redirected to the Login page in 3 seconds';

            setTimeout(() => {
              this.router.navigate(['login']);
            }, 3000)
          }
        }
      });
  }
}
