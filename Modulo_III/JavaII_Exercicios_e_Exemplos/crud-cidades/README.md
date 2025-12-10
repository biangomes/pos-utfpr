# Semana 01: 29/04 a 05/05

## Gerenciamento de cidades

Trata-se de um projeto do tipo CRUD utilizando dados de cidades.

Uma cidade está associada a um único estado, portanto, para criar uma cidade precisamos informar o **nome da cidade** e o **estado** onde ela se encontra.

# Semana 02: 06/05 a 12/05

1. Adicionado a seguinte dependência no `pom.xml`

```xml
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-freemarker</artifactId>
		</dependency>
```

1. Página estática `crud.html`, que estava dentro de `/resources/static` passa para `resources/templates`
2. Renomeando o arquivo `crud.html` para `crud.ftlh`
3. Comparar os commits feitos no arquivo `crud`e `CidadeController`

**Padrões**

O desenvolvimento Web com Java depende de dois padrões antigos e muito populares: *Front Controller* e *MVC.*

O *Front Controller* faz parte do catálogo J2EE - hoje chamada de **Jakarta EE** -, que é mantida pela comunidade Eclipse.

***Catálogo online:*** http://www.corej2eepatterns.com/index.htm

O objetivo do ***Front Controller*** é **centralizar** o tratamento de requisições na camada de apresentação. O catálogo diz que o front recebe as requisições da aplicação e delega essas requisições para outras partes da aplicação, dependendo das regras de roteamento. Essa centralização facilita muito o controle de acesso à aplicação.

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/4e61855e-7d74-450d-a449-a3273526fa38/9a27236f-1ffa-41d1-98e8-b938e3599a9e/Untitled.png)

O Spring MVC é baseado primordialmente no *Front Controller*.

**Padrão MVC**

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/4e61855e-7d74-450d-a449-a3273526fa38/c150e810-53e8-4757-a2a3-f0df191e4dd5/Untitled.png)

Uma classe Java representa o Controller, outra o Model. A View é a página web, no nosso caso com Freemarker para permitir o dinamismo.

# I WebConf Oficial - 30/09/2025

É apresentado o JHipster, que é uma plataforma de desenvolvimento que rapidamente gera, desenvolve e faz deploy de aplicações web modernas e arquiteturas de microsserviços.

Oferece suporte no backend ao Spring Boot (Java e Kotlin), Micronaut, Quarkus, Node.js e .NET

Suporte de deploy AWS, Azure, Google Cloud Platform

Site do JHipster: [https://start.jhipster.tech](https://start.jhipster.tech/)

# Semana 02: 15/09 a 21/09

## Tornando uma página dinâmica com freemarker

O Spring Boot, por meio do Spring MVC, fornece suporte para criação de páginas dinâmicas. Isso é feito com o auxilio de uma template engine. A template engine substitui os valores fixos por valores variáveis na página Web durante o processamento da requisição.

Passo a passo:

1. Adicionar a dependência do freemarker no projeto (pelo `pom.xml`):

```xml
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-freemarker</artifactId>
			<version>3.5.3</version>
		</dependency>
```

2. Mover o arquivo de estilização (até então estático) para a pasta `/resource/templates/`, pois assim o Spring Boot reconhecerá a nossa página como dinâmica.
3. Alterar a extensão de `.html` para `.ftlh`, pois só assim o Spring Boot reconherá as páginas dinâmicas com o Freemarker por padrão.
4. Usar sintaxe do Freemarker

```html
			<tbody>
				<#list listaCidades as cidades>
					<tr>
						<td>${cidades.nome}</td>
						<td>${cidades.estado}</td>
						<td>
							<div class="d-flex d-justify-content-center">
								<a href="" class="btn btn-warning mr-3">ALTERAR</a>
								<a href="" class="btn btn-danger mr-3">EXCLUIR</a>
							</div>
						</td>
					</tr>
				</#list>
			</tbody> 
```

O nome `cidades` do trecho `<#list listaCidades as cidades>` deve ser igual ao que está no controller

## Padrões de Projeto

Dois padrões de projeto antigos e populares:
- Front Controller
- MVC

O objetivo do *Front Controller* é centralizar o tratamento de requisições na camada de apresentação.

O catálogo J2EE explica que o *Front Controller* recebe as requisições da aplicação e delega essas requisições para outras partes da aplicação,
dependendo de regras de roteamento. Essa centralização facilita muito o controle de acesso à aplicação, por exemplo.

O Spring MVC é baseado no *Front Controller* primordialmente.

O outro padrão frequentemente usado em aplicações Web é o MVC. MVC é a sigla em Inglês para Model-View-Controller. É importante ressaltar que o projeto do Spring que usa o MVC é chamado de Spring Web MVC. Isso serve para mostrar que o MVC é o padrão central para o desenvolvimento de aplicações Web com o Spring.