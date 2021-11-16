package ar.pb2.unlam.edu;

public class Heroe extends Avenger implements Comparable<Heroe> {

    public Heroe(String nombre, Integer poderInicial) {
        super(nombre, poderInicial);
    }

    public Heroe(String nombre, Integer poderInicial, Gema gema) {
        super(nombre, poderInicial, gema);
    }

    @Override
    public int compareTo(Heroe heroe) {
        return super.getNombre().compareTo(heroe.getNombre());
    }

    @Override
    public String toString() {
        return super.getNombre();
    }


}
