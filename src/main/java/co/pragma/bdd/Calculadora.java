package co.pragma.bdd;

/**
 * Esta clase representa una calculadora básica
 * que puede realizar operaciones
 * aritméticas simples.
 */
public class Calculadora {
    /** Primer operando de la calculadora. */
    private int a;
    /** Segundo operando de la calculadora. */
    private int b;
    /** Código de operación de la calculadora
     * (1: suma, 2: resta, 3: multiplicación, 4: división).
     */
    private int op;

    /**
     * Establece el código de operación de la calculadora.
     * @param op El código de operación
     * (1: suma, 2: resta, 3: multiplicación, 4: división).
     */
    public void setOp(int op){
        this.op = op;
    }

    /**
     * Establece el primer operando de la calculadora.
     * @param a El primer operando.
     */
    public void setA(int a) {
        this.a = a;
    }

    /**
     * Establece el segundo operando de la calculadora.
     * @param b El segundo operando.
     */
    public void setB(int b) {
        this.b = b;
    }

    /**
     * Obtiene el resultado de la operación realizada por la calculadora.
     * @return El resultado de la operación aritmética.
     */
    public int getOp() {
        return switch (this.op) {
            case 1 -> a + b;
            case 2 -> a - b;
            case 3 -> a * b;
            case 4 -> a / b;
            default -> 0; // Retorna 0 si el código de operación no es válido.
        };

    }

}
