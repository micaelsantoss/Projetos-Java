package co.micaelsantos.bankjava;

public class Account {
    private String ag;
    private String cc;
    private String name;

    private double saldo;

    private static final int MAX_LENGTH = 20;

    public Account(String ag, String cc, String name){
        this.ag = ag;
        this.cc = cc;
        setName(name);

        System.out.println("Cliente " + name + " cadastrado com sucesso! " + "Agência: " + ag + " conta: " + cc);
    }

    public void setName(String name){
        if(name.length() > MAX_LENGTH){
            this.name = name.substring(0, MAX_LENGTH);
        }else {
            this.name = name;
        }
    }

    public String verSaldo(){
        return "R$" + saldo;
    }

    public void depositar(double value){
        if(value > 1){
            saldo += value;
            System.out.println("R$ " + value + " foram depositados com sucesso! Seu saldo agora é de R$" + saldo);
        }else{
            System.out.println("valor de depósito precisa ser maior do que R$1,00!");
        }
    }

    public void sacar(double value){
        if(value <= saldo){
            saldo -= value;
            System.out.println("R$ " + value + " foram sacados com sucesso! Seu saldo agora é de R$" + saldo);
        }else{
            System.out.println("valor de saque precisa ser menor do que o valor do seu saldo!");
        }
    }

}
