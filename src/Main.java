public class Main {
    public static void main(String[] args) {
        ClasseIPv4 classeIPv4 = new ClasseIPv4();
        String myIP = "10.255.255.255";

        if (classeIPv4.classA(myIP)) {
            System.out.println("Classe A");
        }
        if (classeIPv4.loopback(myIP)) {
            System.out.println("Classe A");
            System.out.print("Loopback");
        }
        if (classeIPv4.adresseApipaClasseA(myIP)) {
            System.out.print("Apipa");
        }
        if (classeIPv4.adressePriveeClasseA(myIP)) {
            System.out.print("Classe Privee");
        }
        if (classeIPv4.routeParDefaut(myIP)) {
            System.out.print("Route par defaut");
        }
        if (classeIPv4.classB(myIP)) {
            System.out.print("Classe B");
        }
        if (classeIPv4.classC(myIP)) {
            System.out.print("Classe C");
        }
    }
}