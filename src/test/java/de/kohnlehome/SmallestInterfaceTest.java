package de.kohnlehome;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;



public class SmallestInterfaceTest {
    private ISmallestInterface smallestInterface;

    @BeforeEach
    public void init(){
        // ===== ARRANGE =====
        // Testdouble erstellen
        smallestInterface = new SmallestInterface();

    }

    @Test
    public void test1(){
        // ===== ACT =====
        // zu testende Methode aufrufen
        int[] array1 = {1,3,-15,11,-2};
        int[] array2 = {23,-127,235,-19,8};
        int result = smallestInterface.smallestDifference(array1,array2);

        // ===== ASSERT =====
        // Überprüfen, ob Methode richtigen Wert zurückgibt
        assertThat(result).isEqualTo(3);

    }

    @Test
    public void test2(){
        // ===== ACT =====
        // zu testende Methode aufrufen
        int[] array1 = {1,5,-14,19,-2};
        int[] array2 = {23,-127,335,-12,477};
        int result = smallestInterface.smallestDifference(array1,array2);

        // ===== ASSERT =====
        // Überprüfen, ob Methode richtigen Wert zurückgibt
        assertThat(result).isEqualTo(2);

    }

    @Test
    public void test3(){
        // ===== ACT =====
        // zu testende Methode aufrufen
        int[] array1 = {1,6,-8,22};
        int[] array2 = {188,-240,97,50};
        int result = smallestInterface.smallestDifference(array1,array2);

        // ===== ASSERT =====
        // Überprüfen, ob Methode richtigen Wert zurückgibt
        assertThat(result).isEqualTo(28);

    }
}