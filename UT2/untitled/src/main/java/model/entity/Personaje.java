package model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import model.enums.PersonajeClase;

@Entity
@Table(name = "personajes")
public class Personaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "personajeID")
    private Integer personajeID;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Enumerated(EnumType.STRING)
    @Column(name = "clase", nullable = false)
    private PersonajeClase clase;

    @Column(name = "nivel", nullable = false)
    private int nivel;

    @Column(name = "puntosVida", nullable = false)
    private int puntosVida;

    @Column(name = "armaPrincipal")
    private String armaPrincipal;

    public Integer getPersonajeID() {
        return personajeID;
    }

    public void setPersonajeID(Integer personajeID) {
        this.personajeID = personajeID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public PersonajeClase getClase() {
        return clase;
    }

    public void setClase(PersonajeClase clase) {
        this.clase = clase;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public String getArmaPrincipal() {
        return armaPrincipal;
    }

    public void setArmaPrincipal(String armaPrincipal) {
        this.armaPrincipal = armaPrincipal;
    }
}
