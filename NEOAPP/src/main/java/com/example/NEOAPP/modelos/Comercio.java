package com.example.NEOAPP.modelos;

public class Comercio {
        //id, nit, nombre,actividad
        private Integer id;
        private String Nit;
        private String Nombre;
        private String Actividad;

        //CONSTRUCTOR
        public Comercio() {
        }
        //GETTER Y SETTER
        public Integer getId() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public String getNit() {
                return Nit;
        }

        public void setNit(String nit) {
                Nit = nit;
        }

        public String getNombre() {
                return Nombre;
        }

        public void setNombre(String nombre) {
                Nombre = nombre;
        }

        public String getActividad() {
                return Actividad;
        }

        public void setActividad(String actividad) {
                Actividad = actividad;
        }

        
        
}
