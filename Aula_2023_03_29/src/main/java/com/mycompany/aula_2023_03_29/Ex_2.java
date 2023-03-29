/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula_2023_03_29;

/**
 *
 * @Douglas Candido Domiciano
 */
public class Ex_2 {
    
    public static String ex_2(int tempo,int saldo)
    {
        if (tempo>=2 && saldo>=2000)
        {
            return "Sim";
        }else if (tempo>=2 && saldo<2000)
        {
            return "Não";
        }else if (tempo<2 && saldo>=2000)
        {
            return "Não";
        }else if (tempo<2 && saldo<2000)
        {
            return "Não";
        }else           
        {return "Valores Invalidos";}
        
    }
    
}
