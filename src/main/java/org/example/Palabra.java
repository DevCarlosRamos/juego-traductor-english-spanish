package org.example;

class Palabra {
    private String español;
    private String traduccion;

    public Palabra(String español, String traduccion) {
        this.español = español;
        this.traduccion = traduccion;
    }

    public String getEspañol() {
        return español;
    }

    public String getTraduccion() {
        return traduccion;
    }
}