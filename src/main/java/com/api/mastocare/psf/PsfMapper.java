package com.api.mastocare.psf;

import org.springframework.stereotype.Service;

@Service
public class PsfMapper {
    public Psf toPsf(PsfRequest request) {
        return Psf.builder()
                .id(request.id())
                .cnes(request.cnes())
                .name(request.name())
                .active(true)
                .build();
    }

    public static PsfResponse toPsfResponse(Psf psf) {
        return PsfResponse.builder()
                .id(psf.getId())
                .cnes(psf.getCnes())
                .name(psf.getName())
                .owner(psf.getOwner().getName())
                .build();
    }
}
