package com.cg.wallet.dao;

import java.util.HashMap;

import com.cg.wallet.beans.Account;
import com.cg.wallet.db.WalletDb;
import com.cg.wallet.exception.WalletException;

public class WalletDaoImpl implements IWalletDao {
	private static HashMap<String, Account> walletMap = WalletDb.getWalletMap();

	@Override
	public String createAccount(Account acc) throws WalletException {
		walletMap.put(acc.getMobileNo(), acc);
		return acc.getMobileNo();
	}

	@Override
	public double showBalance(String mobileNo) throws WalletException {
		Account acc = walletMap.get(mobileNo);
		if (acc == null) {
			throw new WalletException("The mobile number does not exist");
		}

		return acc.getBalance();
	}

	@Override
	public Account deposit(String mobileNo) throws WalletException {

		Account acc = walletMap.get(mobileNo);
		if (acc == null) {
			throw new WalletException("The mobile number does not exist");
		}
		return acc;
	}

	@Override
	public Account withdraw(String mobileNo) throws WalletException {
		Account acc = walletMap.get(mobileNo);
		if (acc == null) {
			throw new WalletException("The mobile number does not exist");
		}
		return acc;
	}

	@Override
	public Account printTransactionDetails(String mobileNo)
			throws WalletException {

		Account acc = walletMap.get(mobileNo);
		if (acc == null) {
			throw new WalletException("The mobile number does not exist");
		}
		return acc;
	}

}
