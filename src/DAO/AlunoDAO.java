package DAO;

import Controller.Conexao;
import Model.AlunoModel;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AlunoDAO {
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
        
    public AlunoDAO() {
        Conexao con = new Conexao();
        conexao = con.getConnection();
    }
    
    public int createAluno(AlunoModel aluno){
        int adicionado = 0;
        String sql = "INSERT INTO tbalunos(RMAluno, nomeAluno, moduloAluno, cursoAluno, turnoAluno) VALUES (?,?,?,?,?)";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, aluno.getRMAluno());
            pst.setString(2, aluno.getNomeAluno());
            pst.setString(3, aluno.getModuloAluno());
            pst.setString(4, aluno.getCursoAluno());
            pst.setString(5, aluno.getTurnoAluno());
            
            adicionado = pst.executeUpdate();
        } catch (SQLException err) {
            System.out.println(err);
        }
        
        return adicionado;
    }
    
    public int createAlunoFromCSV(String fileUploaded) {
        int adicionado = 0;
        try {
            String sql = "LOAD DATA LOCAL INFILE '" + fileUploaded + "' INTO TABLE tbalunos FIELDS TERMINATED BY ',' LINES TERMINATED BY '\n' IGNORE 1 ROWS";
            pst = conexao.prepareStatement(sql);
            adicionado = pst.executeUpdate();
        } catch (SQLException err) {
            System.out.println(err);
        }
        return adicionado;
    }
}
