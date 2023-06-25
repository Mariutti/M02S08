package br.senai.lab360.petshopspring.Controller;

import org.springframework.web.bind.annotation.*;

import java.io.PrintWriter;

@RestController
@RequestMapping("/pets")
public class PetController {
    @GetMapping
    public String buscaPets() {
        return "Método GET - Mostra lista completa de Pets";
    }

    @GetMapping("/{idPet}")
    public String buscaPets(@PathVariable("idPet") int id) {
        return "Método GET - Mostra apenas o pet de id " + id;
    }

    @PostMapping
    public String cadastraPet() {
        return "Método POST - Cria cadastro de Pet";
    }

    @PutMapping("/{idPet}")
    public String atualizaPet(@PathVariable("idPet") int id) {
        return "Método PUT - Atualiza o cadastro do pet de id " + id;
    }
    @DeleteMapping
    public String apagaPet(){
        return "Método Delete - Apaga a lista completa de pets";
    }

    @DeleteMapping("/{idPet}")
    public String apagaPet(@PathVariable("idPet") int id) {
        return "Método Delete - Apaga apenas o pet de id " + id;
    }
}


//Exercício 04
//TODO Crie um novo projeto para um PetShop utilizando Spring Boot (start.spring.io), adicionando ao menos a
// dependência Spring Web. Utilize Maven e selecione a versão do Java correspondente ao JDK instalado no seu dispositivo.

//TODO No projeto deverá existir endpoints para Tutores e seus Pets com a função de CRUD (Create, Read, Update e
// Delete).

//TODO Inicialmente, todos os endpoints deverão retornar uma String indicando sua finalidade.