package co.pragma.bdd;

public class Calculadora {

    private int a;
    private int b;
    private int op;

    public void setOp(int op){
        this.op = op;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getOp() {
        return switch (this.op) {
            case 1 -> a + b;
            case 2 -> a - b;
            case 3 -> a * b;
            case 4 -> a / b;
            default -> 0;
        };

    }

}
