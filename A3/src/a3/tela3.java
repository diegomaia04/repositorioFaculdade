package a3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class tela3 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JRadioButton rdbtnDelievry;
	private JRadioButton rdbtnBalcoDaLoja;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JTextField txtCidade;
	private JTextField txtBairro;
	private JTextField txtNumero;
	private JTextField txtComplemento;
	private JButton btnCep;
	private JTextField txtCep;
	private JButton btnNewButton;
	private JTextField txtEndereco;
	private JLabel cboUf;
	private JTextField txtEstado;
	private JComboBox<?> cbcPag;
	private JButton btnFinalizar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela3 frame = new tela3();
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
	public tela3() {
		setResizable(false);
		setTitle("Sorveteria Orland - Retirada");
		setIconImage(Toolkit.getDefaultToolkit().getImage(tela3.class.getResource("/a3/555.jpg")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 514, 354);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 191, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(71, 328, 102, 35);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel = new JLabel("Forma de retirada:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(10, 10, 148, 35);
		contentPane.add(lblNewLabel);

		rdbtnBalcoDaLoja = new JRadioButton();
		rdbtnBalcoDaLoja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnBalcoDaLoja.isSelected()) {
					rdbtnDelievry.setSelected(false);
					txtCep.setText(null);
					txtCidade.setText(null);
					txtComplemento.setText(null);
					txtEstado.setText(null);
					txtNumero.setText(null);
					txtEndereco.setText(null);
					txtBairro.setText(null);
					rdbtnDelievry.setSelected(false);
					txtCep.setEnabled(false);
					txtCidade.setEnabled(false);
					txtComplemento.setEnabled(false);
					txtEstado.setEnabled(false);
					txtEndereco.setEnabled(false);
					txtNumero.setEnabled(false);
					txtBairro.setEnabled(false);
					btnCep.setEnabled(false);
					cbcPag.setEnabled(true);
					btnFinalizar.setEnabled(true);
				
				} 
			
				
			}
		});
		rdbtnBalcoDaLoja.setBackground(new Color(0, 204, 255));
		rdbtnBalcoDaLoja.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnBalcoDaLoja.setText("Balc\u00E3o da Loja");
		rdbtnBalcoDaLoja.setBounds(164, 18, 120, 21);
		contentPane.add(rdbtnBalcoDaLoja);

		rdbtnDelievry = new JRadioButton();
		rdbtnDelievry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if (rdbtnDelievry.isSelected()) {
					rdbtnBalcoDaLoja.setSelected(false);
					txtCep.setEnabled(true);
					txtCidade.setEnabled(true);
					txtComplemento.setEnabled(true);
					txtEstado.setEnabled(true);
					txtNumero.setEnabled(true);
					txtEndereco.setEnabled(true);
					txtBairro.setEnabled(true);
					btnCep.setEnabled(true);
					btnFinalizar.setEnabled(true);
					cbcPag.setEnabled(true);
				}
			
			}
		});
		rdbtnDelievry.setBackground(new Color(102, 204, 255));
		rdbtnDelievry.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnDelievry.setText("Delievry");
		rdbtnDelievry.setBounds(306, 18, 120, 21);
		contentPane.add(rdbtnDelievry);

		cboUf = new JLabel("Estado");
		cboUf.setFont(new Font("Tahoma", Font.BOLD, 14));
		cboUf.setBounds(317, 142, 81, 21);
		contentPane.add(cboUf);

		lblNewLabel_3 = new JLabel("CEP:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(10, 80, 50, 21);
		contentPane.add(lblNewLabel_3);

		lblNewLabel_4 = new JLabel("Cidade:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(10, 142, 81, 21);
		contentPane.add(lblNewLabel_4);

		lblNewLabel_5 = new JLabel("Bairro");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(164, 142, 81, 21);
		contentPane.add(lblNewLabel_5);

		lblNewLabel_6 = new JLabel("Numero:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(279, 111, 81, 21);
		contentPane.add(lblNewLabel_6);

		lblNewLabel_7 = new JLabel("Complemento:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_7.setBounds(15, 171, 120, 21);
		contentPane.add(lblNewLabel_7);

		txtCep = new JTextField();
		txtCep.setEnabled(false);
		txtCep.setBounds(62, 83, 96, 19);
		contentPane.add(txtCep);
		txtCep.setColumns(10);

		btnCep = new JButton("Buscar CEP");
		btnCep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buscarCEP();
			}
		});
		btnCep.setEnabled(false);
		btnCep.setBounds(167, 82, 137, 21);
		contentPane.add(btnCep);

		txtCidade = new JTextField();
		txtCidade.setEnabled(false);
		txtCidade.setColumns(10);
		txtCidade.setBounds(64, 145, 96, 19);
		contentPane.add(txtCidade);

		txtBairro = new JTextField();
		txtBairro.setEnabled(false);
		txtBairro.setColumns(10);
		txtBairro.setBounds(208, 143, 96, 19);
		contentPane.add(txtBairro);

		txtNumero = new JTextField();
		txtNumero.setEnabled(false);
		txtNumero.setColumns(10);
		txtNumero.setBounds(344, 114, 68, 19);
		contentPane.add(txtNumero);

		txtComplemento = new JTextField();
		txtComplemento.setEnabled(false);
		txtComplemento.setColumns(10);
		txtComplemento.setBounds(122, 174, 182, 19);
		contentPane.add(txtComplemento);

		JLabel lblFormaDePagamento = new JLabel("Forma de pagamento");
		lblFormaDePagamento.setForeground(Color.BLACK);
		lblFormaDePagamento.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFormaDePagamento.setBounds(10, 212, 196, 35);
		contentPane.add(lblFormaDePagamento);

		cbcPag = new JComboBox();
		cbcPag.setEnabled(false);
		cbcPag.setModel(new DefaultComboBoxModel(new String[] {"Selecionar Pagamento", "Dinheiro", "Pix", "Cart\u00E3o de Debito", "Cart\u00E3o de Credito", "VR"}));
		cbcPag.setBounds(182, 221, 156, 21);
		contentPane.add(cbcPag);

		btnFinalizar = new JButton("Confirmar");
		btnFinalizar.setEnabled(false);
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnDelievry.isSelected() ) {
					finalizar();
				} else if (cbcPag.getSelectedItem().equals("Selecionar Pagamento")) {
					JOptionPane.showMessageDialog(null, "Preencha a forma de pagamento");
				} 
				  if (cbcPag.getSelectedItem().equals("Selecionar Pagamento")) {
					JOptionPane.showMessageDialog(null, "Preencha a forma de pagamento");
				} else if (rdbtnBalcoDaLoja.isSelected() ) {
					JOptionPane.showMessageDialog(null,
							"Obrigado por escolher nossa Sorveteria!!! Estaremos a sua espera!");
				}
				
			}
		});
		btnFinalizar.setBackground(new Color(30, 144, 255));
		btnFinalizar.setBounds(357, 272, 133, 35);
		contentPane.add(btnFinalizar);

		btnNewButton = new JButton("Limpar ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Limpar();
			}
		});
		btnNewButton.setBackground(new Color(30, 144, 255));
		btnNewButton.setBounds(10, 272, 133, 35);
		contentPane.add(btnNewButton);

		JLabel lblNewLabel_7_1 = new JLabel("Endere\u00E7o:");
		lblNewLabel_7_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_7_1.setBounds(10, 111, 120, 21);
		contentPane.add(lblNewLabel_7_1);

		txtEndereco = new JTextField();
		txtEndereco.setEnabled(false);
		txtEndereco.setColumns(10);
		txtEndereco.setBounds(87, 113, 182, 19);
		contentPane.add(txtEndereco);

		txtEstado = new JTextField();
		txtEstado.setEnabled(false);
		txtEstado.setColumns(10);
		txtEstado.setBounds(370, 143, 90, 19);
		contentPane.add(txtEstado);
	}// fim do construtor

	private void buscarCEP() {
		String logradouro = "";
		String tipoLogradouro = "";
		String cep = txtCep.getText();
		try {
			URL url = new URL("http://cep.republicavirtual.com.br/web_cep.php?cep=" + cep + "&formato=xml");
			SAXReader xml = new SAXReader();
			Document documento = xml.read(url);
			Element root = documento.getRootElement();
			for (Iterator<Element> it = root.elementIterator(); it.hasNext();) {
				Element element = it.next();
				if (element.getQualifiedName().equals("cidade")) {
					txtCidade.setText(element.getText());
				}
				if (element.getQualifiedName().equals("bairro")) {
					txtBairro.setText(element.getText());
				}
				if (element.getQualifiedName().equals("uf")) {
					txtEstado.setText(element.getText());
				}
				if (element.getQualifiedName().equals("tipo_Lograudouro")) {
					tipoLogradouro = element.getText();
				}
				if (element.getQualifiedName().equals("logradouro")) {
					logradouro = element.getText();
				}
				txtEndereco.setText(tipoLogradouro + " " + logradouro);
			}

		} catch (Exception e) {

		}

	}

	private void Limpar() {
		rdbtnBalcoDaLoja.setSelected(false);
		rdbtnDelievry.setSelected(false);
		txtCep.setText(null);
		txtCidade.setText(null);
		txtComplemento.setText(null);
		txtEstado.setText(null);
		txtNumero.setText(null);
		txtEndereco.setText(null);
		txtBairro.setText(null);
	}

	private void finalizar() {
		if (txtEndereco.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o Endereço");
			txtEndereco.requestFocus();
		} else if (txtBairro.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o Bairro");
			txtBairro.requestFocus();
		} else if (txtNumero.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o Numero");
			txtNumero.requestFocus();
		} else if (txtNumero.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o Cidade");
			txtNumero.requestFocus();
		} else if (txtNumero.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o Estado");
			txtNumero.requestFocus();
		} else {
			JOptionPane.showMessageDialog(null,
					"Obrigado por escolher nossa Sorveteria!!! Seu pedido chegará em Breve");
		}

	}
}// fim do codigo
