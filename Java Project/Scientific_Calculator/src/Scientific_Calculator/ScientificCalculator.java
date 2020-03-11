package Scientific_Calculator;

import java.awt.ComponentOrientation;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JLabel;

public class ScientificCalculator {

	private JFrame frmStandardCalculator;
	private JTextField txtDisplay;
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;
	int result1;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScientificCalculator window = new ScientificCalculator();
					window.frmStandardCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public ScientificCalculator() {
		initialize();
	}

	
	private void initialize() {
		frmStandardCalculator = new JFrame();
		frmStandardCalculator.setTitle("Standard Calculator");
		frmStandardCalculator.setBounds(100, 100,276, 367);
		frmStandardCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmStandardCalculator.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem rdbtnmntmStandard = new JMenuItem("Standard");
		rdbtnmntmStandard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmStandardCalculator.setTitle("Standard Calculator");
				frmStandardCalculator.setBounds(100, 100,275, 367);
				txtDisplay.setBounds(10,11,243,37);
			}
		});
		mnFile.add(rdbtnmntmStandard);
		
		JMenuItem mntmScientific = new JMenuItem("Scientific");
		mntmScientific.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmStandardCalculator.setTitle("Scientific Calculator");
				frmStandardCalculator.setBounds(100, 100,529, 367);
				txtDisplay.setBounds(10,11,494,37);
			}
		});
		mnFile.add(mntmScientific);
		
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnFile.add(mntmExit);
		frmStandardCalculator.getContentPane().setLayout(null);
		
		
		txtDisplay = new JTextField();
		txtDisplay.setBounds(10, 11, 243, 37);
		frmStandardCalculator.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		txtDisplay.setHorizontalAlignment(JTextField.RIGHT);
		
		JButton button = new JButton("\uF0E7");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace=null;
				if(txtDisplay.getText().length()>0){
					StringBuilder stringBuilder=new StringBuilder(txtDisplay.getText());
					stringBuilder.deleteCharAt(txtDisplay.getText().length()-1);
					backspace=stringBuilder.toString();
					txtDisplay.setText(backspace);
				}
				
			}
		});
		button.setFont(new Font("Wingding",Font.PLAIN,11));
		button.setBounds(8, 51, 46, 47);
		frmStandardCalculator.getContentPane().add(button);
		
		JButton btnClear = new JButton("CE");
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText("");
				
			}
		});
		btnClear.setBounds(58, 51, 46, 47);
		frmStandardCalculator.getContentPane().add(btnClear);
		
		JButton btnPlusMinus = new JButton("\u00B1");
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops=ops*(-1);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnPlusMinus.setFont(new Font("Tahoma",Font.BOLD,14));
		btnPlusMinus.setBounds(155, 51, 46, 47);
		frmStandardCalculator.getContentPane().add(btnPlusMinus);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnC) {
					        txtDisplay.setText("");
					        return;

			}
			}
		});
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		btnC.setBounds(107, 51, 46, 47);
		frmStandardCalculator.getContentPane().add(btnC);
		
		JButton btnSqrt = new JButton("\u221A");
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops=Math.sqrt(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnSqrt.setFont(new Font("Tahoma",Font.BOLD,14));
		btnSqrt.setBounds(205, 51, 46, 47);
		frmStandardCalculator.getContentPane().add(btnSqrt);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inum=txtDisplay.getText()+btn7.getText();
				txtDisplay.setText(inum);
			}
		});
		btn7.setFont(new Font("Tahoma",Font.BOLD,14));
		btn7.setBounds(8, 100, 46, 47);
		frmStandardCalculator.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inum=txtDisplay.getText()+btn8.getText();
				txtDisplay.setText(inum);
			}
		});
		btn8.setFont(new Font("Tahoma",Font.BOLD,14));
		btn8.setBounds(58, 100, 46, 47);
		frmStandardCalculator.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inum=txtDisplay.getText()+btn9.getText();
				txtDisplay.setText(inum);
			}
		});
		btn9.setFont(new Font("Tahoma",Font.BOLD,14));
		btn9.setBounds(107, 100, 46, 47);
		frmStandardCalculator.getContentPane().add(btn9);
		
		JButton btnpow10 =new JButton("10x");
		btnpow10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops=Math.pow(10,ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnpow10.setFont(new Font("Times New Roman", Font.PLAIN, 8));
		btnpow10.setBounds(205, 100, 46, 47);
		frmStandardCalculator.getContentPane().add(btnpow10);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="/";
			}
		});
		btnDiv.setFont(new Font("Tahoma",Font.BOLD,14));
		btnDiv.setBounds(155, 100, 46, 47);
		frmStandardCalculator.getContentPane().add(btnDiv);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inum=txtDisplay.getText()+btn4.getText();
				txtDisplay.setText(inum);
			}
		});
		btn4.setFont(new Font("Tahoma",Font.BOLD,14));
		btn4.setBounds(8, 149, 46, 47);
		frmStandardCalculator.getContentPane().add(btn4);
		
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="*";
			}
		});
		btnMult.setFont(new Font("Tahoma",Font.BOLD,14));
		btnMult.setBounds(155, 149, 46, 47);
		frmStandardCalculator.getContentPane().add(btnMult);
		
		JButton btn1x = new JButton("1/x");
		btn1x.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops=(1/ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btn1x.setFont(new Font("Calibri", Font.PLAIN, 9));
		btn1x.setBounds(205, 149, 46, 47);
		frmStandardCalculator.getContentPane().add(btn1x);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inum=txtDisplay.getText()+btn5.getText();
				txtDisplay.setText(inum);
			}
		});
		btn5.setFont(new Font("Tahoma",Font.BOLD,14));
		btn5.setBounds(58, 149, 46, 47);
		frmStandardCalculator.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inum=txtDisplay.getText()+btn6.getText();
				txtDisplay.setText(inum);	
			}
		});
		btn6.setFont(new Font("Tahoma",Font.BOLD,14));
		btn6.setBounds(107, 149, 46, 47);
		frmStandardCalculator.getContentPane().add(btn6);
		
		JButton btnNewButton_14 = new JButton("New button");
		btnNewButton_14.setBounds(-47, 229, 46, 50);
		frmStandardCalculator.getContentPane().add(btnNewButton_14);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inum=txtDisplay.getText()+btn1.getText();
				txtDisplay.setText(inum);
			}
		});
		btn1.setFont(new Font("Tahoma",Font.BOLD,14));
		btn1.setBounds(8, 197, 46, 47);
		frmStandardCalculator.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inum=txtDisplay.getText()+btn2.getText();
				txtDisplay.setText(inum);
				
			}
		});
		btn2.setFont(new Font("Tahoma",Font.BOLD,14));
		btn2.setBounds(58, 197, 46, 47);
		frmStandardCalculator.getContentPane().add(btn2);
		
		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondnum=Double.parseDouble(txtDisplay.getText());
				if(operations== "+")
				{
					result= firstnum + secondnum;
					answer=String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if(operations== "-")
				{
					result= firstnum - secondnum;
					answer=String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if(operations== "*")
				{
					result= firstnum * secondnum;
					answer=String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if(operations== "/")
				{
					result= firstnum / secondnum;
					answer=String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				
			}
		});
		btnEquals.setFont(new Font("Tahoma",Font.BOLD,14));
		btnEquals.setBounds(205, 197, 46, 99);
		frmStandardCalculator.getContentPane().add(btnEquals);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inum=txtDisplay.getText()+btn3.getText();
				txtDisplay.setText(inum);
			}
		});
		btn3.setFont(new Font("Tahoma",Font.BOLD,14));
		btn3.setBounds(107, 197, 46, 47);
		frmStandardCalculator.getContentPane().add(btn3);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSub.setBounds(155, 197, 46, 47);
		frmStandardCalculator.getContentPane().add(btnSub);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inum=txtDisplay.getText()+btn0.getText();
				txtDisplay.setText(inum);
			}
		});
		btn0.setFont(new Font("Tahoma",Font.BOLD,14));
		btn0.setBounds(8, 250, 96, 47);
		frmStandardCalculator.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String inum=txtDisplay.getText()+btnDot.getText();
				txtDisplay.setText(inum);
			}
		});
		
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDot.setBounds(107, 250, 46, 47);
		frmStandardCalculator.getContentPane().add(btnDot);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="+";
			}
		});
		btnPlus.setFont(new Font("Tahoma",Font.BOLD,14));
		btnPlus.setBounds(155, 250, 46, 47);
		frmStandardCalculator.getContentPane().add(btnPlus);
		
		JButton btnLog = new JButton("Log");
		btnLog.setFont(new Font("SansSerif", Font.PLAIN, 11));
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops=Math.log10(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnLog.setBounds(265, 50, 53, 47);
		frmStandardCalculator.getContentPane().add(btnLog);
		
		JButton btnSin = new JButton("Sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(txtDisplay.getText()));
				double x=Math.toRadians(ops);
				x=Math.sin(x);
				txtDisplay.setText(String.valueOf(x));
				
			}
		});
		btnSin.setFont(new Font("SansSerif", Font.PLAIN, 12));
		btnSin.setBounds(322, 49, 56, 47);
		frmStandardCalculator.getContentPane().add(btnSin);
		
		JButton btnSinh = new JButton("Sinh");
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops=Math.sinh(ops);
				txtDisplay.setText(String.valueOf(ops));
				
			}
		});
		btnSinh.setFont(new Font("SansSerif", Font.PLAIN, 12));
		btnSinh.setBounds(380, 50, 65, 47);
		frmStandardCalculator.getContentPane().add(btnSinh);
		
		JButton btnMod = new JButton("Mod");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="Mod";
			}
		});
		btnMod.setBounds(447, 50, 60, 47);
		frmStandardCalculator.getContentPane().add(btnMod);
		
		JButton btnpi = new JButton("\u03C0");
		btnpi.setFont(new Font("Centaur", Font.PLAIN, 14));
		btnpi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops;
				ops=(3.1415926535897932384626433832795);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnpi.setBounds(265, 99, 53, 47);
		frmStandardCalculator.getContentPane().add(btnpi);
	
		
		JButton btnlnx = new JButton("ln");
		btnlnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops=Math.log(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
			
		});
		btnlnx.setBounds(447, 99, 60, 47);
		frmStandardCalculator.getContentPane().add(btnlnx);
		
		JButton btnxy = new JButton("x^x");
		btnxy.setFont(new Font("SansSerif", Font.PLAIN, 12));
		btnxy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops=Math.pow(ops,ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnxy.setBounds(265, 148, 53, 47);
		frmStandardCalculator.getContentPane().add(btnxy);
		
		JButton btnTan = new JButton("Tan");
		btnTan.setFont(new Font("SansSerif", Font.PLAIN, 12));
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(txtDisplay.getText()));
				double x=Math.toRadians(ops);
				x=Math.tan(x);
				txtDisplay.setText(String.valueOf(x));
			}
		});
		btnTan.setBounds(322, 148, 56, 47);
		frmStandardCalculator.getContentPane().add(btnTan);
		
		JButton btnExp = new JButton("Exp");
		btnExp.setFont(new Font("SansSerif", Font.PLAIN, 12));
		btnExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops=Math.exp(ops);
				txtDisplay.setText(String.valueOf(ops));
				
			}
		});
		btnExp.setBounds(447, 149, 60, 47);
		frmStandardCalculator.getContentPane().add(btnExp);
		
		JButton btnx2 = new JButton("x^2");
		btnx2.setFont(new Font("SansSerif", Font.PLAIN, 12));
		btnx2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops=(ops*ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnx2.setBounds(265, 197, 53, 47);
		frmStandardCalculator.getContentPane().add(btnx2);
		
		JButton btnCbr = new JButton("Cbr");
		btnCbr.setFont(new Font("SansSerif", Font.PLAIN, 12));
		btnCbr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops=Math.cbrt(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnCbr.setBounds(322, 198, 56, 47);
		frmStandardCalculator.getContentPane().add(btnCbr);
		
		JButton btnRound = new JButton("Rund");
		btnRound.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops=Math.round(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnRound.setFont(new Font("SansSerif", Font.PLAIN, 12));
		btnRound.setBounds(380, 197, 65, 47);
		frmStandardCalculator.getContentPane().add(btnRound);
		
		JButton btnPi2 = new JButton("2*\u03C0");
		btnPi2.setFont(new Font("SansSerif", Font.PLAIN, 12));
		btnPi2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops;
				ops=(3.1415926535897932384626433832795)*2;
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnPi2.setBounds(447, 197, 60, 47);
		frmStandardCalculator.getContentPane().add(btnPi2);
		
		JButton btnx3 = new JButton("x^3");
		btnx3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops=(ops*ops*ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnx3.setFont(new Font("SansSerif", Font.PLAIN, 12));
		btnx3.setBounds(265, 249, 53, 47);
		frmStandardCalculator.getContentPane().add(btnx3);
		
		JButton btnBin = new JButton("Bin");
		btnBin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(txtDisplay.getText());
				txtDisplay.setText(Integer.toString(a,2));
			}
		});
		btnBin.setFont(new Font("SansSerif", Font.PLAIN, 12));
		btnBin.setBounds(322, 249, 56, 47);
		frmStandardCalculator.getContentPane().add(btnBin);
		
		JButton btnHex = new JButton("Hex");
		btnHex.setFont(new Font("SansSerif", Font.PLAIN, 12));
		btnHex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(txtDisplay.getText());
				txtDisplay.setText(Integer.toString(a,16));
			}
		});
		btnHex.setBounds(380, 249, 65, 47);
		frmStandardCalculator.getContentPane().add(btnHex);
		
		JButton btnOctal = new JButton("Octal");
		btnOctal.setFont(new Font("SansSerif", Font.PLAIN, 11));
		btnOctal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(txtDisplay.getText());
				txtDisplay.setText(Integer.toString(a,8));
			}
		});
		btnOctal.setBounds(447, 249, 60, 47);
		frmStandardCalculator.getContentPane().add(btnOctal);
		
		JButton btnCos = new JButton("Cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			double ops=Double.parseDouble(String.valueOf(txtDisplay.getText()));
			double x=Math.toRadians(ops);
			x=Math.cos(x);
			txtDisplay.setText(String.valueOf(x));
			}
		});
		btnCos.setFont(new Font("SansSerif", Font.PLAIN, 11));
		btnCos.setBounds(322, 99, 56, 47);
		frmStandardCalculator.getContentPane().add(btnCos);
		
		JButton btnCosh = new JButton("Cosh");
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops=Math.cosh(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnCosh.setFont(new Font("SansSerif", Font.PLAIN, 12));
		btnCosh.setBounds(380, 99, 65, 47);
		frmStandardCalculator.getContentPane().add(btnCosh);
		
		JButton btnTanh = new JButton("Tanh");
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops=Math.tanh(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnTanh.setFont(new Font("SansSerif", Font.PLAIN, 12));
		btnTanh.setBounds(380, 148, 65, 47);
		frmStandardCalculator.getContentPane().add(btnTanh);
	}
}
