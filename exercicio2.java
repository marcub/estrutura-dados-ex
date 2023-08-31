import java.util.Scanner;
import java.lang.System;
import java.util.ArrayList;
import java.util.Arrays;

class Account {
    private String number;
    private Double balance;
    
    public Account(String number, Double balance) {
        this.number = number;
        this.balance = balance;
    }
    
    public String getNumber() {
        return this.number;
    }
    
    public void setNumber(String number) {
        this.number = number;
    }
    
    public Double getBalance() {
        return this.balance;
    }
    
    public void setBalance(Double balance) {
        this.balance = balance;
    }
    
    public void deposit(Double depositValue) {
        this.balance += depositValue;
    }
    
    public void withdrawal(Double withdrawalValue) {
        this.balance -= withdrawalValue;
    }
    
}

class Main {
    public static void main(String[] args) {
        
        Account conta = new Account("2156325", 1500.00);
        Scanner input = new Scanner(System.in);
        
        Integer choice;
        
        do {
            System.out.println("CONTA\n1 - DEPOSITAR\n2 - SACAR\n3 - EXIBIR SALDO\n---Digite qualquer valor fora das alternativas para parar o script---\nDIGITE SUA OPCAO:");
            choice = input.nextInt();
            
            if (choice == 1) {
                System.out.println("\nQual valor ira depositar?");
                Double value = input.nextDouble();
                System.out.println("Saldo anterior - R$" + conta.getBalance());
                conta.deposit(value);
                System.out.println("Novo saldo - R$" + conta.getBalance());
            } else if (choice == 2) {
                System.out.println("\nQual valor ira sacar?");
                Double value = input.nextDouble();
                System.out.println("Saldo anterior - R$" + conta.getBalance());
                conta.withdrawal(value);
                System.out.println("Novo saldo - R$" + conta.getBalance());
            } else if (choice == 3) {
                System.out.println("Saldo - R$" + conta.getBalance());
            }
            
        } while (choice >= 1 && choice <= 3);
        
        input.close();
    }
}