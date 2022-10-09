public class MinhaClasse2 {
    public static void main(String[] args){
        String primeiroNome = "Alexander";
        String segundoNome = "Correa";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    }
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat("").concat(segundoNome);
    }
}
