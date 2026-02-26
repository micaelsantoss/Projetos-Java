package co.micaelsantos.bankjava;

public class App {
    public static void main(String[] args){
        Account conta1 = new Account("0000", "00000-0", "Micael");

        conta1.depositar(580.60);

        System.out.println(conta1.verSaldo());

        conta1.sacar(200);

        System.out.println(conta1.verSaldo());

        conta1.sacar(400);

        System.out.println(conta1.verSaldo());
    }
}
