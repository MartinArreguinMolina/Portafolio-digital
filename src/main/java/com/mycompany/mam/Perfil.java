package com.mycompany.mam;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import java.util.HashMap;
import java.util.Map;

/**
 * Clase que representa el perfil de un individuo con información básica.
 * 
 * @author MARTINARREGUINMOLINA
 */
@Named
@RequestScoped
public class Perfil {
    private final String nombre = "Martin Arreguin Molina";
    private final String carrera = "Tecnologías de la Información y Comunicaciones";
    private final String foto = "img-martin.jpeg";
    
    // Mapa para almacenar lenguajes de programación y su nivel de dominio
    private final Map<String, Integer> lenguajesDeProgramacion = new HashMap() {{
        put("Java", 90);
        put("C++", 80);
        put("C#", 75);
        put("Dart", 70);
        put("JavaScript", 85);
        put("Python", 95);
    }};
    
    // Mapa para almacenar lenguajes de programación y su nivel de dominio
    private final Map<String, Integer> baseDeDatos = new HashMap() {{
        put("SQL", 90);
        put("NoSQL", 70);
    }};
    
    // Mapa para almacenar lenguajes de programación y su nivel de dominio
    private final Map<String, String[]> proyectosRealizados = new HashMap<String, String[]>() {{
    put("BLACKJACK", new String[] {
        "p1.png", 
        "Este juego fue creado con vanillaScript y VITE para después ser desplegado en la plataforma Netlify."
    });
    put("MATEMATICAS BASICAS", new String[] {
        "p2.png", 
        "La aplicación móvil fue creada en el framework de Google Flutter para después ser desplegada en la Google Play Console."
    });
    put("DRAGON BALL Z DEX", new String[] {
        "p3_1.jpeg", 
        "La aplicación de escritorio fue desarrollada en C# y no fue desplegada."
    });
    put("SERIES DE FOURIER JAVA", new String[] {
        "p4.jpeg", 
        "El proyecto fue realizado en Java y no fue desplegado."
    });
}};

    
    private final float promedio = 9.2f;

    public String getNombre() {
        return nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getFoto() {
        return foto;
    }

    public Map<String, Integer> getLenguajesDeProgramacion() {
        return lenguajesDeProgramacion;
    }

    public Map<String, Integer> getBaseDeDatos() {
        return baseDeDatos;
    }

    public  Map<String, String[]> getProyectosRealizados() {
        return proyectosRealizados;
    }

    public float getPromedio() {
        return promedio;
    }
}
