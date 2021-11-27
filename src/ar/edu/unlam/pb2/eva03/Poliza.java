package ar.edu.unlam.pb2.eva03;

import java.util.Objects;
import java.util.Set;

public abstract class Poliza {

    private Integer nroPoliza;
    private Double suma;
    private Double prima;
    private Persona beneficiario;


    public Poliza(Integer nroPoliza, Persona beneficiario, Double suma, Double prima) {
        this.nroPoliza = nroPoliza;
        this.suma = suma;
        this.prima = prima;
        this.beneficiario = beneficiario;
    }

    public Integer getNroPoliza() {
        return nroPoliza;
    }

    public void setNroPoliza(Integer nroPoliza) {
        this.nroPoliza = nroPoliza;
    }

    public Double getSuma() {
        return suma;
    }

    public void setSuma(Double suma) {
        this.suma = suma;
    }

    public Double getPrima() {
        return prima;
    }

    public void setPrima(Double prima) {
        this.prima = prima;
    }

    public Persona getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(Persona beneficiario) {
        this.beneficiario = beneficiario;
    }

    public Double getPremio(){
        return ((20*this.prima)/100)+this.prima;
    }

    public abstract Boolean fueRobado();

    public abstract Boolean tuvoAlgunAccidente();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Poliza)) return false;
        Poliza poliza = (Poliza) o;
        return getNroPoliza().equals(poliza.getNroPoliza()) && getSuma().equals(poliza.getSuma()) && getPrima().equals(poliza.getPrima()) && getBeneficiario().equals(poliza.getBeneficiario());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNroPoliza());
    }
}
