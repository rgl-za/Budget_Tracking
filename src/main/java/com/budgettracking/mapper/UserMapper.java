package com.budgettracking.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.budgettracking.model.User;

@Mapper
public interface UserMapper {

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(Long userId);

    User getUserById(Long userId);

    User getUserByEmail(String email);

    List<User> getAllUsers();

}
