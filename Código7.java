package codigoOtros7;

import java.util.HashMap; // Se importó la libreria de HasgMap
import java.util.Scanner; // Se importó la libreria de Scanner

//// Este programa permite consultar la capital de un país o agregar una nueva capital al HashMap.

public class Código7 {
 // Se implementó el método main
 public static void main(String[] args) {

	    Scanner s = new Scanner(System.in); // Se agregó System.in
	    
	    //Se definió el HashMap correctamente agregando String
	    HashMap<String, String> capitales = new HashMap<>();  

	    capitales.put("Canadá", "Ottawa"); 
	    capitales.put("Estados Unidos", "Washington DC");
	    capitales.put("México", "México DF");
	    capitales.put("Belice", "Belmopán");
	    capitales.put("Costa rica", "San José");
	    capitales.put("El Salvador", "San Salvador"); // Le faltaba agregar un valor
	    capitales.put("Guatemala", "Ciudad de Guatemala");
	    capitales.put("Honduras", "Tegucigalpa");
	    capitales.put("Nicaragua", "Managua");
	    capitales.put("Panamá", "Panamá");
	   
	    String c = ""; // Se corrigió la palabra String
	    do {
	      System.out.print("Escribe el nombre de un país y te diré su capital: "); //Se cambió a "in" a "out"
	      c = s.nextLine();  // Se cambió a nextLine() para leer una cadena de texto


	      if (!c.equals("salir")) { // Se usó equals en lugar de equal
	    	  if (capitales.containsKey(c)) {  //Cambié ca por capitales y se cambió por containsKey
	          System.out.print("La capital de " + c); //Faltaba agregar "out"
	          System.out.println(" es " + capitales.get(c)); //Cambié ca por capitales y se cambió a .get(c)
	        } else {
	          System.out.print("No conozco la respuesta ");
	          System.out.print("¿cuál es la capital de " + c + "?: ");
	          String ca = s.nextLine();
	          capitales.put(c, ca); //Cambié ca por capitales
	          System.out.println("Gracias por enseñarme nuevas capitales");
	        }
	      }
	      //La palabra while estaba mal escrita
	    } while (!c.equals("salir")); //Faltaba un paréntesis
        s.close();
	  }
}

