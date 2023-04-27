/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.pt3_m5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alumne
 */
public class asierTest {
    
    public asierTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of sum method, of class asier.
     */
    public class ExempleMetodesTest {

    @Test
    public void testSumar() {
        assertEquals(5, ExempleMetodes.sum(2, 3));
        assertEquals(10, ExempleMetodes.sum(5, 5));
        assertEquals(-3, ExempleMetodes.sum(-2, -1));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(6, ExempleMetodes.multiply(2, 3));
        assertEquals(25, ExempleMetodes.multiply(5, 5));
        assertEquals(-2, ExempleMetodes.multiply(-2, 1));
    }
    }
    
}
