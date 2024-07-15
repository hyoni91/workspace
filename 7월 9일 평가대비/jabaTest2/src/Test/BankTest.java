package test;

public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Client client;

       client =  bank.clientInfo("1111-11","이순신");
        System.out.println(client);
        System.out.println( bank.overBalance(40000));


    }




}
