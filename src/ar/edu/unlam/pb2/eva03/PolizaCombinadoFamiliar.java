package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.Map;


public class PolizaCombinadoFamiliar extends Poliza implements SegurosGenerales<Vivienda>, SegurosDeVida{

    private final Map<Persona,TipoDeBeneficiario> listaBeneficiarios;
    private Bienes bienAsegurado;
    private Boolean accidente;

    public PolizaCombinadoFamiliar(Integer numero_de_poliza, Persona asegurado, Double suma_asegurada, Double prima) {
        super(numero_de_poliza,asegurado,suma_asegurada,prima);
        this.listaBeneficiarios = new HashMap<>();
        this.accidente =false;
    }

    @Override
    public void agregarBeneficiario(Persona p, TipoDeBeneficiario tipo) {
       if(!this.listaBeneficiarios.containsKey(p))
           this.listaBeneficiarios.put(p,tipo);
    }


    @Override
    public Integer getNumeroDePoliza() {
        return super.getNroPoliza();
    }

    @Override
    public void agregarBienAsegurado(Bienes bienAsegurado) {
        this.bienAsegurado = bienAsegurado;
    }

    @Override
    public Persona getAsegurado() {
        return super.getBeneficiario();
    }


    @Override
    public Integer obtenerCantidadDeBeneficiario() {
        return this.listaBeneficiarios.size();
    }

    @Override
    public Boolean fueRobado() {
        return null;
    }

    @Override
    public Boolean tuvoAlgunAccidente() {
        return this.accidente;
    }
}