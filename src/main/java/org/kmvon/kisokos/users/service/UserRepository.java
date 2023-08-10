package org.kmvon.kisokos.users.service;

import org.kmvon.kisokos.users.domain.UserBE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserBE, Long> {
}
