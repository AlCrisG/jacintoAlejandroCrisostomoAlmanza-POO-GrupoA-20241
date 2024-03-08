public class BankAccount {
    private long accountNumber;
    private double amount;
    private char type;
    private String ownerName;
    private String ownerLastName;

    public BankAccount(long accountNumber, char type, String ownerName, String ownerLastName) {
        this.accountNumber = accountNumber;
        this.type = type;
        this.ownerName = ownerName;
        this.ownerLastName = ownerLastName;
    }

    public char getType(){
        return type;
    }
    public String getOwnerName(){
        return ownerName;
    }

    public String getOwnerLastName(){
        return ownerLastName;
    }
    public long getAccountNumber() {
        return accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void add(double amount) {
        if (type == 'A'){
            accountA('a',amount);
        }
        else if (type == 'B'){
            accountB('a',amount);
        }
        else {
            accountC('a', amount);
        }
    }

    public void withdraw(double amount) {
        if (type == 'A'){
            accountA('w',amount);
        }
        else if (type == 'B'){
            accountB('w',amount);
        }
        else {
            accountC('w', amount);
        }
    }

    private void accountA(char operation,double amount){
        if (operation == 'a') {
            if (this.amount == 50000) {
                System.out.println("No se puede ingresar más dinero a la cuenta. Límite de $50,000");
            }
            else {
                if (this.amount+amount>=50000) {
                    this.amount += amount;
                    double spare = this.amount - 50000;
                    this.amount = 50000;
                    System.out.println("Operación exitosa. Saldo actual: " + this.amount);
                    System.out.println("Límite excedido. Dinero regresado: " + spare);
                }
                else {
                    this.amount += amount;
                    System.out.println("Operación exitosa. Saldo actual: " + this.amount);
                }
            }
        }
        else {
            if (this.amount >= 1000 && amount >= 1000 && this.amount>=amount) {
                this.amount -= amount;
                System.out.println("Operación exitosa. Saldo actual: " + this.amount);
            }
            else {
                System.out.println("Operación fallida. Saldo insuficiente.");
            }
        }
    }

    private void accountB(char operation,double amount){
        if (operation == 'a') {
            if (this.amount == 100000) {
                System.out.println("No se puede ingresar más dinero a la cuenta. Límite de $100,000");
            }
            else {
                if (this.amount+amount>=100000) {
                    this.amount += amount;
                    double spare = this.amount - 100000;
                    this.amount = 100000;
                    System.out.println("Operación exitosa. Saldo actual: " + this.amount);
                    System.out.println("Límite excedido. Dinero regresado: " + spare);
                }
                else {
                    this.amount += amount;
                    System.out.println("Operación exitosa. Saldo actual: " + this.amount);
                }
            }
        }
        else {
            if (this.amount >= 5000 && amount >= 5000 && this.amount>=amount) {
                this.amount -= amount;
                System.out.println("Operación exitosa. Saldo actual: " + this.amount);
            }
            else {
                System.out.println("Operación fallida. Saldo insuficiente.");
            }
        }
    }

    private void accountC(char operation,double amount){
        if (operation == 'a') {
            this.amount += amount;
            System.out.println("Operación exitosa. Saldo actual: " + this.amount);
        }
        else {
            if (this.amount>=amount) {
                this.amount -= amount;
                System.out.println("Operación exitosa. Saldo actual: " + this.amount);
            }
        }
    }
}
