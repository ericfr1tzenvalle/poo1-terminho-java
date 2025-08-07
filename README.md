# 🎮 Terminho

Um jogo de adivinhação de palavras no terminal, inspirado no **TERMO**, desenvolvido em **Java**.
E uma breve prática de manipulação de arquivos JSON.

---

## 🚀 Funcionalidades

- 🎯 **Modo Termo**: adivinhe uma palavra de 5 letras em até 5 tentativas.  
- 🟩 **Feedback visual com cores**:
  - Verde → Letra correta no lugar certo  
  - Amarelo → Letra correta no lugar errado  
  - Sem cor → Letra não está na palavra  
- 💾 **Salvamento local**: dados armazenados em `jogador.json`  
- 🧠 **Banco de palavras** "extenso" e randômico

---

## 🎮 Como Jogar

1. Execute o jogo no terminal.  
2. Digite seu nome (caso seja sua primeira vez).  
3. Selecione a opção "Termo" no menu.  
4. Digite uma palavra de 5 letras.  
5. Observe o feedback colorido.  
6. Continue até vencer ou acabar as tentativas.

---

## 📁 Estrutura do Projeto

```
com.terminho.terminho
│
├── controller        → Lógica do jogo (GameController.java)
├── model             → Representação de dados (Jogador.java)
├── view              → Interface no terminal (GameView.java)
└── utils             → Utilitários (leitura, palavras, cores)
```

---

## 📦 Dependências

- [Gson](https://github.com/google/gson): para salvar e carregar dados em JSON

---

## 🛠️ Como Compilar e Executar

```bash
# Clone o repositório
git clone https://github.com/ericfr1tzenvalle/poo1-terminho-java.git

# Acesse o diretório do projeto
cd poo1-terminho-java

# Compile o projeto com Maven
mvn clean package

# Execute o jogo
java -jar target/Terminho-1.0-SNAPSHOT.jar
```

---

## 👨‍💻 Autor

**Eric Fritzen Valle**  
GitHub: [@ericfr1tzenvalle](https://github.com/ericfr1tzenvalle)

---

## 📝 Licença

Projeto de uso acadêmico — sem licença específica.

