package com.api.mastocare.psf;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PsfRepository extends JpaRepository<Psf, Long> {

    public Optional<Psf> findByCnes(String psfCnes);
}
