package ar.edu.unlam.pb2.eva03;

public class Auto{
    private String marca;
    private String modelo;
    private Integer anio;
    private Double valorAsegurado;

    public Auto(String marca, String modelo, Integer anio, Double valorAsegurado) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.valorAsegurado = valorAsegurado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Double getValorAsegurado() {
        return valorAsegurado;
    }

    public void setValorAsegurado(Double valorAsegurado) {
        this.valorAsegurado = valorAsegurado;
    }
}
