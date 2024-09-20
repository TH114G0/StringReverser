package br.com.alura;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("-----------------------------------------");
            System.out.print("Informe a String que você deseja inverter: ");
            String stringPadrao = scanner.nextLine();
            StringBuilder stringInvertida = new StringBuilder(stringPadrao);

            System.out.printf("""
                    
                    ANTES: %s
                    DEPOIS: %s
                    
                    """, stringPadrao, stringInvertida.reverse());

            System.out.print("Deseja inverter outra string ? (s/n) ");
            String resp = scanner.nextLine().trim().toUpperCase();
            if (resp.equals("N")) {
                System.out.println("\n>>>>>>>>>>> Finalizando aplicação! <<<<<<<<<<<<<<");
                break;
            } else if (!resp.equals("S")) {
                System.out.println("Informa apenas as letras S para continuar e N para encerrar a aplicação!!");
            }
        }
    }
}