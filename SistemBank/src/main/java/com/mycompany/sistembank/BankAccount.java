package com.mycompany.sistembank;

public class BankAccount {
    private String NomorRekening;
    private double Saldo;
    private Customer owner;

    public BankAccount(String NomorRekening, Customer owner) {
        this.NomorRekening = NomorRekening;
        this.owner = owner;
        this.Saldo = 0;
    }

    public BankAccount(String NomorRekening, Customer owner, double Saldo) {
        this.NomorRekening = NomorRekening;
        this.owner = owner;
        this.Saldo = Saldo;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            Saldo = Saldo + amount;
        }
    }

    public void tarik(double amount) {
        if (amount > 0 && amount <= Saldo) {
            Saldo = Saldo - amount;
        }
    }

    public double getSaldo() {
        return Saldo;
    }

    public String getNomorRekening() {
        return NomorRekening;
    }
}
