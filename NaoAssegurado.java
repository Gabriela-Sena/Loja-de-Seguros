//Alunas: Luísa Pedrolli e Gabriela Sena 2º TI
public class NaoAssegurado extends Paciente{

private int cartaoCredito;

    public NaoAssegurado(String nome, int anoNascimento, int cartaoCredito) {
        super(nome, anoNascimento);
        this.cartaoCredito = cartaoCredito;
    }

    public int getCartaoCredito() {
        return cartaoCredito;
    }

    public void setCartaoCredito(int cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }

    public String nomeEmpresa(){ 
        return "NDA";
    }

    public double valor(){ 
        return 0;
    }

    public String numeroSeguro(){ 
        return "000-0000";
    }

    @Override
    public String toString() {
        return String.format("%s\nNao assegurado:\nNome da empresa do seguro =  %s | Numero do seguro =  %s | Valor do seguro =  %.2f |\nCartao de credito= %d", super.toString(), nomeEmpresa(),numeroSeguro(), valor(), cartaoCredito);
    }
}