package org.kmvon.kisokos.roles.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.kmvon.kisokos.commons.BaseEntity;
import org.kmvon.kisokos.users.domain.UserBE;

import java.util.Set;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "t_kmv_roles")
public final class RoleBE extends BaseEntity {
    @Column(name = "role_name")
    private String roleName;

    @OneToMany(mappedBy = "role")
    private Set<UserBE> usersOfRole;
}
