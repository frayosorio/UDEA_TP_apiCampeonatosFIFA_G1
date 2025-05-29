package campeonatosfifa.api.presentacion.controladores;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import campeonatosfifa.api.core.dominio.entidades.Campeonato;
import campeonatosfifa.api.core.interfaces.servicios.ICampeonatoServicio;

@RestController
@RequestMapping("/api/campeonatos")
public class CampeonatoControlador {

    private ICampeonatoServicio servicio;

    public CampeonatoControlador(ICampeonatoServicio servicio) {
        this.servicio = servicio;
    }

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Campeonato> listar() {
        return servicio.listar();
    }

    @RequestMapping(value = "/obtener/{id}", method = RequestMethod.GET)
    public Campeonato obtener(@PathVariable int id) {
        return servicio.obtener(id);
    }

    @RequestMapping(value = "/buscar/{dato}", method = RequestMethod.GET)
    public List<Campeonato> buscar(@PathVariable String dato) {
        return servicio.buscar(dato);
    }

}
