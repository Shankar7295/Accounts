package com.account.Accounts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.account.Accounts.dao.AccountTransRepository;
import com.account.Accounts.dao.AccountsRepository;
import com.account.Accounts.model.Account;
import com.account.Accounts.model.AccountTransaction;

@Service
public class AccountsService {
	
	@Autowired
	AccountsRepository accountsRepository;
	
	@Autowired
	AccountTransRepository accountTransRepository;

	public List<Account> getAllAccounts() {
		
		return accountsRepository.findAll();
	}

	public List<AccountTransaction> getAllTransForAccounts(long accountNumber) {
		
		 return accountTransRepository.getAllTransactionForAccount(accountNumber);
	}

}
