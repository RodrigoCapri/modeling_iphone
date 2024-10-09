
package application;

import marca.Iphone;

public class App {

    public App(){

        Iphone iphone = new Iphone();

        
        System.out.println(iphone.toString());

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Curtain Call - Eminem");  
        iphone.exibirPagina("google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        System.out.println(iphone.toString());

    }

    public static void main(String[] args) {
        new App();
    }

}
