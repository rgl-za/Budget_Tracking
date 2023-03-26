package com.budgettracking.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.budgettracking.model.Account;

@Mapper
public interface AccountMapper {

    void addAccount(Account account);

    void updateAccount(Account account);

    void deleteAccount(Long accountId);

    Account getAccountById(Long accountId);

    List<Account> getAccountsByUserId(@Param("userId") Long userId);

}
