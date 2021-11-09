package ar.pb2.unlam.edu;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestAvengers {

    @Test
    public void verificarQueSePuedaCrearUnHeroe(){
        Heroe thor = new Heroe("Thor", 100);

        assertNotNull(thor);
    }

    @Test
    public void verificarQueSePuedaCrearUnVillano(){
        Villano loki = new Villano("Loki", 100);

        assertNotNull(loki);
    }

    @Test
    public void verificarQueSePuedanAgregarVillanos(){

        //todo
        //para hacer este metodo me pidio un compareTo
        //siempre que utilizo un treeset para poder acceder al size por ejemplo
        //tengo que tener si o si siempre implementada la interfaz Comparable?

        Batalla tierra = new Batalla();

        Villano loki = new Villano("Loki", 100);
        Villano ronnan = new Villano("Ronnan", 100);
        Villano redSkull = new Villano("Red Skull", 100);
        Villano soldadoDeInvierno = new Villano("Soldado De Invierno", 100);
        Villano hela = new Villano("Hela", 100);

        tierra.agregarUnVillano(loki);
        tierra.agregarUnVillano(ronnan);
        tierra.agregarUnVillano(redSkull);
        tierra.agregarUnVillano(soldadoDeInvierno);
        tierra.agregarUnVillano(hela);

        Integer valorEsperado = 5;

        assertEquals(valorEsperado, tierra.obtenerCantidadDeVillanos());
    }

    @Test
    public void verificarQueSePuedanAgregarHeroes(){

        Batalla tierra = new Batalla();

        Heroe thor = new Heroe("Thor", 100);
        Heroe capitanAmerica = new Heroe("Capitan America", 100);
        Heroe hulk = new Heroe("Hulk", 100);
        Heroe blackWidow = new Heroe("Black Widow", 100);
        Heroe ironMan = new Heroe("Iron Man", 100);

        tierra.agregarUnHeroe(thor);
        tierra.agregarUnHeroe(capitanAmerica);
        tierra.agregarUnHeroe(hulk);
        tierra.agregarUnHeroe(blackWidow);
        tierra.agregarUnHeroe(ironMan);

        Integer valorEsperado = 5;

        assertEquals(valorEsperado, tierra.obtenerCantidadDeHeroes());
    }

    @Test
    public void asignarGemas(){

        Batalla tierra = new Batalla();

        Heroe thor = new Heroe("Thor", 100);
        Heroe capitanAmerica = new Heroe("Capitan America", 100);
        Heroe hulk = new Heroe("Hulk", 100);
        Heroe blackWidow = new Heroe("Black Widow", 100);
        Heroe ironMan = new Heroe("Iron Man", 100);

        Villano loki = new Villano("Loki", 100);
        Villano ronnan = new Villano("Ronnan", 100);
        Villano redSkull = new Villano("Red Skull", 100);
        Villano soldadoDeInvierno = new Villano("Soldado De Invierno", 100);
        Villano hela = new Villano("Hela", 100);

        tierra.agregarUnVillano(loki);
        tierra.agregarUnVillano(ronnan);
        tierra.agregarUnVillano(redSkull);
        tierra.agregarUnVillano(soldadoDeInvierno);
        tierra.agregarUnVillano(hela);

        tierra.agregarUnHeroe(thor);
        tierra.agregarUnHeroe(capitanAmerica);
        tierra.agregarUnHeroe(hulk);
        tierra.agregarUnHeroe(blackWidow);
        tierra.agregarUnHeroe(ironMan);

        Integer valorEsperado = 5;

        assertEquals(valorEsperado, tierra.obtenerCantidadDeHeroes());
    }

}
