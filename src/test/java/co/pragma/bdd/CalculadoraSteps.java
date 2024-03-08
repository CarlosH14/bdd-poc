package co.pragma.bdd;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
/**
 * La clase CalculadoraSteps contiene los pasos
 * de las pruebas de aceptación definidas en lenguaje natural
 * utilizando Cucumber. Esta clase define los pasos para
 * realizar operaciones con la calculadora y verificar
 * los resultados.
 */
public class CalculadoraSteps {
    /** La instancia de la calculadora utilizada en las pruebas. */
    private final Calculadora calc = new Calculadora();
    /** El resultado de la operación ejecutada. */
    private int actual;
    /**
     * Define el primer número para la operación.
     * @param a El primer número para la operación.
     */
    @Given("primer numero es {int}")
    public void givenPrimerNumeroEs(int a) {
        calc.setA(a);
    }
    /**
     * Define el segundo número para la operación.
     * @param b El segundo número para la operación.
     */
    @And("segundo numero es {int}")
    public void givenSegundoNumeroEs(int b) {
        calc.setB(b);
    }
    /**
     * Define el tipo de operación a realizar.
     * @param op El tipo de operación a realizar.
     */
    @And("operacion es {int}")
    public void givenOperacionEs(int op) {
        calc.setOp(op);
    }
    /**
     * Ejecuta la operación utilizando los números definidos anteriormente.
     */
    @When("ejecuta la operacion con ambos numeros")
    public void whenEjecutaLaOperacion() {
        actual = calc.getOp();
    }
    /**
     * Verifica que el resultado de la operación coincide con el valor esperado.
     * @param x El valor esperado del resultado de la operación.
     */
    @Then("el resultado deberia ser {int}")
    public void thenElResultadoDeberiaSer(int x) {
        assertEquals(x, actual);
    }
}