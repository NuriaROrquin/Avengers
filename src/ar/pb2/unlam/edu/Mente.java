package ar.pb2.unlam.edu;

public class Mente extends Gema implements Hechizable{
    @Override
    public Integer hechizable( Integer poderInicial) {
        return poderInicial * 2;
    }
}
