
 //import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
 class Calculator implements ActionListener {
  JFrame f;
  JButton enter,reset;
  JTextField name,weight,result,age,height;
  JMenu menu, submenu,view;
  JMenuBar bar;
  JMenuItem i1, i2, i3, i4, i5,i6,i7,i8;
     Calculator(){
    	 f = new JFrame("Calorie Calculator");
         f.setSize(300,400);
         f.setBounds(500,200,280,375);
    	 name = new JTextField("Name");
    	 name.setBounds(50,30,150,30);
    	 weight = new JTextField("Weight");
    	 weight.setBounds(50,65,150,30);
    	 height = new JTextField("height");
    	 height.setBounds(50,100,150,30);
    	 age = new JTextField("Age"); 
    	 age.setBounds(50,135,150,30);
    	 result = new JTextField("Result");
    	 result.setBounds(87,200,100,40);         
    	 enter = new JButton("Calculate");
    	 enter.setBounds(25,250,100,50);
    	 reset = new JButton("Reset");
    	 reset.setBounds(150,250,100,50);
    	 bar = new JMenuBar();
         menu=new JMenu("Menu"); 
         view= new JMenu("View");
         submenu=new JMenu("More");  
         i1=new JMenuItem("Save");  
         i2=new JMenuItem("Save As");  
         i3=new JMenuItem("Edit");  
         i4=new JMenuItem("Clear cache");  
         i5=new JMenuItem("Refresh");
         i6= new JMenuItem("Names");
         i7= new JMenuItem("Calories");
         i8= new JMenuItem("maximum weight");
         view.add(i6);
         view.add(i7);
         view.add(i8);
         menu.add(i1); 
         menu.add(i2);
         menu.add(i3);  
         submenu.add(i4); 
         submenu.add(i5);  
         menu.add(submenu);  
         bar.add(menu);
         bar.add(view);
         f.setJMenuBar(bar); 
    	 f.add(name);
    	 f.add(weight);
    	 f.add(height);
    	 f.add(enter);
    	 f.add(reset);
    	 f.add(age);
    	 f.add(result);
    	 f.setLayout(null);
    	 f.setVisible(true);
    	 f.setResizable(false);
    	 enter.addActionListener(this);
    	 reset.addActionListener(this);
    	 i5.addActionListener(this);
    	 enter.setActionCommand("calculate");
    	 reset.setActionCommand("reset");
    	 i5.setActionCommand("refresh");
       
          
    	 
     }
     public void actionPerformed(ActionEvent e)
     {
    	 String m =e.getActionCommand();
    	 if(m.equals("calculate")) {
               double sum =0;
               double W =0;
               double H =0;
               double A =0;
               double BMR =0;
               double a=  Double.parseDouble(weight.getText());
               double b=  Double.parseDouble(age.getText());
               double c=  Double.parseDouble(height.getText());
                W = 10*a;
                H = 6.25*c;
                A = 5*b;
                BMR = W+H-A+5;
        	    sum = BMR*1.375;
        	    result.setText(String.valueOf(sum));
    	     }
    	  if(m.equals("reset")) {
    		 name.setText("Name");
    		 weight.setText("Weight");
    		 height.setText("Height");
    		 age.setText("Age");
    		 result.setText("Result");
    		 
    	     }
    	  if(m.equals("refresh")) {
    		 name.setText("Name");
    		 weight.setText("Weight");
    		 height.setText("Height");
    		 age.setText("Age");
    		 result.setText("Result");
    		 
    	     }
    	 
        } 
       
        
   
  public static void main(String [] args)
  {
	  Calculator obj = new Calculator();
	  
	  
  }	
}
  
