package br.com.ti0523.patrimonio.telas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.text.ParseException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import br.com.ti052023.patrimonio.dao.DAOPatrimonio;
import br.com.ti052023.patrimonio.pojo.Patrimonio;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastrarPatrimonio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtSerie;
	private JTextField txtLocalizacao;
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarPatrimonio frame = new CadastrarPatrimonio();
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
	public CadastrarPatrimonio() {
		
		
		// Instância da classe Patrimonio que está no pacote POJO.
		Patrimonio pat = new Patrimonio();
				
		// Instância da classe DAOPatrimonio que realiza o cadastro dos dados do patrimonio no banco de dados.
		DAOPatrimonio daopat = new DAOPatrimonio();
		
		setTitle("Cadastro de Equipamentos");
		setIconImage(Toolkit.getDefaultToolkit().getImage(CadastrarPatrimonio.class.getResource("/br/com/ti0523/patrimonio/images/icone interface grafica.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 515, 359);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Número de série:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 180, 99, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Patrimônio:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 205, 115, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tipo de produto:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(10, 230, 115, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Descrição do produto:");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3_1.setBounds(251, 11, 142, 14);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4 = new JLabel("Localização:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(235, 180, 82, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Data fabricação:");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4_1.setBounds(235, 205, 115, 14);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Data aquisição:");
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4_1_1.setBounds(235, 230, 99, 14);
		contentPane.add(lblNewLabel_4_1_1);
		
		txtSerie = new JTextField();
		txtSerie.setBounds(108, 178, 115, 20);
		contentPane.add(txtSerie);
		txtSerie.setColumns(10);
		
		txtLocalizacao = new JTextField();
		txtLocalizacao.setBounds(331, 174, 115, 20);
		contentPane.add(txtLocalizacao);
		txtLocalizacao.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setBounds(108, 203, 115, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		
		JComboBox cboTipo = new JComboBox();
		cboTipo.setModel(new DefaultComboBoxModel(new String[] {"Informática", "Movéis"}));
		cboTipo.setBounds(108, 230, 115, 22);
		contentPane.add(cboTipo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(239, 142, 171, 0);
		contentPane.add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(251, 36, 183, 110);
		contentPane.add(scrollPane_1);
		
		JTextArea txtDescricao = new JTextArea();
		scrollPane_1.setViewportView(txtDescricao);
		
		MaskFormatter msf = new MaskFormatter();
		try {
			msf.setMask("##/##/####");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		
		JFormattedTextField txtFabricacao = new JFormattedTextField(msf);
		txtFabricacao.setBounds(331, 203, 115, 20);
		contentPane.add(txtFabricacao);
		
		JFormattedTextField txtAquisicao = new JFormattedTextField(msf);
		txtAquisicao.setBounds(331, 228, 115, 20);
		contentPane.add(txtAquisicao);
		
		JLabel lblFigura = new JLabel("New label");
		lblFigura.setBounds(10, 12, 219, 132);
		
		lblFigura.setIcon(new ImageIcon
				(new ImageIcon(CadastrarPatrimonio.class.getResource("/br/com/ti0523/patrimonio/images/monitor.jpg"))
						.getImage().getScaledInstance(lblFigura.getWidth(), 
								lblFigura.getHeight(), Image.SCALE_SMOOTH)));
		
		contentPane.add(lblFigura);
		
		JButton btnSalvar = new JButton("CADASTRAR");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Ao clicar no botão deverá aparecer na tela de console todos os dados preenchidos nos campos.
				pat.setSerie(txtSerie.getText());
				pat.setNomepatrimonio(txtNome.getText());
				pat.setTipo(cboTipo.getSelectedItem().toString());
				pat.setDescricao(txtDescricao.getText());
				pat.setLocalizacao(txtLocalizacao.getText());
				pat.setFabricacao(txtFabricacao.getText());
				pat.setDataaquisicao(txtAquisicao.getText());
				
				String rs = daopat.cadastrar(pat);
				
				JOptionPane.showMessageDialog(null, rs);
				
				txtSerie.setText("");
				txtNome.setText("");
				txtDescricao.setText("");
				txtLocalizacao.setText("");
				txtFabricacao.setText("  /  /    ");
				txtAquisicao.setText("");
			}
		});
		btnSalvar.setBounds(447, 326, 168, 52);
		contentPane.add(btnSalvar);

	}
}
