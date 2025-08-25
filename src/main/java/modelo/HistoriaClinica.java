package modelo;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "historia_clinica")

public class HistoriaClinica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private int numero;

    @Temporal(TemporalType.DATE)
    @Column(name="fecha_alta", nullable = false)
    private Date fechaAlta;

    @OneToMany(mappedBy = "historiaClinica")
    private List<DetalleHistoriaClinica> detallesHistoriaClinica;

    public int getId() {
        return id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public List<DetalleHistoriaClinica> getDetallesHistoriaClinica() {
        return detallesHistoriaClinica;
    }

    public void setDetallesHistoriaClinica(List<DetalleHistoriaClinica> detallesHistoriaClinica) {
        this.detallesHistoriaClinica = detallesHistoriaClinica;
    }
}
