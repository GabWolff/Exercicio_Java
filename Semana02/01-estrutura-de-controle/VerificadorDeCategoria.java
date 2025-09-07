 import java.util.Scanner;
// 5 a 7 anos: Infantil A
// 8 a 10 anos: Infantil B
// 11 a 13 anos: Juvenil A
// 14 a 17 anos: Juvenil B
// 18 anos ou mais: Adulto
// Menos de 5 anos: Não pode competir
public class VerificadorDeCategoria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Vamos informar a sua categoria.");
        System.out.println("Informe a sua idade: ");
        int idade = input.nextInt();

        if (idade >= 5 && idade <= 7){
            System.out.println("Infantil A, pode competir");
        } else if (idade >= 8 && idade <= 10){
            System.out.println("Infantil B, pode competir");
        } else if (idade >= 11 && idade <= 13){
            System.out.println("Juvenil A, pode competir");
        } else if (idade >= 14 && idade <= 17){
            System.out.println("Juvenil B, pode competir");
        } else if (idade >= 18){
            System.out.println("Adulto, pode competir");
        } else {
            System.out.println("Você ainda não tem idade para competir, somente apartir dos 5 anos.");
        }
    }
    
}
