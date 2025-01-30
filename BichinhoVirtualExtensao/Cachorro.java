public class Cachorro extends Bichinho{
    

    public Cachorro(String nome){
        super(nome);
    }

    @Override
    public void brincar(){
        sono = sono + 2;
        energia = energia - 2;
    }

    @Override
    public void emitirSom(){
        sono++;
        energia--;
    }
}
