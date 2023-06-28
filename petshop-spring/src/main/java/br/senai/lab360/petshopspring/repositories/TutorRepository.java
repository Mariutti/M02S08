package br.senai.lab360.petshopspring.repositories;

import br.senai.lab360.petshopspring.models.Tutor;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public class TutorRepository {

    public static List<Tutor> tutores;
    private static int idTutorSequence = 0;


    private static int incrementaId() {
        return ++idTutorSequence;
    }

    public Tutor findById(int idTutor){
        Tutor tutorForId = null;
        for (Tutor tutor : tutores) {
            if (tutor.getId() == idTutor) {
                tutorForId = tutor;
                break;
            }
        }
        return tutorForId;
    }
    public List<Tutor> getTutorList() {
        return getTutorList();
    }


    public void postTutor(Tutor tutor) {
        incrementaId();
        tutores.add(tutor);
    }

    public Tutor replaceTutorDataBase(int id, Tutor tutorNewData) {
        Tutor selectedTutor = findById(id);
        if (tutorNewData.getNome() != null) {
            selectedTutor.setNome(tutorNewData.getNome());
        }
        if (tutorNewData.getTelefone() != null) {
            selectedTutor.setTelefone(tutorNewData.getTelefone());
        }
        return selectedTutor;
    }

    public boolean deleteList() {
        tutores.clear();
        return false;
    }

    public boolean deleteTutorById(int id) {
        if(findById(id) == null){
            return false;
        }
        return tutores.remove(findById(id));
    }


}
