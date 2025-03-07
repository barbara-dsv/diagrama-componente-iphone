public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        // Testando funcionalidades do reprodutor musical
        meuIphone.tocar();
        meuIphone.selecionarMusica("Minha Música Favorita");

        // Testando funcionalidades do aparelho telefônico
        meuIphone.ligar("123-456-7890");
        meuIphone.atender();

        // Testando funcionalidades do navegador de internet
        meuIphone.exibirPagina("www.exemplo.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}