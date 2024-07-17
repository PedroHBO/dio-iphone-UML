# Diagrama de Classes do iPhone

```mermaid
classDiagram
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +parar()
        +avancarFaixa()
        +retrocederFaixa()
    }

    class AparelhoTelefonico {
        +fazerChamada(numero: String)
        +receberChamada()
        +enviarMensagem(mensagem: String)
        +receberMensagem(): String
    }

    class NavegadorInternet {
        +abrirPagina(url: String)
        +atualizarPagina()
        +adicionarAosFavoritos(url: String)
    }

    class iPhone {
        +tocar()
        +pausar()
        +parar()
        +avancarFaixa()
        +retrocederFaixa()
        +fazerChamada(numero: String)
        +receberChamada()
        +enviarMensagem(mensagem: String)
        +receberMensagem(): String
        +abrirPagina(url: String)
        +atualizarPagina()
        +adicionarAosFavoritos(url: String)
    }

    ReprodutorMusical <|.. iPhone
    AparelhoTelefonico <|.. iPhone
    NavegadorInternet <|.. iPhone
