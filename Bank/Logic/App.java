package Bank.Logic;

public class App {
    public static void main(String[] args) {
        Bank b1 = new Bank("Bank1", 100500);
        Bank b2 = new Bank("Bank2", 100500);

        for (int i = 0; i <5 ; i++) {
            Bank.BankAccount ac = b1.createAccount("user-" + i);
            ac.setInCredit(9999999);
        }


    }
}
