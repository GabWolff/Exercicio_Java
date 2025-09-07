import java.util.Scanner;

public class CalculadorDeViagem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a distancia da sua viagem: ");
        Double distancia = input.nextDouble();

        System.out.println("Informe o consumo médio do seu carro: ");
        Double consumoMedio = input.nextDouble();

        System.out.println("Informe o preço atual do combustivel usado");
        Double custoCombustivel = input.nextDouble();

        double litrosNecessarios = distancia / consumoMedio;
        double custoTotal = litrosNecessarios * custoCombustivel;

        System.out.println("Para uma viagem de " + distancia);
        System.out.println("Você irá precisar de " + litrosNecessarios + "litros de gasolina");
        System.out.println("E tera o custo de $" + custoTotal + " para chegar até o local.");
    }
}
