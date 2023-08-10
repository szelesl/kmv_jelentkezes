package org.kmvon.kisokos.users.domain;

import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {
    UserDTO entityToData(UserBE entity);

    UserBE dataToEntity(UserDTO dto);
}
