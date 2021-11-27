package ar.edu.unlam.pb2.eva03;

import java.util.Map;

public interface SegurosDeVida {

    void agregarBeneficiario(Persona p, TipoDeBeneficiario tipo);
    Persona getAsegurado();
    Double getPremio();
    Integer obtenerCantidadDeBeneficiario();
}
