package com.example.NEOAPP.modelos;

import java.time.LocalDate;
import java.util.List;
import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity

@Table (name = "gasto")
    public class Gasto {//id, descripcion, fecha, valor,icono 
        private Integer id;
        private String Descripcion;
        private LocalDate Fecha;
        private double Valor; //Double por si el valor tiene decimales
        private String Icono;

        /*RELACION CON TABLA USUARIO: 1 GASTO - 1 USUARIO*/
        @ManyToAny       /*ManyToAny sirve para la relacion de 1 a 1*/
        @JoinColumn(name = "fk_usuario", referencedColumnName = "id")    /*Sirve para crear las llaves foraneas   NAME: crear el nombre para la llave foranea*/
        private Usuario usuario;

        /*RELACION CON TABLA CATEGORIA: 1 GASTO -  MUCHAS CATEGORIAS*/
        @OneToMany (mappedBy = "gasto")
        private List <Categoria> categorias;

        /*RELACION CON TABLA COMERCIO: 1 GASTO - MUCHOS COMERCIOS*/
        @OneToMany (mappedBy = "comercio")
        private List <Comercio> comercios ;


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

@Table(name="gastos")
public class Gasto {

    //id,descripcion,fecha,valor,icono
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String descripcion;
    private LocalDate fecha;
    private Double valor;
    private String icono;


    //relacion con tabla usuario
    //1 gasto asociado a 1 solo usuario
    @ManyToOne
    @JoinColumn(name = "fk_usuario", referencedColumnName = "id")
    private Usuario usuario;

    
    public Gasto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;

    }
}
