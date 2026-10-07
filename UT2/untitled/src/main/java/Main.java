import model.entity.Mision;
import model.entity.Partida;
import model.entity.Personaje;
import model.enums.MisionDificultad;
import model.enums.PartidaEstado;
import model.enums.PersonajeClase;
import model.service.MisionService;
import model.service.PartidaService;
import model.service.PersonajeService;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        PersonajeService personajeService = new PersonajeService();
        MisionService misionService = new MisionService();
        PartidaService partidaService = new PartidaService();

        // 1. Crear un personaje
        Personaje p = new Personaje();
        p.setNombre("Ayla la Hechicera");
        p.setClase(PersonajeClase.MAGO);
        p.setNivel(5);
        p.setPuntosVida(80);
        p.setArmaPrincipal("Bastón del Alba");
        personajeService.addPersonaje(p);

        // 2. Crear una misión
        Mision m = new Mision();
        m.setTitulo("El Bosque de las Sombras");
        m.setDescripcion("Explora las ruinas antiguas y vence a la Sombra del Olvido.");
        m.setDificultad(MisionDificultad.ALTA);
        m.setRecompensa(500);
        m.setActiva(true);
        misionService.addMision(m);

        // 3. Crear una partida
        Partida partida = new Partida();
        partida.setNombre("La leyenda de Ayla");
        partida.setFechaInicio(LocalDate.now());
        partida.setNumeroJugadores(4);
        partida.setEstado(PartidaEstado.EN_CURSO);
        partidaService.addPartida(partida);

        System.out.println("Datos iniciales añadidos correctamente.");
        System.out.println("Personajes guardados: " + personajeService.getAllPersonajes().size());
        System.out.println("Misiones guardadas: " + misionService.getAllMisiones().size());
        System.out.println("Partidas guardadas: " + partidaService.getAllPartidas().size());
    }
}
