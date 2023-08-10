package org.kmvon.kisokos.users.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.kmvon.kisokos.commons.BaseEntity;

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

    @Column(name = "password")
    private String password;

    @Column(name = "username")
    private String username;
}
