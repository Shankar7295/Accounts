package com.account.Accounts.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.account.Accounts.model.Account;

public interface AccountsRepository extends JpaRepository<Account, Integer> {

}
