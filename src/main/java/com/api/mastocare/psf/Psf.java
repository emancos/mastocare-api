package com.api.mastocare.psf;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.Instant;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "psfs")
@EntityListeners(AuditingEntityListener.class)
public class Psf {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(nullable = false, unique = true)
    private String cnes;
    @Column(length = 80, nullable = false, unique = true)
    private String name;
    @Column(columnDefinition = "boolean default true")
    private  boolean active;
    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private Instant createdAt;
    @UpdateTimestamp
    @Column(insertable = false)
    private Instant updatedAt;
    @CreatedBy
    @Column(nullable = false, updatable = false)
    private Long createdBy;
    @LastModifiedBy
    @Column(insertable = false)
    private Long lastModifieBy;


}
