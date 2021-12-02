package mundopc;
import com.gm.mundopc.*;

public class MundoPc {
    public static void main(String[] args) {
    Orden orden = new Orden();
    Monitor monitor = new Monitor("Noblex",25.5);
    Teclado teclado = new Teclado("Inalambrico","Redragon");
    Raton raton = new Raton("Alambrico","Hyperx");
    Computadora computadora = new Computadora("HP",monitor,teclado,raton);
    Computadora computadoraDos = new Computadora("HP",monitor,teclado,raton);
    orden.agregarComputadora(computadora);
    orden.agregarComputadora(computadoraDos);
    orden.mostrarOrden(orden);
    }
}
