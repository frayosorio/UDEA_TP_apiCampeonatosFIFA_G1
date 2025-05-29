package campeonatosfifa.api.core.interfaces.servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import campeonatosfifa.api.core.dominio.entidades.Campeonato;

@Service
public interface ICampeonatoServicio {

    List<Campeonato> listar();

    Campeonato obtener(int id);

    List<Campeonato> buscar(String dato);

    Campeonato agregar(Campeonato Campeonato);

    Campeonato modificar(Campeonato Campeonato);

    boolean eliminar(int id);
}
