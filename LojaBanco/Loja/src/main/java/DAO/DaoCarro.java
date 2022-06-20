package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Controller.Carro;


public class DaoCarro {
    private Carro c1;
    private String select_sql;
    private PreparedStatement pst;
    
    public DaoCarro(Carro c1) {
    	this.c1=c1;
    }
    
	public void criarCr() {
   
        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            String insert_sql = "insert into carro (modelo, placa, preco) values (?, ?, ?)";
            PreparedStatement pst;
            pst = con.prepareStatement(insert_sql);
            pst.setObject(1, c1.getModeloCarro());
            pst.setObject(2, c1.getPlacaCarro());
            pst.setObject(3, c1.getPrecoCarro());
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
	
	
	public void deletarCr() {
    
        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            
            String insert_sql = "DELETE FROM carro WHERE modelo=? and placa=? and preco=?";
            PreparedStatement pst;
            pst = con.prepareStatement(insert_sql);
            pst.setString(1, c1.getModeloCarro());
            pst.setObject (2, c1.getPlacaCarro());
            pst.setObject (3, c1.getPrecoCarro());
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
    
	
	public void atualizarCr() {

        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            String insert_sql = "update carro set modelo=?, placa=?, preco=? where modelo=? and placa=? and preco=?";
            PreparedStatement pst;
            pst = con.prepareStatement(insert_sql);
            pst.setObject(1, c1.getModeloCarro());
            pst.setObject(2, c1.getPlacaCarro());
            pst.setObject(3, c1.getPrecoCarro());
            pst.setObject(4, c1.getModeloCarro());
            pst.setObject(5, c1.getPlacaCarro());
            pst.setObject(6, c1.getPrecoCarro());
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

    public List<Carro> buscarCarros() {
        List<Carro> clientes = new ArrayList<Carro>();
        Connection con = null;
        
        try {
            con = ConnectionManager.getConnection();
        	select_sql = "select * from carro where modelo=? and placa=? and preco=?";
            pst = con.prepareStatement(select_sql);
            pst.setString(1, c1.getModeloCarro());
            pst.setObject(2, c1.getPlacaCarro());
            pst.setObject(2, c1.getPrecoCarro());
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
            	
            	c1.setModeloCarro(rs.getString("modelo"));
            	c1.setPlacaCarro(rs.getString("placa"));
            	c1.setPrecoCarro(rs.getFloat("preco"));
            	clientes.add(c1);
            	
				
				  System.out.print("Modelo = " + c1.getModeloCarro() +" Placa= "+c1.getPlacaCarro()+" Preço= " + c1.getPrecoCarro());
				  
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

