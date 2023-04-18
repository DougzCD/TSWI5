/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula_2023_04_12;
import java.util.Arrays;

/**
 *
 * @author Aluno
 */
public class Tarefa_2023_04_12 {
    
    public static String[] ex_6 (boolean c1, boolean c2) 
    {      
        String resp[] = new String[4];
        
        resp[0] = "A";
        System.out.println(resp[0]);
        if (c1){
            resp[1] = "B";
            System.out.println(resp[1]);
        }
        else{
            resp[1] = "X";
            System.out.println(resp[1]);
        }   
        if (c2){
            resp[2] = "C";
            System.out.println(resp[2]);
        }
        else{
            resp[2] = "Y";
            System.out.println(resp[2]);
        }
        
        resp[3] = "D";
        
        System.out.println(resp[3]);
        
        return resp;
    }
    
    public static int ex_7 (int[] valor) 
    {      
        int i=1, soma=0, totalentrada=0, totalvalid = 0, media;
        
        do{
            totalentrada++;
            int min = Arrays.stream(valor).min().getAsInt();
            int max = Arrays.stream(valor).max().getAsInt();
            
            if(valor[i]>=min && valor[i]<=max){
                totalvalid++;
                soma = soma + valor[i];  
            }
            i++;  
        }while(valor[i]!=-999 && totalentrada<100);
        if(totalvalid > 0){
            media = soma/totalvalid;
        }else{
            media = -999;
        }
        return media;
    }
    
    public static int ex_8 (boolean premium, boolean casquinha, int coberturas){
        
        int preco;
        
        if (premium){
            preco = 20;
        }
        else{
            preco = 15;
        }   
        if (casquinha){
            preco = preco + 2;
        }
        else{
            preco = preco + 1;
        }
        if (coberturas>1){
            preco = preco + 2;
        }else{
            preco = preco + 1;
        }
       
        
        return preco;
        
    }
    
}
