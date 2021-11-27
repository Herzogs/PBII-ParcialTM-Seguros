package ar.edu.unlam.pb2.eva03;

import java.util.Objects;

public class Persona {
    private String nom;
    private Integer dni;
    private Integer edad;

    public Persona(String nom, Integer dni, Integer edad) {
        this.nom = nom;
        this.dni = dni;
        this.edad = edad;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;
        Persona persona = (Persona) o;
        return getNom().equals(persona.getNom()) && getDni().equals(persona.getDni()) && getEdad().equals(persona.getEdad());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDni());
    }
}
