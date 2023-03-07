package heranca;

public class Animal {
    
    private String nome;
    
    private Double peso;
    
    public Animal() {}
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(final String nome) {
        this.nome = nome;
    }
    
    public Double getPeso() {
        return this.peso;
    }
    
    public void setPeso(final Double peso) {
        this.peso = peso;
    }
    
    public void comer() {
        System.out.println("O animal " + this.nome + " está comendo");
    }
    
    public void dormir() {
        System.out.println("O animal " + this.nome + " está dormindo");
    }
}
