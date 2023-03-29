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
public class Ex_4Test {
    
    public Ex_4Test() {
    }

    @ParameterizedTest
    @CsvSource({
        "True, True, True, [não, sim, sim]",
        "True, True, False, [não, sim, não]",
        "True, False, True, [não, não, sim]",
        "True, False, False, [não, não, não]",
        "False, True, True, [sim, sim, sim]",
        "False, True, False, [sim, sim, não]",
        "False, False, True, [sim, não, sim]",
        "False, False, False, [sim, não, não]",
    })
    public void testeCsvSource(boolean a,boolean b, boolean c, String[] d) {
        
        String esperado[] = d;
        String obtido[] = Ex_4.ex_4(a, b, c);
        assertEquals(esperado, obtido); 
        //System.out.println("method data " + esperado + " value " + obtido);
    }
    
}
