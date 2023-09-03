package org.kmvon.kisokos.roles.domain;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface RoleMapper {
    @Mapping(source = "roleName", target = "name")
    RoleDTO entityToData(RoleBE entity);
}
