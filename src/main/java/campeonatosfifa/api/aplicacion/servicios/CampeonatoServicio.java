package campeonatosfifa.api.aplicacion.servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import campeonatosfifa.api.core.dominio.entidades.Campeonato;
import campeonatosfifa.api.core.interfaces.servicios.ICampeonatoServicio;
import campeonatosfifa.api.infraestructura.repositorios.ICampeonatoRepositorio;

@Service
public class CampeonatoServicio implements ICampeonatoServicio {

    private ICampeonatoRepositorio repositorio;

    public CampeonatoServicio(ICampeonatoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public List<Campeonato> listar() {
        return repositorio.findAll();
    }

    @Override
    public Campeonato obtener(int id) {
       return repositorio.findById(id).orElse(null);
    }

    @Override
    public List<Campeonato> buscar(String dato) {
        return repositorio.buscar(dato);
    }

    @Override
    public Campeonato agregar(Campeonato campeonato) {
        campeonato.setId(0);
        return repositorio.save(campeonato);
    }

    @Override
    public Campeonato modificar(Campeonato campeonato) {
        if (repositorio.findById(campeonato.getId()).isEmpty())
            return null;
        return repositorio.save(campeonato);
    }

    @Override
    public boolean eliminar(int id) {
        try {
            if (repositorio.findById(id).isEmpty())
                return false;
            repositorio.deleteById(id);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

}
