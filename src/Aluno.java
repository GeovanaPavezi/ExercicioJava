public class Aluno {

    private int registroAcademico;
    private String nome;
    private double notaProva1, notaProva2, notaTrabalho;
    private double mediaFinal;
    private String situacao;


    public int getRegistroAcademico() {
        return registroAcademico;
    }
    public void setRegistroAcademico(int registroAcademico) {
        this.registroAcademico = registroAcademico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotaProva1() {
        return notaProva1;
    }

    public void setNotaProva1(double notaProva1) {
        this.notaProva1 = notaProva1;
    }

    public double getNotaProva2() {
        return notaProva2;
    }

    public void setNotaProva2(double notaProva2) {
        this.notaProva2 = notaProva2;
    }

    public double getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(double notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }

    public double getMediaFinal() {
        return mediaFinal;
    }

    public void setMediaFinal(double mediaFinal) {
        this.mediaFinal = mediaFinal;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public  String  toString(){
        return  "RA: " + this.registroAcademico + " Nome: " + this.nome;
    }

    public void calculoMedia(){
        /**
         *
         */
        this.setMediaFinal((this.getNotaProva1() * 0.35) + (this.getNotaProva2() * 0.35) + (this.getNotaTrabalho() * 0.3));
    }
    public void status(){
        if(this.getMediaFinal() >= 7){
            this.setSituacao("Aprovado");
        }else{
            this.setSituacao("Exame");
        }
        System.out.println(this.toString());
        System.out.println("Resultado: \n" + "Media Final: " + this.getMediaFinal() + "\nSituação: " + this.getSituacao());
    }


}
