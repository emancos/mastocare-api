package com.api.mastocare.token;

import com.api.mastocare.token.Token;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TokenRepository extends JpaRepository<Token, Integer> {

    Optional<Token> findByUserToken(String userToken);
}
