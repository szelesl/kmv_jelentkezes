package org.kmvon.kisokos.users.domain;

import lombok.*;
import org.kmvon.kisokos.roles.domain.RoleDTO;

import java.time.OffsetDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public final class UserDTO {
    private String email;
    private String surname;
    private String lastName;
    private RoleDTO role;
    private OffsetDateTime lastLoginDate;
}
