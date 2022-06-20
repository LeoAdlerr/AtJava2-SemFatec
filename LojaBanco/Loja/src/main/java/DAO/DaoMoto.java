package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Controller.Moto;


public class DaoMoto {
    private Moto m1;
    private String select_sql;
    private PreparedStatement pst;
    
    public DaoMoto(Moto m1) {
    	this.m1=m1;
    }
    
	public void criarMt() {
   
        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            String insert_sql = "insert into moto (modelo, placa, preco) values (?, ?, ?)";
            PreparedStatement pst;
            pst = con.prepareStatement(insert_sql);
            pst.setObject(1, m1.getModeloMoto());
            pst.setObject(2, m1.getPlacaMoto());
            pst.setObject(3, m1.getPrecoMoto());
            pst.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao inserir os dados!", e);
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("Erro ao fechar conexão", e);
            }
        }
    }
	
	
	public void deletarMt() {
    
        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            
            String insert_sql = "DELETE FROM moto WHERE modelo=? and placa=? and preco=?";
            PreparedStatement pst;
            pst = con.prepareStatement(insert_sql);
            pst.setString(1, m1.getModeloMoto());
            pst.setObject (2, m1.getPlacaMoto());
            pst.setObject (3, m1.getPrecoMoto());
            pst.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao inserir os dados!", e);
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("Erro ao fechar conexão", e);
            }
        }
    }
    
	
	public void atualizarMt() {

        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            String insert_sql = "update moto set modelo=?, placa=?, preco=? where modelo=? and placa=? and preco=?";
            PreparedStatement pst;
            pst = con.prepareStatement(insert_sql);
            pst.setObject(1, m1.getModeloMoto());
            pst.setObject(2, m1.getPlacaMoto());
            pst.setObject(3, m1.getPrecoMoto());
            pst.setObject(4, m1.getModeloMoto());
            pst.setObject(5, m1.getPlacaMoto());
            pst.setObject(6, m1.getPrecoMoto());
            int rowsUpdated = pst.executeUpdate();
            if(rowsUpdated > 0) {
            	System.out.println("Atualizou passou");
            }
            
            
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir os dados!", e);
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("Erro ao fechar conexão", e);
            }
        }
	}

    public List<Moto> buscarMotos() {
        List<Moto> clientes = new ArrayList<Moto>();
        Connection con = null;
        
        try {
            con = ConnectionManager.getConnection();
        	select_sql = "select * from moto where modelo=? and placa=? and preco=?";
            pst = con.prepareStatement(select_sql);
            pst.setString(1, m1.getModeloMoto());
            pst.setObject(2, m1.getPlacaMoto());
            pst.setObject(2, m1.getPrecoMoto());
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
            	
            	m1.setModeloMoto(rs.getString("modelo"));
            	m1.setPlacaMoto(rs.getString("placa"));
            	m1.setPrecoMoto(rs.getFloat("preco"));
            	clientes.add(m1);
				  
           }
            } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao buscar tarefas!", e);
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("Erro ao fechar conexão", e);
            }
        }        
        return clientes;
    
}
    }

