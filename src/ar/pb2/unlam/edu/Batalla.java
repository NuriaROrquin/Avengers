package ar.pb2.unlam.edu;

import java.util.*;

public class Batalla {

    Set <Heroe> heroes = new TreeSet<>();
    Set <Villano> villanos = new TreeSet<>();

    public void agregarUnVillano(Villano nuevoVillano){
        villanos.add(nuevoVillano);
    }

    public void agregarUnHeroe(Heroe nuevoHeroe){
        heroes.add(nuevoHeroe);
    }

    public TreeSet<Heroe> getHeroes() {
        return (TreeSet<Heroe>) heroes;
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

    public Avenger EmpezarBatalla(Avenger heroe, Avenger villano) throws NoSePuedeEmpateException {
        Avenger ganador = null;

        if(heroe.getPoderInicial() == villano.getPoderInicial()){
            throw new NoSePuedeEmpateException("Ambos avengers tienen el mismo poder");
        }

        if(heroe.getPoderInicial() > villano.getPoderInicial()){
            agregarUnHeroe((Heroe)heroe);
            ganador = heroe;
        }else{
            agregarUnVillano((Villano)villano);
            ganador = villano;
        }

        return ganador;
    }

    public TreeSet<Villano> ordenarVillanosPor(Comparator criterio){
        TreeSet<Villano> villanosOrdenados = new TreeSet<Villano>(criterio);
        villanosOrdenados.addAll(villanos);
        return villanosOrdenados;
    }
}

