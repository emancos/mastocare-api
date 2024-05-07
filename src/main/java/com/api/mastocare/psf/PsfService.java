package com.api.mastocare.psf;

import com.api.mastocare.user.User;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PsfService {

    private final PsfRepository repository;
    private final PsfMapper psfMapper;

    public Long create(PsfRequest request, Authentication connectedUser) {
        User user = ((User) connectedUser.getPrincipal());
        Psf psf = psfMapper.toPsf(request);
        psf.setOwner(user);
        return repository.save(psf).getId();
    }

    public PsfResponse findByCnes(String psfCnes) {
        return repository.findByCnes(psfCnes)
                .map(PsfMapper::toPsfResponse)
                .orElseThrow(() -> new EntityNotFoundException("PSF com CNES: " + psfCnes + ", não foi encontrado"));
    }
}
