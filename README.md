# Picpay Challenge

![Java](https://img.shields.io/badge/Java-17-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.5-brightgreen)
![Maven](https://img.shields.io/badge/Maven-4.0.0-orange)
![H2 Database](https://img.shields.io/badge/H2%20Database-1.4.200-lightgrey)
![License](https://img.shields.io/badge/License-MIT-yellow)

## Descrição

Este projeto foi desenvolvido como parte de um desafio para a vaga de desenvolvedor na Picpay. O projeto é uma aplicação simples de transações financeiras entre usuários. Foi construído utilizando as seguintes tecnologias:

- **Linguagem:** Java 17
- **Framework:** Spring Boot 3.2.5
- **Banco de Dados:** H2 Database

A aplicação permite criar usuários, realizar transações entre eles e enviar notificações sobre o status das transações.

## Instruções de Instalação

### Pré-requisitos

- **Java 17** deve estar instalado e configurado na sua máquina.
- **Maven** para gerenciamento de dependências.

### Passos para instalação

1. Clone o repositório:
   ```sh
   git clone https://github.com/seu-usuario/seu-repositorio.git
   ```

2. Navegue até o diretório do projeto:
```bash
cd seu-repositorio
```

3. Compile o projeto usando Maven:
```bash
   mvn clean install
```

4. Execute a aplicação:
```bash
mvn spring-boot:run
```

## Como Utilizar
### Endpoints Disponíveis
A aplicação disponibiliza os seguintes endpoints:<br>
Criar Usuário<br>
-Endpoint: /users<br>
-Método: POST<br>

Corpo da Requisição:<br>
```bash
{
    "firstName": "John",
    "lastName": "Doe",
    "document": "12345678900",
    "balance": 1000.00,
    "email": "john.doe@example.com",
    "password": "password123",
    "userType": "COMMON"
}
```

Resposta de Sucesso:
```bash
{
    "firstName": "John",
    "lastName": "Doe",
    "document": "12345678900",
    "balance": 1000.00,
    "email": "john.doe@example.com",
    "password": "password123",
    "userType": "COMMON"
}
```

Criar Transação
-Endpoint: /transactions
-Método: POST

Corpo da Requisição:
```bash
{
    "value": 100.00,
    "senderId": 1,
    "receiverId": 2
}
```

Resposta de Sucesso:
```bash
{
    "id": 1,
    "amount": 100.00,
    "sender": {
        "id": 1,
        "firstName": "John",
        "lastName": "Doe",
        "email": "john.doe@example.com"
    },
    "receiver": {
        "id": 2,
        "firstName": "Jane",
        "lastName": "Smith",
        "email": "jane.smith@example.com"
    },
    "timestamp": "2024-05-26T18:00:00"
}
```

## Configuração do Banco de Dados
O projeto utiliza o banco de dados H2 para simplificação e testes. A configuração está disponível no arquivo application.properties:




