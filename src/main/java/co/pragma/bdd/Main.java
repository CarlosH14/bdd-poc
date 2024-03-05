package co.pragma.bdd;

import java.util.Scanner;

public class Main {

    private Main() {

    }

    public static void main(String[] args) {
        Calculadora calculadora;
        Scanner scanner;

        calculadora = new Calculadora();
        scanner = new Scanner(System.in);

        calculadora.setA(scanner.nextInt());
        calculadora.setB(scanner.nextInt());
        calculadora.setOp(scanner.nextInt());

        scanner.close();

        System.out.printf("X = %d%n", calculadora.getOp());
    }

}
