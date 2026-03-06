
package com.mycompany.sistembank;

public class Customer {
    private String nama;
    private String customerId;

    public Customer(String nama, String customerId) {
        this.nama = nama;
        this.customerId = customerId;
    }

    public String getnama() {
        return nama;
    }

    public String getCustomerId() {
        return customerId;
    }
}
