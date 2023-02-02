package repository;

import entity.Customer;
import entity.RegisteredDate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerRepository {
    private final List<Customer> customerList;
    public CustomerRepository() {
        this.customerList = new ArrayList<>();

    }





    public List<Customer> listAll(){
        return customerList;
    }

    public void saveCustomer(Customer c) {
        customerList.add(c);
    }

    public List<Customer> filterByName(String c) {
        return customerList.stream().filter(i->i.getName().contains(c)).collect(Collectors.toList());
    }
    public List<Customer> filterById(int id) {
        return customerList.stream().filter(i->i.getCustomer_id() == id).collect(Collectors.toList());

    }

    public List<Customer> filterByDate(RegisteredDate date) {
        return customerList.stream().filter(i->i.getRegistered_date()==date).collect(Collectors.toList());
    }
}
