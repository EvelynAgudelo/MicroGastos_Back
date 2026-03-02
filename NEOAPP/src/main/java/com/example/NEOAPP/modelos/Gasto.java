package com.example.NEOAPP.modelos;

import java.time.LocalDate;

public class Gasto {//id, descripcion, fecha, valor,icono 
    private Integer id;
    private String Descripcion;
    private LocalDate Fecha;
    private double Valor; //Double por si el valor tiene decimales
    private String Icono;
    
    //CONSTRUCTOR
    public Gasto() {
    }

    //GETTER Y SETTER
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate fecha) {
        Fecha = fecha;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double valor) {
        Valor = valor;
    }

    public String getIcono() {
        return Icono;
    }

    public void setIcono(String icono) {
        Icono = icono;
    }
    
    
}
