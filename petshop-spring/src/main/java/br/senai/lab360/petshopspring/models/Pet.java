package br.senai.lab360.petshopspring.models;

import br.senai.lab360.petshopspring.repositories.PetRepository;

import java.util.ArrayList;
import java.util.List;

public class Pet {
    private List<Pet> petList = PetRepository.pets;
    private int id;
    private String nome;
    private String especie;
    private String raca;
    private double peso;
    private Tutor tutor;

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

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public String listarPetsString() {
        String texto = "{";
        for (Pet pet : petList) {
            texto += "{ Pet id: " + pet.getId() + ", nome: " + pet.getNome() + ", especie: " + pet.getEspecie() + ", " +
                    "raca: " + pet.getRaca() + ", " +
                    "peso: " + pet.getPeso() + "}";
        }
        return texto;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", especie='" + especie + '\'' +
                ", raca='" + raca + '\'' +
                ", peso=" + peso +
                '}';
    }


}
