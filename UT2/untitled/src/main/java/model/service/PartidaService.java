package model.service;

import java.util.List;
import model.dao.PartidaDAO;
import model.entity.Partida;

public class PartidaService extends GenericServiceImpl<Partida, Integer> {

    public PartidaService() {
        super(new PartidaDAO());
    }

    public int addPartida(Partida partida) {
        return create(partida);
    }

    public Partida getPartidaById(Integer id) {
        return findById(id);
    }

    public List<Partida> getAllPartidas() {
        return findAll();
    }

    public int actualizarPartida(Partida partida) {
        return update(partida);
    }

    public int eliminarPartida(Partida partida) {
        return delete(partida);
    }
}
