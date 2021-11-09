package ar.pb2.unlam.edu;

public class Villano implements Comparable<Villano> {
    public String nombre;
    public Integer poderInicial;

    public Villano(String nombre, Integer poderInicial) {
        this.nombre = nombre;
        this.poderInicial = poderInicial;
    }

    @Override
    public int compareTo(Villano villano) {
        return this.nombre.compareTo(villano.nombre);
    }
}
