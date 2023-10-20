public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone((long) 682578379);

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();

        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.exibirPagina();
    }
}