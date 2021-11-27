package ar.edu.unlam.pb2.eva03;

public class PolizaDeAuto extends Poliza implements SegurosGenerales<Auto>{

    private Auto bienAsegurado;
    private Boolean robado;

    public PolizaDeAuto(Integer nroPoliza, Persona beneficiario, Double suma, Double prima) {
        super(nroPoliza,beneficiario, suma, prima);
        this.robado = false;
    }

    @Override
    public void agregarBienAsegurado(Auto bienAsegurado) {
        this.bienAsegurado = bienAsegurado;
    }

    @Override
    public Integer getNumeroDePoliza() {
        return super.getNroPoliza();
    }

    @Override
    public Persona getAsegurado() {
        return super.getBeneficiario();
    }

    @Override
    public Integer obtenerCantidadDeBeneficiario() {
        return 1;
    }

    public Auto getAuto(){
        return (Auto)this.bienAsegurado;
    }

    public void setRobado(Boolean robado) {
        this.robado = robado;
    }

    @Override
    public Boolean fueRobado() {
        return this.robado;
    }

    @Override
    public Boolean tuvoAlgunAccidente() {
        return null;
    }
}
