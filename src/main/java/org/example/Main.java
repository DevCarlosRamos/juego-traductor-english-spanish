package org.example;

public class Main {
    public static void main(String[] args) {
        JuegoAdivinanza juego = new JuegoAdivinanza(System.getProperty("user.dir") + "\\src\\main\\resources\\palabras.json");
        juego.iniciarJuego();
        System.out.println("¡Hasta luego!");
    }
}