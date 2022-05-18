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

public class TelaMoto extends JFrame{
	
	private JLabel lableModeloMoto;
	private JLabel lablePlacaMoto;
	private JLabel lablePrecoMoto;
	
	private JTextField txtModeloMoto;
	private JTextField txtPlacaMoto;
	private JTextField txtPrecoMoto;
	
	private JButton botaoSalvarVeiculo;
	
	public TelaMoto() {
		super();
		
		this.setTitle("Cadastro Moto");
		this.setSize(500,250);
		
		getContentPane().setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		lableModeloMoto = new JLabel("Modelo: ");
		txtModeloMoto = new JTextField();
		txtModeloMoto.setPreferredSize(new Dimension(400,25));
		
		lablePlacaMoto = new JLabel("Placa: ");
		txtPlacaMoto = new JTextField();
		txtPlacaMoto.setPreferredSize(new Dimension(100,25));
		
		lablePrecoMoto = new JLabel("Preço: ");
		txtPrecoMoto = new JTextField();
		txtPrecoMoto.setPreferredSize(new Dimension(100,25));
		
		
		botaoSalvarVeiculo = new JButton("Salvar");
		
		botaoSalvarVeiculo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent ae) {
				Moto m1 = new Moto(txtPlacaMoto.getText(), txtModeloMoto.getText(), Float.parseFloat(txtPrecoMoto.getText()));
				
				motos.add(m1);
				
				for (int i = 0; i < motos.size(); i++) {
			        System.out.println("Modelo: " + m1.getModeloMoto() +  "\n" + "\n" + "Placa: " + m1.getPlacaMoto() + "\n" + "\n" + "Preco: " + m1.getPrecoMoto());
			    }
			
			/*
			 * String modeloCarro = txtModeloCarro.getText();
			 *
			String placaCarro = txtPlacaCarro.getText();
			float precoCarro = Float.parseFloat(txtPrecoCarro.getText());*/
		
			JOptionPane.showMessageDialog(null, "DADOS DO VEICULO " +
					"\n Modelo: " + m1.getModeloMoto() +
					"\n Placa: " + m1.getPlacaMoto() +
					"\n Preço: " + m1.getPrecoMoto());
			JOptionPane.showMessageDialog(null, "Veiculo salvo com sucesso!");
		}

		private LinkedList<Moto> motos = new LinkedList<Moto>();
		
		public void cadastrarCarro(Moto moto) {
			motos.add(moto);
		}
		public List<Moto> getMoto(Moto m1){
			return this.motos;
		}
			}
		);
		
		getContentPane().add(lableModeloMoto);
		getContentPane().add(txtModeloMoto);
		
		getContentPane().add(lablePlacaMoto);
		getContentPane().add(txtPlacaMoto);
		
		getContentPane().add(lablePrecoMoto);
		getContentPane().add(txtPrecoMoto);
	
		getContentPane().add(botaoSalvarVeiculo);
		
		this.setVisible(true);
	}
}
