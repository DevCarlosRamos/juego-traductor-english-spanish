package org.example;

import java.util.*;

public class JuegoAdivinanza {
    private static final int NUMERO_PALABRAS = 5;
    private List<Palabra> palabras;

    public JuegoAdivinanza(String rutaArchivo) {
        palabras = CargadorPalabras.cargarPalabrasDesdeJSON(rutaArchivo);
        Collections.shuffle(palabras);
    }

    public void iniciarJuego() {
        Scanner scanner = new Scanner(System.in);
        Set<String> palabrasAdivinadasTemporales = new HashSet<>();
        Set<String> palabrasAdivinadasTotales = new HashSet<>();

        while (true) {
            System.out.println("Adivina la palabra en español:");
            mostrarOpciones(palabrasAdivinadasTemporales);

            String palabra = solicitarTraduccion(scanner);

            if (palabra.equalsIgnoreCase("p")) {
                break;
            }

            verificarRespuesta(palabra, palabras, palabrasAdivinadasTemporales);

            if (todasPalabrasAdivinadas(palabras, palabrasAdivinadasTemporales)) {
                System.out.println("¡Felicidades! ¡Has adivinado todas las palabras!");
                palabrasAdivinadasTotales.addAll(palabrasAdivinadasTemporales);
                palabrasAdivinadasTemporales.clear();
                Collections.shuffle(palabras);
                int palabrasRestantes = contarPalabrasRestantes(palabras, palabrasAdivinadasTotales);
                System.out.println("Palabras restantes: " + palabrasRestantes);
            }
        }
        scanner.close();
    }

    private void mostrarOpciones(Set<String> palabrasAdivinadas) {
        for (int i = 0; i < NUMERO_PALABRAS; i++) {
            if (!palabrasAdivinadas.contains(palabras.get(i).getTraduccion())) {
                System.out.println((i + 1) + ". " + palabras.get(i).getEspañol());
            }
        }
    }

    private String solicitarTraduccion(Scanner scanner) {
        System.out.print("Ingrese la traducción en inglés de una de las palabras (o presione 'P' para salir): ");
        return scanner.nextLine();
    }

    private void verificarRespuesta(String palabra, List<Palabra> palabras, Set<String> palabrasAdivinadas) {
        if (palabras.stream().anyMatch(p -> p.getTraduccion().equalsIgnoreCase(palabra)) && !palabrasAdivinadas.contains(palabra.toLowerCase())) {
            System.out.println("¡Correcto!");
            palabrasAdivinadas.add(palabra.toLowerCase());
        } else {
            System.out.println("Incorrecto");
        }
    }

    private boolean todasPalabrasAdivinadas(List<Palabra> palabras, Set<String> palabrasAdivinadas) {
        return palabrasAdivinadas.size() == NUMERO_PALABRAS;
    }

    private int contarPalabrasRestantes(List<Palabra> palabras, Set<String> palabrasAdivinadas) {
        int palabrasRestantes = 0;
        for (Palabra palabra : palabras) {
            if (!palabrasAdivinadas.contains(palabra.getTraduccion())) {
                palabrasRestantes++;
            }
        }
        return palabrasRestantes;
    }
}