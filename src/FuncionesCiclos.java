
import javax.swing.JOptionPane;

/**
 *
 * @author DIEGO
 */
public class FuncionesCiclos {

    public void generaAleatorio(int x) {
        for (int i = 0; i < x; i++) {
            System.out.print((int) (10 + (Math.random() * 90)) + "\t");
        }
    }

    public void presentaMensaje(String men) {
        JOptionPane.showMessageDialog(null, "<html><font color=#FF00FF size=7>" + men + "</font></html>");
    }

    public String generaAleatorios(int x) {
        String texto = "";
        for (int i = 0; i < x; i++) {
            texto += (int) (10 + (Math.random() * 90)) + " ";
            if ((i + 1) % 10 == 0) {
                texto += "\n";
            }
        }
        return texto;
    }
}
