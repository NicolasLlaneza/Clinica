package modelo;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "detalle_historia_clinica")

public class DetalleHistoriaClinica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_atencion")
    private Date fechaAtencion;

    @Column(nullable = false)
    private String sintomas;

    @Column(nullable = false)
    private String diagnostico;

    @Column
    private String observaciones;

    @ManyToOne
    @JoinColumn(name="id_historia_clinica")
    private HistoriaClinica historiaClinica;

    public int getId() {
        return id;
    }

    public Date getFechaAtencion() {
        return fechaAtencion;
    }

    public void setFechaAtencion(Date fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public HistoriaClinica getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(HistoriaClinica historiaClinica) {
        this.historiaClinica = historiaClinica;
    }
}
