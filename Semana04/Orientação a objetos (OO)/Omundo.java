
public class Omundo {

    public static void main(String[] args) {

        Apessoa pessoa1 = new Apessoa("Gabriel", 25, 1.87);

        Apessoa pessoa2 = new Apessoa("Carol", 29, 1.60);

        System.out.println("--- Apresentação pessoa 1 ---");
        pessoa1.apresentacao();

        System.out.println("--- Apresentação pessoa 2 ---");
        pessoa2.apresentacao();
    }
}
