<h1 align="center">
    <h2 align="center">BackEnd Java/Spring</h2>
    
</h1>


# Livraria Online.
### Link [FrontEnd](https://github.com/samuelpd22/livrariaSL-Angular)





## 📖 Sobre 
Projeto **Livraria Online (BackEnd)** é um projeto **FullStack**.



## ⚡ Tecnologias utilizadas

Projeto desenvolvido utilizando as seguintes tecnologias
- [Java](https://www.java.com/pt-BR/)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [Lombook](https://projectlombok.org/)
- [DevTools](https://docs.spring.io/spring-boot/docs/1.5.16.RELEASE/reference/html/using-boot-devtools.html)
- [Docker](https://www.docker.com/)
- [PostgreSQL](https://www.postgresql.org/)

## Como baixar projeto

    $ git clone https://github.com/samuelpd22/Backend-livrariaSL

    $ cd Backend-livrariaSL


    
### Regras

- 1 - Antes de cadastrar qualquer livro, se certificar que o **AUTOR JÁ ESTÁ CADASTRADO**.
- 2 - Seguir modelos de **JSON**
    - Cadastrar **autor**

            {
                "nome":"Ali Hanzelwood",
                "imageAutorUrl":"https://static.fnac-static.com/multimedia/Images/PT/Comete/17654/CCP_IMG_ORIGINAL/247127.jpg"
            }
    - Cadastrar **livro** - ***INFORMAR NO CAMPO ID*** o **ID** do autor

            {
                "titulo":"Titulo",
                "imagemUrl":"url-image",
                "genero":"GENERO",
                "sinopse":"sinopse",
                "valor":"R$ 00,00",
                "linkLivro":"url-livro",
                "autor":{
                    "id": 0 
            }

}




Desenvolvido 🤍 por Samuel Patrocinio Drumond.