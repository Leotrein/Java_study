public class Caneta {

    // code made for the exam about college classes and objects.

    String marca;
    String modelo;
    String cor;

    private int tinta = 1000;

    public Caneta(String marca, String modelo, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }

    public String escrever(int linhas) {
        if (tinta > 0 && tinta >= linhas) {
            tinta -= linhas;
            return "Escrevendo...";
        } else if (tinta == 0) {
            return "Está sem tinta :(";
        } else {
            int a = tinta - linhas;
            tinta = 0;
            return "Acabou a tinta, faltou " + Math.abs(a) + " linhas para escrever tudo :(";
        }

    }

    public static void main(String[] args) {
        
        Caneta canetaColorida = new Caneta("BIC", "Cristal", "Roxo");

        System.out.println(canetaColorida.escrever(1055));
        System.out.println("Quantidade que resta de tinta: " + canetaColorida.tinta);

        System.out.println("\nFIM!\n");

    }
}