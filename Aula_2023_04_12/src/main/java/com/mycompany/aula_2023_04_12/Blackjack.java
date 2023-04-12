/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aula_2023_04_12;

/**
 *
 * @author Aluno
 */

public class Blackjack 
{
    public static int play (int left, int right) 
    {      
        int ln = left;
        int rn = right;
        if (ln>21) 
            ln =0;
        if (rn > 21)
            rn = 0;
        if (ln > rn)
            return rn;
        else 
            return ln;
    }
}
    