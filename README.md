# Payment-API

## Configurando o Projeto

1. Baixe o arquivo .zip da branch master
2. Descompacte o arquivo em uma pasta de sua escolha
3. Abra o assistente do Maven na barra lateral direita e execute **payment-api > Lifecycle > _install_**
4. Clique com o direito sobre a class PaymentApiApplication.java, localizada em **src/main/java/com/cursojunit/paymentapi**, e clique em _Run_
    
## Configurando o Banco de Dados

1. Após executar o projeto, acesse em seu navegador _http://localhost:8081/h2_
2. As credenciais de acesso e URL do Banco de Dados encontram-se no arquivo **application.properties**, localizado em **src/main/resources**
3. Execute os scripts localizados em **/src/main/resources/scripts/db-initializer.sql**
