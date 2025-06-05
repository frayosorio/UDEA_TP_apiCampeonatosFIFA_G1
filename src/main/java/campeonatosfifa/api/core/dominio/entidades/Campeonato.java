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
@Table(name = "campeonato")
public class Campeonato {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "campeonato_id_seq")
    @SequenceGenerator(name = "campeonato_id_seq", sequenceName = "campeonato_id_seq", allocationSize = 1)
    @Column(name = "id")
    private int id;

    @Column(name = "campeonato", length = 100, unique = true)
    private String nombre;

    @Column(name = "año")
    private int año;

    @ManyToOne
    @JoinColumn(name="idpais", referencedColumnName = "id")
    private Seleccion paisOrganizador;

    public Campeonato(int id, String nombre, int año, Seleccion paisOrganizador) {
        this.id = id;
        this.nombre = nombre;
        this.año = año;
        this.paisOrganizador = paisOrganizador;
    }

    public Campeonato(){

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

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Seleccion getPaisOrganizador() {
        return paisOrganizador;
    }

    public void setPaisOrganizador(Seleccion paisOrganizador) {
        this.paisOrganizador = paisOrganizador;
    }

    

}
