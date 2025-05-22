package campeonatosfifa.api.infraestructura.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import campeonatosfifa.api.core.dominio.entidades.Estadio;

@Repository
public interface IEstadioRepositorio extends JpaRepository<Estadio, Integer> {

    @Query("SELECT e FROM Estadio e WHERE e.nombre LIKE '%' || :dato || '%'") // JPQL
    public List<Estadio> buscar(String dato);

    @Query("SELECT e FROM Estadio e JOIN Ciudad c ON c.id=e.ciudad.id WHERE c.pais.id=:idpais") // JPQL
    public List<Estadio> listarPorPais(int idPais);

    @Query("SELECT e FROM Estadio e " +
            " JOIN Ciudad c ON c.id=e.ciudad.id " +
            " JOIN Seleccion s ON s.id=c.pais.id " +
            " JOIN Campeonato cm ON cm.paisOrganizador.id=s.id " +
            " WHERE cm.id=:idCampeonato") // JPQL
    public List<Estadio> listarPorCampeonato(int idCampeonato);

}
