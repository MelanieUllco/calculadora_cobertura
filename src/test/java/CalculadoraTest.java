
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.calculadora.Calculadora;

public class CalculadoraTest {

    private Calculadora calc;

    @Before
    public void setUp(){
    calc = new Calculadora();
    }


    @Test
    public void testSuma() {
        
        assertEquals(5, calc.sumar(2, 3));
    }

    @Test
    public void testResta() {
        assertEquals(1, calc.restar(3, 2));
    }

    @Test
    public void testMultiplicacion() {
        assertEquals(6, calc.multiplicar(2, 3));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionPorCero() {
        calc.dividir(5, 0);
    }

    @Test
    public void testDivision() {
        assertEquals(2, calc.dividir(6, 3));
    }
}