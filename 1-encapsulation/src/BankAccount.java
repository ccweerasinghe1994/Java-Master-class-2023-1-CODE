import java.math.BigDecimal;
import static java.math.BigDecimal.ZERO;

public class BankAccount {
    private String name;
    private BigDecimal balance;
    private boolean hasOverdraft;

    public BankAccount() {
    }

    public BankAccount(String name, BigDecimal balance, boolean hasOverdraft) {
        this.name = name;
        this.balance = balance;
        this.hasOverdraft = hasOverdraft;
    }

    public BigDecimal withdraw(BigDecimal amount){
        if (balance.subtract(amount).compareTo(ZERO)>=0){
            this.balance = this.balance.subtract(amount);
            return amount;
        }
        return ZERO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public boolean isHasOverdraft() {
        return hasOverdraft;
    }

    public void setHasOverdraft(boolean hasOverdraft) {
        this.hasOverdraft = hasOverdraft;
    }
}
 