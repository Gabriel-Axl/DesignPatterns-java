package com.alex.prototype;

import com.alex.prototype.prototipo.Personagem;
import com.alex.prototype.prototipoConcreto.Jarvis;
import com.alex.prototype.prototipoConcreto.Jorge;

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
