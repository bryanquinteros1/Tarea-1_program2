
package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    
   static Scanner scanner=new Scanner(System.in); 
   
 
    public static void main(String[] args) {
//    Scanner teclado = new Scanner(System.in); 
//    
//    String nom;
//     
//    double num5=0.11;
//    int num=0;
//    int resultado=0;
//    int dato; 
//        System.out.println("Ingrese su nombre");
//        nom = teclado.nextLine();
//        
//        System.out.println("ingrese una cantidad en Quetzales");
//        
//        num=teclado.nextInt();
//        
//        
//        System.out.println("Su nombre es:"+nom);
//        System.out.println("total es");
//        
  System.out.println("Su nombre por favor:");
       String nom = scanner.nextLine();
  


         
          System.out.println("---¿EN que moneda desea operar?---");
          System.out.println("1.Dolar");
          System.out.println("2.Euro");
          System.out.println("3.yuanes");
         
          
          System.out.println("seleccione una opcion:");
          int opcion=scanner.nextInt();
          switch(opcion){
              
              case 1:
                  Dolar();
          
                  break;
                  
              case 2:
                  Euro();
               
                  break;
               
              case 3:
                  Yuanes();
                  
                  break;
                  
              
                   
          }

    }
    static void Dolar(){
        System.out.println("---Operacion con dola---");
       
         System.out.println("Digite su Numero:");
         int numero1=scanner.nextInt();
         
       double resultado = numero1*0.13;
    
       
       System.out.println("De Quetzales a Dolares es:"+resultado);
            
    }
    
    static void Euro(){
        System.out.println("---Operacion con Euros---");
        
         System.out.println("Digite su Numero:");
         int numero1=scanner.nextInt();
        
       double resultado = numero1*0.11;
       
       System.out.println("De Quetzales a Euros es:"+resultado);
        
        
       
        
    }
    
    static void Yuanes(){
        System.out.println("---Operacion con Yuanes---");
        
      
         System.out.println("Digite su Cantidad de Quetzales:");
         int numero1=scanner.nextInt();
        
       double resultado = numero1*0.84;
       
       System.out.println("De Quetzales a Yuan es:"+resultado);
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
}
      
           
   
    
    
    



           

        
 
        
        
        
                  
        
                 
              
  

         
      
  
        
    
    

