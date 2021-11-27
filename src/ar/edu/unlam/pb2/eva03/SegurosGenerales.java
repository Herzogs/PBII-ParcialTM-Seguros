package ar.edu.unlam.pb2.eva03;

public interface SegurosGenerales <T> {

    Integer getNumeroDePoliza();
    void agregarBienAsegurado(T bienAsegurado);
    Persona getAsegurado();
    Double getPremio();
    Integer obtenerCantidadDeBeneficiario();

}
