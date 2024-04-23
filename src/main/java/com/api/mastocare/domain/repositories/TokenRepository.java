package com.api.mastocare.domain.repositories;

import com.api.mastocare.domain.entities.Token;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TokenRepository extends JpaRepository<Token, Integer> {

    Optional<Token> findByUserToken(String userToken);
}
