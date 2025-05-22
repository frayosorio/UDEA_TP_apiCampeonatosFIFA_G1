package campeonatosfifa.api.infraestructura.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import campeonatosfifa.api.core.dominio.entidades.Encuentro;

@Repository
public interface IEncuentroRepositorio extends JpaRepository<Encuentro, Integer> {

    @Query("SELECT e FROM Encuentro e  WHERE e.campeonato.id = :idcampeonato ORDER BY e.fecha ASC")
    public List<Encuentro> listarPorCampeonato(int idCampeonato);

    public List<Encuentro> listarPorCampeonatoYFase(int idCampeonato, int idFase);

    public List<Encuentro> listarPorGrupo();
}
