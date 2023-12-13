public class ClasseIPv4 {
    private final String _192_a_223 = "(19[2-9]|2[0-1][0-9]|22[0-3])";
    private final String _0_a_255 = "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";
    private final String _0_a_126 = "([0-9]|[1-9][0-9]|1[0-1][0-9]|12[0-6])";
    private final String _128_a_191 = "(12[8-9]|1[3-8][0-9]|19[0-1])";
    private final String adressesPrivate = "(((10)[.]" + _0_a_255 + "[.]" + _0_a_255 + "[.]" + _0_a_255 + ")" + "|(((172)[.](1[6-9]|2[0-9]|3[0-1]))" + "[.]" + _0_a_255 + "[.]" + _0_a_255 + ")" + "|(((192)[.](168))" + "[.]" + _0_a_255 + "[.]" + _0_a_255 + ")" + ")";
    private final String apipClasse = "";

    public boolean classA(String ipAdresse) {
        return ipAdresse.matches(_0_a_126 + "[.]" + _0_a_255 + "[.]" + _0_a_255 + "[.]" + _0_a_255);
    }
    public boolean classB(String ipAdresse) {
        return ipAdresse.matches(_128_a_191 + "[.]" + _0_a_255 + "[.]" + _0_a_255 + "[.]" + _0_a_255);
    }
    public boolean classC(String ipAdresse) {
        return ipAdresse.matches(_192_a_223 + "[.]" + _0_a_255 + "[.]" + _0_a_255 + "[.]" + _0_a_255);
    }
    public boolean routeParDefaut(String ipAdresse) {
        return ipAdresse.matches("0" + "[.]" + _0_a_255 + "[.]" + _0_a_255 + "[.]" + _0_a_255);
    }
    public boolean loopback(String ipAdresse) {
        return ipAdresse.matches("127" + "[.]" + _0_a_255 + "[.]" + _0_a_255 + "[.]" + _0_a_255);
    }
    public boolean adressePriveeClasse(String ipAdresse) {
        return ipAdresse.matches(adressesPrivate);
    }
    public boolean adresseApipaClasse(String ipAdresse) {
       return true;
    }

}