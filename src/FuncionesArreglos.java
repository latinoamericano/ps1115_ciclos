
/**
 *
 * @author DIEGO
 */
public class FuncionesArreglos {

    public int[] generaAleatorios(int x) {
        int num[] = new int[x];
        for (int i = 0; i < x; i++) {
            num[i] = (int) (10 + (Math.random() * 90));

        }
        return num;
    }

    public String presentaArreglo(int[] x) {
        String texto = "";
        for (int i = 0; i < x.length; i++) {
            texto += x[i] + " ";
            if ((i + 1) % 10 == 0) {
                texto += "\n";
            }
        }
        return texto;
    }
    
    public int[] invertirArreglo(int[] x) {
        int[] inv = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            inv[i] = x[x.length-i-1];
        }
        return inv;
    }
}
