package Model;

public class AdmModel {
    private int cod_adm;
    private String login_adm; 
    private String senha_adm;

    public AdmModel(int cod_adm, String login_adm, String senha_adm) {
        this.cod_adm = cod_adm;
        this.login_adm = login_adm;
        this.senha_adm = senha_adm;
    }
    
    public AdmModel (){
        this(0,"","");
    }
    
    public int getId_adm() {
        return cod_adm;
    }

    public void setId_adm(int cod_adm) {
        this.cod_adm = cod_adm;
    }

    public String getLogin_adm() {
        return login_adm;
    }

    public void setLogin_adm(String login_adm) {
        this.login_adm = login_adm;
    }

    public String getSenha_adm() {
        return senha_adm;
    }

    public void setSenha_adm(String senha_adm) {
        this.senha_adm = senha_adm;
    }
    
}
