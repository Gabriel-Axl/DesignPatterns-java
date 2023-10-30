package com.alex.estruturais.facade.fachada;

import com.alex.estruturais.facade.components.Luz;
import com.alex.estruturais.facade.components.Midia;
import com.alex.estruturais.facade.components.Projetor;

public class CinemaFacade {
    Luz led = new Luz();
    Projetor projetor = new Projetor();
    Midia filme = new Midia();

    public CinemaFacade(Luz led, Projetor projetor, Midia filme) {
        this.led = led;
        this.projetor = projetor;
        this.filme = filme;
    }

    public void iniciar(String midia){
        led.ligar();
        projetor.ligar();
        filme.setMidia(midia);
        projetor.reproduzirMidia(this.filme);
    }
    public void deligar(){
        led.desligar();
        projetor.desligar();
    }
}
