import java.util.ArrayList;

public class Employee {
    private String name;
    private String lastName;
    ArrayList<BankAccount> accounts;
    private char type;

    public Employee(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.accounts = new ArrayList<>();
    }

    public Employee(String name, String lastName, long accountNumber, char type) {
        this(name, lastName);
        if (type == 'A' || type == 'B' || type == 'C') {
            addAccount(accountNumber, type);
            System.out.println("Cuenta bancaria agregada con éxito.");
        } else {
            System.out.println("Tipo de cuenta inválido. La cuenta debe ser de tipo 'A', 'B' o 'C'.");
        }
    }

    public void addAccount(long accountNumber, char type) {
        if (type == 'A' || type == 'B' || type == 'C') {
            this.accounts.add(new BankAccount(accountNumber, type, name, lastName));
            System.out.println("Cuenta bancaria agregada con éxito.");
        } else {
            System.out.println("Tipo de cuenta inválido. La cuenta debe ser de tipo 'A', 'B' o 'C'.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<BankAccount> getAccounts() {
        return accounts;
    }

}