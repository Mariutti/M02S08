package br.senai.lab360.petshopspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PetshopSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetshopSpringApplication.class, args);
	}

}


//EXERCÍCIO 06
//TODO Agora que temos as classes que representam as entidades (Models), vamos criar as classes de serviço e
// repositório.
//
//TODO Crie uma para cada entidade:
//
//TODO Classe de serviço (@Service)
//
//TODO Classe de persistência (@Repository)(Para armazenamento e consulta das entidades)
//
//TODO As dependências deverão ser injetadas respeitando o fluxo:
//
//TODO Controller -> Service -> Repository
//
//TODO Transferir as listas que representam a persistência dos dados para as classes Repository correspondentes.