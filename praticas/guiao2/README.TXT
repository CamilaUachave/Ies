servlet container

--> é responsável por gerenciar o ciclo de vida de servlets

--> mapear uma URL para um servlet particular

--> garantir que o requisitante da URL possua os direitos de acesso corretos

Um servlet container implementa o contrato de componente web da arquitetura Java EE, especificando um ambiente de tempo de execução para componentes web que inclui segurança, concorrência, gerenciamento de ciclo de vida, transação, implantação e outros serviços.


Spring Boot 

1
Servidores incorporados são úteis quando você trata seu aplicativo como um processo do SO e ele será iniciado com algo como java -jar youapp.jar. Nesse cenário, a configuração inicial da caixa com um determinado servidor de aplicativos, por exemplo, Tomcat, não é necessária. Esses aplicativos podem ser executados pelo usuário final sem a necessidade de instalação e configuração extras de um servidor de aplicativos.

Aplicações como Jenkins por exemplo extremamente beneficiar de tais embalagens. Outro cenário é quando a implantação em serviços em nuvem como Heroku. O agrupamento do servidor de aplicativos em seu jar elimina a necessidade de instalar o servidor nessas caixas de nuvem.

Aqui, essencialmente, um único aplicativo web é executado em um determinado servidor embutido. No entanto, se você deseja instalar dois aplicativos web em digamos dois contextos $ {raiz} / app1 $ {raiz} / app2 então incorporado servidor de aplicações não é uma boa opção para você.

2.


3
Anotações básicas do Spring Boot
@Bean - indica que um método produz um bean a ser gerenciado pelo Spring.
@ Service - indica que uma classe anotada é uma classe de serviço.
@Repository - indica que uma classe anotada é um repositório, que é uma abstração do acesso e armazenamento de dados.


