/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula_2023_03_29;

/**
 *
 * @author Douglas Candido Domiciano
 */
public class Ex_3 {
    
    public static String ex_3(int idade, boolean pp, boolean resp)
    {
        if (idade>=18)
        {
            if(pp)
            {
                return "sim";           
            }else
            {
                return "não";
            }
        }else           
        {
            if(pp)
            {
                if(resp)  
                {
                    return "sim";
                }else
                {
                    return "não";
                }
            }else
            {
                return "não";
            }
        }
        
    }
}
