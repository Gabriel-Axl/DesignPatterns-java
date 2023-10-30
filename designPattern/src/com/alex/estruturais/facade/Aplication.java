package com.alex.estruturais.facade;

import com.alex.estruturais.facade.fachada.CinemaFacade;
import com.alex.estruturais.facade.components.*;
public class Aplication {
    public static void main(String[] args) {
        Luz led = new Luz();
        Projetor projetor = new Projetor();
        Midia titanic = new Midia();
        CinemaFacade cinemax = new CinemaFacade(led, projetor, titanic);
        cinemax.iniciar("titanic");

        System.out.println("\nFim da sessão\n");

        cinemax.deligar();
    }
}
