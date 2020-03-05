package com.account.Accounts.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class AccountTransaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int accountTransId;
	private long accountNumber;
	private String accountName;
	@JsonFormat(pattern = "MMM.dd,yyyy")
	private Date valueDate;
	private String currency;
	private double debitAmount;
	private double creditAmount;
	private String creitOrDebit;
	private String transNarrative;
	
	
	public int getAccountTransId() {
		return accountTransId;
	}
	public void setAccountTransId(int accountTransId) {
		this.accountTransId = accountTransId;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public Date getValueDate() {
		return valueDate;
	}
	public void setValueDate(Date valueDate) {
		this.valueDate = valueDate;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public double getDebitAmount() {
		return debitAmount;
	}
	public void setDebitAmount(double debitAmount) {
		this.debitAmount = debitAmount;
	}
	public double getCreditAmount() {
		return creditAmount;
	}
	public void setCreditAmount(double creditAmount) {
		this.creditAmount = creditAmount;
	}
	public String getCreitOrDebit() {
		return creitOrDebit;
	}
	public void setCreitOrDebit(String creitOrDebit) {
		this.creitOrDebit = creitOrDebit;
	}
	public String getTransNarrative() {
		return transNarrative;
	}
	public void setTransNarrative(String transNarrative) {
		this.transNarrative = transNarrative;
	}


}
