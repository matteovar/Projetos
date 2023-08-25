package ex_revisao;
import java.util.Scanner;


class Candidato {
    private int numero_cadidato;
    private int cpf;
    private String nome;
    private int idade;
    private String sexo;
    private String genero_de_musica;
    
    
    public Candidato(int numero_cadidato, int cpf , String nome, int idade, String sexo, String genero_de_musica){
        this.numero_cadidato = numero_cadidato;
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.genero_de_musica = genero_de_musica;
    }

    public int getnumero_cadidato(){
        return numero_cadidato;
    }

    public int getcpf(){
        return cpf;
    }

    public String getnome(){
        return nome;
    }

    public int getidade(){
        return idade;
    }

    public String getsexo(){
        return sexo;
    }

    public String getgenero_de_musica(){
        return genero_de_musica;
    }

    public void setnumero_cadidato(int numero_candidato){
        this.numero_cadidato = numero_candidato;
    }

    public void setcpf(int cpf){
        this.cpf=cpf;
    }

    public void setnome(String nome){
        this.nome = nome;
    }

    public void setidade(int idade){
       this.idade = idade;
    }

    public void setsexo(String sexo){
        this.sexo = sexo;
    }

    public void setgenero_de_musica(String genero_de_musica){
        this.genero_de_musica = genero_de_musica;
    }

    @Override
    public String toString(){
        return "Numero do candidato: " + this.numero_cadidato + ", Cpf: " + this.cpf + ", Nome: " + this.nome + ", Idade: " + this.idade +", Sexo: " + this.sexo + ", Genero de musica principal: " + this.genero_de_musica;
    }

}
class Juri {
    private String nome_juri_verdadeiro;
    private String nome_artistico;
    private String genero_musical_juri;

    public Juri(String nome_juri_verdadeiro, String nome_artistico,String genero_musical_juri){
        this.nome_juri_verdadeiro = nome_juri_verdadeiro;
        this.nome_artistico = nome_artistico;
        this.genero_musical_juri = genero_musical_juri;
    }

    public String getnome_juri_verdadeiro(){
        return nome_juri_verdadeiro;
    }

    public String genome_artistico(){
        return nome_artistico;
    }

    public String getgenero_musica_juri(){
        return genero_musical_juri;
    }

    public void setnome_juri_verdadeiro(String nome_juri_verdadeiro){
        this.nome_juri_verdadeiro = nome_juri_verdadeiro;
    }

    public void setnome_artistico (String nome_artistico){
        this.nome_artistico = nome_artistico;
    }

    public void setgenero_musical_juri(String genero_musical_juri){
        this.genero_musical_juri = genero_musical_juri;
    }
    
    @Override
  public String toString(){
    return "Nome completo: " + this.nome_juri_verdadeiro + ", Nome artistico: " + this.nome_artistico + ", Genero de musica principal: " + this.genero_musical_juri ;
  }
    
}

class Concurso {
    private String nome_concurso;   
    private Candidato[] vetor_candidato;
    private Juri[] vetor_juri;

    public Concurso(String nome_concurso, Candidato[] vetor_candidato, Juri[] vetor_juri){
        this.nome_concurso = nome_concurso;
        this.vetor_candidato = vetor_candidato;
        this.vetor_juri = vetor_juri;
    }


    public void filtragenero(String genero){
        System.out.println("Candidatos com o genero musical de " + genero + ":");
        for (Candidato candidato  : vetor_candidato){
            if (candidato.getgenero_de_musica().equalsIgnoreCase(genero)){
                System.out.println(candidato);
            }
        }

        System.out.println("\nJuris com gênero musical " + genero + ":");
        for (Juri juri : vetor_juri) {
            if (juri.getgenero_musica_juri().equalsIgnoreCase(genero)) {
                System.out.println(juri);
            }
        }
    }

    public void candidatos_por_idade(int idadeMinima, int idadeMaxima, String sexo) {
        System.out.println("\nCandidatos com idades entre " + idadeMinima + " e " + idadeMaxima + " e sexo " + sexo + ":");
        for (Candidato candidato : vetor_candidato) {
            if (candidato.getidade() >= idadeMinima && candidato.getidade() <= idadeMaxima && candidato.getsexo().equalsIgnoreCase(sexo)) {
                System.out.println(candidato);
            }
        }
    }

    public int contar_candidator_por_sexo(String sexo){
        int total = 0;
        for (Candidato candidato : vetor_candidato){
            if (candidato.getsexo().equalsIgnoreCase(sexo)){
                total++;
            }
        }
        return total;
    }
    

    public static void main(String[] args){
        Candidato candidato1 = new Candidato(5, 123456789, "Matteo", 20, "masculino", "Pop");
        Candidato candidato2 = new Candidato(892, 499196008, "Julia", 16, "feminino", "sertanejo");
        Candidato candidato3 = new Candidato(575, 21567923, "Cleber", 18, "masculino", "funk    ");
    
        Juri juri1 = new Juri("Isabela Cristina Correia", "Iza", "Pop");
        Juri juri2 = new Juri("ISolana Imani Rowe", "Sza", "Rap");

        Candidato[] candidato  = {candidato1,candidato2,candidato3};
        Juri[] jurados = {juri1, juri2};

        Concurso concurso = new Concurso("Concurso Musical", candidato, jurados);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o gênero musical para filtrar: ");
        String generoFiltro = scanner.nextLine();

        concurso.filtragenero(generoFiltro);
        System.out.println("------------------------------------");
    
        System.out.print("Digite a idade mínima: ");
        int idadeMinima = scanner.nextInt();

        System.out.print("Digite a idade máxima: ");
        int idadeMaxima = scanner.nextInt();

        scanner.nextLine(); 

        System.out.print("Digite o sexo(feminino/masculino): ");
        String sexo = scanner.nextLine();

        concurso.candidatos_por_idade(idadeMinima, idadeMaxima, sexo);   

        System.out.println("------------------------------------");

        System.out.print("Digite o sexo(feminino/masculino): ");        
        String sexo2 = scanner.nextLine();

        int quantidade_de_candidatos = concurso.contar_candidator_por_sexo(sexo2);
        System.out.println("\nQuantidade de candidatos " + sexo2 + " é de " + quantidade_de_candidatos);
        
        
        scanner.close();

    }   
 

}

