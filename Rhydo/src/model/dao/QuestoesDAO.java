
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Questoes;


public class QuestoesDAO {
        
        public Questoes obterQuestao(String nome){
            Questoes q = new Questoes();
            
            
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            try {
                stmt = con.prepareStatement("SELECT * FROM questoes WHERE nome = ?");
                stmt.setString(1,nome);
                rs = stmt.executeQuery();
                
                if(rs.next()){
                
               
                
                q.setNome(rs.getString("nome"));    
                q.setEnunciado(rs.getString("enunciado"));
                q.setEntrada1(rs.getString("entrada1"));
                q.setEntrada2(rs.getString("entrada2"));
                q.setEntrada3(rs.getString("entrada3"));
                q.setSaida1(rs.getString("saida1"));
                q.setSaida2(rs.getString("saida2"));
                q.setSaida3(rs.getString("saida3"));
                }
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro ao acessar dados de entrda e saida: "+ex);
            }finally{
                ConnectionFactory.closeConnection(con, stmt, rs);
            }
                 
            return q;
        }
        
        
        public void create(Questoes q){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        
        try {
            stmt = con.prepareStatement("INSERT INTO questoes (nome,enunciado,entrada1,entrada2,entrada3,saida1,saida2,saida3) VALUES(?,?,?,?,?,?,?,?)");
            stmt.setString(1,q.getNome());
            stmt.setString(2,q.getEnunciado());
            stmt.setString(3,q.getEntrada1());
            stmt.setString(4,q.getEntrada2());
            stmt.setString(5,q.getEntrada3());
            stmt.setString(6,q.getSaida1());
            stmt.setString(7,q.getSaida2());
            stmt.setString(8,q.getSaida3());
           
            
            
            
            stmt.executeUpdate();
            
            
            JOptionPane.showMessageDialog(null,"Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
    public List<Questoes> read(){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Questoes> questoes = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM questoes");
            rs = stmt.executeQuery();
            
            
            while(rs.next()){
                
                Questoes q = new Questoes();
                q.setId(rs.getInt("id"));
                q.setNome(rs.getString("nome"));
                q.setEnunciado(rs.getString("enunciado"));
                q.setEntrada1(rs.getString("entrada1"));
                q.setEntrada2(rs.getString("entrada2"));
                q.setEntrada3(rs.getString("entrada3"));
                q.setSaida1(rs.getString("saida1"));
                q.setSaida2(rs.getString("saida2"));
                q.setSaida3(rs.getString("saida3"));
                
                
                
                questoes.add(q);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao adicionar questão na lista: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return questoes;
        
    }
  
    
    
    public void delete(Questoes q){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        
        try {
            stmt = con.prepareStatement("DELETE FROM questoes WHERE id = ?");
            stmt.setInt(1, q.getId());
            
            
            stmt.executeUpdate();
            
            
            JOptionPane.showMessageDialog(null,"Excluído com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
}
