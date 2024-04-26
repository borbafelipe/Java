
/*

              _..----.._    _
            .'  .--.    "-.(0)_                         GABIRU STAMP OF QUALITY
'-.__.-'"'=:|   ,  _)_ \__ . c\'-..   GABIRU CASA MACIA CORPORATION LTDA INC. S.A TUDOS E TUDOS.
             '''------'---''---'-"    MADE IN LOCAL SECRETO DO ESCONDERIJO DOS NOSFERATUS DO ESGOTO;
                                                                                         ART BY CJW.
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aluno {

    private String nome;
    private String matricula;
    private List<Disciplina> disciplinas;
    private double CRE;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.disciplinas = new ArrayList<>();
        this.CRE = 0.0;
    }

    public static Aluno criarAluno(Scanner scanner) {
        System.out.println("Digite o nome do aluno:");
        String nomeAluno = scanner.nextLine();

        System.out.println("Digite a matrícula do aluno:");
        String matriculaAluno = scanner.nextLine();

        return new Aluno(nomeAluno, matriculaAluno);
    }

    public void adicionarDisciplina(Scanner scanner) {
        System.out.println("Digite o código da disciplina:");
        String codigoDisciplina = scanner.nextLine();

        System.out.println("Digite o nome da disciplina:");
        String nomeDisciplina = scanner.nextLine();

        System.out.println("Digite a primeira nota:");
        double nota1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite a segunda nota:");
        double nota2 = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite a terceira nota:");
        double nota3 = Double.parseDouble(scanner.nextLine());

        Disciplina disciplina = new Disciplina(codigoDisciplina, nomeDisciplina);
        disciplina.setNota1(nota1);
        disciplina.setNota2(nota2);
        disciplina.setNota3(nota3);

        disciplinas.add(disciplina);
    }

    public void calcularCRE() {
        double somaMedias = 0.0;
        int numDisciplinas = 0;
/*
 * Sobre o loop abaixo, é interessante comentar certos aspectos da linguagem java
 * Asintasse do java tem caracteristicas muito importantes quanto a seu funcionamento. 
 * Em conjunção com a tipagem forte, podemos deduzir certas paradas mto interessantes
 * 
 */
        for (Disciplina disciplina : disciplinas) {
            Estado status = disciplina.getStatus();
            if (status == Estado.APROVADO || status == Estado.REPROVADO) {
                somaMedias += disciplina.getMedia();
                numDisciplinas++;
            }
        }

        if (numDisciplinas > 0) {
            CRE = somaMedias / numDisciplinas;
        } else {
            CRE = 0.0;
        }
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Disciplinas:");
        for (Disciplina disciplina : disciplinas) {
            System.out.println("- " + disciplina.getNome() + ": Média = " + disciplina.getMedia() +
                    ", Status = " + disciplina.getStatus());
        }

        System.out.println("CRE: " + CRE);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public double getCRE() {
        return CRE;
    }


    public void setCRE(double CRE) {
        this.CRE = CRE;
    }
}
