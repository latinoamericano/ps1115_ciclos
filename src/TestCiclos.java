
import javax.swing.JOptionPane;


/**
 *
 * @author DIEGO
 */
public class TestCiclos {

    public static void main(String[] args) {
        FuncionesCiclos f = new FuncionesCiclos();
        int x = Integer.parseInt(JOptionPane.showInputDialog("Mejorar", 15));
        String tex=f.generaAleatorios(x);
        System.out.println(tex);
        f.presentaMensaje(tex.replaceAll("\n", "<br>"));
    }
}
