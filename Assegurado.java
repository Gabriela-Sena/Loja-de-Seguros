//Alunas: Luísa Pedrolli e Gabriela Sena 2º TI
public class Assegurado extends Paciente{

    private String nomeEmpresa;
    private double valor;
    private String numeroSeguro;

    public Assegurado(String nome, int anoNascimento, String nomeEmpresa, double valor, String numeroSeguro) {
        super(nome, anoNascimento);
        this.nomeEmpresa = nomeEmpresa;
        this.valor = valor;
        this.numeroSeguro = numeroSeguro;
    }

    public String nomeEmpresa(){ 
        return nomeEmpresa;
    }

    public double valor(){
        int idade = 2021 - getAnoNascimento(); 
        return idade * 150;
    }

    public String numeroSeguro(){ 
        return numeroSeguro;
    }

    @Override
    public String toString() {
        return String.format("%s\nAssegurado:\nNome da empresa do seguro =  %s | Numero do seguro =  %s | Valor do seguro =  %.2f\n", super.toString(), nomeEmpresa, numeroSeguro, valor);
    }
}