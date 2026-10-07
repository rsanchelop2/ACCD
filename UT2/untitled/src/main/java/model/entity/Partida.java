package model.entity;

import jakarta.persistence.*;
import model.enums.PartidaEstado;

import java.time.LocalDate;

@Entity
@Table(name = "partidas")
public class Partida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "partidaID")
    private Integer partidaID;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "fechaInicio")
    private LocalDate fechaInicio;

    @Column(name = "numeroJugadores", nullable = false)
    private int numeroJugadores;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado", nullable = false)
    private PartidaEstado estado;


    //region Getters & Setter
    public Integer getPartidaID() {
        return partidaID;
    }

    public void setPartidaID(Integer partidaID) {
        this.partidaID = partidaID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getNumeroJugadores() {
        return numeroJugadores;
    }

    public void setNumeroJugadores(int numeroJugadores) {
        this.numeroJugadores = numeroJugadores;
    }

    public PartidaEstado getEstado() {
        return estado;
    }

    public void setEstado(PartidaEstado estado) {
        this.estado = estado;
    }
    //endregion
}
