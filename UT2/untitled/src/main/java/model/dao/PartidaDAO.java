package model.dao;

import model.entity.Partida;

public class PartidaDAO extends GenericDAOImpl<Partida, Integer> {
    public PartidaDAO() {
        super(Partida.class);
    }
}
