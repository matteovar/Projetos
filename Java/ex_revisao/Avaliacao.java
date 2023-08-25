package ex_revisao;


class Avaliacao{
    private String nome;
    private String TipoAvaliacao;
    private float nota;

    public Avaliacao(){
        nome = "";
        TipoAvaliacao = "";
        nota = 0;
    }

    public Avaliacao(String nome, String TipoAvaliacao, float nota){
        this.nome = nome;
        this.TipoAvaliacao = TipoAvaliacao;
        this.nota = nota;
    }

    public float porcentual(){
        float porcentagem = nota * 10; // ja q a nota maxima é 10.0 da para implementar este metodo
        return porcentagem;
    }

    @Override
    public String toString(){
        return "nome: " + this.nome + " Tipo Avaliação: " + this.TipoAvaliacao + " nota: " + this.nota + " porcentual nota: " + porcentual();
    }

}