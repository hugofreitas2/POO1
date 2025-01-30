public abstract class Bichinho {
    
    protected String nome;
    protected int energia;
    protected int sono;

    public Bichinho(String nome){
        this.nome = nome;
        this.energia = 2;
        this.sono = 2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEnergia() {
        return energia;
    }


    public int getSono() {
        return sono;
    }

    public void alimentar(){
        energia++;
        sono++;
    }

    public void dormir(){
        energia--;
        sono--;

    }

    public void brincar(){
        energia--;
        sono++;
    }

    public void emitirSom(){
    }

    
}
