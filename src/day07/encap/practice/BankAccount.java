package day07.encap.practice;

import java.util.Scanner;
import java.util.SplittableRandom;

public class BankAccount {
    private String accountNumber; //계좌번호
    private String accountHolder; //계좌 주인 이름
    private long balance; //계좌 잔액


    public BankAccount(String accountNumber, String accountHolder, long balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public void deposit(int money) {
        if (money < 0) {
            System.out.println("입금액은 음수일 수 없습니다.");
            return;
        }
        this.balance += money;
    }

    public void withdraw(int money) {
        if (money < 0 || money > this.balance) {
            System.out.println("잔액이 부족하거나 잘못된 출금액입니다.");
            return;
        }
        this.balance -= money;
    }
}

