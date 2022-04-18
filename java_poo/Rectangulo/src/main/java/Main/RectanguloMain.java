package Main;

import Entidates.Rectangulo;
import Serivicio.RectanguloServ;

public class RectanguloMain {

    public static void main(String[] args) {
        RectanguloServ rs = new RectanguloServ();
        Rectangulo r1 = rs.crearRectangulo();
        
        rs.Perimetro(r1, 0, 0);
        rs.Superficie(r1, 0, 0);
        rs.dibujar(r1, 0, 0);

    }
}
