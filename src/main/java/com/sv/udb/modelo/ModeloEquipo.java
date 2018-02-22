/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.modelo;

/**
 *
 * @author Daniel
 */
public class ModeloEquipo {
    int codiEqui;
    String nombre;
    String descri;

    public ModeloEquipo() {
    }

    public ModeloEquipo(int codiEqui,String nombre, String descri) {
        this.codiEqui= codiEqui;
        this.nombre = nombre;
        this.descri = descri;
    }

    public int getCodiEqui() {
        return codiEqui;
    }

    public void setCodiEqui(int codiEqui) {
        this.codiEqui = codiEqui;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }

    @Override
    public String toString() {
        return this.nombre; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
