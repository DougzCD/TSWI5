/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.aula_2023_04_12;

//import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 *
 * @author Aluno
 */
public class BlackjackTest {
    
    public BlackjackTest() {
    }

    @ParameterizedTest
    @CsvSource({
        " 21, 21, 21",
        " 21, 20, 20",
        " 20, 21, 20",
        " 20, 22, 0",
        " 22, 20, 0",
        " 22, 22, 0"
    })
    public void testeCsvSource(int l,int r, int x) {
        
        int esperado = x;
        int obtido = Blackjack.play(l, r);
        assertEquals(esperado, obtido); 
        //System.out.println("method data " + esperado + " value " + obtido);
    }
    
}

