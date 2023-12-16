public class Main {
    public static void main(String[] args) {
        ClasseIPv4 classeIPv4 = new ClasseIPv4();
        String myIP;

        System.out.print("Votre adresse IP: ");
        myIP = In.readString();

        assert myIP != null;

        if (classeIPv4.classA(myIP)) {
            System.out.println("Classe A");
            if (classeIPv4.adressePriveeClasse(myIP)) {
                System.out.print("Private adresse");
            } else if (classeIPv4.adresseApipaClasse(myIP)) {
                System.out.print("Adressage IP publique");
            } else if (classeIPv4.routeParDefaut(myIP)) {
                System.out.print("Route par defaut");
            }
        } else if (classeIPv4.classB(myIP)) {
            System.out.println("Classe B");
            if (classeIPv4.adressePriveeClasse(myIP)) {
                System.out.print("Private adresse");
            } else if (classeIPv4.adresseApipaClasse(myIP)) {
                System.out.print("Adressage IP publique");
            }
        } else if (classeIPv4.classC(myIP)) {
            System.out.println("Classe C");
            if (classeIPv4.adressePriveeClasse(myIP)) {
                System.out.println("Private adresse");
            } else if (classeIPv4.adresseApipaClasse(myIP)) {
                System.out.print("Adressage IP publique");
            }
        } else if (classeIPv4.loopback(myIP)) {
            System.out.println("Classe A");
            System.out.print("Loopback");
        } else {
            System.out.print("Votre IP n'a pas ete reconnue");
        }
    }
}