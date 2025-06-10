package campeonatosfifa.api.infraestructura.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import campeonatosfifa.api.core.dominio.entidades.Grupo;

@Repository
public interface IGrupoRepositorio extends JpaRepository<Grupo, Integer> {

    @Query("SELECT g FROM Grupo g WHERE g.nombre LIKE '%' || :dato || '%' AND g.campeonato.id=:idCampeonato") // JPQL
    public List<Grupo> buscar(int idCampeonato, String dato);

    @Query("SELECT g FROM Grupo g WHERE g.campeonato.id=:idCampeonato") // JPQL
    public List<Grupo> listarCampeonato(int idCampeonato);

}
