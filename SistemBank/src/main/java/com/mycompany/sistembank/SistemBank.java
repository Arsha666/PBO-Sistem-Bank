
package com.mycompany.sistembank;


public class SistemBank {

    public static void main(String[] args) {

        Customer c1 = new Customer("Arsha", "C001");

        BankAccount acc1 = new BankAccount("ACC01", c1);

        acc1.deposit(1000);
        acc1.tarik(300);

        System.out.println("Nama Nasabah: " + c1.getnama());
        System.out.println("Nomor Rekening: " + acc1.getNomorRekening());
        System.out.println("Saldo: " + acc1.getSaldo());

    }
}
