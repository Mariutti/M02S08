package br.senai.lab360.petshopspring.repositories;

import br.senai.lab360.petshopspring.models.Pet;
import br.senai.lab360.petshopspring.models.Tutor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PetRepository {
    public static List<Pet> pets = new ArrayList<>();
    private static int idPetSequece = 0;

    private static int incrementaId() {
        return ++idPetSequece;
    }

    public static List<Pet> listaPets(){
        return pets;
    }


    public static String listarPetsToString() {
        String texto = "{";
        for (Pet pet : pets) {
            texto += "{ Pet id: " + pet.getId() + ", nome: " + pet.getNome() + ", especie: " + pet.getEspecie() + ", " +
                    "raca: " + pet.getRaca() + ", " +
                    "peso: " + pet.getPeso() + "}";
        }
        return texto;
    }

    public Pet findById(int idPet){
        Pet petMatch = null;
        for (Pet pet : pets) {
            if (pet.getId() == idPet) {
                petMatch = pet;
                break;
            }
        }
        return petMatch;
    }

    public void cadastraPet(Pet pet) {
        incrementaId();
        pet.setId(idPetSequece);
        pets.add(pet);
    }

    public Pet atualizaPetNoBanco(int id, Pet petParaAlterar) {
        Pet petSelecionado = findById(id);
        if (petParaAlterar.getNome() != null) {
            petSelecionado.setNome(petParaAlterar.getNome());
        }
        if (petParaAlterar.getEspecie() != null) {
            petSelecionado.setEspecie(petParaAlterar.getEspecie());
        }
        if (petParaAlterar.getRaca() != null) {
            petSelecionado.setRaca(petParaAlterar.getRaca());
        }
        if (petParaAlterar.getPeso() != 0.0) {
            petSelecionado.setPeso(petParaAlterar.getPeso());
        }
        return petSelecionado;
    }

    public boolean apagaListaPets() {
        pets.clear();
        return false;
    }

    public boolean deletaPet(int idPet) {
        Pet petMatch = findById(idPet);
        if (petMatch == null) {
            return false;
        }
        pets.remove(petMatch);
        return true;
    }


    public List<Pet> findPets(int idTutor) {
        List<Pet> petListPorTutor = null;
        for(Pet pet : pets){
            if(pet.getTutor().getId()== idTutor)
                petListPorTutor.add(pet);
        }
        return petListPorTutor;
    }
}
