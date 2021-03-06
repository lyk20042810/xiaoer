package com.itxiaoer.core.dal.mapper;

import org.apache.ibatis.annotations.Param;

import com.itxiaoer.core.dal.entity.User;

public interface UserMapper extends BaseMapper {

	User loadByNameAndPass(@Param("username") String username, @Param("password") String password);

	User loadByName(@Param("username") String username);

}
