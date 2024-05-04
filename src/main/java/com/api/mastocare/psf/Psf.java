package com.api.mastocare.psf;

import com.api.mastocare.common.BaseEntity;
import com.api.mastocare.history.PsfTransactionalHistory;
import com.api.mastocare.user.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

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
    @OneToMany(mappedBy = "psf")
    private List<User> acs;
    @OneToMany(mappedBy = "psf")
    private List<PsfTransactionalHistory> histories;
}
