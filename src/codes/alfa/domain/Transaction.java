package codes.alfa.domain;

public class Transaction {
    private int amount;
    private Contact contact;
    private String description;

    public Transaction(int amount, Contact contact, String description) {
        this.amount = amount;
        this.contact = contact;
        this.description = description;
    }


    public int getAmount() {
        return amount;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
