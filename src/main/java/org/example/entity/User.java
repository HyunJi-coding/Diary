package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

@Entity
@Table
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User{
    @GeneratedValue
    @Id
    private Long id;
    private String username;
    private String password;
    private String authority;

    public User(
            String username,
            String password,
            String authority
    ) {
        this.username = username;
        this.password = password;
        this.authority = authority;
    }

}
