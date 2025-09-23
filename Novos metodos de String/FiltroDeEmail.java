
import java.util.Arrays;

public class FiltroDeEmail {

    public static void main(String[] args) {
        String[] emails = {"ana@gmail.com", "pedro@outlook.com", "sofia@gmail.com", "joao@yahoo.com", "maria.silva@gmail.com"};

        int contagemGmail = 0;

        for (String email : emails) {
            if (email.endsWith("@gmail.com")) {
                contagemGmail++;
            }
        }

        String[] emailsGmail = new String[contagemGmail];
        int indiceGmail = 0;

        for (String email : emails) {
            if (email.endsWith("@gmail.com")) {
                emailsGmail[indiceGmail] = email;
                indiceGmail++;

            }
        }
        System.out.println("\n--- Array com e-mails do Gmail ---");
        System.out.println(Arrays.toString(emailsGmail));
    }
}
