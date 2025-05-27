package campeonatosfifa.api.core.interfaces.servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import campeonatosfifa.api.core.dominio.entidades.Seleccion;

@Service
public interface ISeleccionServicio {

    List<Seleccion> listar();

    Seleccion obtener(int id);

    List<Seleccion> buscar(String dato);

    Seleccion agregar(Seleccion seleccion);

    Seleccion modificar(Seleccion seleccion);

    boolean eliminar(int id);

}
