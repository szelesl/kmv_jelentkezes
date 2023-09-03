package org.kmvon.kisokos.roles.service;

import org.kmvon.kisokos.roles.domain.RoleBE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<RoleBE, Long> {
}
