package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.Map;

public class PolizaAccidentesPersonales extends Poliza implements SegurosDeVida{

    private final Map<Persona,TipoDeBeneficiario> listaBeneficiarios;
    private Boolean accidente;

    public PolizaAccidentesPersonales(Integer nroPoliza, Persona beneficiario, Double suma, Double prima) {
        super(nroPoliza,beneficiario, suma, prima);
        this.listaBeneficiarios = new HashMap<>();
        this.accidente =false;
    }

    @Override
    public void agregarBeneficiario(Persona p, TipoDeBeneficiario tipo) {
        if(!this.listaBeneficiarios.containsKey(p))
            this.listaBeneficiarios.put(p,tipo);
    }

    @Override
    public Persona getAsegurado() {
        return super.getBeneficiario();
    }

    @Override
    public Integer obtenerCantidadDeBeneficiario() {
        return this.listaBeneficiarios.size();
    }

    public void setAccidente(Boolean accidente) {
        this.accidente = accidente;
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
