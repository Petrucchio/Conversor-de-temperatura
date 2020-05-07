package converção;
import java.util.*;
public class conversores {
	
	public static void tabela1() {
		System.out.println("X-----------------------------------------------------X");
		System.out.println("| indique o tipo do valor que gostaria de converter   |");
		System.out.println("|                                                     |");
		System.out.println("| 1 - Celsius                                         |");
		System.out.println("| 2 - Fahrenheit                                      |");
		System.out.println("| 3 - Kelvin                                          |");
		System.out.println("X-----------------------------------------------------X");
		
	}
	
	public static void tabelaCelsius(double valor_a_converter) {
		System.out.println("X-------------------------------------------------------------X");
		System.out.println("| indique o tipo do valor que gostaria que fosse convertido   |");
		System.out.println("|                                                             |");
		System.out.println("| 1 - Fahrenheit                                              |");
		System.out.println("| 2 - Kelvin                                                  |");
		System.out.println("X-------------------------------------------------------------X");
		String tipo_valor;
		double valor_convertido;
		tipo_valor = new Scanner (System.in).next();
		if((tipo_valor.equalsIgnoreCase("1"))||
				(tipo_valor.equalsIgnoreCase("Fahrenheit"))||
				(tipo_valor.equalsIgnoreCase("1 - Fahrenheit "))){
			System.out.println("Opção selecionada: Fahrenheit");
			valor_convertido=(valor_a_converter * 1.8) + 32;
			System.out.println();
			System.out.println("seu valor convertido é : "+valor_convertido+" F°");
			
		}else if((tipo_valor.equalsIgnoreCase("2"))||
				(tipo_valor.equalsIgnoreCase("Kelvin"))||
				(tipo_valor.equalsIgnoreCase("2 - Kelvin "))) {
			System.out.println("Opção selecionada: Kelvin");
			valor_convertido=valor_a_converter+ 273.15;
			System.out.println("seu valor convertido é : "+valor_convertido+" k°");
		}
		
		
	}
	
	public static void tabelaFahrenheit(double valor_a_converter) {
		System.out.println("X-------------------------------------------------------------X");
		System.out.println("| indique o tipo do valor que gostaria que fosse convertido   |");
		System.out.println("|                                                             |");
		System.out.println("| 1 - Celsius                                                 |");
		System.out.println("| 2 - Kelvin                                                  |");
		System.out.println("X-------------------------------------------------------------X");
		String tipo_valor;
		double valor_convertido;
		tipo_valor = new Scanner (System.in).next();
		if((tipo_valor.equalsIgnoreCase("1"))||
				(tipo_valor.equalsIgnoreCase("Celsius"))||
				(tipo_valor.equalsIgnoreCase("1 - Celsius "))){
			System.out.println("Opção selecionada: Celsius");
			valor_convertido=(valor_a_converter - 32) * 5/9;
			System.out.println();
			System.out.println("seu valor convertido é : "+valor_convertido+" C°");
			
		}else if((tipo_valor.equalsIgnoreCase("2"))||
				(tipo_valor.equalsIgnoreCase("Kelvin"))||
				(tipo_valor.equalsIgnoreCase("2 - Kelvin "))) {
			System.out.println("Opção selecionada: Kelvin");
			valor_convertido=(valor_a_converter - 32) * 5/9 + 273.15;
			System.out.println("seu valor convertido é : "+valor_convertido+" k°");
		}
		
		
	}
	
	public static void tabelaKelvin(double valor_a_converter) {
		System.out.println("X-------------------------------------------------------------X");
		System.out.println("| indique o tipo do valor que gostaria que fosse convertido   |");
		System.out.println("|                                                             |");
		System.out.println("| 1 - Celsius                                                 |");
		System.out.println("| 2 - Fahrenheit                                              |");
		System.out.println("X-------------------------------------------------------------X");
		String tipo_valor;
		double valor_convertido;
		tipo_valor = new Scanner (System.in).next();
		if((tipo_valor.equalsIgnoreCase("1"))||
				(tipo_valor.equalsIgnoreCase("Celsius"))||
				(tipo_valor.equalsIgnoreCase("1 - Celsius "))){
			System.out.println("Opção selecionada: Celsius");
			valor_convertido=(valor_a_converter - 273.1);
			System.out.println();
			System.out.println("seu valor convertido é : "+valor_convertido+" C°");
			
		}else if((tipo_valor.equalsIgnoreCase("2"))||
				(tipo_valor.equalsIgnoreCase("Fahrenheit "))||
				(tipo_valor.equalsIgnoreCase("2 - Fahrenheit  "))) {
			System.out.println("Opção selecionada: Fahrenheit ");
			valor_convertido=(valor_a_converter- 273.15) * 9/5 + 32;
			System.out.println("seu valor convertido é : "+valor_convertido+" F°");
		}
		
		
	}
}

