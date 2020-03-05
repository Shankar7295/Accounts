package com.account.Accounts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.account.Accounts.model.Account;
import com.account.Accounts.model.AccountTransaction;
import com.account.Accounts.service.AccountsService;

@RestController
public class AccountsController {

	@Autowired
	AccountsService service;
	
	@GetMapping(value="/getAllAccounts")
	public ResponseEntity<List<Account>> getAllAccounts() {
		List<Account> lst = service.getAllAccounts();
		return new ResponseEntity<List<Account>>(lst, HttpStatus.OK);
		
	}
	
	
	@GetMapping(value="/getAllTransForAccounts/{accountNumber}")
	public ResponseEntity<List<AccountTransaction>> getAllTransForAccounts(@PathVariable("accountNumber") long accountNumber) {
		List<AccountTransaction> lst = service.getAllTransForAccounts(accountNumber);
		return new ResponseEntity<List<AccountTransaction>>(lst, HttpStatus.OK);
		
	}
}
