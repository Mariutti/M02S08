package br.senai.lab360.petshopspring.services;

import br.senai.lab360.petshopspring.models.Tutor;
import br.senai.lab360.petshopspring.repositories.TutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TutorService {

    @Autowired
    private TutorRepository tutorRepository;

    public List<Tutor> listarTutores() {
        return tutorRepository.getTutorList();
    }

    public Tutor getTutor(int id) {
        return tutorRepository.findById(id);

    }

    public void postTutor(Tutor tutor) {
        tutorRepository.postTutor(tutor);
    }

    public String replaceTutor(int id, Tutor tutor) {
        Tutor tutorNewData = tutorRepository.replaceTutorDataBase(id, tutor);
        if (tutorNewData == null) {
            return "Tutor não encontrado";
        }
        return "Método PUT - Atualiza o cadastro do pet de " +
                "id " + tutorNewData.getId() + ", " +
                "nome: " + tutorNewData.getNome() + ", " +
                "telefone: " + tutorNewData.getTelefone();
    }

    public boolean deleteTutorsList() {
        return tutorRepository.deleteList();
    }

    public boolean deleteTutorById(int id) {
        return tutorRepository.deleteTutorById(id);
    }
}
