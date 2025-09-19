public class GeradorDeTabuada {
    public static void main(String[] args) {
        int[] tabuada = new int[10];

        int numeroBase = 7;
        for(int i = 0; i < tabuada.length; i++){
            tabuada[i] = numeroBase * (i + 1);
            System.out.println(tabuada[i]);
        }
    }
}
