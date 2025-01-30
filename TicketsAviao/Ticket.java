import java.time.LocalDate;



public class Ticket{

    private int cpf;
    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private String genero;
    private int assentos;

    public Ticket (int cpf, String nome, String sobrenome, LocalDate dataNasc, String genero, int assentos){
        this.cpf = cpf;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
        this.genero = genero;
        this.assentos = assentos;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    
    @Override
    public String toString() {
        return "Ticket{" +
                "CPF=" + cpf +
                ", Nome='" + nome + ' ' + sobrenome + '\'' +
                ", Data de Nascimento=" + dataNasc +
                ", Gênero='" + genero + '\'' +
                ", Assento=" + assentos +
                '}';
    }

}