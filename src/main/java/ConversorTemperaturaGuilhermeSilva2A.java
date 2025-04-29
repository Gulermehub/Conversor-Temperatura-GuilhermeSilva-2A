
import java.util.Scanner;


public class ConversorTemperaturaGuilhermeSilva2A {

    public static void main(String[] args) {               
        Scanner scan = new Scanner(System.in);
        
        boolean continuar = true;
        while (continuar){
        
            System.out.println("=======Conversor de Temperatura======");
            System.out.println("1. Celsius");
            System.out.println("2. Fahrenheit");
            System.out.println("3. Kelvin");
            System.out.println("4. Sair");
            System.out.println("Escolha a unidade de origem (1-4):  ");
            int escolha  = scan.nextInt();
            if (escolha  == 4){
                continuar = false;
                continue;
            }
            if (escolha<1 || escolha>4){
                System.out.println("Opção Invalida");
                continue;
            
            }
            System.out.println("Digite o valorda temperatura");
            double Graus  = scan.nextDouble();
            
            switch(escolha) {
            
                case 1:
                    Celsius celsius = new Celsius(Graus);
                    System.out.println("=========================================================================== ");

                    System.out.println("Resultado: ");
                    System.out.println("Fahrenheit:" + celsius.paraFahrenheit());
                    System.out.println("Kelvin:" + celsius.paraKelvin());
                    System.out.println("=========================================================================== ");
                    break;
                case 2:
                    Fahrenheit fafa = new Fahrenheit(Graus);
                    System.out.println("=========================================================================== ");

                    System.out.println("Resultado: ");
                    System.out.println("Celsius:" + fafa.paraCelsius());
                    System.out.println("Kelvin:" + fafa.paraKelvin());
                    System.out.println("=========================================================================== ");
                    break;
                case 3:
                    Kelvin keke = new Kelvin(Graus);
                    System.out.println("=========================================================================== ");

                    System.out.println("Resultado: ");
                    System.out.println("Celsius:" + keke.paraCelsius());
                    System.out.println("Fahrenheit:" + keke.paraFahrenheit());
                    System.out.println("=========================================================================== ");
                    break;
               
     
                    
                    
                    
            }
        
        System.out.println("=================PROGRAMA ENCERRADO========================== ");
        
    
      }
        
        scan.close();
        
           
}}
