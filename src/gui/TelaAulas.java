package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import classes.Aluno;
import classes.Aulas;
import classes.Curso;
import classes.Professor;
import classes.Sala;

public class TelaAulas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTituloCurso;
	private JTextField txtCargaHoraria;
	private JTextField txtPreco;
	private JTextField txtIdentificacao;
	private JTextField txtDescricao;
	private JTextField txtNomeProfessor;
	private JTextField txtEmailProfessor;
	private JTextField txtCPFProfessor;
	private JTextField txtNomeAluno;
	private JTextField txtEmailAluno;
	private JTextField txtCpfAluno;
	private JTextField txtIdade;
	private JTextField txtIdAula;
	private JTextField txtCurso;
	private JTextField txtProfessor;
	private JTextField txtInicio;
	private JTextField txtTermino;
	private JTextField txtSala;
	
	
	// Declaração dos items para criar uma aula. 
	
	
	private Curso curso;
	private Aluno aluno;
	private Sala sala;
	private Professor professor;
	private Aulas aulas;
	private List<Aluno> listaAluno;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAulas frame = new TelaAulas();
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
	public TelaAulas() {
		
		// Vamos instanciar as nossas classes para gerar 
		// objetos dos items relacionados a aula.
		// Estes objetos estão vazios e serão preenchidos quando 
		// o usuário clicar nos botões de incluir.
		curso = new Curso();
		listaAluno = new ArrayList<Aluno>();
		sala = new Sala();
		professor = new Professor();
		aulas = new Aulas();
		
		
		
		setResizable(false);
		setTitle("Cadastro de Aulas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 620);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_curso = new JPanel();
		panel_curso.setBackground(new Color(224, 255, 255));
		panel_curso.setBounds(10, 61, 711, 90);
		contentPane.add(panel_curso);
		panel_curso.setLayout(null);
		
		JLabel lblTitulodoCurso = new JLabel("Titulo do Curso:");
		lblTitulodoCurso.setBackground(SystemColor.activeCaption);
		lblTitulodoCurso.setForeground(Color.DARK_GRAY);
		lblTitulodoCurso.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTitulodoCurso.setBounds(21, 11, 149, 14);
		panel_curso.add(lblTitulodoCurso);
		
		txtTituloCurso = new JTextField();
		txtTituloCurso.setBounds(140, 9, 322, 20);
		panel_curso.add(txtTituloCurso);
		txtTituloCurso.setColumns(10);
		
		JLabel lblArea = new JLabel("Área:");
		lblArea.setForeground(Color.DARK_GRAY);
		lblArea.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblArea.setBackground(SystemColor.activeCaption);
		lblArea.setBounds(472, 12, 66, 14);
		panel_curso.add(lblArea);
		
		JLabel lblCargaHoraria = new JLabel("Carga Horária:");
		lblCargaHoraria.setForeground(Color.DARK_GRAY);
		lblCargaHoraria.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCargaHoraria.setBackground(SystemColor.activeCaption);
		lblCargaHoraria.setBounds(35, 44, 149, 14);
		panel_curso.add(lblCargaHoraria);
		
		txtCargaHoraria = new JTextField();
		txtCargaHoraria.setBounds(140, 42, 208, 20);
		panel_curso.add(txtCargaHoraria);
		txtCargaHoraria.setColumns(10);
		
		JLabel lblPreco = new JLabel("Preço");
		lblPreco.setForeground(Color.DARK_GRAY);
		lblPreco.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPreco.setBackground(SystemColor.activeCaption);
		lblPreco.setBounds(389, 44, 149, 14);
		panel_curso.add(lblPreco);
		
		txtPreco = new JTextField();
		txtPreco.setColumns(10);
		txtPreco.setBounds(482, 42, 178, 20);
		panel_curso.add(txtPreco);
		
		JComboBox cboArea = new JComboBox();
		cboArea.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		cboArea.setModel(new DefaultComboBoxModel(new String[] {"Humanas", "Exatas", "Biomedicas"}));
		cboArea.setBounds(527, 7, 133, 22);
		panel_curso.add(cboArea);
		
		JPanel panel_sala = new JPanel();
		panel_sala.setBackground(new Color(224, 255, 255));
		panel_sala.setBounds(10, 162, 711, 64);
		contentPane.add(panel_sala);
		panel_sala.setLayout(null);
		
		JLabel lblIdentificacao = new JLabel("Identificação:");
		lblIdentificacao.setForeground(Color.DARK_GRAY);
		lblIdentificacao.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblIdentificacao.setBackground(SystemColor.activeCaption);
		lblIdentificacao.setBounds(36, 23, 149, 14);
		panel_sala.add(lblIdentificacao);
		
		txtIdentificacao = new JTextField();
		txtIdentificacao.setBounds(136, 21, 124, 20);
		panel_sala.add(txtIdentificacao);
		txtIdentificacao.setColumns(10);
		
		txtDescricao = new JTextField();
		txtDescricao.setColumns(10);
		txtDescricao.setBounds(344, 21, 317, 20);
		panel_sala.add(txtDescricao);
		
		JLabel lblDescricao = new JLabel("Descrição:");
		lblDescricao.setForeground(Color.DARK_GRAY);
		lblDescricao.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDescricao.setBackground(SystemColor.activeCaption);
		lblDescricao.setBounds(270, 23, 149, 14);
		panel_sala.add(lblDescricao);
		
		JPanel panel_professor = new JPanel();
		panel_professor.setBackground(new Color(224, 255, 255));
		panel_professor.setBounds(10, 237, 711, 76);
		contentPane.add(panel_professor);
		panel_professor.setLayout(null);
		
		JLabel lblNomedoProfessor = new JLabel("Nome do Professor:");
		lblNomedoProfessor.setForeground(Color.DARK_GRAY);
		lblNomedoProfessor.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNomedoProfessor.setBackground(SystemColor.activeCaption);
		lblNomedoProfessor.setBounds(20, 13, 149, 14);
		panel_professor.add(lblNomedoProfessor);
		
		txtNomeProfessor = new JTextField();
		txtNomeProfessor.setColumns(10);
		txtNomeProfessor.setBounds(20, 32, 260, 20);
		panel_professor.add(txtNomeProfessor);
		
		txtEmailProfessor = new JTextField();
		txtEmailProfessor.setColumns(10);
		txtEmailProfessor.setBounds(310, 32, 203, 20);
		panel_professor.add(txtEmailProfessor);
		
		JLabel lblEmailProfessor = new JLabel("E-Mail do Professor:");
		lblEmailProfessor.setForeground(Color.DARK_GRAY);
		lblEmailProfessor.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmailProfessor.setBackground(SystemColor.activeCaption);
		lblEmailProfessor.setBounds(310, 13, 149, 14);
		panel_professor.add(lblEmailProfessor);
		
		txtCPFProfessor = new JTextField();
		txtCPFProfessor.setColumns(10);
		txtCPFProfessor.setBounds(534, 32, 137, 20);
		panel_professor.add(txtCPFProfessor);
		
		JLabel lblCPFdoProfessor = new JLabel("CPF do Professor:");
		lblCPFdoProfessor.setForeground(Color.DARK_GRAY);
		lblCPFdoProfessor.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCPFdoProfessor.setBackground(SystemColor.activeCaption);
		lblCPFdoProfessor.setBounds(534, 13, 203, 14);
		panel_professor.add(lblCPFdoProfessor);
		
		JPanel panel_aluno = new JPanel();
		panel_aluno.setBackground(new Color(224, 255, 255));
		panel_aluno.setBounds(10, 324, 711, 95);
		contentPane.add(panel_aluno);
		panel_aluno.setLayout(null);
		
		JLabel lblNomeDoAluno = new JLabel("Nome do Aluno:");
		lblNomeDoAluno.setForeground(Color.DARK_GRAY);
		lblNomeDoAluno.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNomeDoAluno.setBackground(SystemColor.activeCaption);
		lblNomeDoAluno.setBounds(10, 11, 149, 14);
		panel_aluno.add(lblNomeDoAluno);
		
		txtNomeAluno = new JTextField();
		txtNomeAluno.setColumns(10);
		txtNomeAluno.setBounds(10, 30, 396, 20);
		panel_aluno.add(txtNomeAluno);
		
		JLabel lblEmailAluno = new JLabel("E-Mail do Aluno:");
		lblEmailAluno.setForeground(Color.DARK_GRAY);
		lblEmailAluno.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmailAluno.setBackground(SystemColor.activeCaption);
		lblEmailAluno.setBounds(450, 11, 149, 14);
		panel_aluno.add(lblEmailAluno);
		
		txtEmailAluno = new JTextField();
		txtEmailAluno.setColumns(10);
		txtEmailAluno.setBounds(451, 30, 222, 20);
		panel_aluno.add(txtEmailAluno);
		
		JLabel lblCpfAluno = new JLabel("CPF do Aluno:");
		lblCpfAluno.setForeground(Color.DARK_GRAY);
		lblCpfAluno.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCpfAluno.setBackground(SystemColor.activeCaption);
		lblCpfAluno.setBounds(10, 65, 149, 14);
		panel_aluno.add(lblCpfAluno);
		
		txtCpfAluno = new JTextField();
		txtCpfAluno.setColumns(10);
		txtCpfAluno.setBounds(140, 63, 322, 20);
		panel_aluno.add(txtCpfAluno);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setForeground(Color.DARK_GRAY);
		lblIdade.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblIdade.setBackground(SystemColor.activeCaption);
		lblIdade.setBounds(485, 65, 66, 14);
		panel_aluno.add(lblIdade);
		
		txtIdade = new JTextField();
		txtIdade.setColumns(10);
		txtIdade.setBounds(548, 63, 125, 20);
		panel_aluno.add(txtIdade);
		
		JPanel panel_aulas = new JPanel();
		panel_aulas.setBackground(new Color(224, 255, 255));
		panel_aulas.setBounds(10, 430, 711, 106);
		contentPane.add(panel_aulas);
		panel_aulas.setLayout(null);
		
		JLabel lblddaAula = new JLabel("Id da Aula:");
		lblddaAula.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblddaAula.setBounds(10, 11, 169, 14);
		panel_aulas.add(lblddaAula);
		
		txtIdAula = new JTextField();
		txtIdAula.setBounds(96, 9, 120, 20);
		panel_aulas.add(txtIdAula);
		txtIdAula.setColumns(10);
		
		JLabel lblCurso = new JLabel("Curso:");
		lblCurso.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCurso.setBounds(226, 11, 87, 14);
		panel_aulas.add(lblCurso);
		
		txtCurso = new JTextField();
		txtCurso.setColumns(10);
		txtCurso.setBounds(272, 9, 136, 20);
		panel_aulas.add(txtCurso);
		
		JLabel lblProfessor = new JLabel("Professor:");
		lblProfessor.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblProfessor.setBounds(440, 11, 87, 14);
		panel_aulas.add(lblProfessor);
		
		txtProfessor = new JTextField();
		txtProfessor.setColumns(10);
		txtProfessor.setBounds(525, 9, 152, 20);
		panel_aulas.add(txtProfessor);
		
		JLabel lblInicio = new JLabel("Início:");
		lblInicio.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblInicio.setBounds(10, 48, 169, 14);
		panel_aulas.add(lblInicio);
		
		txtInicio = new JTextField();
		txtInicio.setColumns(10);
		txtInicio.setBounds(96, 46, 120, 20);
		panel_aulas.add(txtInicio);
		
		JLabel lblTermino = new JLabel("Término:");
		lblTermino.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTermino.setBounds(226, 48, 169, 14);
		panel_aulas.add(lblTermino);
		
		txtTermino = new JTextField();
		txtTermino.setColumns(10);
		txtTermino.setBounds(288, 46, 120, 20);
		panel_aulas.add(txtTermino);
		
		JLabel lblAlunos = new JLabel("Alunos:");
		lblAlunos.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAlunos.setBounds(440, 48, 169, 14);
		panel_aulas.add(lblAlunos);
		
		JComboBox cboAlunos = new JComboBox();
		cboAlunos.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		cboAlunos.setModel(new DefaultComboBoxModel(new String[] {"Kaylane", "Ingrid", "Marcos", "Lais", "Pedro", "Luan"}));
		cboAlunos.setBounds(525, 45, 152, 20);
		panel_aulas.add(cboAlunos);
		
		JLabel lblSala = new JLabel("Sala:");
		lblSala.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSala.setBounds(10, 81, 169, 14);
		panel_aulas.add(lblSala);
		
		txtSala = new JTextField();
		txtSala.setColumns(10);
		txtSala.setBounds(96, 79, 120, 20);
		panel_aulas.add(txtSala);
		
		JButton btnIncluirCurso = new JButton("Incluir curso");
		btnIncluirCurso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Obter o texto que está na caixa de título de curso
				// e adicionar à caixa curso que está na área do criar aula.
				txtCurso.setText(txtTituloCurso.getText());
				
				//vamos adicionar os elementos do curso ao objeto curso, tais como:
				//titulo, carga horaria, datainicio...
				curso.setTitulo(txtTituloCurso.getText());
				curso.setArea(cboArea.getSelectedItem().toString());
				curso.setCargaHoraria(txtCargaHoraria.getText());
				curso.setPreco(Double.parseDouble(txtPreco.getText()));
			
				
				// Vamos desativar o painel de cursos. Vamos usar
				// o comando enabled com o valor falso.
				txtTituloCurso.setEnabled(false);
				cboArea.setEnabled(false);
				txtCargaHoraria.setEnabled(false);
				txtPreco.setEnabled(false);
				
				btnIncluirCurso.setEnabled(false);
			}
		});
		btnIncluirCurso.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		btnIncluirCurso.setBounds(10, 547, 141, 23);
		contentPane.add(btnIncluirCurso);
		
		JButton btnIncluirSala = new JButton("Incluir sala");
		btnIncluirSala.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// preencher os dados do objeto sala
				sala.setIdentificacao(txtIdentificacao.getText());
				sala.setDescricao(txtDescricao.getText());

				txtSala.setText(txtIdentificacao.getText());
				
				btnIncluirSala.setEnabled(false);
				txtIdentificacao.setEnabled(false);
				txtDescricao.setEnabled(false);
			}
		});
		btnIncluirSala.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		btnIncluirSala.setBounds(155, 547, 141, 23);
		contentPane.add(btnIncluirSala);
		
		JButton btnIncluirProfessor = new JButton("Incluir professor");
		btnIncluirProfessor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				professor.setNome(txtNomeProfessor.getText());
				professor.setEmail(txtEmailProfessor.getText());
				professor.setCpf(txtCPFProfessor.getText());
				
				txtProfessor.setText(txtNomeProfessor.getText());
				
				
				btnIncluirProfessor.setEnabled(false);
				txtNomeProfessor.setEnabled(false);
				txtEmailProfessor.setEnabled(false);
				txtCPFProfessor.setEnabled(false);
			}
		});
		btnIncluirProfessor.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		btnIncluirProfessor.setBounds(298, 547, 141, 23);
		contentPane.add(btnIncluirProfessor);
		
		JButton btnIncluirAluno = new JButton("Incluir aluno");
		btnIncluirAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				aluno = new Aluno();
				
				aluno.setNome(txtNomeAluno.getText());
				aluno.setEmail(txtEmailAluno.getText());
				aluno.setCpf(txtCpfAluno.getText());
				aluno.setIdade(Integer.parseInt(txtIdade.getText()));
				listaAluno.add(aluno);
				
				cboAlunos.addItem(txtNomeAluno.getText());
				
				btnIncluirAluno.setEnabled(false);
				txtNomeAluno.setEnabled(false);
				txtEmailAluno.setEnabled(false);
				txtCpfAluno.setEnabled(false);
				txtIdade.setEnabled(false);
			}
		});
		btnIncluirAluno.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		btnIncluirAluno.setBounds(440, 547, 141, 23);
		contentPane.add(btnIncluirAluno);
		
		JButton btnCriarAula = new JButton("Criar a Aula");
		btnCriarAula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				aulas.setId(Integer.parseInt(txtIdAula.getText()));
				aulas.setCurso(curso);
				aulas.setProfessor(professor);
				aulas.setInicio(new Date(Long.parseLong(txtInicio.getText())));
				aulas.setTermino(new Date(Long.parseLong(txtTermino.getText())));
				
				
				aulas.setAlunos(listaAluno.toArray(new Aluno[0]));
				aulas.setSala(sala);

				txtIdAula.setEnabled(false);
				txtCurso.setEnabled(false);
				txtProfessor.setEnabled(false);
				txtInicio.setEnabled(false);
				txtTermino.setEnabled(false);
				txtSala.setEnabled(false);
				
				System.out.print(cboAlunos.getItemAt(0));
			}
		});
		btnCriarAula.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		btnCriarAula.setBounds(583, 547, 141, 23);
		contentPane.add(btnCriarAula);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(155, 11, 419, 39);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" CADASTRO DE AULAS");
		lblNewLabel.setFont(new Font("Playfair Display", Font.PLAIN, 14));
		lblNewLabel.setBounds(134, 11, 153, 14);
		panel.add(lblNewLabel);
	}
}
