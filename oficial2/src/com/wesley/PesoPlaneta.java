package com.wesley;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PesoPlaneta extends JFrame {

	private JPanel contentPane;
	private JTextField peso;
	protected Double peso1;
	protected Double total;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PesoPlaneta frame = new PesoPlaneta();
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
	public PesoPlaneta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Peso Na Terra(Kg):");
		lblNewLabel.setBounds(163, 11, 163, 14);
		contentPane.add(lblNewLabel);
		
		peso = new JTextField();
		peso.setBounds(163, 71, 86, 20);
		contentPane.add(peso);
		peso.setColumns(10);
		
		JButton limpar = new JButton("Limpar");
		limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			peso.setText("");
			
			
			
			}
		});
		limpar.setBounds(305, 70, 89, 23);
		contentPane.add(limpar);
		
		JButton mer = new JButton("Mercurio");
		mer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				peso1 = Double.parseDouble(peso.getText());	
		
			
			total = peso1 * 0.37;
					
			JOptionPane.showInternalMessageDialog(null," O seu peso em mercurio é: " +total+ "Kg");
		
			
			}
			
		});
		mer.setBounds(42, 151, 89, 23);
		contentPane.add(mer);
		
		JButton mar = new JButton("Marte");
		mar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				peso1 = Double.parseDouble(peso.getText());	
				
				
				total = peso1 * 0.38;
						
				JOptionPane.showInternalMessageDialog(null," O seu peso em Marte é: " +total+"Kg");
			
			}
		
		});
		mar.setBounds(163, 151, 89, 23);
		contentPane.add(mar);
		
		JButton sat = new JButton("Saturno");
		sat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				peso1 = Double.parseDouble(peso.getText());	
				
				
				total = peso1 * 1.15;
						
				JOptionPane.showInternalMessageDialog(null," O seu peso em Saturno é: " +total);
			
			
			
			}
		});
		sat.setBounds(284, 151, 89, 23);
		contentPane.add(sat);
		
		JButton ven = new JButton("Venus");
		ven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				peso1 = Double.parseDouble(peso.getText());	
				
				
				total = peso1 * 0.88;
						
				JOptionPane.showInternalMessageDialog(null," O seu peso em Venus é: " +total+"Kg");
			
			}
		});
		ven.setBounds(42, 210, 89, 23);
		contentPane.add(ven);
		
		JButton jup = new JButton("Jupiter");
		jup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				peso1 = Double.parseDouble(peso.getText());	
				
				
				total = peso1 * 2.64;
						
				JOptionPane.showInternalMessageDialog(null," O seu peso em Jupiter é: " +total+"Kg");
			
			
			}
		});
		jup.setBounds(163, 210, 89, 23);
		contentPane.add(jup);
		
		JButton ura = new JButton("Urano");
		ura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				peso1 = Double.parseDouble(peso.getText());	
				
				
				total = peso1 * 1.17;
						
				JOptionPane.showInternalMessageDialog(null," O seu peso em Urano é: " +total+"Kg");
			
			
			}
		});
		ura.setBounds(284, 210, 89, 23);
		contentPane.add(ura);
		
		JLabel lblNewLabel_1 = new JLabel("Selecione o Planeta:");
		lblNewLabel_1.setBounds(163, 112, 144, 14);
		contentPane.add(lblNewLabel_1);
	}
}
