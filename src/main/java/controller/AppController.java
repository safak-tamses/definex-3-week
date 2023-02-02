package controller;

import entity.RegisteredDate;
import repository.CustomerRepository;
import service.BillService;
import service.CustomerService;

public class AppController {
    CustomerService customerService;

    public AppController() {
        this.customerService = new CustomerService(new CustomerRepository());
        this.billService = new BillService(customerService.getCustomerRepository());
    }

    BillService billService;
    public void listAllCustomer() {
        customerService.listAllCustomer();
    }

    public void createCustomer(String name, String surname, String phone, RegisteredDate date, String address, String sector) {
        customerService.createCustomer(name,surname,phone,date,address,sector);
        System.out.println("Create Successful");
    }

    public void filterByName(String c) {
        customerService.filterByName(c);
    }

    public void filter(RegisteredDate june) {
        customerService.filter(june);
    }

    public void listAllBill() {
        billService.listAllBill();
    }

    public void filterBill(int i, String s, String all) {
        billService.filterBill(i,s,all);
    }
    public void filterBill(int i, String s, String all, String filt) {
        billService.filterBillX(i,s,all,filt);
    }

    public void special(int i, RegisteredDate june) {
    }

    public void createBill(int id, int price, RegisteredDate date) {
        billService.create(id,price,date);
    }
}
