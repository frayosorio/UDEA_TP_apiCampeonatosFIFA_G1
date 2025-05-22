package campeonatosfifa.api.infraestructura.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import campeonatosfifa.api.core.dominio.entidades.Seleccion;

@Repository
public interface ISeleccionRepositorio extends JpaRepository<Seleccion, Integer> {

    @Query("SELECT s FROM Seleccion s WHERE s.nombre LIKE '%' || :dato || '%'") //JPQL
    public List<Seleccion> buscar(String dato);
}
