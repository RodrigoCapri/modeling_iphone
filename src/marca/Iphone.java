package marca;

import aparelho.AparelhoTelefonico;
import utils.NavegadorInternet;
import utils.ReprodutorMusical;

public class Iphone extends AparelhoTelefonico implements NavegadorInternet, ReprodutorMusical {

    private int bateria;
    private int versao;

    public Iphone(){
        this.bateria = 100;
        this.versao = 1;
    }

    public int getBateria() {
        return bateria;
    }

    
    public int getVersao() {
        return versao;
    }

    public void setVersao(int versao) {
        this.versao = versao;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return "Iphone [bateria=" + bateria + "%, versao=" + versao + "]";
    }

    @Override
    public void tocar() {
        bateria -= 10;
        System.out.println("tocando musica");
    }

    @Override
    public void pausar() {
        bateria -= 10;
        System.out.println("pausando");
    }

    @Override
    public void selecionarMusica(String musica) {
        bateria -= 10;
        System.out.println("tocando: " + musica);
    }

    @Override
    public void exibirPagina(String url) {
        bateria -= 10;
        System.out.println("exibindo: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        bateria -= 10;
        System.out.println("adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        bateria -= 10;
        System.out.println("atualizando");
    }


}
