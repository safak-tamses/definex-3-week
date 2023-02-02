package service;

import entity.Bill;
import entity.Customer;
import entity.RegisteredDate;
import repository.BillRepository;
import repository.CustomerRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BillService {
    BillRepository billRepository;
    final CustomerRepository customerRepository;

    public BillService(CustomerRepository customerRepository) {
        this.billRepository = new BillRepository();
        this.customerRepository = customerRepository;
    }

    public void listAllBill() {
        List<Bill> temp=billRepository.listAll();
        for(Bill x:temp){
            System.out.println(x);
        }
    }

    public void filterBill(int price, String equal, String text) {
        List<Bill> temp= billRepository.filter(price,equal);
        if (text.equals("all")){
            for (Bill x:temp){
                System.out.println(x);
            }
        }
        if (text.equals("avg")){
            System.out.println(temp.stream().mapToDouble(Bill::getPrice).average());
        }
    }


    public void filterBillX(int price, String equal, String all, String filt) {
        List<Bill> temp= billRepository.filter(price,equal);
        List<String> customerNames = new ArrayList<>();
        for (Bill x:temp){
            customerNames.addAll(customerRepository.filterById(x.getCustomer_id()).stream().map(Customer::getName).toList());

        }
        for (String s:customerNames){
            System.out.println(s);
        }
    }

    public void create(int id, int price, RegisteredDate date) {
        billRepository.save(id,price,date);
    }
}
