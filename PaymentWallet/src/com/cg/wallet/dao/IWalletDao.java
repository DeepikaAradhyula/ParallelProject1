package com.cg.wallet.dao;

import com.cg.wallet.beans.Account;
import com.cg.wallet.exception.WalletException;

public interface IWalletDao {
	String createAccount(Account acc) throws WalletException;

	double showBalance(String mobileNo) throws WalletException;

	Account deposit(String mobileNo) throws WalletException;

	Account withdraw(String mobileNo) throws WalletException;

	Account printTransactionDetails(String mobileNo) throws WalletException;

}
