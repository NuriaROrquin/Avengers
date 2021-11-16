package ar.pb2.unlam.edu;

public class Avenger {

    private String nombre;
    private Integer poderInicial;
    private Gema gema;

    public Avenger(String nombre, Integer poderInicial) {
        this.nombre = nombre;
        this.poderInicial = poderInicial;
    }

    public Avenger(String nombre, Integer poderInicial, Gema gema) {
        this.nombre = nombre;
        this.poderInicial = poderInicial;
        this.gema = gema;
    }

    public void AumentarPoder() throws NoAumentarPoderSinGemaException, LaGemaNoAumentaPoderException {

        if(gema == null){
            throw new NoAumentarPoderSinGemaException("No se puede aumentar el poder sin gema");
        }

        if (gema instanceof Alma|| gema instanceof Espacio || gema instanceof Realidad) {
            throw new LaGemaNoAumentaPoderException ("No se puede aumentar porder por no ser tipo de gema aumentable.");
        }

        if(gema instanceof Mente){
            Integer num = ((Mente) gema).hechizable(poderInicial);
            this.setPoderInicial(num);
        }else if( gema instanceof Poder){
            Integer num = ((Poder) gema).hechizable(poderInicial);
            this.setPoderInicial(num);
        }else if( gema instanceof Tiempo){
            Integer num = ((Tiempo) gema).hechizable(poderInicial);
            this.setPoderInicial(num);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPoderInicial() {
        return poderInicial;
    }

    public void setPoderInicial(Integer poderInicial) {
        this.poderInicial = poderInicial;
    }

    public Gema getGema() {
        return gema;
    }

    public void setGema(Gema gema) {
        this.gema = gema;
    }
}
