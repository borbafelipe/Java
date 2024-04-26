/* 

              _..----.._    _
            .'  .--.    "-.(0)_                         GABIRU STAMP OF QUALITY
'-.__.-'"'=:|   ,  _)_ \__ . c\'-..   GABIRU CASA MACIA CORPORATION LTDA INC. S.A TUDOS E TUDOS.
             '''------'---''---'-"    MADE IN LOCAL SECRETO DO ESCONDERIJO DOS NOSFERATUS DO ESGOTO;
                                                                                         ART BY CJW.
*/

public class Disciplina {

    private String codigo;
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;
    private double media;
    private Estado status;

    public Disciplina(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.nota1 = 0;
        this.nota2 = 0;
        this.nota3 = 0;
        this.status = null;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public void setStatus(Estado estado) {
        this.status = estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public double getMedia() {
        return media;
    }

    public Estado getStatus() {
        return status;
    }

    public Estado getResultado(double nota1, double nota2, double nota3) {
        media = (nota1 + nota2 + nota3) / 3;
        Estado currentStatus;

        if (media >= 7) {
            setStatus(Estado.APROVADO);
            currentStatus = getStatus();
            System.out.println("Suas notas foram " + nota1 + ", " + nota2 + ", " + nota3);
            System.out.println("Sua média é " + media + " e você está: " + currentStatus.toString());
        } else if (nota1 == 0.0 || nota2 == 0.0 || nota3 == 0.0 || media < 7) {
            setStatus(Estado.REPROVADO);
            currentStatus = getStatus();
            System.out.println("Suas notas foram " + nota1 + ", " + nota2 + ", " + nota3);
            System.out.println("Sua média é " + media + " e você está: " + currentStatus.toString());
        } else {
            currentStatus = getStatus();
            System.out.println("Sua média é " + media + " e você está: " + currentStatus.toString());
        }
        return status;
    }
}
