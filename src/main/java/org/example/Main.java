package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<String, String> palabras;
    private static int palabrasRestantes;

    private static void cargarPalabrasDesdeJSON() {
        try (FileReader reader = new FileReader(System.getProperty("user.dir")+"\\src\\main\\resources\\palabras.json")) {
            Gson gson = new Gson();
            palabras = gson.fromJson(reader, new TypeToken<Map<String, String>>(){}.getType());
            palabrasRestantes = palabras.size();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        cargarPalabrasDesdeJSON();

        Scanner scanner = new Scanner(System.in);
        String palabra;

        do {
            System.out.print("Ingrese una palabra (o presione 'P' para salir): ");
            palabra = scanner.nextLine();

            if (palabra.equalsIgnoreCase("p")) {
                break;
            }

            if (palabras.containsKey(palabra.toLowerCase())) {
                System.out.println("¡Correcto!");
                palabrasRestantes--;

                if (palabrasRestantes == 0) {
                    System.out.println("¡Felicidades! ¡Has adivinado todas las palabras!");
                    return;
                }
            } else {
                System.out.println("Incorrecto");
            }

            System.out.println("Palabras restantes por adivinar: " + palabrasRestantes);

        } while (true);

        System.out.println("¡Hasta luego!");
    }
}