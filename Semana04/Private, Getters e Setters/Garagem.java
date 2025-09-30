
import java.util.ArrayList;

public class Garagem {

    public static void main(String[] args) {
        ArrayList<Carro> minhaGaragem = new ArrayList<>();

        Carro carro1 = new Carro("Ford", "Ka", 2020);
        minhaGaragem.add(carro1);

        Carro carro2 = new Carro("Chevrolet", "Onix", 2022);
        minhaGaragem.add(carro2);

        System.out.println("--- Carros na Garagem ---");
        for (Carro carroDaVez : minhaGaragem) {
            carroDaVez.exibirInfo();
        }
    }
}
