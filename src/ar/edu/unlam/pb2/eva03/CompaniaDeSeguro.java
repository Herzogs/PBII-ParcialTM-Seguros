package ar.edu.unlam.pb2.eva03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CompaniaDeSeguro {

    private String nombre;
    private Set<Poliza> listaPolizas;

    public CompaniaDeSeguro(String nombre) {
        this.nombre = nombre;
        this.listaPolizas = new HashSet<>();
    }

    public void agregarPoliza(Poliza p){
        if(this.getPoliza(p.getNroPoliza())== null)
            this.listaPolizas.add(p);
    }

    public Integer obtenerLaCantidadDePolizasEmitidas(){
        return this.listaPolizas.size();
    }

    public Poliza getPoliza (Integer idx){
        Iterator<Poliza> iter = this.listaPolizas.iterator();
        Boolean enc = false;
        Poliza aux = null;
        while(iter.hasNext() && !enc){
            aux = iter.next();
            if(aux.getNroPoliza().equals(idx)){
                enc = true;
            }
        }
        return enc?aux:null;
    }

    public void denunciarSiniestro(Integer idx) throws PolizaInexistente{
        Poliza pol = this.getPoliza(idx);
        if(pol == null){
            throw new PolizaInexistente("No existe dicha poliza");
        }
        if(pol instanceof PolizaDeAuto){
            ((PolizaDeAuto)pol).setRobado(true);
        }
        if(pol instanceof PolizaAccidentesPersonales){
            ((PolizaAccidentesPersonales)pol).setAccidente(true);
        }
    }
}
