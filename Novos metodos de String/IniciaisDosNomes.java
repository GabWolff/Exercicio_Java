import java.util.Arrays;

public class IniciaisDosNomes {
    public static void main(String[] args) {
        String[] nomes = {"Joao", "Maria", "Gabriel"};

        char[] iniciais = new char[nomes.length];

        for(int i = 0; i < iniciais.length; i++){
            iniciais[i] = nomes[i].charAt(0);
        }
        System.out.println(Arrays.toString(iniciais));
    }
    
}
