package ar.pb2.unlam.edu;

public class Poder extends Gema implements Hechizable{
    @Override
    public Integer hechizable(Integer poderInicial) {
        return poderInicial * 2;
    }

    /*@Override
    public Integer aumentarPoder(Avenger nuevoAvenger) {
        return null;
    }*/
}
