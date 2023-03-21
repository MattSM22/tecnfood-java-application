package DAO;

import Controller.Conexao;
import Model.CardapioModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class CardapioDAO {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public CardapioDAO() {
        Conexao con = new Conexao();
        conexao = con.getConnection();
    }

    public ArrayList<CardapioModel> getAllMenuData() {
        String sql = "SELECT * FROM cardapio";
        ArrayList<CardapioModel> menuList = new ArrayList<>();
        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                CardapioModel menu = new CardapioModel(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getString(7));

                menuList.add(menu);
            }
        } catch (SQLException err) {
            System.out.println(err);
        }

        return menuList;
    }

    public ArrayList<CardapioModel> getMenuWithDate(CardapioModel cardapio) {
        String sql = "SELECT * FROM cardapio WHERE data_cardapio = ?";
        ArrayList<CardapioModel> menuList = new ArrayList<>();
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, cardapio.getDia_cardapio());
            rs = pst.executeQuery();
            while (rs.next()) {
                CardapioModel menu = new CardapioModel(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getString(7));

                menuList.add(menu);
            }
        } catch (SQLException err) {
            System.out.println(err);
        }

        return menuList;
    }

    public int createMenu(CardapioModel cardapio) {
        int adicionado = 0;
        String sql = "INSERT INTO cardapio (cod_cardapio, pratobase, prato_principal, guarnicao, fruta_salada, totalcal, data_cardapio) "
                + "VALUES (?,?,?,?,?,?,?)";

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, cardapio.getCod_cardapio());
            pst.setString(2, cardapio.getPrato_base());
            pst.setString(3, cardapio.getPrato_principal());
            pst.setString(4, cardapio.getGuarnição());
            pst.setString(5, cardapio.getFruta_salada());
            pst.setInt(6, cardapio.getTotal_cal());
            pst.setString(7, cardapio.getDia_cardapio());

            adicionado = pst.executeUpdate();
        } catch (SQLException err) {
            System.out.println(err);
        }

        return adicionado;
    }

    public int updateMenu(CardapioModel cardapio) {
        int atualizado = 0;
        String sql = "UPDATE cardapio SET pratobase = ? prato_principal = ? guarnicao = ?, "
                + "fruta_salada = ?, totalcal = ?, data_cardapio = ? WHERE cod_cardapio = ?";

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, cardapio.getPrato_base());
            pst.setString(2, cardapio.getPrato_principal());
            pst.setString(3, cardapio.getGuarnição());
            pst.setString(4, cardapio.getFruta_salada());
            pst.setInt(5, cardapio.getTotal_cal());
            pst.setString(6, cardapio.getDia_cardapio());
            pst.setString(7, cardapio.getCod_cardapio());

            atualizado = pst.executeUpdate();
        } catch (SQLException err) {
            System.out.println(err);
        }

        return atualizado;
    }

    public int deleteMenu(CardapioModel cardapio) {
        int deletado = 0;
        String sql = "DELETE FROM cardapio WHERE cod_cardapio = ?";

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, cardapio.getCod_cardapio());

            deletado = pst.executeUpdate();
        } catch (SQLException err) {
            System.out.println(err);
        }

        return deletado;
    }

}
