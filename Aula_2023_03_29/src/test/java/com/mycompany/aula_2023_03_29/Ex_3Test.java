/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.aula_2023_03_29;

//import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 *
 * @author Aluno
 */
public class Ex_3Test {
    
    public Ex_3Test() {
    }

    @ParameterizedTest
    @CsvSource({
        "18, True, True, sim",
        "18, False, True, não",
        "17, True, True, sim",
        "17, True, False, não",
        "17, False, True, não" 
    })
    public void testeCsvSource(int a,boolean b, boolean c, String d) {
        
        String esperado = d;
        String obtido = Ex_3.ex_3(a, b, c);
        assertEquals(esperado, obtido); 
        System.out.println("method data " + esperado + " value " + obtido);
    }
    
}
