import browser.NavegadorInternet;
import dispositivos.IPhone;
import player.ReprodutorMusical;

public class App {
    public static void main(String[] args) {
        System.out.println("\n===Meu iPhone:===");
        IPhone iphone = new IPhone();
        iphone.ligar();
        iphone.atender();
        iphone.iniciarChamadaVoz();
        iphone.reproduzir();
        iphone.pausar();
        iphone.selecionarMusica(1);
        iphone.exibirPagina("https://www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagia();

        System.out.println("\n===Meu iPad:===");
        ReprodutorMusical iPad = new IPhone();

        iPad.selecionarMusica(3);
        iPad.reproduzir();
        iPad.pausar();

        System.out.println("\n===Meu Navegador:===");
        NavegadorInternet edge = new IPhone();

        edge.exibirPagina("https://www.google.com");
        edge.adicionarNovaAba();
        edge.atualizarPagia();

    }
}