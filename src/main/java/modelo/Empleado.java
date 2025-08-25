package modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "empleado")

public class Empleado extends Persona {

    @Column(nullable = false)
    private double sueldo;


    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
