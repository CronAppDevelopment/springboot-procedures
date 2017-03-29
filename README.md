# SpringBoot chamando Procedures

Esse é um projeto de exemplo para mostrar como chamar procedures com o spring-data.
Para esse exemplo criamos um DAO e uma implementação dele, chamados respectivamente de ProceduresDAO e ProceduresDAOImpl.
Injetamos o ProceduresDAOImpl em PessoaBusiness e criamos um método para chamar o método do nosso DAO.
Criamos um evento do tipo servidor, que cria uma função js no arquivo events.js e uma classe REST para retornar dados do servidor, lá estamos retornando apenas a quantidade de registros encontrados pela procedure.

Caso você altere o banco de dados crie a procedure que está em procedures.txt

