package ar.pb2.unlam.edu;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.TreeSet;

public class TestAvengers {

    @Test
    public void batallar() throws NoSePuedeEmpateException, NoAumentarPoderSinGemaException, LaGemaNoAumentaPoderException {
        Batalla tierra = new Batalla();
        Gema poder = new Poder();
        Heroe thor = new Heroe("Thor", 100, poder);

        thor.AumentarPoder();

        Villano loki = new Villano("Loki", 150);

        assertEquals(thor, tierra.EmpezarBatalla(thor, loki));
    }

    @Test (expected = NoSePuedeEmpateException.class)
    public void comprobarQueHayaExcepcionDeEmpate() throws NoSePuedeEmpateException {
        Batalla tierra = new Batalla();

        Heroe thor = new Heroe("Thor", 100);
        Villano loki = new Villano("Loki", 100);

        tierra.EmpezarBatalla(thor, loki);
    }

    @Test (expected = NoAumentarPoderSinGemaException.class)
    public void comprobarQueHayaExcepcionDeAumentarPoderSinGema() throws NoAumentarPoderSinGemaException, LaGemaNoAumentaPoderException {
        Batalla tierra = new Batalla();

        Heroe thor = new Heroe("Thor", 100);
        Villano loki = new Villano("Loki", 100);

        thor.AumentarPoder();
    }

    @Test
    public void ordenarListadoDeVillanos() throws NoSePuedeEmpateException, NoAumentarPoderSinGemaException, LaGemaNoAumentaPoderException {
        Batalla tierra = new Batalla();

        Gema mente = new Mente();
        Gema tiempo = new Tiempo();
        Gema realidad = new Realidad();
        Gema alma = new Alma();
        Gema espacio = new Espacio();
        Gema poder = new Poder();


        Avenger thor = new Heroe("Thor", 500, mente);
        Avenger capitanAmerica = new Heroe("Capitan America", 400);
        Avenger hulk = new Heroe("Hulk", 300, realidad);
        Avenger blackWidow = new Heroe("Black Widow", 200);
        Avenger ironMan = new Heroe("Iron Man", 450, espacio);

        Avenger loki = new Villano("Loki", 200);
        Avenger ronnan = new Villano("Ronnan", 800, tiempo);
        Avenger redSkull = new Villano("Red Skull", 500, alma);
        Avenger soldadoDeInvierno = new Villano("Soldado De Invierno", 400);
        Avenger hela = new Villano("Hela", 600, poder);

        thor.AumentarPoder();
        ronnan.AumentarPoder();
        hela.AumentarPoder();

        tierra.EmpezarBatalla(thor, loki); //thor --> 1000
        tierra.EmpezarBatalla(capitanAmerica, ronnan); //ronnan --> 1600
        tierra.EmpezarBatalla(hulk, redSkull); //redSkull --> 500
        tierra.EmpezarBatalla(blackWidow, soldadoDeInvierno); //soldado --> 400
        tierra.EmpezarBatalla(ironMan, hela); //hela --> 1200

        TreeSet <Villano> villanos = tierra.ordenarVillanosPor(new PorPoderDescendenteComparator());

        for (Villano villano : villanos){
            System.out.println(villano);
        }

        assertEquals (villanos.first().equals(ronnan),villanos.last().equals(soldadoDeInvierno));
    }

    @Test (expected = LaGemaNoAumentaPoderException.class)
    public void noSePudoAumentarElPoderPorSerGemaNoHechizable() throws LaGemaNoAumentaPoderException, NoAumentarPoderSinGemaException {
        Batalla batalla = new Batalla();
        Gema realidad = new Realidad();
        Avenger thor = new Heroe("Thor", 100);
        Avenger loki = new Villano("Loki", 100, realidad);
        loki.AumentarPoder();
    }

    @Test
    public void ordenarListadoDeHeroes() throws NoSePuedeEmpateException, NoAumentarPoderSinGemaException, LaGemaNoAumentaPoderException {
        Batalla tierra = new Batalla();

        Gema mente = new Mente();
        Gema tiempo = new Tiempo();
        Gema realidad = new Realidad();
        Gema alma = new Alma();
        Gema espacio = new Espacio();
        Gema poder = new Poder();


        Avenger thor = new Heroe("Thor", 500, mente);
        Avenger capitanAmerica = new Heroe("Capitan America", 400);
        Avenger hulk = new Heroe("Hulk", 500, realidad);
        Avenger blackWidow = new Heroe("Black Widow", 200);
        Avenger ironMan = new Heroe("Iron Man", 450, espacio);

        Avenger loki = new Villano("Loki", 20, poder);
        Avenger ronnan = new Villano("Ronnan", 10, tiempo);
        Avenger redSkull = new Villano("Red Skull", 30);
        Avenger soldadoDeInvierno = new Villano("Soldado De Invierno", 10, alma);
        Avenger hela = new Villano("Hela", 20);

        thor.AumentarPoder();
        ronnan.AumentarPoder();
        loki.AumentarPoder();

        tierra.EmpezarBatalla(thor, loki); //thor --> 1000
        tierra.EmpezarBatalla(capitanAmerica, ronnan); //capi --> 400
        tierra.EmpezarBatalla(hulk, redSkull); //hulk --> 5000
        tierra.EmpezarBatalla(blackWidow, soldadoDeInvierno); //soldado --> 400
        tierra.EmpezarBatalla(ironMan, hela); //hela --> 1200

        assertEquals(tierra.getHeroes().first().equals(blackWidow),tierra.getHeroes().last().equals(thor));
    }







}
