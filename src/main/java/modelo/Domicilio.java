package modelo;


import jakarta.persistence.*;

@Entity
@Table(name = "domicilio")

public class Domicilio {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String localidad;

    @Column(nullable = false)
    private String calle;

    @Column(nullable = false)
    private int numero;

    public int getId() {
        return id;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
