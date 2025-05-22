package campeonatosfifa.api.infraestructura.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import campeonatosfifa.api.core.dominio.entidades.GrupoPais;
import campeonatosfifa.api.core.dominio.entidades.GrupoPaisId;

@Repository
public interface IGrupoPaisRepositorio extends JpaRepository<GrupoPais, GrupoPaisId> {

    public List<GrupoPais> listarPaises(int idGrupo);

}
