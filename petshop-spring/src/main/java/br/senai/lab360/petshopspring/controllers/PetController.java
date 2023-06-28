package br.senai.lab360.petshopspring.controllers;

import br.senai.lab360.petshopspring.models.Pet;
import br.senai.lab360.petshopspring.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pets")
public class PetController {
    @Autowired
    private PetService petService;
    private static int idPet = 0;

    @GetMapping
    public String listaPets() {
        return petService.listaPets();
    }

    @GetMapping("/{idPet}")
    public String buscaPet(@PathVariable("idPet") int id) {
        return petService.buscaPetPorId(id).toString();
    }

    @PostMapping
    public Pet cadastraPet(@RequestBody Pet pet) {
        petService.cadastraPet(pet);
        return pet;
    }

    @PutMapping("/{idPet}")
    public String atualizaPet(@PathVariable("idPet") int id, @RequestBody Pet petParaAlterar) {
        return petService.atualizaPet(id, petParaAlterar);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping
    public String apagaPets() {
        boolean clear = petService.apagaListaPets();
        if(clear) {
            return "Método Delete - Lista apagada";
        }
        return "ERRO";
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{idPet}")
    public boolean apagaPet(@PathVariable("idPet") int id) {
        return petService.apagaUmPet(id);
    }
}