package ejercicio;

import java.util.ArrayList;
import java.util.List;

public class ClsEjercicio6 {

    private String nombre;
    private double sueldo_base;
    private double sueldo_Liquitod;
    private double descuento;

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo_base() {
        return sueldo_base;
    }

    public void setSueldo_base(double sueldo_base) {
        this.sueldo_base = sueldo_base;
    }

    public double getSueldo_Liquitod() {
        return sueldo_Liquitod;
    }

    public void Ejercicio6(){
        ClsEjercicio6 ej = new ClsEjercicio6();
        List<ClsEjercicio6> Lista = new ArrayList<>();
        ej.setNombre("Sergio");
        ej.setSueldo_base(3500);
        ej.setDescuento(500);


    }
}

