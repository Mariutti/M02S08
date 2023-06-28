package br.senai.lab360.petshopspring.models;

import br.senai.lab360.petshopspring.repositories.PetRepository;
import br.senai.lab360.petshopspring.repositories.TutorRepository;

import java.util.List;

public class Tutor {

    private static final List<Tutor> tutorList = TutorRepository.tutores;
    private int id;

    private String nome;
    private String telefone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
