package br.senai.lab360.petshopspring.Controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tutores")
public class TutorController {

    @GetMapping
    public String listarTutores(){
        return "Método GET - Busca e lista todos os tutores";
    }

    @GetMapping("/{idTutor}")
    public String mostrarTutor(@PathVariable("idTutor") int id){
        return "Método GET - Busca e exibe apenas o tutor com id " + id;
    }

    @PostMapping
    public String cadastraTutor(){
        return "Método POST - Cadastra um tutor";
    }

    @PutMapping("/{idTutor}")
    public String atualizaTutor(@PathVariable("idTutor") int id){
        return "Método PUT - Atualiza o cadastro do tutor de id " + id;
    }

    @DeleteMapping
    public String deletaTutores(){
        return "Método DELETE - Deleta toda a lista de tutores";
    }

    @DeleteMapping("/{idTutor}")
    public String deletaTutores(@PathVariable("idTutor") int id) {
        return "Método DELETE - Deleta apenas o tutor de id " + id;
    }
}
