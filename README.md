# Projeto de Estudo.

Esse é um projeto para mostrar aquilo que eu sei, por volta do que eu
aprendi quando comecei a entrar no mercado de trabalho (2020, 2021, 2022).

Depois do que eu mostrar o que aprendi, provavelmente vou criar outro ou 
dar continuidade a esse.

---

### Cria um certificado ssl
```java
SslContext sslContext = SslContextBuilder.forClient().trustManager(InsecureTrustManagerFactory.INSTANCE).build();
TcpClient tcpClient = TcpClient.create().secure(t -> t.sslContext(sslContext) );
HttpClient httpClient = HttpClient.from(tcpClient);
```
obs: isso é só para lembrar que eu já tive que fazer.

---
### Projeto
roda na porta 5000

---
### Banco
Subindo um banco via terminal pelo docker e salvando o endereço no projeto.

`docker run --name postgresql -p 5050:5432
-e POSTGRES_PASSWORD=postgres
 -v "<endereco_no_pc>:/var/lib/postgresql/data" postgres`

Quiser entrar no banco após criado

`docker exec -it <id_do_container> bash`

Ira abrir o root do banco, para começar a fazer mexer no sql colocará 
os seguintes comandos

`psql -U postgres`

A parti de agora pode fazer os sql no terminal.

---
### gerador Documentos
Podendo gerar ou validar o cpf.

E como o endereço da requisição já está pronta pode criar para
validar ou gerar documentos que a propria disponibiliza.