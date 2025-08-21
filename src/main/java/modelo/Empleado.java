package modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "empleado")

public class Empleado extends Persona {

    @Column(nullable = false)
    private int idEmpleado;

    @Column(nullable = false)
    private double sueldo;

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
