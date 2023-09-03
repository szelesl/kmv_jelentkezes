package org.kmvon.kisokos.users.domain;

import org.kmvon.kisokos.roles.domain.RoleMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper
public abstract class UserMapper {

    @Autowired
    protected RoleMapper roleMapper;

    @Mapping(target = "role", expression = "java(roleMapper.entityToData(entity.getRole()))")
    public abstract UserDTO entityToData(UserBE entity);
}
