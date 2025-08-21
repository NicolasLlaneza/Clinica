package modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "medico")

public class Medico extends Persona {

    @Column(nullable = false)
    private int matricula;

    @Column (nullable = false)
    private long celular;

    @ManyToMany
    @JoinColumn(name = "id_especialidad")
    private Especialidad especialidad;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
}
