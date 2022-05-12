package Loja;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTree;
import javax.swing.JEditorPane;

public class TelaVan extends JFrame{
	
	private JLabel lableModeloVan;
	private JLabel lablePlacaVan;
	private JLabel lablePrecoVan;
	
	private JTextField txtModeloVan;
	private JTextField txtPlacaVan;
	private JTextField txtPrecoVan;
	
	private JButton botaoSalvarVeiculo;
	
	public TelaVan() {
		super();
		
		this.setTitle("Cadastro Van");
		this.setSize(500,250);
		
		getContentPane().setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		lableModeloVan = new JLabel("Modelo: ");
		txtModeloVan = new JTextField();
		txtModeloVan.setPreferredSize(new Dimension(400,25));
		
		lablePlacaVan = new JLabel("Placa: ");
		txtPlacaVan = new JTextField();
		txtPlacaVan.setPreferredSize(new Dimension(100,25));
		
		lablePrecoVan = new JLabel("Preço: ");
		txtPrecoVan = new JTextField();
		txtPrecoVan.setPreferredSize(new Dimension(100,25));
		
		
		botaoSalvarVeiculo = new JButton("Salvar");
		
		botaoSalvarVeiculo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent ae) {
				Van v1 = new Van(txtModeloVan.getText(), txtPlacaVan.getText(), Float.parseFloat(txtPrecoVan.getText()));
				
				vans.add(v1);
				
				
				for (int i = 0; i < vans.size(); i++) {
			        System.out.println(getVans(v1));
			    }
			
			/*
			 * String modeloCarro = txtModeloCarro.getText();
			 *
			String placaCarro = txtPlacaCarro.getText();
			float precoCarro = Float.parseFloat(txtPrecoCarro.getText());*/
		
			JOptionPane.showMessageDialog(null, "DADOS DO VEICULO " +
					"\n Modelo: " + v1.getModeloVan() +
					"\n Placa: " + v1.getPlacaVan() +
					"\n Preço: " + v1.getPrecoVan());
			JOptionPane.showMessageDialog(null, "Veiculo salvo com sucesso!");
		}
		
		LinkedList<Van> vans = new LinkedList<Van>();
		
		public void cadastrarVan(Van van) {
			vans.add(van);
		}
		public List<Van> getVans(Van v1){
			return this.vans;
		}
			}
		);
		
		getContentPane().add(lableModeloVan);
		getContentPane().add(txtModeloVan);
		
		getContentPane().add(lablePlacaVan);
		getContentPane().add(txtPlacaVan);
		
		getContentPane().add(lablePrecoVan);
		getContentPane().add(txtPrecoVan);
	
		getContentPane().add(botaoSalvarVeiculo);
		
		this.setVisible(true);
	}
}
