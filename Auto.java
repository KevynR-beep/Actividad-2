/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 * Autor: Kevyn Raul Hernandez Gallegos
 * Actividad: TDA Auto
 */
public class Auto {

    // Atributos
    private String marca;
    private double gasolina;    // litros en el tanque (máximo 50)
    private double kilometraje; // km recorridos en total

    // Constructor con validaciones
    public Auto(String marca, double gasolina) {
        if (marca == null || marca.trim().isEmpty()) {
            throw new IllegalArgumentException("Falta la marca del auto");
        }
        if (gasolina < 0 || gasolina > 50) {
            throw new IllegalArgumentException("La gasolina debe estar entre 0 y 50 litros");
        }
        this.marca = marca;
        this.gasolina = gasolina;
        this.kilometraje = 0;
    }

    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca != null && !marca.trim().isEmpty()) {
            this.marca = marca;
        }
    }

    public double getGasolina() {
        return gasolina;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    
    public boolean cargarGasolina(double litros) {
        if (litros <= 0) {
            return false;
        }
        gasolina = gasolina + litros;
        if (gasolina > 50) {
            gasolina = 50;
        }
        return true;
    }

    
    public boolean viajar(double km) {
        if (km <= 0) {
            return false;
        }
        double litrosNecesarios = km / 10;
        if (litrosNecesarios > gasolina) {
            return false; // no alcanza
        }
        gasolina = gasolina - litrosNecesarios;
        kilometraje = kilometraje + km;
        return true;
    }

    
    public boolean necesitaGasolina() {
        return gasolina < 5;
    }

    
    public int kmPosibles(int litros) {
        if (litros <= 0) {
            return 0;
        }
        return 10 + kmPosibles(litros - 1);
    }
}