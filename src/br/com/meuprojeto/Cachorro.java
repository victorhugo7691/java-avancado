package br.com.meuprojeto;

public class Cachorro {
    
    private int tamanho;
    
    private String raca;
    
    public void Cachorro() {}
    
    public void latir() {
        System.out.println("Au au");
    }
    
    public int getTamanho() {
        return this.tamanho;
    }
    
    public void setTamanho(final int tamanho) {
        this.tamanho = tamanho;
    }
    
    public String getRaca() {
        return this.raca;
    }
    
    public void setRaca(final String raca) {
        this.raca = raca;
    }
    
}
