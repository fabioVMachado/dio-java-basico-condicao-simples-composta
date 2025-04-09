## Getting Started

ContaTerminha.java = Codigo para BootCamp Dio+Bradesco. Uso das Condicionais sendo usada em uma aplicação de conta bancária simulando um saque. 
Condicional Simples (if/se) - Sempre a primeira condição. Usa ()
Condicional Composta else/senão - Sempre a última condição. Não usa ()
Condicional Encadeada (else is/senão se) - Sempre entre as Condições if/se e else/senão. Usa ()

Obs: Após definir as variáveis do tipo Double Caso sua concidicional (If/se) ou (else/senão) tenha mais de uma linha de código então use {}
Ex:
if (valorSaque < Saldo)
    1 Linha: saque = saque - ValorSaque
    2 Linha: System.out.println("Saque Realizado." + saldo);

Condicional Encadeada - Possibilita que armazenemos uma condição dentro de uma variável como no arquivo
SaqueApp.java demos a variavél mensagem o valor da condicional.
Obs1: A condição Encadeada faz uso dos simbolos ? (if/se) e : (else/senão) para simplificar/abreviar o código. 
Obs2: Se nossa condicional for gerar uma conta é importante que usemos os parenteses.
Obs3: Caso use a Condicional Encadeada apenas inverta a ordem dos simbolos. 
Ex: ? (if/se) Condição Verdadeira --> : (else/senão) Condição de Comparação ? (if/se) --> : (else/senão) 




## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
