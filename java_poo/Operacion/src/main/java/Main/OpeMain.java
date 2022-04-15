package Main;

import Entidadades.Operacion;
import Servicio.OpeServicio;

public class OpeMain {
    
    public static void main(String[] args) {
        OpeServicio os = new OpeServicio();
        Operacion o1 = os.crearOperacion();
        
        os.sumar(o1);
        os.restar(o1);
        os.multiplicar(o1);
        os.dividir(o1);
        
    }
}
