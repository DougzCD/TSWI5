/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.aula_2023_03_29;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 *
 * @Douglas Candido Domiciano
 */
public class Ex_1Test {
    
    @Test
    public void testePadrao() {
    int a = 6;
    String esperado = "Não";
    String obtido = Ex_1.ex_1(a);
    assertEquals(esperado,obtido);    
       
    }
    
    //@Test
    @ParameterizedTest
    @ValueSource(ints = {1,17})
    public void testeMenorIdade(int a) {
    String esperado = "Não";
    String obtido = Ex_1.ex_1(a);
    assertEquals(esperado, obtido);           
    }
    
    //@Test
    @ParameterizedTest
    @ValueSource(ints = {19,30})
    public void testeEmpregadoParcial(int a) {
    String esperado = "Sim";
    String obtido = Ex_1.ex_1(a);
    assertEquals(esperado, obtido);           
    }
}
