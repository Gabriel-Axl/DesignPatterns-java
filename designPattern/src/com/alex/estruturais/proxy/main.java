package com.alex.estruturais.proxy;

import com.alex.estruturais.proxy.proxyAuthentica.Proxy;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        Scanner sc = new Scanner(System.in);
        String usuario = sc.nextLine();
        String senha = sc.nextLine();
        proxy.login(usuario, senha);
    }
}
