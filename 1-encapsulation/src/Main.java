import java.math.BigDecimal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    BankAccount account = new BankAccount("Mr. John Doe", new BigDecimal("100.00"), true);
    BigDecimal withdraw =  account.withdraw(new BigDecimal("50.00"));
        System.out.println(withdraw);
        System.out.println(account.getBalance());
//        now we can control the balance
        account.setBalance(new BigDecimal("100.00"));
        System.out.println(account.getBalance());
    }
}