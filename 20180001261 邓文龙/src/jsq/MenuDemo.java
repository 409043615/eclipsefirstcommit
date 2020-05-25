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
 this.setTitle("图形用户界面"); 
 this.setBounds(600, 150, 500, 150); 
 this.setVisible(true); 
 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 this.setLocationRelativeTo(null); 
 //创建菜单 
 JMenuBar jmb = new JMenuBar(); 
 //不能设定位置，会自动放在最上部 
 this.setJMenuBar(jmb); 
 //添加菜单 
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
 //添加菜单项至菜单上 
 menu1.add(item1); 
 menu1.add(item2); 
 menu1.add(item3); 
 menu2.add(item4); 
 menu2.add(item5); 
 menu2.add(item6); 
 menu3.add(item7); 
 //将菜单加入至菜单条 
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
  System.out.println("New正在被点击"); 
 } 
 else if("Open".equals(str)){ 
  System.out.println("Open正在被点击"); 
 } 
 else if("Save".equals(str)){ 
  System.out.println("Save正在被点击"); 
 } 
 else if("Copy".equals(str)){ 
  System.out.println("Copy正在被点击"); 
 } 
 else if("Cut".equals(str)){ 
  System.out.println("Cut正在被点击"); 
 } 
 else if("Paste".equals(str)){ 
  System.out.println("Paste正在被点击"); 
 } 
 else{ 
  System.out.println("About正在被点击"); 
 } 
 } 
}
