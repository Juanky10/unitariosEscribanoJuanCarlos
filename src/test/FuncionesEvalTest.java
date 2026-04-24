package test;

import org.junit.jupiter.api.Test;
import src.FuncionesEval;

import static org.junit.Assert.*;

class FuncionesEvalTest {

    @Test
    void contarApariciones() {
        assertEquals(2, FuncionesEval.contarApariciones(new int[]{1, 2, 3, 1, 4}, 1));
        assertEquals(0, FuncionesEval.contarApariciones(new int[]{5, 6, 7}, 2));
        assertEquals(0, FuncionesEval.contarApariciones(new int[]{}, 5));
    }

    @Test
    void encontrarMayor() {
        int[] array1 = {1, 3, 2, 5, 4};
        assertEquals(5, FuncionesEval.encontrarMayor(array1));

        int[] array2 = {-1, -2, -3, -4};
        assertEquals(-1, FuncionesEval.encontrarMayor(array2));

        int[] array3 = {10};
        assertEquals(10, FuncionesEval.encontrarMayor(array3));

        int[] array4 = {};
        assertThrows(IllegalArgumentException.class, () -> FuncionesEval.encontrarMayor(array4));

        int[] array5 = null;
        assertThrows(IllegalArgumentException.class, () -> FuncionesEval.encontrarMayor(array5));
    }

    @Test
    void esPerfecto() {
        assertTrue(FuncionesEval.esPerfecto(6));
        assertTrue(FuncionesEval.esPerfecto(28));
        assertFalse(FuncionesEval.esPerfecto(5));
    }

    @Test
    void getTipoClima() {
        // Límite fío (<=10)
        assertEquals("Frío", FuncionesEval.getTipoClima(10.0));
        assertEquals("Frío", FuncionesEval.getTipoClima(-5.0));

        // Límite nublado (>10 y <=20)
        assertEquals("Nublado", FuncionesEval.getTipoClima(10.1));
        assertEquals("Nublado", FuncionesEval.getTipoClima(20.0));

        // Límite caluroso (>20 y <=30)
        assertEquals("Caluroso", FuncionesEval.getTipoClima(20.1));
        assertEquals("Caluroso", FuncionesEval.getTipoClima(30.0));

        // Límite tropical (>30)
        assertEquals("Tropical", FuncionesEval.getTipoClima(30.1));
        assertEquals("Tropical", FuncionesEval.getTipoClima(40.0));
    }

    @Test
    void invertirArray() {
        // Array con varios elementos
        int[] original = {1, 2, 3, 4, 5};
        int[] esperado = {5, 4, 3, 2, 1};
        assertArrayEquals(esperado, FuncionesEval.invertirArray(original));

        // Array de un solo elemento
        assertArrayEquals(new int[]{10}, FuncionesEval.invertirArray(new int[]{10}));

        // Array vacío
        assertArrayEquals(new int[]{}, FuncionesEval.invertirArray(new int[]{}));
    }
}