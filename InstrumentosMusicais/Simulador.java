import java.util.ArrayList;
import java.util.List;

public class Simulador {
    private List<InstrumentoMusical> instrumentos;


    public Simulador() {
        this.instrumentos = new ArrayList<>();
    }

    public void adicionarInstrumento(InstrumentoMusical instrumento) {
        instrumentos.add(instrumento);
    }

    public void tocarTodos() {
        for (InstrumentoMusical instrumento : instrumentos) {
            instrumento.tocar();
        }
    }
}