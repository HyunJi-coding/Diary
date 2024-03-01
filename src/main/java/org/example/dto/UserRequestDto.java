package org.example.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserRequestDto {
    private String username;
    private String password;
}
