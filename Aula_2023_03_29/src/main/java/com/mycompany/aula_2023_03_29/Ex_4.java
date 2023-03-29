/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula_2023_03_29;

/**
 *
 * @author Aluno
 */
public class Ex_4 {
    
    public static String[] ex_4(boolean inf2, boolean alug3, boolean alug3p)
    {
        String[] resp = new String[2];
        
        if(inf2)
        {
            resp[0] = "não";
        }else
        {
            resp[0] = "sim";
        }
        
        if(alug3)
        {
            resp[1] = "não";
        }else
        {
            resp[1] = "sim";
        }
        
        if(alug3p)
        {
            resp[2] = "não";
        }else
        {
            resp[2] = "sim";
        }
        
        return resp;
    }
}
