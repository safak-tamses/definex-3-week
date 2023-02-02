package entity;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int customer_id=0;
    private String name;
    private String surname;
    private String phone_number;
    private RegisteredDate registered_date;
    private String address;
    private String sector;
    private List<Bill> customerS_bill;
    private static int x=1;

    public Customer(String name, String surname, String phone_number, RegisteredDate registered_date, String address, String sector) {
        this.customer_id = x;
        this.name = name;
        this.surname = surname;
        this.phone_number = phone_number;
        this.registered_date = registered_date;
        this.address = address;
        this.sector = sector;
        this.customerS_bill = new ArrayList<>();
        this.x+=1;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customer_id=" + customer_id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", registered_date=" + registered_date +
                ", address='" + address + '\'' +
                ", sector='" + sector + '\'' +
                ", customerS_bill=" + customerS_bill +
                ", x=" + x +
                '}';
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public RegisteredDate getRegistered_date() {
        return registered_date;
    }

    public void setRegistered_date(RegisteredDate registered_date) {
        this.registered_date = registered_date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public List<Bill> getCustomerS_bill() {
        return customerS_bill;
    }

    public void setCustomerS_bill(List<Bill> customerS_bill) {
        this.customerS_bill = customerS_bill;
    }
}
