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
    public Campeonato agregar(Campeonato Campeonato) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agregar'");
    }

    @Override
    public Campeonato modificar(Campeonato Campeonato) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modificar'");
    }

    @Override
    public boolean eliminar(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
    }

}
