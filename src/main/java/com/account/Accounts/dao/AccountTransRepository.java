package com.account.Accounts.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.account.Accounts.model.AccountTransaction;

public interface AccountTransRepository extends JpaRepository<AccountTransaction, Integer>{
	
	@Query("Select a from AccountTransaction a where a.accountNumber=:accountNumber")
	public List<AccountTransaction> getAllTransactionForAccount(@Param("accountNumber") long accountNumber);

}
