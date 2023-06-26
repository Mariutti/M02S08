package br.senai.lab360.petshopspring.Controllers;

import br.senai.lab360.petshopspring.models.Pet;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pets")
public class PetController {
    private static int idPet = 0;

    @GetMapping
    public String buscaPets() {
        return "Método GET - Mostra lista completa de Pets" + Pet.listarPets();
    }

    @GetMapping("/{idPet}")
    public String buscaPets(@PathVariable("idPet") int id) {
        Pet petBuscado = null;
        for (Pet pet : Pet.pets) {
            if (pet.getId() == id) {
                petBuscado = pet;
                break;
            }
        }
        return petBuscado.toString();
//        return "Método GET - Mostra apenas o pet de id " + id;
    }

    @PostMapping
    public Pet cadastraPet(@RequestBody Pet pet) {
        ++idPet;
        pet.setId(idPet);
        Pet.pets.add(pet);
        return pet;
    }

    @PutMapping("/{idPet}")
    public String atualizaPet(@PathVariable("idPet") int id, @RequestBody Pet petParaAlterar) {
        petParaAlterar.setId(id);
        Pet petSelecionado = null;
        for (Pet pet : Pet.pets) {
            if (pet.getId() == id) {
                petSelecionado = pet;
                break;
            }
        }
        if(petSelecionado == null){
            return "Pet não encontrado";
        }
        if(petParaAlterar.getNome() != null){
            petSelecionado.setNome(petParaAlterar.getNome());
        }
        if(petParaAlterar.getEspecie() != null){
            petSelecionado.setEspecie(petParaAlterar.getEspecie());
        }
        if(petParaAlterar.getRaca() != null){
            petSelecionado.setRaca(petParaAlterar.getRaca());
        }
        if (petParaAlterar.getPeso() != 0.0) {
            petSelecionado.setPeso(petParaAlterar.getPeso());
        }

        return "Método PUT - Atualiza o cadastro do pet de " +
                "id " + petSelecionado.getId() +  ", " +
                "nome: "+ petSelecionado.getNome() +  ", " +
                "especie: " + petSelecionado.getEspecie() + ", " +
                "raca: " + petSelecionado.getRaca() + ", " +
                "peso: " + petSelecionado.getPeso();
    }

    @DeleteMapping
    public String apagaPets() {
        Pet.pets.clear();
        return "Método Delete - Apaga a lista completa de pets";
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{idPet}")
    public boolean apagaPet(@PathVariable("idPet") final int id) {
        String msg;
        Pet petParaExcluir = null;
        for(Pet pet : Pet.pets){
            if(pet.getId() == idPet){
                petParaExcluir = pet;
                break;
            }
        }
        if(petParaExcluir == null){
            msg =  "Não existe o pet";
            return false;
        }
        String petId = String.valueOf(petParaExcluir.getId());
        String petNome = petParaExcluir.getNome();
        Pet.pets.remove(petParaExcluir);
        msg  ="id: "+ petId + " nome: " + petNome;
        return true;
    }
}