package heranca;

public class TesteHeranca {
    
    public static void main(final String[] args) {
        // TODO Auto-generated method stub
        
        final Galinha galinha = new Galinha();
        galinha.setNome("Joana");
        galinha.setPeso(10.0d);
        System.out.println(galinha.getNome());
        galinha.botar();
    }
    
}
