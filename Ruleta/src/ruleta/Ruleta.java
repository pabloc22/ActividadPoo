/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruleta;

import java.util.Scanner;

/**
 *
 * @author juanp
 */
public class Ruleta {

    private int saldoActual = 100;
    private String apuestaColor;
    private int apuestaNumero;
    private int opcion;
    private String confirmacion = "si";
    
    
    
    public void apostarNumero(int saldo){
        Scanner sr = new Scanner(System.in); 
    saldo = saldoActual;
   if (saldoActual>0){
       int ruleta = (int)(Math.random()*10+1);
        System.out.println(" Ingrese el numero a apostar de 1 a 10");
        apuestaNumero = sr.nextInt();
        if(apuestaNumero<11 && apuestaNumero>0){
        if(apuestaNumero==ruleta){
        saldoActual= saldoActual+30;
            System.out.println("Ganó la apuesta, su nuevo saldo es :"+saldoActual);
        } 
        else{
            saldoActual= saldoActual-10;
            System.out.println("Perdió la apuesta, su nuevo saldo es: "+saldoActual);
        }
        
        }else{
            System.out.println("Ingrese un numero mayor que 0 y menor que 10 ");
            
        }
    
   }
    }
    
    public void apostarColor(String apuestaColor){
    Scanner sr = new Scanner(System.in);
    if(saldoActual>0){
    int ruleta= (int)(Math.random()*10+1);
        System.out.println("Ingrese el color a apostar (blanco/negro)");
        apuestaColor = sr.nextLine();
        if((ruleta%2)==0 && apuestaColor.equals("negro")){
            saldoActual= saldoActual+20;
            System.out.println("Usted gano la apuesta, su nuevo saldo es: "+saldoActual);
        }
        else if((ruleta%2)!=0 && apuestaColor.equals("negro")){
            saldoActual = saldoActual-10;
            System.out.println("Usted perdió la apuesta, su nuevo saldo es: "+saldoActual);
        }
        
        else if((ruleta%2)==1 && apuestaColor.equals("blanco")){
        saldoActual= saldoActual+20;
            System.out.println("Usted gano la apuesta, su nuevo saldo es: "+saldoActual);
       
        }
        else{
            saldoActual = saldoActual-10;
            System.out.println("Usted perdió la apuesta, su nuevo saldo es: "+saldoActual);
        }
        
        
    }else if(saldoActual<=0){
        System.out.println("Usted ya no tiene dinero para apostar");
        System.exit(0);
    }
    }
    
     public void menu(){
         Scanner sc =  new Scanner(System.in);
         Scanner st =  new Scanner(System.in);
         do{
   System.out.println("-----Menu----------");
       System.out.println("1. Apostar por numero");
       System.out.println("2. Apostar por color");
         System.out.println("3. Salir");
             System.out.println("Ingrese una opcion: ");
             opcion= sc.nextInt();
       switch(opcion){
           case 1:{
             apostarNumero(apuestaNumero);
           };break;
           
           case 2: {
           apostarColor(apuestaColor);
           };break;
           
           case 3:{
           System.exit(0);
           }  
       }
       System.out.println("Desea realizar otra opcion? Si/No");
       confirmacion = st.nextLine();
       
   }while(confirmacion.equals("si") || confirmacion.equals("Si"));
         }
    
    
   
}
