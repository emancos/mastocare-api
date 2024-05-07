package com.api.mastocare.psf;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("psfs")
@RequiredArgsConstructor
@Tag(name = "Psf")
public class PsfController {

    private final PsfService service;

    @PostMapping
    public ResponseEntity<Long> createPsf(
            @Valid @RequestBody PsfRequest request,
            Authentication connectedUser
    ) {
        return ResponseEntity.ok(service.create(request, connectedUser));
    }

    @GetMapping("{psf-cnes}")
    public ResponseEntity<PsfResponse> findPsfByCnes(
            @PathVariable("psf-cnes") String psfCnes
    ) {
        return ResponseEntity.ok(service.findByCnes(psfCnes));
    }
}
