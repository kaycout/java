package br.com.ti0523.patrimonio.telas;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class CadastrarLocalizacao extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarLocalizacao frame = new CadastrarLocalizacao();
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
	public CadastrarLocalizacao() {
		setBounds(100, 100, 450, 300);
		setIconImage(Toolkit.getDefaultToolkit().getImage(CadastrarLocalizacao.class.getResource("/br/com/ti0523/patrimonio/images/2 icone interface.png")));
		setTitle("Cadastro de Localização de Patrimônios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFigura = new JLabel("New label");
		lblFigura.setBounds(10, 11, 179, 296);
		
		lblFigura.setIcon(new ImageIcon
				(new ImageIcon(CadastrarPatrimonio.class.getResource("/br/com/ti0523/patrimonio/imagens/cadeira_presidente.jpg"))
						.getImage().getScaledInstance(lblFigura.getWidth(),
								lblFigura.getHeight(), Image.SCALE_SMOOTH)));
		contentPane.add(lblFigura);
		
		JLabel lblNewLabel = new JLabel("Empresa:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(20, 160, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(19, 182, 46, 14);
		contentPane.add(lblNewLabel_1);
		
	}

}
