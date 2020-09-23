package codes.alfa.service;

import codes.alfa.domain.Contact;
import codes.alfa.domain.Ledger;

import java.util.Map;

public interface LedgerService {

    public void sendMoney(Contact contact, int amount, String description, Ledger ledger);

    public void receiveMoney(Contact contact, int amount, String description, Ledger ledger);

    public int calculateContactBalance(Contact contact, Ledger ledger);

    public Map<Contact, Integer> generateSummary(Ledger ledger);

}
