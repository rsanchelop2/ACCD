package model.service;

import model.dao.MisionDAO;
import model.entity.Mision;

import java.util.List;

public class MisionService extends GenericServiceImpl<Mision, Integer> {

    public MisionService() {
        super(new MisionDAO());
    }

    public int addMision(Mision mision) {
        return create(mision);
    }

    public Mision getMisionById(Integer id) {
        return findById(id);
    }

    public List<Mision> getAllMisiones() {
        return findAll();
    }

    public int actualizarMision(Mision mision) {
        return update(mision);
    }

    public int eliminarMision(Mision mision) {
        return delete(mision);
    }
}
