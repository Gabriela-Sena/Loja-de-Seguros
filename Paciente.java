//Alunas: Luísa Pedrolli e Gabriela Sena 2º TI
public abstract class Paciente implements Seguro{

private String nome;
private int anoNascimento; 
 
    public Paciente(String nome, int anoNascimento){
    this.nome = nome;
    this.anoNascimento = anoNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    @Override
    public String toString() {
        return "Cliente: \nNome = " + nome + " | Ano de nascimento = " + anoNascimento + "";
    }
}