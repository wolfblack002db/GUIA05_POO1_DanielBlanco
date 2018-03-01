/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.modelo;

/**
 *
 * @author Estudiante
 */
public class ModeloJugadores {
    private int codiJuga;
    private ModeloEquipo codiEqui; // la referencia -Llave foránea-
    private String nombJuga;
    private int edadJuga, altuJuga, pesoJuga;

    public ModeloJugadores() {
    }

    public ModeloJugadores(int codiJuga, ModeloEquipo codiEqui, String nombJuga, int edadJuga, int altuJuga, int pesoJuga) {
        this.codiJuga = codiJuga;
        this.codiEqui = codiEqui;
        this.nombJuga = nombJuga;
        this.edadJuga = edadJuga;
        this.altuJuga = altuJuga;
        this.pesoJuga = pesoJuga;
    }

    public int getCodiJuga() {
        return codiJuga;
    }

    public void setCodiJuga(int codiJuga) {
        this.codiJuga = codiJuga;
    }

    public ModeloEquipo getCodiEqui() {
        return codiEqui;
    }

    public void setCodiEqui(ModeloEquipo codiEqui) {
        this.codiEqui = codiEqui;
    }

    public String getNombJuga() {
        return nombJuga;
    }

    public void setNombJuga(String nombJuga) {
        this.nombJuga = nombJuga;
    }

    public int getEdadJuga() {
        return edadJuga;
    }

    public void setEdadJuga(int edadJuga) {
        this.edadJuga = edadJuga;
    }

    public int getAltuJuga() {
        return altuJuga;
    }

    public void setAltuJuga(int altuJuga) {
        this.altuJuga = altuJuga;
    }

    public int getPesoJuga() {
        return pesoJuga;
    }

    public void setPesoJuga(int pesoJuga) {
        this.pesoJuga = pesoJuga;
    }

    @Override
    public String toString() {
        return this.nombJuga; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
