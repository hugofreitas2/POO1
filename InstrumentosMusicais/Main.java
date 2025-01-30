public class Main {

    public static void main(String[] args) {
        Simulador s = new Simulador();

        InstrumentoMusical guita = new Guitarra();
        InstrumentoMusical batera = new Bateria();
        InstrumentoMusical piano = new Piano();

        s.adicionarInstrumento(guita);
        s.adicionarInstrumento(batera);
        s.adicionarInstrumento(piano);

        System.out.println("Artistas Tocando >>\n");
        s.tocarTodos();
    }
}
    


