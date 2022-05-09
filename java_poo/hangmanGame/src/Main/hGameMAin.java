package Main;

import Entitys.hGame;
import Services.hGameServices;

public class hGameMAin {
    public static void main(String[] args) {
        hGameServices gs = new hGameServices();
        hGame g1 = gs.newHManGame();
        gs.longg(g1);
        gs.findL(g1);
        gs.found(g1, "");
        gs.mostrarPalabra(g1);

    }
}