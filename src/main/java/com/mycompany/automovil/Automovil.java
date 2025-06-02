/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.automovil;

/**
 *
 * @author Calavera
 */

public class Automovil {
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
    public Automovil(String marca, int modelo, double motor,Combustible tipoCombustible, TipoAutomovil tipoAutomovil,int numeroPuertas, int cantidadAsientos,double velocidadMaxima, Color color) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.velocidadActual = 0;
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

    // Metodos de comportamiento
    public void acelerar(double velocidad) {
        if (velocidadActual + velocidad > velocidadMaxima) {
            System.out.println("No se puede acelerar más allá de la velocidad máxima.");
        } 
        else {
            velocidadActual += velocidad;
            System.out.println("Acelerando. Velocidad actual: " + velocidadActual + " km/h");
        }
    }

    public void desacelerar(double velocidad) {
        if (velocidadActual - velocidad < 0) {
            System.out.println("No se puede desacelerar a una velocidad negativa.");
        } 
        else {
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

    // Método main
    public static void main(String[] args) {
        Automovil auto = new Automovil("Mazda", 2023, 2.0,Combustible.GASOLINA, TipoAutomovil.SUV,4, 5, 180, Color.ROJO);
        Automovil auto2 = new Automovil("Toyota", 2022, 1.8,Combustible.DIESEL, TipoAutomovil.COMPACTO,4, 5, 200, Color.AZUL);
        System.out.println("Informacion del primer automovil:");
        auto.mostrarInformacion();

        System.out.println("\nSimulacion:");
        auto.velocidadActual = 100;
        System.out.println("Velocidad actual: " + auto.velocidadActual + " km/h");

        auto.acelerar(20);
        auto.desacelerar(50); 
        double distancia = 300; // km
         
        auto.velocidadActual = 120; // distinta de cero
        double tiempo = auto.tiempoLlegada(distancia);
        if (tiempo != -1) {
        System.out.println("Tiempo estimado para recorrer " + distancia + " km a " + auto.velocidadActual + " km/h: " + String.format("%.2f", tiempo) + " horas");
        }
        
        auto.frenar();
        
        
        System.out.println("\nInformacion del segundo automovil:");
        
        auto2.mostrarInformacion();
        System.out.println("\nSimulacion");
        auto2.velocidadActual = 150;
        System.out.println("Velocidad actual: " + auto2.velocidadActual + " km/h");
        auto2.acelerar(30);
        auto2.desacelerar(70);
        double distancia2 = 350; // en km
        double tiempo2 = auto2.tiempoLlegada(distancia2);
        if (tiempo2 != -1) {
            System.out.println("Tiempo estimado para recorrer " + distancia2 + " km a " + auto2.velocidadActual + " km/h: " + String.format("%.2f", tiempo2) + " horas");
        }
        auto2.frenar();
       
    }
}
