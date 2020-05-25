package jsq;

import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
  
import javax.swing.*; 
public class MenuDemo extends JFrame implements ActionListener{ 
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public static void main(String[] args){ 
 MenuDemo demo = new MenuDemo(); 
 demo.go(); 
 } 
 public void go(){ 
 this.setTitle("ͼ���û�����"); 
 this.setBounds(600, 150, 500, 150); 
 this.setVisible(true); 
 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 this.setLocationRelativeTo(null); 
 //�����˵� 
 JMenuBar jmb = new JMenuBar(); 
 //�����趨λ�ã����Զ��������ϲ� 
 this.setJMenuBar(jmb); 
 //��Ӳ˵� 
 JMenu menu1 = new JMenu("File"); 
 JMenu menu2 = new JMenu("Edit"); 
 JMenu menu3 = new JMenu("Help"); 
 
 JMenuItem item1 = new JMenuItem("New"); 
 JMenuItem item2 = new JMenuItem("Open"); 
 JMenuItem item3 = new JMenuItem("Save"); 
 JMenuItem item4 = new JMenuItem("Copy"); 
 JMenuItem item5 = new JMenuItem("Cut"); 
 JMenuItem item6 = new JMenuItem("Paste"); 
 JMenuItem item7 = new JMenuItem("About"); 
 //��Ӳ˵������˵��� 
 menu1.add(item1); 
 menu1.add(item2); 
 menu1.add(item3); 
 menu2.add(item4); 
 menu2.add(item5); 
 menu2.add(item6); 
 menu3.add(item7); 
 //���˵��������˵��� 
 jmb.add(menu1); 
 jmb.add(menu2); 
 jmb.add(menu3); 
 item1.addActionListener(this); 
 item2.addActionListener(this); 
 item3.addActionListener(this); 
 item4.addActionListener(this); 
 item5.addActionListener(this); 
 item6.addActionListener(this); 
 item7.addActionListener(this); 
 } 
 public void actionPerformed(ActionEvent e){ 
 String str = e.getActionCommand(); 
 if("New".equals(str)) { 
  System.out.println("New���ڱ����"); 
 } 
 else if("Open".equals(str)){ 
  System.out.println("Open���ڱ����"); 
 } 
 else if("Save".equals(str)){ 
  System.out.println("Save���ڱ����"); 
 } 
 else if("Copy".equals(str)){ 
  System.out.println("Copy���ڱ����"); 
 } 
 else if("Cut".equals(str)){ 
  System.out.println("Cut���ڱ����"); 
 } 
 else if("Paste".equals(str)){ 
  System.out.println("Paste���ڱ����"); 
 } 
 else{ 
  System.out.println("About���ڱ����"); 
 } 
 } 
}
