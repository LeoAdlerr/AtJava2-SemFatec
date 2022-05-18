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

public class TelaCarro extends JFrame{
	
	private JLabel lableModeloCarro;
	private JLabel lablePlacaCarro;
	private JLabel lablePrecoCarro;
	
	private JTextField txtModeloCarro;
	private JTextField txtPlacaCarro;
	private JTextField txtPrecoCarro;
	
	private JButton botaoSalvarVeiculo;
	
	public TelaCarro() {
		super();
		
		this.setTitle("Cadastro Carro");
		this.setSize(500,250);
		
		getContentPane().setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		lableModeloCarro = new JLabel("Modelo: ");
		txtModeloCarro = new JTextField();
		txtModeloCarro.setPreferredSize(new Dimension(400,25));
		
		lablePlacaCarro = new JLabel("Placa: ");
		txtPlacaCarro = new JTextField();
		txtPlacaCarro.setPreferredSize(new Dimension(100,25));
		
		lablePrecoCarro = new JLabel("Preço: ");
		txtPrecoCarro = new JTextField();
		txtPrecoCarro.setPreferredSize(new Dimension(100,25));
		
		
		botaoSalvarVeiculo = new JButton("Salvar");
		
		botaoSalvarVeiculo.addActionListener(new ActionListener() {
			

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				Carro c1 = new Carro(txtPlacaCarro.getText(), txtModeloCarro.getText(), Float.parseFloat(txtPrecoCarro.getText()));
				
					carros.add(c1);
					
					
					for (int i = 0; i < carros.size(); i++) {
				        System.out.println("Modelo: " + c1.getModeloCarro() +  "\n" + "\n" + "Placa: " + c1.getPlacaCarro() + "\n" + "\n" + "Preco: " + c1.getPrecoCarro());
				    }
				
				/*
				 * String modeloCarro = txtModeloCarro.getText();
				 *
				String placaCarro = txtPlacaCarro.getText();
				float precoCarro = Float.parseFloat(txtPrecoCarro.getText());*/
			
				JOptionPane.showMessageDialog(null, "DADOS DO VEICULO " +
						"\n Modelo: " + c1.getModeloCarro() +
						"\n Placa: " + c1.getPlacaCarro() +
						"\n Preço: " + c1.getPrecoCarro());
				JOptionPane.showMessageDialog(null, "Veiculo salvo com sucesso!");
			}

			ArrayList<Carro> carros = new ArrayList<Carro>();
			
			public void cadastrarCarro(Carro carro) {
				carros.add(carro);
			}
			public ArrayList<Carro> getCarro(Carro c1){
				return this.carros;
			}
			
			}
		);
		
		getContentPane().add(lableModeloCarro);
		getContentPane().add(txtModeloCarro);
		
		getContentPane().add(lablePlacaCarro);
		getContentPane().add(txtPlacaCarro);
		
		getContentPane().add(lablePrecoCarro);
		getContentPane().add(txtPrecoCarro);
	
		getContentPane().add(botaoSalvarVeiculo);
		
		this.setVisible(true);
	}

}
