/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.aula_2023_03_29;

//import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
//import org.junit.jupiter.params.provider.ValueSource;

/**
 *
 * @Douglas Candido Domiciano
 */
public class Ex_2Test {
    
    public Ex_2Test() {
    }
    
    //@Test
    @ParameterizedTest
    @CsvSource({"1,1000","1,1999"})
    public void testeMenorTempoMenorSaldo(int a,int b) {
    String esperado = "Sim";
    String obtido = Ex_2.ex_2(a, b);
    assertEquals(esperado, obtido); 
    System.out.println("method data " + esperado + " value " + obtido);
    }
    
    //@Test
    @ParameterizedTest
    @CsvSource({"1,2001", "1,3000"})
    public void testeMenorTempoMaiorSaldo(int a,int b) {
    String esperado = "Sim";
    String obtido = Ex_2.ex_2(a, b);
    assertEquals(esperado, obtido);           
    }
    
    //@Test
    @ParameterizedTest
    @CsvSource({"3,1000", "4,1999"})
    public void testeMaiorTempoMenorSaldo(int a,int b) {
    String esperado = "Sim";
    String obtido = Ex_2.ex_2(a, b);
    assertEquals(esperado, obtido);           
    }
    
    //@Test
    @ParameterizedTest
    @CsvSource({"3,2001", "4,4000"})
    public void testeMaiorTempoMaiorSaldo(int a,int b) {
    String esperado = "Sim";
    String obtido = Ex_2.ex_2(a, b);
    assertEquals(esperado, obtido);           
    }
    
}
