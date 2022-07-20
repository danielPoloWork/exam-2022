package it.euris.exam.test3.model;

import java.util.ArrayList;
import java.util.List;

public class Account {

    private Customer customer;

    private List<Movement> movementList = new ArrayList<>();
    private long amount = 0;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public List<Movement> getMovementList() {
        return movementList;
    }

    public void setMovementList(List<Movement> movementList) {
        this.movementList = movementList;
    }
}
