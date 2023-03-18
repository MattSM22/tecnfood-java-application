package DAO;

import Controller.Conexao;
import Model.AlunoModel;

import java.io.*;
import java.nio.charset.StandardCharsets;

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
        int criadoAlunos = 0;
        int atualizandoCamposDosAlunos = 0;
        try {
            String sql = "LOAD DATA LOCAL INFILE '" + fileUploaded + "' INTO TABLE tbalunos FIELDS TERMINATED BY ',' LINES TERMINATED BY '\n' IGNORE 1 ROWS";
            pst = conexao.prepareStatement(sql);
            criadoAlunos = pst.executeUpdate();
            if (criadoAlunos > 0){
                String sqlSelectAllFields= "UPDATE tbalunos SET nomeAluno = UPPER(nomeAluno), cursoAluno = UPPER(cursoAluno), turnoAluno = UPPER(turnoAluno)";
                pst = conexao.prepareStatement(sqlSelectAllFields);
                atualizandoCamposDosAlunos = pst.executeUpdate();
            }
        } catch (SQLException err) {
            System.out.println(err);
        }
        return atualizandoCamposDosAlunos;
    }
    
    public int updateAluno(AlunoModel aluno){
        int updateAlunoFlag = 0;
        String sql = "UPDATE tbalunos SET nomeAluno = ?, moduloAluno = ?, cursoAluno = ?, turnoAluno = ? WHERE RMAluno = ?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, aluno.getNomeAluno());
            pst.setString(2, aluno.getModuloAluno());
            pst.setString(3, aluno.getCursoAluno());
            pst.setString(4, aluno.getTurnoAluno());
            pst.setString(5, aluno.getRMAluno());
            
            updateAlunoFlag = pst.executeUpdate();
        } catch (SQLException err) {
            System.out.println(err);
        }
        
        return updateAlunoFlag;
    }
    
    public int deleteAluno(AlunoModel aluno){
        int deletedStudentFlag = 0;
        String sql = "DELETE FROM tbalunos WHERE RMAluno = ?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, aluno.getRMAluno());
            deletedStudentFlag = pst.executeUpdate();
        } catch (SQLException err) {
            System.out.println(err);
        }
        
        return deletedStudentFlag;
    }
    
    public ArrayList<AlunoModel> getAllData(){
        String sql = "SELECT * FROM tbalunos ORDER BY moduloAluno";
        ArrayList<AlunoModel> studentList = new ArrayList<>();
        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                AlunoModel adm = new 
                AlunoModel(rs.getString(1), 
                         rs.getString(2),
                        rs.getString(3), 
                        rs.getString(4), 
                        rs.getString(5));
                studentList.add(adm);
            }
        } catch (SQLException err) {
            System.out.println(err);
        }
        
        return studentList;
    }

    public ArrayList<AlunoModel> refinedTableDataByNameOfStudent(AlunoModel aluno){
        String sql = "SELECT * FROM tbalunos WHERE nomeAluno like ? ORDER BY moduloAluno";
        ArrayList<AlunoModel> studentList = new ArrayList<>();
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, aluno.getNomeAluno() + "%");
            rs = pst.executeQuery();
            while(rs.next()){
                AlunoModel adm = new 
                AlunoModel(rs.getString(1), 
                         rs.getString(2),
                        rs.getString(3), 
                        rs.getString(4), 
                        rs.getString(5));
                studentList.add(adm);
            }
        } catch (SQLException err) {
            System.out.println(err);
        }
        
        return studentList;
    }
    
    public ArrayList<AlunoModel> refinedTableDataByRMOfStudent(AlunoModel aluno){
        String sql = "SELECT * FROM tbalunos WHERE RMAluno like ? ORDER BY moduloAluno";
        ArrayList<AlunoModel> studentList = new ArrayList<>();
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, aluno.getRMAluno()+ "%");
            rs = pst.executeQuery();
            while(rs.next()){
                AlunoModel adm = new 
                AlunoModel(rs.getString(1), 
                         rs.getString(2),
                        rs.getString(3), 
                        rs.getString(4), 
                        rs.getString(5));
                studentList.add(adm);
            }
        } catch (SQLException err) {
            System.out.println(err);
        }
        
        return studentList;
    }
}
