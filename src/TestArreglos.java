
import javax.swing.JOptionPane;

/**
 *
 * @author DIEGO
 */
public class TestArreglos {

    public static void main(String[] args) {
        FuncionesArreglos fa = new FuncionesArreglos();
        FuncionesCiclos fc = new FuncionesCiclos();
        int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de números", 55));
        int a[]=fa.generaAleatorios(x);
        String s = fa.arregloToTexto(a);
        fc.presentaMensaje(s.replaceAll("\n", "<br>"));
        fc.presentaMensaje(fa.arregloToTexto(fa.invertirArreglo(a)).replaceAll("\n", "<br>"));
    }
}
