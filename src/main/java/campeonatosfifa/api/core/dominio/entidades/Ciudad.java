package campeonatosfifa.api.core.dominio.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "ciudad")
public class Ciudad {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "ciudad_id_seq")
    @SequenceGenerator(name = "ciudad_id_seq", sequenceName = "ciudad_id_seq", allocationSize = 1)
    @Column(name = "id")
    private int id;

    @Column(name = "ciudad", length = 100)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "idpais", referencedColumnName = "id")
    private Seleccion pais;

    public Ciudad(int id, String nombre, Seleccion pais) {
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
    }

    public Ciudad() {
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

    public Seleccion getPais() {
        return pais;
    }

    public void setPais(Seleccion pais) {
        this.pais = pais;
    }

}
