package Model;

public class AlunoModel {
    private String RMAluno;
    private String nomeAluno;
    private String moduloAluno;
    private String cursoAluno;
    private String turnoAluno;

    public AlunoModel(String RMAluno, String nomeAluno, String moduloAluno, String cursoAluno, String turnoAluno) {
        this.RMAluno = RMAluno;
        this.nomeAluno = nomeAluno;
        this.moduloAluno = moduloAluno;
        this.cursoAluno = cursoAluno;
        this.turnoAluno = turnoAluno;
    }
    
    public AlunoModel() {
        this("","","","","");
    }

    public String getRMAluno() {
        return RMAluno;
    }

    public void setRMAluno(String RMAluno) {
        this.RMAluno = RMAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getModuloAluno() {
        return moduloAluno;
    }

    public void setModuloAluno(String moduloAluno) {
        this.moduloAluno = moduloAluno;
    }

    public String getCursoAluno() {
        return cursoAluno;
    }

    public void setCursoAluno(String cursoAluno) {
        this.cursoAluno = cursoAluno;
    }

    public String getTurnoAluno() {
        return turnoAluno;
    }

    public void setTurnoAluno(String turnoAluno) {
        this.turnoAluno = turnoAluno;
    }
    
    
}
