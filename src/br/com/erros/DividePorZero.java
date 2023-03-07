package br.com.erros;

public class DividePorZero {
    
    public static void main(final String[] args) {
        try {
            System.out.println(1 / 0);
        } catch (final Exception e) {
            System.out.println("Falha ao dividir " + e);
        } finally {
            System.out.println("Programa rodando");
        }
        
    }
}
