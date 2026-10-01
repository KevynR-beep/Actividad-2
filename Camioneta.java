/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 * Autor: Kevyn Raul Hernandez Gallegos
 */
public class Camioneta extends Auto {

    private double capacidadCarga; // en kilos

    public Camioneta(String marca, double gasolina, double capacidadCarga) {
        super(marca, gasolina); // constructor de Auto
        if (capacidadCarga <= 0) {
            throw new IllegalArgumentException("La capacidad debe ser mayor a 0");
        }
        this.capacidadCarga = capacidadCarga;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        if (capacidadCarga > 0) {
            this.capacidadCarga = capacidadCarga;
        }
    }

    // Revisa si la camioneta aguanta cierto peso
    public boolean puedeCargar(double peso) {
        return peso > 0 && peso <= capacidadCarga;
    }
}