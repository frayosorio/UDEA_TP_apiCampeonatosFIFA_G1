package campeonatosfifa.api.core.dominio.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "pais")
public class Seleccion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "pais_id_seq")
    @SequenceGenerator(name="pais_id_seq", sequenceName = "pais_id_seq", allocationSize = 1)
    @Column(name = "id")
    private int id;
    @Column(name = "pais", length = 100, unique = true)
    private String nombre;
    @Column(name = "entidad", length = 100)
    private String entidad;

    public Seleccion(int id, String nombre, String entidad) {
        this.id = id;
        this.nombre = nombre;
        this.entidad = entidad;
    }
    
    public Seleccion() {
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

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    
}
