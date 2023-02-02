package repository;

import entity.Bill;
import entity.RegisteredDate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BillRepository {
    private List<Bill> billList;

    public BillRepository() {
        this.billList = new ArrayList<>();
    }

    public List<Bill> listAll() {
        return billList;
    }



    public List<Bill> filter(int price, String equal) {
        if(equal.equals(">")){
            return billList.stream().filter(i->i.getPrice() > price).collect(Collectors.toList());
        }
        if (equal.equals("<")){
            return billList.stream().filter(i->i.getPrice() < price).collect(Collectors.toList());
        }
        else return null;
    }

    public void save(int id, int price, RegisteredDate date) {
        Bill b= new Bill(id,price,date);
        billList.add(b);
    }
}
