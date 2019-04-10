package com.sh.doorbell.registerandactivate.dao;

import com.sh.doorbell.registerandactivate.entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    int insert(UserEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    int insertSelective(UserEntity record);

    int updateSelective(UserEntity entity);

    List<UserEntity> selectAll();

    List<UserEntity> selectByMap(HashMap map);

    UserEntity selectById(String id);

    int selectCoutByMap(HashMap map);
}