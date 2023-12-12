public class Main {
    public static void main(String[] args) {
        ClasseIPv4 classeIPv4 = new ClasseIPv4();
        String myIP;

        System.out.print("Votre adresse IP: ");
        myIP = In.readString();

        assert myIP != null;

        if (classeIPv4.adressePriveeClasse(myIP)) {
            System.out.print("Private adresse");
        }
    }
}