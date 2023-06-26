package br.senai.lab360.petshopspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PetshopSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetshopSpringApplication.class, args);
	}

}

//TODO Exercício 05
//TODO Construa os Models para representar as entidades Tutores e Pets.
//TODO Construa a lógica necessária do CRUD de Tutor e Pet.
//TODO Para cada endpoint:
//POST - Receber os dados como parâmetro e retornar a entidade cadastrada.
//GET - Buscar todos os registros cadastrados da entidade.
//PUT - Receber os dados necessários para edição como parâmetro e retornar a entidade alterada.
//TODO DELETE - Receber os dados necessários para identificação e remoção da entidade correspondente e retornar um boolean indicando o sucesso.
//Obs.: Pode salvar os registros em listas, não precisa conectar num banco de dados.