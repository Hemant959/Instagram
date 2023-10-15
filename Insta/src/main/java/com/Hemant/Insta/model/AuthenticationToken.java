package com.Hemant.Insta.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AuthenticationToken {
    @Id
    private Long tokenId;
    private String token;
    private LocalDate tokenCreationDate;
    @OneToOne
    private User user;

    public AuthenticationToken(User existingUser) {
        this.user = user;
        this.token = UUID.randomUUID().toString();
        this.tokenCreationDate = LocalDate.now();
    }

}
