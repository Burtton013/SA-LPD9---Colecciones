package sa_lpd9_colecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
        Map<String, String> diccionario = new HashMap<>();
        
        diccionario.put("videojuego", "videogame");
        diccionario.put("pajaro", "bird");
        diccionario.put("cerveza", "beer");
        diccionario.put("cumpleaños", "birthday");
        diccionario.put("libro", "book");
        diccionario.put("tierra", "earth");
        diccionario.put("ciudad", "city");
        diccionario.put("piña", "pineapple");
        diccionario.put("pastel", "cake");
        diccionario.put("pluma", "pen");
        diccionario.put("cuero", "leather");
        diccionario.put("vidrio", "glass");
        diccionario.put("ficcion", "fiction");
        diccionario.put("motosierra", "chainsaw");
        diccionario.put("raton", "mouse");
        diccionario.put("espejo", "mirror");
        diccionario.put("jarabe", "siroup");
        diccionario.put("escudo", "shield");
        diccionario.put("celular", "cell phone");
        diccionario.put("gato", "cat");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa una palabra en español:");
        String palabraEspanol = scanner.nextLine().toLowerCase();

        if (diccionario.containsKey(palabraEspanol)) {
            String palabraIngles = diccionario.get(palabraEspanol);
            System.out.println("La traducción de \"" + palabraEspanol + "\" es \"" + palabraIngles + "\".");
        } else {
        	
            System.out.println("La palabra \"" + palabraEspanol + "\" no se encuentra en el diccionario.");
        }

        scanner.close();
    }
}
