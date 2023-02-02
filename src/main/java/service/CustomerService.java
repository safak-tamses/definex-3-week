package service;

import entity.Bill;
import entity.Customer;
import entity.RegisteredDate;
import repository.CustomerRepository;

import java.util.List;

public class CustomerService {
    public CustomerRepository getCustomerRepository() {
        return customerRepository;
    }

    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void listAllCustomer() {
        List<Customer> temp=customerRepository.listAll();
        for(Customer x:temp){
            System.out.println(x);
        }
    }

    public void createCustomer(String name, String surname, String phone, RegisteredDate date, String address, String sector) {
        Customer c = new Customer(name,surname,phone,date,address,sector);
        customerRepository.saveCustomer(c);
    }

    public void filterByName(String c) {
        List<Customer> temp =customerRepository.filterByName(c);
        for (Customer x:temp){
            System.out.println(x);
        }
    }

    public void filter(RegisteredDate date) {
        List<Customer> temp= customerRepository.filterByDate(date);
        double sumPrice=0;
        for (Customer x:temp){
            sumPrice += x.getCustomerS_bill().stream().mapToDouble(Bill::getPrice).sum();
        }
        System.out.println(sumPrice);
    }
}
