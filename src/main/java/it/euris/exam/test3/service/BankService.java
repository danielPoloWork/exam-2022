package it.euris.exam.test3.service;

import it.euris.exam.test3.model.Account;

public class BankService {

    public void deposit(Account account, long amount) {
        account.setAmount(account.getAmount() + amount);
    }

    public void withDraw(Account account, long amount) {
        account.setAmount(account.getAmount() - amount);
    }

    public void sendEmail() {
        //write email related logic
        System.out.println("WARNING we are poor");
    }
}