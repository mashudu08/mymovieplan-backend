package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.BankAccount;
import com.repository.BankAccountRepository;

@Service
public class BankAccountService {
	@Autowired
	private BankAccountRepository ba;
	
	//create
	public BankAccount create(BankAccount bank) {
		return ba.save(bank);
	}
	
	//read all
		public List<BankAccount> read(){
			return ba.findAll();
		}
		
		// read by id
		public BankAccount read(Integer id) {
			Optional<BankAccount> temp = ba.findById(id);
			BankAccount bank = null;
			if(temp.isPresent())
			{
				bank = temp.get();
			}
			return bank;
		}
		
		//update 
		public BankAccount update(BankAccount bank) {
			Optional<BankAccount> temp = ba.findById(bank.getUserId());  
			if(temp.isPresent())
			{
				ba.save(bank);
				return bank;
			}
				return null;
			
		}
		
}
