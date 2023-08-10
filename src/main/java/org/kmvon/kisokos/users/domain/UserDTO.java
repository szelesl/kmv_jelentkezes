package org.kmvon.kisokos.users.domain;

import lombok.*;

import java.time.OffsetDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public final class UserDTO {
    private String email;
    private String username;
    private OffsetDateTime lastLoginDate;
}
