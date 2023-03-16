package DAO;

import Controller.Conexao;
import Model.AdmModel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;

import java.util.ArrayList;

public class AdmDAO {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public AdmDAO() {
        Conexao con = new Conexao();
        conexao = con.getConnection();
    }

    public int admCreate(AdmModel adm) {
        int adicionado = 0;
        String sql = "INSERT INTO adm(login_adm, senha_adm) VALUES (?,?)";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, adm.getLogin_adm());
            pst.setString(2, adm.getSenha_adm());

            adicionado = pst.executeUpdate();
        } catch (SQLException err) {
            System.out.println(err);
        }

        return adicionado;
    }
    
    public ArrayList<AdmModel> getAllData(){
        String sql = "SELECT * FROM adm";
        ArrayList<AdmModel> admList = new ArrayList<>();
        try {
            pst = conexao.prepareCall(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                AdmModel adm = new AdmModel(rs.getInt(1), rs.getString(2), rs.getString(3));
                admList.add(adm);
            }
        } catch (SQLException err) {
            System.out.println(err);
        }
        
        return admList;
    }

    public void admSelect(AdmModel adm) {
        String sql = "SELECT * FROM adm";
        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                adm.setId_adm(rs.getInt(1));
                adm.setLogin_adm(rs.getString(2));
                adm.setSenha_adm(rs.getString(3));
            }
        } catch (SQLException err) {
            System.out.println(err);
        }
    }

    public int admUpdate(AdmModel adm) {
        int atualizado = 0;
        String sql = "UPDATE adm SET login_adm = ?, senha_adm = ? WHERE cod_adm = ?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, adm.getLogin_adm());
            pst.setString(2, adm.getSenha_adm());
            pst.setInt(3, adm.getId_adm());

            atualizado = pst.executeUpdate();
        } catch (SQLException err) {
            System.out.println(err);
        }
        
        return atualizado;
    }

    public int admDelete(AdmModel adm) {
        int apagado = 0;
        String sql = "DELETE FROM adm WHERE cod_adm = ?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, adm.getId_adm());
            apagado = pst.executeUpdate();
        } catch (SQLException err) {
            System.out.println(err);
        }
        
        return apagado;
    }

    public boolean admLoginSystem(AdmModel adm) {
        boolean retorno = false;
        String sql = "SELECT * FROM adm WHERE login_adm=? AND senha_adm=?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, adm.getLogin_adm());
            pst.setString(2, adm.getSenha_adm());

            rs = pst.executeQuery();
            retorno = rs.next();
        } catch (SQLException err) {
            System.out.println(err);
        }

        return retorno;
    }
}
