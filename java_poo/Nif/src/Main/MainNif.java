package Main;

import Entitys.Nif;
import Services.NifServices;

public class MainNif {
    public static void main(String[] args) {
        NifServices ns = new NifServices();
        Nif n1 = ns.askDni();
        ns.showNif(n1);
    }
}
