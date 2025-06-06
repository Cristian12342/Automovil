/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiculos;

import com.mycompany.vehiculos.TipoAutomovil;

/**
 *
 * @author Calavera
 */
public class Auto {

        private String marca;
        private int modelo;
        private double motor;
        private Combustible tipoCombustible;
        private TipoAutomovil tipoAutomovil;
        private int numeroPuertas;
        private int cantidadAsientos;
        private double velocidadMaxima;
        private Color color;
        private double velocidadActual;

        // Constructor
        public Auto(String marca, int modelo, double motor, Combustible tipoCombustible, TipoAutomovil tipoAutomovil, int numeroPuertas, int cantidadAsientos, double velocidadMaxima, Color color, double velocidadActual) {
            this.marca = marca;
            this.modelo = modelo;
            this.motor = motor;
            this.tipoCombustible = tipoCombustible;
            this.tipoAutomovil = tipoAutomovil;
            this.numeroPuertas = numeroPuertas;
            this.cantidadAsientos = cantidadAsientos;
            this.velocidadMaxima = velocidadMaxima;
            this.color = color;
            this.velocidadActual = velocidadActual;
        }

        public Auto(){

        }

        // Metodos get->leer y set->modificar
        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public int getModelo() {
            return modelo;
        }

        public void setModelo(int modelo) {
            this.modelo = modelo;
        }

        public double getMotor() {
            return motor;
        }

        public void setMotor(double motor) {
            this.motor = motor;
        }

        public int getNumeroPuertas() {
            return numeroPuertas;
        }

        public void setNumeroPuertas(int numeroPuertas) {
            this.numeroPuertas = numeroPuertas;
        }

        public int getCantidadAsientos() {
            return cantidadAsientos;
        }

        public void setCantidadAsientos(int cantidadAsientos) {
            this.cantidadAsientos = cantidadAsientos;
        }

        public double getVelocidadMaxima() {
            return velocidadMaxima;
        }

        public void setVelocidadMaxima(double velocidadMaxima) {
            this.velocidadMaxima = velocidadMaxima;
        }

        public Color getColor() {
            return color;
        }

        public void setColor(Color color) {
            this.color = color;
        }

        public double getVelocidadActual(){
            return velocidadActual;
        }

        public void setVelocidadActual(double velocidadActual){
            this.velocidadActual = velocidadActual;
        }

        // Metodos de comportamiento
        public void acelerar(double velocidad) {
            if (velocidadActual + velocidad > velocidadMaxima) {
                System.out.println("No se puede acelerar más allá de la velocidad máxima.");
            } else {
                velocidadActual += velocidad;
                System.out.println("Acelerando. Velocidad actual: " + velocidadActual + " km/h");
            }
        }

        public void desacelerar(double velocidad) {
            if (velocidadActual - velocidad < 0) {
                System.out.println("No se puede desacelerar a una velocidad negativa.");
            } else {
                velocidadActual -= velocidad;
                System.out.println("Desacelerando. Velocidad actual: " + velocidadActual + " km/h");
            }
        }

        public void frenar() {
            velocidadActual = 0;
            System.out.println("Frenando. Velocidad actual: 0 km/h");
        }

        public double tiempoLlegada(double distancia) {
            if (velocidadActual <= 0) {
                System.out.println("No se puede calcular el tiempo con velocidad 0.");
                return -1;
            }
            return distancia / velocidadActual;
        }

        public void mostrarInformacion() {
            System.out.println("--- Informacion del Automovil ---");
            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
            System.out.println("Motor: " + motor + " L");
            System.out.println("Tipo de combustible: " + tipoCombustible);
            System.out.println("Tipo de automovil: " + tipoAutomovil);
            System.out.println("Puertas: " + numeroPuertas);
            System.out.println("Asientos: " + cantidadAsientos);
            System.out.println("Velocidad maxima: " + velocidadMaxima + " km/h");
            System.out.println("Color: " + color);
            System.out.println("Velocidad actual: " + velocidadActual + " km/h");
            System.out.println("----------------------------------");
        }

    }