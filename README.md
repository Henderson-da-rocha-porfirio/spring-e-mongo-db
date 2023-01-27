# Mongo DB
## Database Relacional
|   ID   | NOME | PRECO |
|   :---:     |   :---:     | :---: |
| :---:  |  :---:| :---: |
|   | |  |
### - Possui tabelas com colunas e linhas em uma estrutura e cada tabela tem um relacionaamento com outra quando necessário.
## Database Não-Relacional
### - Já database que não é relacional, tipo o Mongo DB, ele guarda as informações em forma de collections: formato JSON.
### - Cada classe JAVA será mapeada por um documento ou uma collection de uma collection.
### - Cada objeto não será uma típica tabela mas será uma JSON ROW de uma particular collection.
## Instalando o Mongo
> 1. [Download do Mongo]( https://www.mongodb.com/try/download/community?tck=docs_server)
> - Debois de baixado, é preciso fazer algumas configurações para ele funcionar no Windows:
> 2. Configurar no Windows:
> 
>> a. Criar uma pasta "data" no disco "C" ou principal de seu SO.
> 
>> b. Criar uma pasta "db" dentro de "data".
>
> 3. Entrando no Mongo pelo CMD, digite:
````
mongo
````
> 4. Help:
````
db.help
````
> 5. Rodar o Servidor:
````
mongod.
````
> 6. Mostrar os databases:
````
show dbs

````
> 7. Criar um novo banco ou escolher detre os existentes:
````
use mydb
````
> 8. Mostrar Collections:

````
show collections
````
> 9. Criar Tabela com a coluna:
````
db.produto.insert({"name":"mac","price":3000})
````
> 10. Achar a Tabela:
````
db.produto.find()

Resposta: { "_id" : ObjectId("6243aa9c5da52e55d6cacf2a"), "name" : "mac", "price" : 3000 }
````
> 11. Para update usar o mesmo comando: 
````
db.produto.insert({"name":"windows","price":3000})
````
> 12. Outro método Find:
````
>   db.produto.find().pretty()

> 13. Mostrar o Database: db
> 14. Mostrar as Collections: show collections
> 15. Drop:
>> i. Tabela: db.produto.drop()
>> ii. Database: db.dropDatabase()

## Spring Boot Compatibilidade
### - É compatível com de.flapdoodle.embed.mongo
### - Esta dependência é colocada no pom.
### - Anotações:
#### i. @Document
#### ii. @ID ( mas é opcional porque MongoDB gera o ID para tudo que você grava ou objetos criados.
### - Eles herdam de MongoDB ou do Mongo repositório em vez do JPA repository.
### - Na hora de criar o projeto, colocar as dependências (só digitar mongo que aparecerão as duas opções):
#### i. Spring Data MongoDB
#### ii. Embedded MongoDB Database (util para o teste)
### Para ele funcionar sem a incorporação, remover a dependência:de.flapdoodle.embed
### E configurar application.properties com acessos e inclusive com o nome do database que deseja que seja criado, portas e etc.
### Caso busque o funcionamento sem a configuração das properties, verificar na Branch a configuração sem as properties configuradas.

