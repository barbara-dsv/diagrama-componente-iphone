## Diagrama UML do iPhone

Este repositório contém o diagrama UML das funcionalidades do iPhone, utilizando interfaces para modelar as funcionalidades.

### Classes e Interfaces:

#### Interfaces:
- **ReprodutorMusical**
  - Métodos:
    - `tocar()`
    - `pausar()`
    - `selecionarMusica(String musica)`

- **AparelhoTelefonico**
  - Métodos:
    - `ligar(String numero)`
    - `atender()`
    - `iniciarCorreioVoz()`

- **NavegadorInternet**
  - Métodos:
    - `exibirPagina(String url)`
    - `adicionarNovaAba()`
    - `atualizarPagina()`

#### Classe iPhone:
- Implementa as interfaces `ReprodutorMusical`, `AparelhoTelefonico` e `NavegadorInternet`.
- Métodos:
  - `tocar()`
  - `pausar()`
  - `selecionarMusica(String musica)`
  - `ligar(String numero)`
  - `atender()`
  - `iniciarCorreioVoz()`
  - `exibirPagina(String url)`
  - `adicionarNovaAba()`
  - `atualizarPagina()`

### Diagrama UML:
```plaintext
classDiagram
    interface ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    interface AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    interface NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iPhone {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    iPhone ..|> ReprodutorMusical
    iPhone ..|> AparelhoTelefonico
    iPhone ..|> NavegadorInternet
