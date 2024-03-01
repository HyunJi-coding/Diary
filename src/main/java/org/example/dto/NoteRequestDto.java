package org.example.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class NoteRequestDto {
    private String title;
    private String content;
}