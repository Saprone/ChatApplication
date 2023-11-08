import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {RegisterRequest} from "../models/register-request";
import {AuthenticationResponse} from "../models/authentication-response";
import {VerificationRequest} from "../models/verification-request";

@Injectable({providedIn: 'root'})
export class AuthenticationService {

  private baseUrl = 'http://localhost:8090/api/v1/auth'

  constructor(private http: HttpClient) {
  }

  register(registerRequest: RegisterRequest) {
    return this.http.post<AuthenticationResponse> (`${this.baseUrl}/register`, registerRequest);
  }

  verifyOTPCode(verificationRequest: VerificationRequest) {
    return this.http.post<AuthenticationResponse> (`${this.baseUrl}/verify`, verificationRequest);
  }
}
