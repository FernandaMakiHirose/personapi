# Desenvolvendo um sistema de gerenciamento de pessoas em API REST com Spring Boot
## Tópicos abordados
* Setup inicial de projeto com o Spring Boot Initialzr 
* Criação de modelo de dados para o mapeamento de entidades em bancos de dados
* Desenvolvimento de operações de gerenciamento de usuários (Cadastro, leitura, atualização e remoção de pessoas de um sistema).
* Relação de cada uma das operações acima com o padrão arquitetural REST, e a explicação de cada um dos conceitos REST envolvidos durante o desenvolvimento do projeto.
* Desenvolvimento de testes unitários para validação das funcionalidades
* Implantação do sistema na nuvem através do Heroku

## Requisitos
* Java 11 ou versões superiores.
* Maven 3.6.3 ou versões superiores.
* Intellj IDEA Community Edition ou sua IDE favorita.
* Controle de versão GIT instalado na sua máquina.
* Conta no GitHub para o armazenamento do seu projeto na nuvem.
* Conta no Heroku para o deploy do projeto na nuvem

## Licença
Distribuido sob a licença MIT License. Veja `LICENSE` para mais informações.

## Comandos
Para executar o projeto no terminal, digite o seguinte comando:
shell script
>mvn spring-boot:run 

Após executar o comando acima, basta apenas abrir o seguinte endereço e visualizar a execução do projeto:
> http://localhost:8080/api/v1/people

Para ver se o Java está instalado:
> java --version

## Documentações
- [O que é REST API?](https://rockcontent.com/br/blog/rest-api/)
- [Palheta de atalhos de comandos do Intellij](https://resources.jetbrains.com/storage/products/intellij-idea/docs/IntelliJIDEA_ReferenceCard.pdf)
- [Site oficial do Spring Initialzr, para setup do projeto](https://start.spring.io/)
- [Site oficial do Heroku](https://www.heroku.com/)
- [Site oficial do GIT](https://git-scm.com/)
- [Site oficial do GitHub](http://github.com/)
- [Documentação oficial do Lombok](https://projectlombok.org/)
- [Documentação oficial do Map Struct](https://mapstruct.org/)
- [Referência para o padrão arquitetural REST](https://restfulapi.net/)

[Neste link](https://drive.google.com/file/d/1crVPOVl6ok2HeYjh3fjQuGQn2lDZVHrn/view?usp=sharing), seguem os slides apresentados como o roteiro utilizado para o desenvolvimento do projeto da nossa sessão.

## Instalações usadas
- [SDKMAN](https://sdkman.io/install)
- [Java](https://www.edivaldobrito.com.br/como-instalar-o-java-no-ubuntu-20-04-lts-e-derivados/)
- [Maven](https://linuxize.com/post/how-to-install-apache-maven-on-ubuntu-20-04/)
- [IntelliJ](https://askubuntu.com/questions/272314/setup-and-install-intellij-with-jdk)

## Spring Boot
- [Site oficial do Spring](https://spring.io/)
- Maven Project
- Language: Java
- Spring Boot: 2.2.6
- Group: one.digitalinnovation
- Artifact: personapi
- Packing: jar
- Dependencies: Spring Boot DevTools, Lombok, Spring Web, Spring Data JPA, Spring Boot Actuator, H2 Database.

## Como eu subi o projeto para a nuvem - Heroku
- New - Create app <br>
- App name: restapi-peopleapi <br>
- United States <br>
- Cliquem em Create app <br>
- Selecionei o Github e coloquei o repositório do projeto <br>
- Clique em Enable Automatic Deploys e Deploy Branch

## Conteúdo Bônus
- Função estática utilitária: Ela consegue se resolver por ela mesma, sem dependências externas? Os parâmetros de entrada são simples e direto? O resultado de saída também é simples e direto?
- Programação estruturada: As tomadas de decisões são feitas de forma ordenada, por meio de verificações condicionais e interações, utilizando variáveis e rotinas para o desenvolvimento do programa.
- Sobrecarga: Métodos com o mesmo nome, mas lista de parâmetros (assinaturas) diferentes.
