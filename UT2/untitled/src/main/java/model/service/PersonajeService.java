package model.service;

import java.util.List;
import model.dao.PersonajeDAO;
import model.entity.Personaje;

public class PersonajeService extends GenericServiceImpl<Personaje, Integer> {

    public PersonajeService() {
        super(new PersonajeDAO());
    }

    public int addPersonaje(Personaje personaje) {
        return create(personaje);
    }

    public Personaje getPersonajeById(Integer id) {
        return findById(id);
    }

    public List<Personaje> getAllPersonajes() {
        return findAll();
    }

    public int actualizarPersonaje(Personaje personaje) {
        return update(personaje);
    }

    public int eliminarPersonaje(Personaje personaje) {
        return delete(personaje);
    }
}
