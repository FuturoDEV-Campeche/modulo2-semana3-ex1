package br.com.futurodev.m2s3.exemplo;

public class Planta extends SerVivo {
    public Planta(String nome) {
        super("Planta", nome);
    }

    public void fotossintese() {
        System.out.println(getNome() + " - está fazendo a fotossintese!");
    }

}
