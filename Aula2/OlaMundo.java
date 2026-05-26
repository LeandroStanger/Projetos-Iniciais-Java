public class OlaMundo {
    static String ola = "Olá, Mundo!";
    public String ola2 = "Olá, Mundo!";
    public void mensagem(){
        System.out.println(ola + " 2026!");
        System.out.println(ola);
        System.out.println(ola2);
        ola2 += " 2027";
        System.out.println(ola2);
    }
    public void main(String[] args) {
        mensagem();
    }
}