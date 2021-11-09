package br.edu.ifto.swt.aula_2_2;

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
}
