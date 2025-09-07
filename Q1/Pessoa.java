public class Pessoa {
    private String nome;
    private String CPF;
    private int anoNasc;
    private double altura;
    public int anoAtual;

    public Pessoa(String nome, String CPF, int anoNasc, double altura){
        this.nome = nome;
        this.CPF = CPF;
        this.anoNasc = anoNasc;
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public int getAnoNasc() {
        return anoNasc;
    }
    public String getCPF() {
        return CPF;
    }
    public String getNome() {
        return nome;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }
    public int Idade(){
        return anoAtual - anoNasc;
    }
    public void Mostra(){
        System.out.println("Nome: "+ nome);
        System.out.println("CPF "+ CPF);
        System.out.println("Ano de Nascimento: " + anoNasc);
        System.out.println("Altura: "+ altura);
        System.out.println("Ano Atual: "+ anoAtual);
        System.out.println("Idade: "+ Idade());
    }
}
