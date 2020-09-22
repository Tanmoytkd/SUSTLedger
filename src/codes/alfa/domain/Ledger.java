package codes.alfa.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Ledger {
    private List<Contact> contacts;
    private Map<Contact, Integer> accountBalance;
    private Map<Contact, List<Transaction>> transactions;

    public Ledger() {
        this.contacts = new ArrayList<>();
        this.accountBalance = new TreeMap<>();
        this.transactions = new TreeMap<>();
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public Map<Contact, Integer> getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Map<Contact, Integer> accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Map<Contact, List<Transaction>> getTransactions() {
        return transactions;
    }

    public void setTransactions(Map<Contact, List<Transaction>> transactions) {
        this.transactions = transactions;
    }
}
