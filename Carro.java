//Alunas: Luísa Pedrolli e Gabriela Sena 2º TI
public class Carro implements Seguro{

    private String cor;
    private double preco;
    private String modelo;
    private int ano;
    private String nomeEmpresa;
    private String numeroSeguro;

    public Carro(String cor, double preco, String modelo, int ano, String nomeEmpresa, String numeroSeguro) { 
        this.cor = cor;
        this.preco = preco;
        this.modelo = modelo;
        this.ano = ano;
        this.nomeEmpresa = nomeEmpresa;
        this.numeroSeguro = numeroSeguro;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String nomeEmpresa(){ 
        return nomeEmpresa;
    }

    public double valor(){ 
        int idade = 2021 - getAno();
        return (preco * 0.02) + (150 - idade) * 0.025;
    }

    public String numeroSeguro(){ 
        return numeroSeguro;
    }

    @Override
    public String toString() {
        return String.format("\nCarro: \nCor = %s | Modelo =  %s | Preco =  %.2f | Ano = %d | Nome da empresa do seguro = \n%s | \nNumero do seguro =  %s | Valor do seguro =  %.2f",cor,modelo, preco, ano, nomeEmpresa(), numeroSeguro(), valor());
    }
}