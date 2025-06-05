package campeonatosfifa.api.core.dominio.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "grupo")
public class Grupo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "grupo_id_seq")
    @SequenceGenerator(name = "grupo_id_seq", sequenceName = "grupo_id_seq", allocationSize = 1)
    @Column(name = "id")
    private int id;

    @Column(name = "grupo", nullable = false)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "idcampeonato", referencedColumnName = "id", nullable = false)
    private Campeonato campeonato;

    public Grupo() {
    }

    public Grupo(int id, String nombre, Campeonato campeonato) {
        this.id = id;
        this.nombre = nombre;
        this.campeonato = campeonato;
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

    public Campeonato getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(Campeonato campeonato) {
        this.campeonato = campeonato;
    }
}
