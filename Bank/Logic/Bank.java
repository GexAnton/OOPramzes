package Bank.Logic;

import java.lang.ref.PhantomReference;
import java.util.Arrays;
import java.util.Date;

public class Bank {
    private String name;
    private double creditLimit;
    private double inCredit;
    private BankAccount[] accounts;
    private int counter = 0;


    public Bank(String name, double creditLimit) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.accounts = new BankAccount[10];
    }

    private void addAccountToList(BankAccount ac){
        if(counter == accounts.length){
            expandAndAddItem(ac);
        }else {
            accounts[counter++] = ac;
        }
    }

    private void expandAndAddItem(BankAccount ac){
        accounts = Arrays.copyOf(accounts,(3*accounts.length/2)+1);
        accounts[counter++] = ac;


    }

    public BankAccount createAccount(String username){
        BankAccount a = new BankAccount("","",new Date());
        addAccountToList(a);
        return a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getInCredit() {
        return inCredit;
    }

    public void setInCredit(double inCredit) {
        this.inCredit = inCredit;
    }

    public class BankAccount{
        private String username;
        private String accountNumber;
        private double creditLimit  = 300;
        private double inCredit;
        private double balance;
        private Date validTo;


        public BankAccount(String username, String accountNumber, Date validTo) {
            this.username = username;
            this.accountNumber = accountNumber;
            this.validTo = validTo;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        public double getCreditLimit() {
            return creditLimit;
        }

        public void setCreditLimit(double creditLimit) {
            this.creditLimit = creditLimit;
        }

        public double getInCredit() {
            return inCredit;
        }

        public void setInCredit(double inCredit) {
            this.inCredit = inCredit;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public Date getValidTo() {
            return validTo;
        }

        public void setValidTo(Date validTo) {
            this.validTo = validTo;
        }
    }

    public void printAccounts(){
        for(BankAccount b: accounts){
            System.out.println(b);
        }
    }


}
