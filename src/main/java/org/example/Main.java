package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<String, String> palabras;

    private static void cargarPalabrasDesdeJSON() {
        try (FileReader reader = new FileReader("C:\\Users\\Carlos\\Desktop\\PracticaIngles\\src\\main\\resources\\palabras.json")) {
            Gson gson = new Gson();
            palabras = gson.fromJson(reader, new TypeToken<Map<String, String>>(){}.getType());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        cargarPalabrasDesdeJSON();

        Scanner scanner = new Scanner(System.in);
        String palabra;
        int palabrasAdivinadas = 0;

        do {
            System.out.print("Ingrese una palabra (o presione 'P' para salir): ");
            palabra = scanner.nextLine();

            if (palabra.equalsIgnoreCase("p")) {
                break;
            }

            if (palabras.containsKey(palabra.toLowerCase())) {
                System.out.println("¡Correcto!");
                palabrasAdivinadas++;

                if (palabrasAdivinadas == palabras.size()) {
                    System.out.println("¡Felicidades! ¡Has adivinado todas las palabras!");
                    return;
                }
            } else {
                System.out.println("Incorrecto");
            }

        } while (true);

        System.out.println("¡Hasta luego!");
    }
}