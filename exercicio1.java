import java.util.Scanner;
import java.lang.System;
import java.util.ArrayList;
import java.util.Arrays;

class EditorLista {
    public static void main(String[] args) {
        ArrayList<Integer> P = new ArrayList(Arrays.asList(1,2,3));
        
        Scanner input = new Scanner(System.in);
        
        Integer choice;
        
        do {
            System.out.println("EDITOR DE LISTAS\n1 - EMPILHAR\n2 - DESEMPILHAR\n3 - EXIBIR ELEMENTO DO TOPO\n4 - EXIBIR A PILHA\n5 - ESVAZIAR A PILHA\n---Digite qualquer valor fora das alternativas para parar o script---\nDIGITE SUA OPCAO:");
            choice = input.nextInt();
            
            System.out.println("Pilha - " + P);
            
            if (choice == 1) {
                System.out.println("\nQual valor ira empilhar?");
                Integer value = input.nextInt();
                P.add(value);
                System.out.println("Resultado - " + P);
            } else if (choice == 2) {
                P.remove(P.size() - 1);
                System.out.println("Resultado - " + P);
            } else if (choice == 3) {
                System.out.println(P.get(0));
            } else if (choice == 4) {
                System.out.println("Resultado - " + P);
            } else if (choice == 5) {
                P.clear();
                System.out.println("Resultado - " + P);
            }
            
        } while (choice >= 1 && choice <= 5);
        
        input.close();
    }
}