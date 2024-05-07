package com.api.mastocare.psf;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record PsfRequest(
        Long id,
        @NotNull(message = "100")
        @NotEmpty(message = "100")
        String cnes,
        @NotNull(message = "101")
        @NotEmpty(message = "101")
        String name
) {
}
