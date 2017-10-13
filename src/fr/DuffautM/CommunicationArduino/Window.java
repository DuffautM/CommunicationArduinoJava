package fr.DuffautM.CommunicationArduino;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JToolBar;
import javax.swing.JDesktopPane;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Window extends JFrame {

	public final JPanel contentPane;
	public final JButton buttonPlus;
	public final JButton buttonLess;
	public final JLabel labelConsigne;
	public final JLabel labelHumidity;
	public final JLabel labelTemperature;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window frame = new Window();
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
	public Window() {
		setTitle("Frigo Center");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 454, 438);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Température :");
		lblNewLabel.setBounds(15, 16, 169, 82);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 23));
		
		JLabel lblHumidit = new JLabel("Humidité :");
		lblHumidit.setBounds(15, 104, 169, 82);
		lblHumidit.setForeground(Color.WHITE);
		lblHumidit.setFont(new Font("Tahoma", Font.PLAIN, 23));
		
		JLabel lblConsigne = new JLabel("Consigne :");
		lblConsigne.setBounds(15, 247, 169, 82);
		lblConsigne.setForeground(Color.WHITE);
		lblConsigne.setFont(new Font("Tahoma", Font.PLAIN, 23));
		
		labelTemperature = new JLabel("0°C");
		labelTemperature.setBounds(370, 16, 83, 82);
		labelTemperature.setForeground(Color.RED);
		labelTemperature.setFont(new Font("Tahoma", Font.PLAIN, 23));
		
		labelHumidity = new JLabel("0°C");
		labelHumidity.setBounds(370, 104, 83, 82);
		labelHumidity.setForeground(Color.BLUE);
		labelHumidity.setFont(new Font("Tahoma", Font.PLAIN, 23));
		
		labelConsigne = new JLabel("0°C");
		labelConsigne.setBounds(370, 247, 38, 82);
		labelConsigne.setForeground(Color.ORANGE);
		labelConsigne.setFont(new Font("Tahoma", Font.PLAIN, 23));
		
		buttonLess = new JButton("-");
		buttonLess.setBounds(344, 323, 64, 45);
		buttonLess.setFont(new Font("Tahoma", Font.PLAIN, 40));
		
		buttonPlus = new JButton("+");
		buttonPlus.setBounds(270, 323, 64, 45);
		buttonPlus.setFont(new Font("Tahoma", Font.PLAIN, 40));
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel);
		contentPane.add(lblHumidit);
		contentPane.add(lblConsigne);
		contentPane.add(labelHumidity);
		contentPane.add(labelTemperature);
		contentPane.add(labelConsigne);
		contentPane.add(buttonPlus);
		contentPane.add(buttonLess);
	}
}
