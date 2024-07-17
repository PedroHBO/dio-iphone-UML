
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    
// Implementação de ReprodutorMusical

    @Override
    public void tocar() {
        System.out.println("Tocando música.");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void parar() {
        System.out.println("Música parada.");
    }

    @Override
    public void avancarFaixa() {
        System.out.println("Avançando para a próxima faixa.");
    }

    @Override
    public void retrocederFaixa() {
        System.out.println("Retrocedendo para a faixa anterior.");
    }

// Implementação de AparelhoTelefonico

    @Override
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para " + numero);
    }

    @Override
    public void receberChamada() {
        System.out.println("Recebendo chamada.");
    }

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando mensagem: " + mensagem);
    }

    @Override
    public String receberMensagem() {
        return "Mensagem recebida.";
    }

// Implementação de NavegadorInternet

    @Override
    public void abrirPagina(String url) {
        System.out.println("Abrindo página: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }

    @Override
    public void adicionarAosFavoritos(String url) {
        System.out.println("Adicionando aos favoritos: " + url);
    }
}
