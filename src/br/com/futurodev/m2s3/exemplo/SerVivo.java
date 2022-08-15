package br.com.futurodev.m2s3.exemplo;

public class SerVivo {

    // Atributos
    private String especie;
    private String nome;

    // Ações
    public void respirar() {
        System.out.println(especie + " - " + nome + ": Está respirando...");
    }

    public void reproduzir() {
        System.out.println(especie + " - " + nome + ": Está reproduzindo...");
    }

    // Getters And Setters
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
