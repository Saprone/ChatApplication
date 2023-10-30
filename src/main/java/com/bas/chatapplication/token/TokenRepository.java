package com.bas.chatapplication.token;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface TokenRepository extends JpaRepository<Token, Integer> {

    @Query("""
        select token from Token token inner join User user on token.user.id = user.id
        where user.id = :userId and (token.expired = false or token.revoked = false)
    """)
    List<Token> findAllValidTokensByUser(Integer userId);

    Optional<Token> findByToken(String Token);
}
