package campeonatosfifa.api.aplicacion.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import campeonatosfifa.api.core.dominio.DTOs.TablaPosicionDto;
import campeonatosfifa.api.core.dominio.entidades.Encuentro;
import campeonatosfifa.api.core.dominio.entidades.Grupo;
import campeonatosfifa.api.core.interfaces.servicios.IGrupoServicio;
import campeonatosfifa.api.infraestructura.repositorios.IEncuentroRepositorio;
import campeonatosfifa.api.infraestructura.repositorios.IGrupoRepositorio;
import jakarta.persistence.EntityManager;

@Service
public class GrupoServicio implements IGrupoServicio {

    @Autowired
    private IGrupoRepositorio repositorio;

    @Autowired
    private IEncuentroRepositorio repositorioEncuentro;

    @Autowired
    private EntityManager em;

    @Override
    public List<Grupo> listar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listar'");
    }

    @Override
    public Grupo obtener(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtener'");
    }

    @Override
    public List<Grupo> buscar(String nombre) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscar'");
    }

    @Override
    public Grupo agregar(Grupo grupo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agregar'");
    }

    @Override
    public Grupo modificar(Grupo grupo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modificar'");
    }

    @Override
    public boolean eliminar(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
    }

    @Override
    public List<TablaPosicionDto> obtenerTablaPosiciones(int id) {
        return em
                .createNativeQuery("SELECT * FROM  fobtenertablaposiciones(:idgrupotabla) ORDER BY puntos DESC;",
                        TablaPosicionDto.class)
                .setParameter("idgrupotabla", id)
                .getResultList();
    }

    @Override
    public List<Encuentro> obtenerEncuentros(int id) {
        return repositorioEncuentro.listarPorGrupo(id);
    }

    @Override
    public List<Grupo> listarCampeonato(int idCampeonato) {
        return repositorio.listarCampeonato(idCampeonato);
    }

}
