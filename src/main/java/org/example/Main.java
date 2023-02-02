package org.example;

import controller.AppController;
import entity.RegisteredDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        AppController appController = new AppController();

        appController.createCustomer("ahmet", "test", "0111111111", RegisteredDate.FEBRUARY, "test", "test");
        appController.createCustomer("Ctest", "test", "test", RegisteredDate.JUNE, "test", "test");
        appController.createBill(2,400,RegisteredDate.JUNE);
        appController.createBill(1,450,RegisteredDate.JUNE);
        appController.createBill(2,9200,RegisteredDate.JUNE);



        System.out.println("Tüm müşterileri listeleyin ");
        appController.listAllCustomer();


        System.out.println("Yeni Müşteri oluşturabilen");
        appController.createCustomer("safak", "tamses", "05367214367", RegisteredDate.FEBRUARY, "salkımsögüt sokak no 4", "technology");


        System.out.println("İçerisinde ‘C’ harfi olan müşterileri listeleyin");
        appController.filterByName("C");


        System.out.println("Haziran ayında kayıt olan müşterilerin faturalarınının toplam tutarını listeleyin");
        appController.filter(RegisteredDate.JUNE);


        System.out.println("Sistemdeki tüm faturaları listeleyin");
        appController.listAllBill();

        System.out.println("Sistemdeki 1500TL üstündeki faturaları listeleyin");
        appController.filterBill(1500, ">", "all");

        System.out.println("Sistemdeki 1500TL üstündeki faturaları ortalamasını hesaplayın");
        appController.filterBill(1500, ">", "avg");

        System.out.println("Sistemdeki 500TL altındaki faturalara sahip müşterilerin isimleri listeleyin");
        appController.filterBill(500, "<", "all", "customerName");
//
//
//        appController.special(750,RegisteredDate.JUNE);
    }
}