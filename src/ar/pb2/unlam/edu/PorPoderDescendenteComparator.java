package ar.pb2.unlam.edu;

import java.util.Comparator;

public class PorPoderDescendenteComparator implements Comparator<Villano> {

    @Override
    public int compare(Villano o1, Villano o2) {
        return (o2.getPoderInicial().compareTo(o1.getPoderInicial()));
    }
}
