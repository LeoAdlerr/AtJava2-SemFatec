package Loja;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JDesktopPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;

public class Main extends JFrame {

	private JPanel contentPane;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction();
	private final Action action_2 = new SwingAction_1();
	private final Action action_3 = new SwingAction_2();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(10, 236, 399, -206);
		contentPane.add(desktopPane);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 64, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Cadastro");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Carro");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCarro carro = new TelaCarro();
				 carro.setVisible(true);
	
			}
		});
		mntmNewMenuItem.setAction(action);
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Moto");
		mntmNewMenuItem_1.setAction(action_3);
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Van");
		mntmNewMenuItem_2.setAction(action_2);
		mnNewMenu.add(mntmNewMenuItem_2);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Carro");
			putValue(SHORT_DESCRIPTION, "Cadastro Carro");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Van");
			putValue(SHORT_DESCRIPTION, "Cadastro Van");
		}
		public void actionPerformed(ActionEvent e) {
			TelaVan van = new TelaVan();
			 van.setVisible(true);
		}
	}
	private class SwingAction_2 extends AbstractAction {
		public SwingAction_2() {
			putValue(NAME, "Moto");
			putValue(SHORT_DESCRIPTION, "Cadastro Moto");
		}
		public void actionPerformed(ActionEvent e) {
			TelaMoto moto = new TelaMoto();
			 moto.setVisible(true);
		}
	}
}
