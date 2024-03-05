package org.example.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class NoteDto {
    private String title;
    private String content;
}