package campeonatosfifa.api.core.interfaces.servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import campeonatosfifa.api.core.dominio.DTOs.TablaPosicionDto;
import campeonatosfifa.api.core.dominio.entidades.Encuentro;
import campeonatosfifa.api.core.dominio.entidades.Grupo;

@Service
public interface IGrupoServicio {

    public List<Grupo> listar();

    public Grupo obtener(int id);

    public List<Grupo> buscar(String nombre);

    public Grupo agregar(Grupo grupo);

    public Grupo modificar(Grupo grupo);

    public boolean eliminar(int id);

    public List<TablaPosicionDto> obtenerTablaPosiciones(int id);

    public List<Encuentro> obtenerEncuentros(int id);

    public List<Grupo> listarCampeonato(int idCampeonato);
}
