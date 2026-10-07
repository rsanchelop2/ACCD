package model.dao;

import model.entity.Mision;

public class MisionDAO extends GenericDAOImpl<Mision, Integer> {
    public MisionDAO() {
        super(Mision.class);
    }
}
