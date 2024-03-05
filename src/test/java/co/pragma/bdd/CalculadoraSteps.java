package co.pragma.bdd;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class CalculadoraSteps {
    private final Calculadora calc = new Calculadora();
    private int actual;

    @Given("primer numero es {int}")
    public void givenPrimerNumeroEs(int a) {
        calc.setA(a);
    }

    @And("segundo numero es {int}")
    public void givenSegundoNumeroEs(int b) {
        calc.setB(b);
    }

    @And("operacion es {int}")
    public void givenOperacionEs(int op) {
        calc.setOp(op);
    }

    @When("ejecuta la operacion con ambos numeros")
    public void whenEjecutaLaOperacion() {
        actual = calc.getOp();
    }

    @Then("el resultado deberia ser {int}")
    public void thenElResultadoDeberiaSer(int x) {
        assertEquals(x, actual);
    }
}