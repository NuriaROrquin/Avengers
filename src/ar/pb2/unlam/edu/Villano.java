package ar.pb2.unlam.edu;

public class Villano extends Avenger implements Comparable<Villano> {

    public Villano(String nombre, Integer poderInicial) {
        super(nombre, poderInicial);
    }

    public Villano(String nombre, Integer poderInicial, Gema gema) {
        super(nombre, poderInicial, gema);
    }

    @Override
    public int compareTo(Villano villano) {
        return super.getNombre().compareTo(villano.getNombre());
    }

    @Override
    public String toString() {
        return super.getNombre();
    }


}
