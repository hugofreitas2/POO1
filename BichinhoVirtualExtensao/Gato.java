public class Gato extends Bichinho {


    public Gato(String nome){
        super(nome);
    }

    @Override
    public void emitirSom(){
        sono++;
        energia--;
    }



    
}
