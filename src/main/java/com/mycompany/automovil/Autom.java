package com.mycompany.automovil;

import com.mycompany.vehiculos.*;

public class Autom {
    public static void main (String[] args) {
        Auto auto = new Auto("Toyota", 2022, 2.0, Combustible.GASOLINA, TipoAutomovil.COMPACTO, 4, 5, 180, Color.AZUL, 0);
        System.out.println("Informacion del primer automovil:");
        auto.mostrarInformacion();

        System.out.println("\nSimulacion:");
        auto.setVelocidadActual(100);
        System.out.println("Velocidad actual: " + auto.getVelocidadActual() + " km/h");

        auto.acelerar(20);
        auto.desacelerar(50); 
        double distancia = 300; // km
         
        auto.getVelocidadActual(); // distinta de cero
        double tiempo = auto.tiempoLlegada(distancia);
        if (tiempo != -1) {
        System.out.println("Tiempo estimado para recorrer " + distancia + " km a " + auto.getVelocidadActual() + " km/h: " + String.format("%.2f", tiempo) + " horas");
        }
        
        auto.frenar();
        
        
        System.out.println("\nInformacion del segundo automovil:");
        
        auto.mostrarInformacion();
        System.out.println("\nSimulacion");
        auto.setVelocidadActual(50);
        System.out.println("Velocidad actual: " + auto.getVelocidadActual() + " km/h");
        auto.acelerar(30);
        auto.desacelerar(70);
        double distancia2 = 350; // en km
        double tiempo2 = auto.tiempoLlegada(distancia2);
        if (tiempo2 != -1) {
            System.out.println("Tiempo estimado para recorrer " + distancia2 + " km a " + auto.getVelocidadActual() + " km/h: " + String.format("%.2f", tiempo2) + " horas");
        }
        auto.frenar();
       
    }



}
 