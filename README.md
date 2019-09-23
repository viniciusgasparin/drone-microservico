Esse projeto ilustra o uso do padrão Factory Method.

É criada uma API REST para exemplificar.

### Exemplo para rodar em Docker

1) Baixar o projeto: 
> git clone

2.1 ) Executar na própria máquina: 

a) Linux ou Mac
> ./mvnw spring-boot:run

b) Windows
> mvnw.cmd spring-boot:run

2.2) Executar em Docker

a) Criar a imagem: 
> docker build -t solicitacaoDrone .

b) Rodar aplicação em conteiner: 
> docker run --name SolicitacaoDrone -p 8080:8080 -d solicitacaoDrone

3) Exemplo de chamada no navegador:
http://localhost:8080/solicitacao?latitudeOrigem=51.65987&longitudeOrigem=51.65987&latitudeDestino=51.65987&longitudeDestino=51.65987

    
### References

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Web Starter](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-developing-web-applications)

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

