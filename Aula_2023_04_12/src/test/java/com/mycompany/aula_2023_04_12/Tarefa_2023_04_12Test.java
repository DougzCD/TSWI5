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
public class Tarefa_2023_04_12Test {
    
    public Tarefa_2023_04_12Test() {
    }

    @ParameterizedTest
    @CsvSource({
        "True, True, [A, B, C, D]",
        "True, False, [A, B, Y, D]",
        "False, True, [A, X, C, D]",
        "False, False, [A, X, Y, D]",
    })
    public void testCsvSourceEx_6(boolean x,boolean y,String[] r) {

        String expResult[] = r;
        String result[] = Tarefa_2023_04_12.ex_6(x, y);
        assertEquals(expResult, result);
        
        fail("The test case is a prototype.");
    }


    @ParameterizedTest
    @CsvSource({
        "[1,2,3,4,5,6,7,8,9,10], 5",
        "[10,9,8,7,6,5,4,3,2,1], 5",
        "[10,10,10,10], 10",
        "[7,7,7], 7",
    })
    public void testCsvSourceEx_7(int[] n, int r) {
   
        int[] v = n;
        int expResult = r;
        int result = Tarefa_2023_04_12.ex_7(v);
        assertEquals(expResult, result);
        
        fail("The test case is a prototype.");
    }

    @ParameterizedTest
    @CsvSource({
        "True,True,2,24",
        "False,True,2,19",
        "False,False,2,18",
        "False,False,1,17",
    })
    public void testCsvSourceEx_8(boolean x, boolean y, int z, int r) {
        
        boolean p = x;
        boolean c = y;
        int cb = z;
        int expResult = r;
        int result = Tarefa_2023_04_12.ex_8(p, c, cb);
        assertEquals(expResult, result);
        
        fail("The test case is a prototype.");
    }
    
}
