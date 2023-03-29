package ucsal;

import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double temp;
        
        System.out.println("Digite a temperatura:" );
        temp = sc.nextDouble();
        
        System.out.println("Informe qual conversão deseja realizar: "
        		+ "\nA) Celsius -> Kelvin"
        		+ "\nB) Celsius -> Fahrenheit"
        		+ "\nC) Kelvin -> Celsius"
        		+ "\nD) Kelvin -> Fahrenheit"
        		+ "\nE) Fahrenheit -> Celsius"
        		+ "\nF) Fahrenheit -> Kelvin");
        char opcao = sc.next().toUpperCase().charAt(0);
        
        switch (opcao) {
		case 'A':
			System.out.println("Celcius -> Kelvin = " + (temp + 273.15));
			break;
		
		case 'B':
			System.out.println("Celsius -> Fahrenheit = " + (temp * 1.8 + 32));
			break;	
			
		case 'C':
			System.out.println("Kelvin -> Celsius = " + (temp - 273.15));
			break;	
			
		case 'D':
			System.out.println("Kelvin -> Fahrenheit = " + ((temp - 273.15) * 1.8 + 32));
			break;
			
		case 'E':
			System.out.println("Fahrenheit -> Celsius = " + ((temp - 32) / 1.8));
			break;	
			
		case 'F':
			System.out.println("Fahrenheit -> Kelvin = " + ((temp - 32) * 5/9 + 273.15));
			break;	
	

		default:
			System.out.println("Opção não encontrada!!!");
			break;
		}
        
        
        
        
        
        


    


        
    }
}

