package com.api.mastocare.psf;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PsfResponse {

    private Long id;
    private String cnes;
    private String name;
    private String owner;
}
