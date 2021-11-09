package ar.pb2.unlam.edu;

import java.util.Set;
import java.util.TreeSet;

public class Batalla {
    Set <Heroe> heroes = new TreeSet<>();
    Set <Villano> villanos = new TreeSet<>();

    public void agregarUnVillano(Villano nuevoVillano){
        villanos.add(nuevoVillano);
    }

    public void agregarUnHeroe(Heroe nuevoHeroe){
        heroes.add(nuevoHeroe);
    }

    public Set<Heroe> getHeroes() {
        return heroes;
    }

    public Set<Villano> getVillanos() {
        return villanos;
    }

    public Integer obtenerCantidadDeVillanos(){
        return villanos.size();
    }

    public Integer obtenerCantidadDeHeroes() {
        return heroes.size();
    }
}
