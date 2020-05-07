package converção;
import java.util.*;
import java.io.*;
public class converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		conversores.tabela1();
		String tipo_valor;
		
		tipo_valor = new Scanner (System.in).next();
		
		double valor_a_converter,valor_convertido;
		
		
				if((tipo_valor.equalsIgnoreCase("1"))||
					(tipo_valor.equalsIgnoreCase("Celsius"))||
					(tipo_valor.equalsIgnoreCase("1 - Celsius"))){
				System.out.println("Opção selecionada: Celsius");
				System.out.println("indique o valor a ser convertido");
				valor_a_converter = new Scanner (System.in).nextDouble();
				conversores.tabelaCelsius(valor_a_converter);
				
			}else if((tipo_valor.equalsIgnoreCase("2"))||
					(tipo_valor.equalsIgnoreCase("Fahrenheit"))||
					(tipo_valor.equalsIgnoreCase("2 - Fahrenheit "))){
				System.out.println("Opção selecionada: Fahrenheit");
				System.out.println("indique o valor a ser convertido");
				valor_a_converter = new Scanner (System.in).nextDouble();
				conversores.tabelaFahrenheit(valor_a_converter);
				
			}else if((tipo_valor.equalsIgnoreCase("3"))||
					(tipo_valor.equalsIgnoreCase("Kelvin"))||
					(tipo_valor.equalsIgnoreCase("3 - Kelvin "))) {
				System.out.println("Opção selecionada: Kelvin");
				System.out.println("indique o valor a ser convertido");
				valor_a_converter = new Scanner (System.in).nextDouble();
				conversores.tabelaKelvin(valor_a_converter);
				
			}
		
			
			
		
		
	}

}
