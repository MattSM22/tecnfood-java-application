package Model;

import java.util.Date;


public class CardapioModel {
    private String cod_cardapio;
    private String prato_base;
    private String prato_principal;
    private String guarnição;
    private String fruta_salada;
    private int total_cal;
    private String dia_cardapio;

    public CardapioModel(String cod_cardapio, String prato_base, String prato_principal, String guarnição, String fruta_salada, int total_cal ,String dia_cardapio) {
        this.cod_cardapio = cod_cardapio;
        this.prato_base = prato_base;
        this.prato_principal = prato_principal;
        this.guarnição = guarnição;
        this.fruta_salada = fruta_salada;
        this.dia_cardapio = dia_cardapio;
    }
    
    public CardapioModel(){
        this("","","","","", 0,"");
    }

    public String getCod_cardapio() {
        return cod_cardapio;
    }

    public void setCod_cardapio(String cod_cardapio) {
        this.cod_cardapio = cod_cardapio;
    }

    public String getPrato_base() {
        return prato_base;
    }

    public void setPrato_base(String prato_base) {
        this.prato_base = prato_base;
    }

    public String getPrato_principal() {
        return prato_principal;
    }

    public void setPrato_principal(String prato_principal) {
        this.prato_principal = prato_principal;
    }

    public String getGuarnição() {
        return guarnição;
    }

    public void setGuarnição(String guarnição) {
        this.guarnição = guarnição;
    }

    public String getFruta_salada() {
        return fruta_salada;
    }

    public void setFruta_salada(String fruta_salada) {
        this.fruta_salada = fruta_salada;
    }
    
    public int getTotal_cal() {
        return total_cal;
    }

    public void setTotal_cal(int total_cal) {
        this.total_cal = total_cal;
    }

    public String getDia_cardapio() {
        return dia_cardapio;
    }

    public void setDia_cardapio(String dia_cardapio) {
        this.dia_cardapio = dia_cardapio;
    }
    
    
}
