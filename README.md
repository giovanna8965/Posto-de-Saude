# Sistema de Gerenciamento de Posto de Saúde

Este é um projeto de exemplo para um sistema de gerenciamento de posto de saúde desenvolvido em Java. Ele permite o cadastro de pacientes, médicos e consultas, bem como a listagem de pacientes cadastrados.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

PostoSaude/
├── src/
│ ├── controller/
│ │ └── Main.java
│ ├── dao/
│ │ └── PacienteDAO.java
│ ├── model/
│ │ ├── Paciente.java
│ │ ├── Medico.java
│ │ └── Consulta.java
│ └── service/
│ └── PostoSaudeService.java
└── pom.xml


### Pacotes e Classes

- `controller`: Contém a classe `Main` que executa o programa.
- `dao`: Contém a classe `PacienteDAO` para acesso a dados.
- `model`: Contém as classes de modelo `Paciente`, `Medico` e `Consulta`.
- `service`: Contém a classe `PostoSaudeService` que implementa a lógica de negócios.

## Pré-requisitos

- JDK 17 ou superior
- Maven (opcional, para gerenciamento de dependências e build)

## Instalação

### 1. Instalar o JDK

Baixe e instale a versão mais recente do JDK a partir do [site oficial do Oracle](https://www.oracle.com/java/technologies/javase-downloads.html) ou do [OpenJDK](https://jdk.java.net/).

### 2. Clonar o Repositório

Clone este repositório em sua máquina local usando o comando:

git clone https://github.com/giovanna8965/PostoSaude.git
cd PostoSaude

3. Configurar o Ambiente no Visual Studio Code
Instalar Extensões Necessárias
Abra o Visual Studio Code.
Vá para a aba de extensões (Ctrl+Shift+X) e instale a extensão "Extension Pack for Java".
Configurar o JDK
Se necessário, configure o caminho do JDK no VS Code:

Abra as configurações JSON (File > Preferences > Settings e clique no ícone de configurações JSON no canto superior direito).
Adicione a seguinte configuração:

{
  "java.home": "caminho/para/o/jdk"
}

Substitua "caminho/para/o/jdk" pelo caminho do diretório onde o JDK está instalado.

Compilação e Execução

Usando Maven

No terminal integrado do VS Code, navegue até o diretório do projeto e execute:

mvn clean install

Execute o projeto com o seguinte comando:

mvn exec:java -Dexec.mainClass="controller.Main"

Sem Maven

No terminal integrado do VS Code, navegue até o diretório do projeto e compile o código com:

javac -d out src/main/java/model/*.java src/main/java/dao/*.java src/main/java/service/*.java src/main/java/controller/Main.java

Execute o código compilado com:

java -cp out controller.Main

Funcionalidades

Cadastrar Paciente: Permite o cadastro de novos pacientes.

Listar Pacientes: Lista todos os pacientes cadastrados.
