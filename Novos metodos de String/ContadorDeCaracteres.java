public class ContadorDeCaracteres {
    public static void main(String[] args) {
        String[] frases = {"Exemplo", "de", "frase", "para", "contar", "os", "caracteres."};

        int soma = 0;
        for (String palavra : frases) {
            soma += palavra.length();
        }


        System.out.println("A frase tem " + contador + " caracteres.");
        System.out.println("A soma dos caracteres é " + soma + ".");

    }
}
