package br.senai.lab360.petshopspring.controllers;

import br.senai.lab360.petshopspring.models.Tutor;
import br.senai.lab360.petshopspring.services.TutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tutores")
public class TutorController {

    @Autowired
    private TutorService tutorService;

    @GetMapping
    public List<Tutor> listarTutores(){

        return tutorService.listarTutores();
    }

    @GetMapping("/{idTutor}")
    public Tutor getTutor(@PathVariable("idTutor") int id){
        return tutorService.getTutor(id);
    }

    @PostMapping
    public Tutor cadastraTutor(@RequestBody Tutor tutor){
        tutorService.postTutor(tutor);
        return tutor;
    }

    @PutMapping("/{idTutor}")
    public String atualizaTutor(@PathVariable("idTutor") int id, @RequestBody Tutor tutor){
        return tutorService.replaceTutor(id, tutor);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping
    public String deleteTutorsList(){
        boolean clear = tutorService.deleteTutorsList();
        if(clear) {
            return "Método Delete - Lista apagada";
        }
        return "ERRO";
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{idTutor}")
    public boolean deletaTutores(@PathVariable("idTutor") int id) {
        return tutorService.deleteTutorById(id);
    }
}
