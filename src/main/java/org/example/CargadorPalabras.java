package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CargadorPalabras {
    private static final int NUMERO_PALABRAS = 5;

    public static List<Palabra> cargarPalabrasDesdeJSON(String rutaArchivo) {
        List<Palabra> palabras = new ArrayList<>();
        try (FileReader reader = new FileReader(rutaArchivo)) {
            Gson gson = new Gson();
            Map<String, String> palabrasMap = gson.fromJson(reader, new TypeToken<Map<String, String>>() {}.getType());
            for (Map.Entry<String, String> entry : palabrasMap.entrySet()) {
                palabras.add(new Palabra(entry.getValue(), entry.getKey()));
            }
            if (palabras.size() < NUMERO_PALABRAS) {
                throw new IllegalArgumentException("No hay suficientes palabras en el archivo JSON.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return palabras;
    }
}
