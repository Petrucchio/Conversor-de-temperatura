import java.util.*; 

public class temperatureconverter { 

  
	

     

    public static void celsius(){ 

        float celsius,farenheitminima,farenheitmaxima,temperaturaAtual; 

        System.out.println(" bem vindo ao conversor para Celsius"); 

        System.out.println("========================================"); 

        System.out.println("indique a temperatura minima em farenheit "); 

        farenheitminima=new Scanner (System.in).nextFloat(); 

        System.out.println("indique a temperatura maxima em farenheit "); 

        farenheitmaxima=new Scanner (System.in).nextFloat(); 

        System.out.println("========================================"); 

        temperaturaAtual=farenheitminima; 

        while (temperaturaAtual>=farenheitminima &&temperaturaAtual<=farenheitmaxima){ 

        celsius=((temperaturaAtual-32)*5)/9; 

        System.out.printf(" temperatura %.2f F°  =  %.2f C° \n ",temperaturaAtual,celsius); 

        temperaturaAtual++; 

        } 

        System.out.println("========================================="); 

         

         

    } 

} 