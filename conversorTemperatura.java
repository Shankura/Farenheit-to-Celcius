
package aula.pkg3;

import java.util.Scanner;


public class conversorTemperatura {
    
    public static void main(String[] args){
        float temperatura; 
        int opcao;
        float pontooito = (float) 1.8;
        
                
    Scanner scanner = new Scanner(System.in);
            
    System.out.println("Informe a temperatura que quer alterar");
    temperatura = scanner.nextFloat();
    
    System.out.println(" ");
            
    System.out.println("1 - Farenheit para Celsius");
    System.out.println("2 - Celsius para Farenheit");
    opcao = scanner.nextInt();
    
    System.out.println(" ");
    
   switch (opcao){
           
    case 1:
        temperatura = (temperatura-32)* 5/9;
        System.out.print(temperatura);
        break;
    case 2:
        temperatura = (temperatura*pontooito)+ 32;
        System.out.print(temperatura);
        break;
    default:
        System.out.println("Escolha outra opção!");
    }
  }
}
