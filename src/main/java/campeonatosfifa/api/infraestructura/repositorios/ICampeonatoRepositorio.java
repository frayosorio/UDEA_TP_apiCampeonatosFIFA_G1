package campeonatosfifa.api.infraestructura.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import campeonatosfifa.api.core.dominio.entidades.Campeonato;

@Repository
public interface ICampeonatoRepositorio extends JpaRepository<Campeonato, Integer> {

    @Query("SELECT c FROM Campeonato c WHERE c.nombre LIKE '%' || :dato || '%'") // JPQL
    public List<Campeonato> buscar(String dato);
}
