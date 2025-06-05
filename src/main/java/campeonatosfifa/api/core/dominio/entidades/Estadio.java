package campeonatosfifa.api.core.dominio.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "estadio")
public class Estadio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "estadio_id_seq")
    @SequenceGenerator(name = "estadio_id_seq", sequenceName = "estadio_id_seq", allocationSize = 1)
    @Column(name = "id")
    private int id;

    @Column(name = "estadio", nullable = false)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "idciudad", referencedColumnName = "id", nullable = false)
    private Ciudad ciudad;

    @Column(name = "capacidad", nullable = false)
    private int capacidad;

    public Estadio() {
    }

    public Estadio(int id, String nombre, Ciudad ciudad, int capacidad) {
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.capacidad = capacidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

}
