package modelo;

import jakarta.persistence.*;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Entity
@Table(name = "medico")

public class Medico extends Persona {

    @Column(nullable = false)
    private int matricula;

    @Column (nullable = false)
    private long celular;

    @ManyToMany
    @JoinTable(name = "medico_especialidad",joinColumns = @JoinColumn(name = "medico_id"),
    inverseJoinColumns = @JoinColumn(name = "especialidad_id"))

    private ArrayList<Especialidad> especialidad =new ArrayList<>();

    @OneToMany(mappedBy = "medico", cascade = CascadeType.ALL)
    private ArrayList<Turno> turnos;

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

    public void setEspecialidad(Especialidad especialidad) {
    }
}

