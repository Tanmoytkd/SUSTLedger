package codes.alfa.service;

import codes.alfa.domain.Contact;
import codes.alfa.domain.Ledger;
import codes.alfa.domain.Transaction;

import java.util.List;
import java.util.Map;

public class LedgerServiceImpl implements LedgerService {

    @Override
    public void sendMoney(Contact contact, int amount, String description, Ledger ledger) {
        Transaction transaction = new Transaction(amount, contact, description, true);

        Map<Contact, List<Transaction>> contactListMap = ledger.getTransactions();
        List<Transaction> transactionList = contactListMap.get(contact);
        transactionList.add(transaction);
        contactListMap.put(contact, transactionList);

        Map<Contact, Integer> accountBalance = ledger.getAccountBalance();
        int balance = accountBalance.get(contact) - amount;
        accountBalance.put(contact, balance);
    }

    @Override
    public void receiveMoney(Contact contact, int amount, String description, Ledger ledger) {
        Transaction transaction = new Transaction(amount, contact, description, false);

        Map<Contact, List<Transaction>> contactListMap = ledger.getTransactions();
        List<Transaction> transactionList = contactListMap.get(contact);
        transactionList.add(transaction);
        contactListMap.put(contact, transactionList);

        Map<Contact, Integer> accountBalance = ledger.getAccountBalance();
        int balance = accountBalance.get(contact) + amount;
        accountBalance.put(contact, balance);
    }

    @Override
    public int calculateContactBalance(Contact contact, Ledger ledger) {
        Map<Contact, Integer> accountBalance = ledger.getAccountBalance();
        int balance = accountBalance.get(contact);
        return balance;
    }

    @Override
    public Map<Contact, Integer> generateSummary(Ledger ledger) {
        Map<Contact, Integer> summary = ledger.getAccountBalance();
        return summary;
    }
}
