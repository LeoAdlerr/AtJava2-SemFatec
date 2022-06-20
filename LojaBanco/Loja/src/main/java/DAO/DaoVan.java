package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Controller.Van;


public class DaoVan {
    private Van v1;
    private String select_sql;
    private PreparedStatement pst;
    
    public DaoVan(Van v1) {
    	this.v1=v1;
    }
    
	public void criarVn() {
   
        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            String insert_sql = "insert into van (modelo, placa, preco) values (?, ?, ?)";
            PreparedStatement pst;
            pst = con.prepareStatement(insert_sql);
            pst.setObject(1, v1.getModeloVan());
            pst.setObject(2, v1.getPlacaVan());
            pst.setObject(3, v1.getPrecoVan());
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
	
	
	public void deletarVn() {
    
        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            
            String insert_sql = "DELETE FROM van WHERE modelo=? and placa=? and preco=?";
            PreparedStatement pst;
            pst = con.prepareStatement(insert_sql);
            pst.setString(1, v1.getModeloVan());
            pst.setObject (2, v1.getPlacaVan());
            pst.setObject (3, v1.getPrecoVan());
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
    
	
	public void atualizarVn() {

        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            String insert_sql = "update van set modelo=?, placa=?, preco=? where modelo=? and placa=? and preco=?";
            PreparedStatement pst;
            pst = con.prepareStatement(insert_sql);
            pst.setObject(1, v1.getModeloVan());
            pst.setObject(2, v1.getPlacaVan());
            pst.setObject(3, v1.getPrecoVan());
            pst.setObject(4, v1.getModeloVan());
            pst.setObject(5, v1.getPlacaVan());
            pst.setObject(6, v1.getPrecoVan());
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

    public List<Van> buscarVans() {
        List<Van> clientes = new ArrayList<Van>();
        Connection con = null;
        
        try {
            con = ConnectionManager.getConnection();
        	select_sql = "select * from van where modelo=? and placa=? and preco=?";
            pst = con.prepareStatement(select_sql);
            pst.setString(1, v1.getModeloVan());
            pst.setObject(2, v1.getPlacaVan());
            pst.setObject(2, v1.getPrecoVan());
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
            	
            	v1.setModeloVan(rs.getString("modelo"));
            	v1.setPlacaVan(rs.getString("placa"));
            	v1.setPrecoVan(rs.getFloat("preco"));
            	clientes.add(v1);
				  
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

