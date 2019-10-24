RESUMO DO DOCKER E ALGUNS COMANDOS IMPORTANTES 

O Docker --> é uma plataforma para desenvolvedores e administradores de sistemas desenvolver, implantar e executar aplicativos com contêineres.

vantagens do uso dos contêineres:
*Flexível
*Leve
*Intercambiável
*Portátil
*Escalável
*Empilhável

Um contêiner é iniciado executando uma imagem.

Imagem--> é um pacote executável que inclui tudo o necessário para executar um aplicativo.

exemplo: as bibliotecas, as variáveis de ambiente, o código etc 

Testei o comando comando $docker ps no terminal para ver a lista de contêineres no meu pc e o resultado foi:
 
********************************************************************
CONTAINER ID        IMAGE               COMMAND             CREATED             STATUS              PORTS               NAMES
*******************************************************************

Contêineres e máquinas virtuais

***************              *****************
  Container   *              *       VM      *
***************              *****************
    AppB      *              *     App B     *
***************              *****************
   Bins/Libs  *              *    Bins/Libs  *
***************              *****************
              *              *    Guest OS   *
    DOCKER    *              *****************
              *              *               *
              *              *  Hypervisor   *
***************              *               *
                             *****************


comandos docker

$docker--version -->verifica se possuimos uma versão suportada do Docker

$docker info --> mais detalhes sobre a instalação do Docker

Resultado:
**************************
Containers: 5
 Running: 1
 Paused: 0
 Stopped: 4
Images: 9
(...)
***************************


$docker run hello-world --> Testa se a instalação funciona executando a imagem simples do Docker (hello-world)

$docker image ls --> Lista a imagem criada anteriormente

Listar comandos da CLI do Docker
$docker
$docker container --help

Exibir versão e informações do Docker
$docker --version
$docker version
$docker info

Executar imagem do Docker
$docker run hello-world

Listar imagens do Docker
$docker image ls

istar contêineres do Docker (em execução, todos, todos no modo silencioso)
$docker container ls
$docker container ls --all
$docker container ls -aq






