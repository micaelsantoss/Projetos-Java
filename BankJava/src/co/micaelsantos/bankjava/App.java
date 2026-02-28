package co.micaelsantos.bankjava;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Bank santander = new Bank("0001");

        while (true){
            System.out.println("O que você deseja fazer? C = Criar conta, S = Sair");
            String op = scanner.nextLine();

            if(op.equals("C") || op.equals("c")){
                System.out.println("Digite seu nome:");
                String name = scanner.nextLine();

                Account conta = santander.generateAccount(name);

                santander.insertAccount(conta);

                operateAccount(conta);
            }else if(op.equals("S") || op.equals("s")){
                System.out.println("Processo finalizado!");
                break;
            }else{
                System.out.println("Comando inválido, tente novamente!");
            }
        }

    }

    static void operateAccount(Account conta){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("O que deseja fazer? V = Visualizar saldo, D = Depósito, S = Sacar");
            String response = scanner.nextLine();

            if(response.equals("V") || response.equals("v")){
                System.out.println(conta.verSaldo());
            } else if (response.equals("D") || response.equals("d")) {
                System.out.println("Qual valor deseja depositar? ");
                String value = scanner.nextLine();

                double valueDouble = Double.parseDouble(value);

                conta.depositar(valueDouble);
                System.out.println(conta.verSaldo());
            } else if (response.equals("S") || response.equals("s")) {
                System.out.println("Qual valor deseja sacar? ");
                String value = scanner.nextLine();

                double valueDouble = Double.parseDouble(value);

                conta.sacar(valueDouble);
                System.out.println(conta.verSaldo());
            }else{
                System.out.println("Desculpe, não entendi sua resposta, por favor, responda novamente!");
            }

            String decision = "s";

            while (decision.equals("s") || decision.equals("S")){
                System.out.println("Deseja realizar nova operação? S = Sim, N = Não");
                decision = scanner.nextLine();

                if(decision.equals("N") || decision.equals("n")) {
                    return;
                } else if (decision.equals("S") || decision.equals("s")) {
                    decision = "n";
                }else {
                    System.out.println("Desculpe, não entendi sua resposta, por favor, responda novamente!");
                    decision = "s";
                }
            }

        }
    }
}
