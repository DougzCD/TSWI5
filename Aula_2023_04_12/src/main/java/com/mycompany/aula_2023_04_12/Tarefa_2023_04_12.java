/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula_2023_04_12;

/**
 *
 * @author Aluno
 */
public class Tarefa_2023_04_12 {
    
    public static int ex_1 (boolean c1, boolean c2, String[] resp) 
    {      
        resp[0] = "A";
        System.out.println("A");
        if (c1) 
            resp[1] = "B";
        else
            resp[1] = "X";
        if (c2) 
            resp[2] = "C";
        else
            resp[2] = "Y";
        
        return resp[1];
    }
    
}
