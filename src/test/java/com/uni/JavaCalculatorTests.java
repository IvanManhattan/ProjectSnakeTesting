package com.uni;

import static junit.framework.TestCase.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class JavaCalculatorTests {
    JavaCalculator calculator = new JavaCalculator();



    @Test
    public void testARCCOS() {
        calculator.selectButton(calculator.getButton(0));
        calculator.selectButton(calculator.getButton(10));
        calculator.selectButton(calculator.getButton(5));
        calculator.selectButton(calculator.getButton(29));
        assertEquals(Math.acos(0.5), calculator.getOutput());
    }

    @Test
    public void testSARCCTG() {
        calculator.selectButton(calculator.getButton(1));
        calculator.selectButton(calculator.getButton(31));
        assertEquals(1 / Math.atan(1), calculator.getOutput());
    }

    @Test
    public void testSARCSIN() {
        calculator.selectButton(calculator.getButton(0));
        calculator.selectButton(calculator.getButton(10));
        calculator.selectButton(calculator.getButton(5));
        calculator.selectButton(calculator.getButton(28));
        assertEquals(Math.asin(0.5), calculator.getOutput());
    }

    @Test
    public void testSARCTG() {
        calculator.selectButton(calculator.getButton(1));
        calculator.selectButton(calculator.getButton(30));
        assertEquals(Math.atan(1), calculator.getOutput());
    }

    @Test
    public void testSCOS() {
        calculator.selectButton(calculator.getButton(6));
        calculator.selectButton(calculator.getButton(0));
        calculator.selectButton(calculator.getButton(25));
        assertEquals(Math.cos(Math.toRadians(60)), calculator.getOutput());
    }

    @Test
    public void testSCTG() {
        calculator.selectButton(calculator.getButton(4));
        calculator.selectButton(calculator.getButton(5));
        calculator.selectButton(calculator.getButton(27));
        assertEquals(1 / Math.tan(Math.toRadians(45)), calculator.getOutput());
    }

    @Test
    public void testSDIVIDE() {
        calculator.selectButton(calculator.getButton(9));
        calculator.selectButton(calculator.getButton(14));
        calculator.selectButton(calculator.getButton(3));
        calculator.selectButton(calculator.getButton(19));
        assertEquals(3, calculator.getOutput());
    }

    @Test
    public void testSNUMBER() {
        calculator.selectButton(calculator.getButton(3));
        calculator.selectButton(calculator.getButton(23));
        assertEquals(6, calculator.getOutput());
    }

    @Test
    public void testSFACTORIAL() {
        calculator.selectButton(calculator.getButton(3));
        calculator.selectButton(calculator.getButton(23));
        assertEquals(6, calculator.getOutput());
    }

    @Test
    public void testSLOGARITHM() {
        calculator.selectButton(calculator.getButton(2));
        calculator.selectButton(calculator.getButton(5));
        calculator.selectButton(calculator.getButton(22));
        calculator.selectButton(calculator.getButton(5));
        calculator.selectButton(calculator.getButton(19));
        assertEquals(2, calculator.getOutput());
    }

    /**@Test
    void testSMINUS() {
        calculator.selectButton(calculator.getButton(2));
        calculator.selectButton(calculator.getButton(16));
        calculator.selectButton(calculator.getButton(3));
        calculator.selectButton(calculator.getButton(19));
        assertEquals(-1, calculator.getOutput());
    }**/


    @Test
    public void testSMULTIPLE() {
        calculator.selectButton(calculator.getButton(2));
        calculator.selectButton(calculator.getButton(15));
        calculator.selectButton(calculator.getButton(3));
        calculator.selectButton(calculator.getButton(19));
        assertEquals(6, calculator.getOutput());
    }

    @Test
    public void testSPERCENT() {
        calculator.selectButton(calculator.getButton(1));
        calculator.selectButton(calculator.getButton(0));
        calculator.selectButton(calculator.getButton(0));
        calculator.selectButton(calculator.getButton(18));
        calculator.selectButton(calculator.getButton(1));
        calculator.selectButton(calculator.getButton(0));
        calculator.selectButton(calculator.getButton(19));
        assertEquals(10, calculator.getOutput());
    }

    @Test
    public void testSPLUS() {
        calculator.selectButton(calculator.getButton(2));
        calculator.selectButton(calculator.getButton(17));
        calculator.selectButton(calculator.getButton(3));
        calculator.selectButton(calculator.getButton(19));
        assertEquals(5, calculator.getOutput());
    }

    @Test
    public void testSPOWER() {
        calculator.selectButton(calculator.getButton(5));
        calculator.selectButton(calculator.getButton(21));
        calculator.selectButton(calculator.getButton(2));
        calculator.selectButton(calculator.getButton(19));
        assertEquals(25, calculator.getOutput());
    }

    @Test
    public void testSSIN() {
        calculator.selectButton(calculator.getButton(3));
        calculator.selectButton(calculator.getButton(0));
        calculator.selectButton(calculator.getButton(24));
        assertEquals(Math.sin(Math.toRadians(30)), calculator.getOutput());
    }

    @Test
    public void testSSQRT() {
        calculator.selectButton(calculator.getButton(2));
        calculator.selectButton(calculator.getButton(5));
        calculator.selectButton(calculator.getButton(20));
        assertEquals(5, calculator.getOutput());
    }

    @Test
    public void testSTG() {
        calculator.selectButton(calculator.getButton(4));
        calculator.selectButton(calculator.getButton(5));
        calculator.selectButton(calculator.getButton(26));
        assertEquals(Math.tan(Math.toRadians(45)), calculator.getOutput());
    }

    @Test
    public void testSDOUBLEFACT() {
        calculator.selectButton(calculator.getButton(9));
        calculator.selectButton(calculator.getButton(44));
        assertEquals(945, calculator.getOutput());
    }

    @Test
    public void testSTEN() {
        calculator.selectButton(calculator.getButton(2));
        calculator.selectButton(calculator.getButton(42));
        assertEquals(100, calculator.getOutput());
    }

    @Test
    public void testSLN() {
        calculator.selectButton(calculator.getButton(1));
        calculator.selectButton(calculator.getButton(0));
        calculator.selectButton(calculator.getButton(37));
        assertEquals(Math.log(10), calculator.getOutput());
    }

    @Test
    public void testSLG() {
        calculator.selectButton(calculator.getButton(1));
        calculator.selectButton(calculator.getButton(0));
        calculator.selectButton(calculator.getButton(36));
        assertEquals(1, calculator.getOutput());
    }

    @Test
    public void testSCUBE() {
        calculator.selectButton(calculator.getButton(3));
        calculator.selectButton(calculator.getButton(35));
        assertEquals(27, calculator.getOutput());
    }

    @Test
    public void testSSQUARE() {
        calculator.selectButton(calculator.getButton(3));
        calculator.selectButton(calculator.getButton(34));
        assertEquals(9, calculator.getOutput());
    }

    @Test
    public void testSSH() {
        calculator.selectButton(calculator.getButton(3));
        calculator.selectButton(calculator.getButton(39));
        assertEquals((Math.pow(2.7183, 3) - Math.pow(2.7183, (-1) * 3)) / 2, calculator.getOutput());
    }

    @Test
    public void testSCH() {
        calculator.selectButton(calculator.getButton(3));
        calculator.selectButton(calculator.getButton(38));
        assertEquals((Math.pow(2.7183, 3) + Math.pow(2.7183, (-1) * 3)) / 2, calculator.getOutput());
    }

    @Test
    public void testSBACK() {
        calculator.selectButton(calculator.getButton(1));
        calculator.selectButton(calculator.getButton(43));
        assertEquals(1, calculator.getOutput());
    }

    @Test
    public void testSTH() {
        calculator.selectButton(calculator.getButton(0));
        calculator.selectButton(calculator.getButton(40));
        assertEquals((Math.pow(2.7183, 0) - Math.pow(2.7183, (-1) * 0)) / (Math.pow(2.7183, 0) + Math.pow(2.7183, (-1) * 0)), calculator.getOutput());
    }

    @Test
    public void testSCTH() {
        calculator.selectButton(calculator.getButton(3));
        calculator.selectButton(calculator.getButton(41));
        assertEquals((Math.pow(2.7183, 3) + Math.pow(2.7183, (-1) * 3)) / (Math.pow(2.7183, 3) - Math.pow(2.7183, (-1) * 3)), calculator.getOutput());
    }

    @Test
    public void testExtended() {
        calculator.selectButton(calculator.getButton(32));
        assertEquals(true, calculator.getExtended());
        calculator.selectButton(calculator.getButton(32));
        assertEquals(false, calculator.getExtended());
    }

    @Test
    public void testCLEAR() {
        calculator.selectButton(calculator.getButton(3));
        calculator.selectButton(calculator.getButton(13));
        assertEquals(0, calculator.getOutput());
    }

    @Test
    public void testE() {
        calculator.selectButton(calculator.getButton(12));
        calculator.selectButton(calculator.getButton(19));
        assertEquals(2.718281828459045, calculator.getOutput());
    }

    @Test
    public void testP() {
        calculator.selectButton(calculator.getButton(11));
        calculator.selectButton(calculator.getButton(19));
        assertEquals(3.141592653589793, calculator.getOutput());
    }
}