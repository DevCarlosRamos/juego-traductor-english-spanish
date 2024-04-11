package org.example;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String filePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main"
                + File.separator + "resources" + File.separator + "palabras.json";
        JuegoAdivinanza juego = new JuegoAdivinanza(filePath);
        juego.iniciarJuego();
        System.out.println("¡Hasta luego!");
    }
}
