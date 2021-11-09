package ar.pb2.unlam.edu;

public class Heroe implements Comparable<Heroe> {

    public String nombre;
    public Integer poderInicial;

    public Heroe(String nombre, Integer poderInicial) {
        this.nombre = nombre;
        this.poderInicial = poderInicial;
    }

    @Override
    public int compareTo(Heroe heroe) {
        return this.nombre.compareTo(heroe.nombre);
    }
}
