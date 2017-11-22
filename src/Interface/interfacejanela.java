package Interface;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.io.IOException;

import javax.swing.*;

public class interfacejanela {

	
	private JFrame Frame= new JFrame("Editor De Opcoes");
	private JPanel Caminhos=new JPanel();
	private JPanel Manual=new JPanel();
	private JPanel Automatico=new JPanel();
	
	
	public interfacejanela() {
		addingPanels();
		definingWindow();
		addingUrls();
		setttingManual();
		settingAutomatico();
		Frame.setVisible(true);
	
	}	
	
	private void setttingManual() {
		String[] test= {"hey               w", "no", "jog"};
		Manual.setLayout(new BorderLayout());
		Manual.setBackground(Color.GRAY);
		JList<String> list1=new JList<String>(test);
		JEditorPane EP=new JEditorPane();
		JScrollPane scrollPane = new JScrollPane(EP);
	
		
		list1.setVisibleRowCount(3);
		list1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		
		//EP.add(scrollPane, BorderLayout.CENTER);
		Manual.add(new JPanel().add(list1), BorderLayout.WEST);
		Manual.add(new JPanel().add(scrollPane),BorderLayout.CENTER);
		
		JButton button1= new JButton("nao consigo ler");
		JButton apply= new JButton("Apply");
		JPanel buttonHolder= new JPanel();
		buttonHolder.setLayout(new GridLayout(2,1));
		buttonHolder.add(button1);
		buttonHolder.add(apply);
		Manual.add(buttonHolder,BorderLayout.EAST);
		
	}


	private void settingAutomatico() {
		String[] test= {"hey               w", "no", "jog"};
		Automatico.setLayout(new BorderLayout());
		Automatico.setBackground(Color.GRAY);
		JList<String> list1=new JList<String>(test);
		JEditorPane EP=new JEditorPane();
		JScrollPane scrollPane = new JScrollPane(EP);
		EP.setEditable(false);
		
		list1.setVisibleRowCount(3);
		list1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		
		//EP.add(scrollPane, BorderLayout.CENTER);
		Automatico.add(new JPanel().add(list1), BorderLayout.WEST);
		Automatico.add(new JPanel().add(scrollPane),BorderLayout.CENTER);
		
		JButton button1= new JButton("nao consigo ler");
		JButton 	apply= new JButton("Apply");
		JPanel buttonHolder= new JPanel();
		buttonHolder.setLayout(new GridLayout(2,1));
		buttonHolder.add(button1);
		buttonHolder.add(apply);
		Automatico.add(buttonHolder,BorderLayout.EAST);
		
	}














	private void addingUrls() {
		JLabel link1=new JLabel("ham.log");
		/*link1.addMouseListener(new MouseAdapter() {
	        public void mouseClicked(MouseEvent e) {
	            try {
	                File.open("Leitor/ham.log");
	            } catch (IOException e1) {

	                e1.printStackTrace();
	            }
	        }
	    });*/
		JLabel link2=new JLabel("wqw");
		JLabel link3=new JLabel("gdfs");
		
		
		Caminhos.setLayout(new GridLayout(3,1));
		Caminhos.add(link1);
		Caminhos.add(link2);
		Caminhos.add(link3);
	}

	
	
	
	
	
	
	
	
	private void addingPanels() {
		Frame.add(Caminhos);
		Frame.add(Manual);
		Frame.add(Automatico);
	}

	
	
	
	
	
	
	
	private void definingWindow(){
		Frame.setSize(500,900);
		Frame.setResizable(false);
		Frame.setLayout(new GridLayout(3,1));
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
