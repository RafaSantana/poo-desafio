package dispositivos;

import browser.NavegadorInternet;
import player.ReprodutorMusical;
import telefone.AparelhoTelefonico;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagia() {
        System.out.println("Atualizando página");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo");
    }

    @Override
    public void iniciarChamadaVoz() {
        System.out.println("Iniciando chamada de voz");
    }

    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando");
    }

    @Override
    public void selecionarMusica(int faixa) {
        System.out.println("Selecionando faixa " + faixa);
    }

}
