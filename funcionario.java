public class funcionario {
    private String nome;
    private double salario;
    private String departamento;
    private String data_de_entrada;
    private String RG;

    public funcionario(String nome, double salario, String departamento, String RG, String data_de_entrada)
    {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
        this.RG = RG;
        this.data_de_entrada = data_de_entrada;

        System.out.println("Funcionario Criado com Sucesso");
    }

    public void recebeAumento(double percentagem)
    {
        this.salario *= (1 + percentagem/100);
    }

    public double calculaganhoAnual(){
        return (this.salario * 12);
    }
}
