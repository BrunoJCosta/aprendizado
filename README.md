# Projeto de Teste.

### Cria um certificado ssl
```java
SslContext sslContext = SslContextBuilder.forClient().trustManager(InsecureTrustManagerFactory.INSTANCE).build();
TcpClient tcpClient = TcpClient.create().secure(t -> t.sslContext(sslContext) );
HttpClient httpClient = HttpClient.from(tcpClient);
```