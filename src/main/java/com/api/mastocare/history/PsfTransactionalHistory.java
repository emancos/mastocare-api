package com.api.mastocare.history;

import com.api.mastocare.common.BaseEntity;
import com.api.mastocare.psf.Psf;
import com.api.mastocare.user.User;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PsfTransactionalHistory extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "psf_id")
    private Psf psf;
    private boolean returned;
    private boolean returnApproved;
}
