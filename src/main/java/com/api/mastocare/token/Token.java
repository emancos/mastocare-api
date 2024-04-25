package com.api.mastocare.token;

import com.api.mastocare.user.User;
import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Token {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String userToken;
    private Instant createdAt;
    private Instant expiresAt;
    private Instant validateAt;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
