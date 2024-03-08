import java.util.ArrayList;

public class Bank {
    private ArrayList<BankAccount> cuentas;

    public Bank(){
        this.cuentas = new ArrayList<>();
    }

    public void agregarCuenta(BankAccount cuenta){
        this.cuentas.add(cuenta);
    }

    public void listarCuentas(){
        if (cuentas.isEmpty()){
            System.out.println("ERROR. No se ha agregado ninguna cuenta.");
            System.out.println("");
        }
        else{
            System.out.println("=== CUENTAS AGREGADAS ===");
            for(BankAccount cuenta : cuentas){
                System.out.println("*******************************************");
                System.out.println(String.format("Propietario de la cuenta: %s %s", cuenta.getOwnerName(), cuenta.getOwnerLastName()));
                System.out.println("Número de cuenta: " + cuenta.getAccountNumber());
                System.out.println("Tipo de cuenta: " + cuenta.getType());
                System.out.println("*******************************************\n");
            }
        }
    }

    public void mostrarCuentasUsuario(String ownerName, String ownerLastName) {
        boolean encontrado = false;
        for (BankAccount cuenta : cuentas) {
            if (cuenta.getOwnerName().equals(ownerName) && cuenta.getOwnerLastName().equals(ownerLastName)) {
                encontrado = true;
                System.out.println("*******************************************");
                System.out.println(String.format("Propietario de la cuenta: %s %s", cuenta.getOwnerName(), cuenta.getOwnerLastName()));
                System.out.println("Número de cuenta: " + cuenta.getAccountNumber());
                System.out.println("Tipo de cuenta: " + cuenta.getType());
                System.out.println("*******************************************\n");
            }
        }
        if (!encontrado) {
            System.out.println(String.format("No se encontraron cuentas para el usuario %s %s", ownerName, ownerLastName));
            System.out.println();
        }
    }

    public void mostrarCuenta(long accountNumber){
        boolean encontrado = false;
        for (BankAccount cuenta : cuentas){
            if (cuenta.getAccountNumber() == accountNumber){
                encontrado = true;
                System.out.println("*******************************************");
                System.out.println(String.format("Propietario de la cuenta: %s %s", cuenta.getOwnerName(), cuenta.getOwnerLastName()));
                System.out.println("Número de cuenta: " + cuenta.getAccountNumber());
                System.out.println("Tipo de cuenta: " + cuenta.getType());
                System.out.println("*******************************************\n");
            }
        }
        if (!encontrado){
            System.out.println("No se encontraron cuentas para el número " + accountNumber);
            System.out.println();
        }
    }

}
