package com.api.mastocare.psf;

import com.api.mastocare.common.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "psfs")
public class Psf extends BaseEntity {

    @Column(nullable = false, unique = true)
    private String cnes;
    @Column(length = 80, nullable = false, unique = true)
    private String name;
}
