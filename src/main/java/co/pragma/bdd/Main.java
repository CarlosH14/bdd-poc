package co.pragma.bdd;

import java.util.Scanner;

public class Main {

    private Main() {

    }

    public static void main(String[] args) {

        Calculadora calculadora;
        Scanner scanner;

        // Crear una instancia de la clase Calculadora
        calculadora = new Calculadora();
        // Leer dos números enteros y un operador
        scanner = new Scanner(System.in);

        // Leer dos números enteros y un operador
        calculadora.setA(scanner.nextInt());
        calculadora.setB(scanner.nextInt());
        calculadora.setOp(scanner.nextInt());

        // Cerrar el Scanner para liberar recursos
        scanner.close();

        // Obtener y mostrar el resultado calculado por la calculadora
        System.out.printf("X = %d%n", calculadora.getOp());
    }

}
