
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
    public String presentaArreglo(int []x){
        return null;
    }
}
