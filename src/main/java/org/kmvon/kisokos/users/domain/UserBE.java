package org.kmvon.kisokos.users.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.kmvon.kisokos.commons.BaseEntity;
import org.kmvon.kisokos.roles.domain.RoleBE;

import java.time.OffsetDateTime;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "t_kmv_users")
public final class UserBE extends BaseEntity {
    @Column(name = "email")
    private String email;

    @Column(name = "last_login_date")
    private OffsetDateTime lastLoginDate;

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    private RoleBE role;

    @Column(name = "password")
    private String password;

    @Column(name = "surname")
    private String surname;

    @Column(name = "last_name")
    private String lastName;
}
