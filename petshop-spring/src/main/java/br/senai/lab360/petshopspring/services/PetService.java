package br.senai.lab360.petshopspring.services;

import br.senai.lab360.petshopspring.models.Pet;
import br.senai.lab360.petshopspring.models.Tutor;
import br.senai.lab360.petshopspring.repositories.PetRepository;
import br.senai.lab360.petshopspring.repositories.TutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {

    @Autowired
    private PetRepository petRepository;
    @Autowired
    private TutorRepository tutorRepository;
    public String listaPets() {
        return "Método GET - Mostra lista completa de Pets" + PetRepository.listarPetsToString();
    }

    public Pet buscaPetPorId(int id) {
        Pet petBuscado = null;
        for (Pet pet : petRepository.listaPets()) {
            if (pet.getId() == id) {
                petBuscado = pet;
                break;
            }
        }
        return petBuscado;
    }

    public void cadastraPet(Pet pet) {
        petRepository.cadastraPet(pet);
    }

    public String atualizaPet(int id, Pet petParaAlterar) {
        Pet petSelecionado = petRepository.atualizaPetNoBanco(id, petParaAlterar);
        if (petSelecionado == null) {
            return "Pet não encontrado";
        }
        return "Método PUT - Atualiza o cadastro do pet de " +
                "id " + petSelecionado.getId() + ", " +
                "nome: " + petSelecionado.getNome() + ", " +
                "especie: " + petSelecionado.getEspecie() + ", " +
                "raca: " + petSelecionado.getRaca() + ", " +
                "peso: " + petSelecionado.getPeso();
    }

    public boolean apagaListaPets() {
        return petRepository.apagaListaPets();
    }

    public boolean apagaUmPet(int id) {
        return petRepository.deletaPet(id);
    }

    public List<Pet> buscaPetPorTutor(int idTutor) {
        boolean tutorIdExist = false;
        for(Tutor tutor : TutorRepository.tutores){
            if(tutor.getId() == idTutor) {
                tutorIdExist = true;
                break;
            } else {
                tutorIdExist = false;
            }
        }
        if(tutorIdExist) {
            return petRepository.findPets(idTutor);
        }
        return null;
    }
}
