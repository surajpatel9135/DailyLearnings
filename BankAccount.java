final class BankAccounts {
    private final String NAME;
    private final String IFSC;
    private final String ACCNO;
    private String mobileNo;
    private double balance;
    
    public BankAccounts(String NAME, String ACCNO, String IFSC, String mobileNo, double balance) {
        if(ACCNO == null || ACCNO.length() != 10) {
            throw new IllegalArgumentException("Account Number must be exactly 10");
        }
        if(balance <= 0) {
            throw new IllegalArgumentException("Balance must be greater than zero.");
        }
        
        if(mobileNo == null || mobileNo.length() != 10) {
            throw new IllegalArgumentException("Mobile Number must be exactly 10");
        }
        this.NAME = NAME;
        this.ACCNO = ACCNO;
        this.IFSC = IFSC;
        this.balance = balance;
        this.mobileNo = mobileNo;
    }
    
    public String getName() {
        return this.NAME;
    }
    
    public String getAccountNumber() {
        return this.ACCNO;
    }
    
    public String getIfscCode() {
        return this.IFSC;
    }
    
    public double getBalance() {
        return this.balance;
    }
    
    public String getMoblileNumber() {
        return this.mobileNo;
    }
    
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Security Threat: Deposit amount must be greater than zero.");
        }
        this.balance += amount;
    }
    
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Security Threat: Withdrawal amount must be greater than zero.");
        }
        if (amount > this.balance) {
            throw new IllegalStateException("Security Prevention: Insufficient funds for withdrawal.");
        }
        this.balance -= amount;
    }
}

public class BankAccount {
    public static void main (String[] args) {
        BankAccounts b1 = new BankAccounts("Suraj Patel", "1234567890", "BARK0D123", "6207618768", 10000.00);
        System.out.println("Account Holder: "+ b1.getName());
        System.out.println("Account Number: "+ b1.getAccountNumber());
        System.out.println("IFSC Code: "+ b1.getIfscCode());
        System.out.println("Initial Balance: " + b1.getBalance());
        System.out.println("Mobile Number: "+ b1.getMoblileNumber());
        b1.deposit(500.00);
        System.out.println("After Deposit: " + b1.getBalance()); 
        b1.withdraw(200.00);
        System.out.println("After Withdrawal: " + b1.getBalance());
    }
}

