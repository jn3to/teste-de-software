package br.edu.ifto.swt.aula_2_3;

import static br.edu.ifto.swt.aula_2_3.MathUtil.mdc;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Classe para inclusão dos testes unitários para os métodos mdc() da classe {@link MathUtil}, que
 * calcula o Máximo Divisor Comum de dois ou mais números.
 *
 * <p>Cada teste unitário deve verificar uma determinada propriedade do MDC. Os métodos de teste
 * indicam o número da <a
 * href="https://pt.wikipedia.org/wiki/Máximo_divisor_comum#Propriedades">propriedade<</a> testada
 * (como p1) no nome.
 *
 * @author Manoel Campos da Silva Filho <http://github.com/manoelcampos>
 */
class MathUtilMdcTest {
    @Test
    void testMDCAParP1() {
        final int a = 6;
        final int b = 3;
        final int esperado = b;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }

    @Test
    void testMDCAImparP1() {
        final int a = 9;
        final int b = 3;
        final int esperado = b;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }

    @Test
    void testMDCParesP2() {
        final int a = 16;
        final int b = 8;
        final int divisor = 4;
        final int esperado = 0;
        final int obtido = MathUtil.mdc(a, b);
        assertTrue(obtido % divisor == esperado);
    }

    @Test
    void testMDCAPositivoP3() {
        final int a = 15;
        final int b = 0;
        final int esperado = 15;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }

    @Test
    void testMDCANegativoP3() {
        final int a = -30;
        final int b = 0;
        final int esperado = 30;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }

    @Test
    void testMDCMParP4() {
        final int a = 9;
        final int b = 3;
        final int m = 2;
        final int esperado = MathUtil.mdc(a * m, b * m);
        final int obtido = m * MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }

    @Test
    void testMDCResultado1P5() {
        final int a = 7;
        final int b = 3;
        final int c = 5;
        final int esperado = 1;
        final int obtido = mdc(b, c);
        assertEquals(esperado, obtido);
    }

    @Test
    void testMDCP5() {
        final int a = 7;
        final int b = 3;
        final int c = 5;
        final int esperado = mdc(a * b, c);
        final int obtido = mdc(b, c);
        assertEquals(esperado, obtido);
    }

    @Test
    void testMDCP6() {
        final int a = 8;
        final int b = 2;
        final int esperado = mdc(a, b);
        final int obtido = mdc(b, a);
        assertEquals(esperado, obtido);
    }

    @Test
    void testMDCTudoNegativoP7() {
        final int a = -12;
        final int b = -6;
        final int esperado = 6;
        final int obtido = mdc(a, b);
        assertEquals(esperado, obtido);
    }
}
