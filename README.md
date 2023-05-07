[![NPM](https://img.shields.io/npm/l/react)](https://github.com/lucarauj/API-Rest-Java-e-Spring-II/blob/main/LICENSE)

<h1 align="center"> API Rest com Java e Spring Boot: </h1>
<h2 align="center"> Banco de Dados ORM </h2>

<p align="center"><img width="700px" src="https://github.com/lucarauj/assets/blob/main/Spring.png" /></p>

### ✅ Projeto Base 👉 [🖱](https://github.com/lucarauj/API-Rest-Java-e-Spring-I)

<br>

### ⚙ Dependências:

- Spring Web
- ➕ Spring Data JPA
- ➕ H2 Database

<br>

### Modelo de Domínio:

<img width="550px" src="https://github.com/lucarauj/API-Rest-Java-e-Spring/blob/main/images/Modelo%20de%20Dom%C3%ADnio.png"/>

<br>

### ⚙ Configurando Banco de Dados H2:

```
# H2 Connection
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=

# H2 Client
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

# Show SQL
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

<br>

### 📝 Anotações:

- @GetMapping: usada para mapear solicitações HTTP GET em métodos manipuladores específicos;
- @RestController: marca a classe como um controlador onde cada método retorna um objeto de domínio em vez de uma visão;
- @RequestMapping: usada para mapear solicitações da web para classes manipuladoras específicas e métodos manipuladores;
- ➕ @Entity
- ➕ @Id
- ➕ @Table
- ➕ @GeneratedValue(strategy = GenerationType.IDENTITY)
- ➕ @ManyToOne
- ➕ @JoinColumn

<br>

## Aluno

Lucas Araujo

<a href="https://www.linkedin.com/in/lucarauj"><img alt="lucarauj | LinkdeIN" width="40px" src="https://user-images.githubusercontent.com/43545812/144035037-0f415fc7-9f96-4517-a370-ccc6e78a714b.png" /></a>
