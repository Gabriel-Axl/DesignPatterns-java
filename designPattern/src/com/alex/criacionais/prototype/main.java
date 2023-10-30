package com.alex.criacionais.prototype;

import com.alex.criacionais.prototype.prototipo.Personagem;
import com.alex.criacionais.prototype.prototipoConcreto.Jarvis;
import com.alex.criacionais.prototype.prototipoConcreto.Jorge;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Personagem npcJarvis = new Jarvis();
        Personagem npcJorge = new Jorge();

        Personagem jarvisCareca = npcJarvis.clone();
        Personagem jorgeNatal = npcJorge.clone();

        System.out.println(Arrays.toString(jarvisCareca.getFalas()));
        System.out.println(jorgeNatal.getName()+Arrays.toString(jorgeNatal.getFalas()));
    }
}
