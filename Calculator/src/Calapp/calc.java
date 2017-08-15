package Calapp;

import java.awt.*;
import java.awt.event.*;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;

public class calc{
    String op=null, S=null;
	double num1=0.0,num2=0.0,result=0.0;
    JFrame Jframe = new JFrame();
    JPanel pan= new JPanel();
    JTextArea textarea=new  JTextArea();
    JButton button1=new JButton("1");
    JButton button2=new JButton("2");
    JButton button3=new JButton("3");
    JButton button4=new JButton("4");
    JButton button5=new JButton("5");
    JButton button6=new JButton("6");
    JButton button7=new JButton("7");
    JButton button8=new JButton("8");
    JButton button9=new JButton("9");
    JButton button0=new JButton("0");
    JButton buttonminus=new JButton("-");
    JButton buttonplus=new JButton("+");
    JButton buttonmultiply=new JButton("*");
    JButton buttonequals=new JButton("=");
    JButton buttonDot=new JButton(".");
    JButton buttondivide=new JButton("/");
    JButton buttonsqrt=new JButton("del");
    JButton buttonC=new JButton("C");
    JButton buttonsquare=new JButton("AC");
    JTextArea textfeild2=new JTextArea();
   calc(){
    	Jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	Jframe.setVisible(true);
    	//Jframe.setResizable(false);
    	Jframe.setTitle("Calculator");
    	Jframe.setMaximumSize(new Dimension(280,500));
    	Jframe.setMinimumSize(new Dimension(280,500));
    	Jframe.add(pan);
    	pan.setBackground(Color.GRAY);
        pan.setBounds(0, 0, 280, 500);    
    	textarea.setBackground(Color.LIGHT_GRAY);
    	textarea.setFont(new Font("arial",Font.CENTER_BASELINE,20));
    	textarea.setEditable(false);
    	textarea.setForeground(Color.BLACK);
    	textarea.setPreferredSize(new Dimension(255,60));
    	textarea.setLineWrap(true);
    	textfeild2.setPreferredSize(new Dimension(250,60));
    	textfeild2.setLineWrap(true);
    	textfeild2.setBackground(Color.DARK_GRAY);
    	textfeild2.setForeground(Color.RED);
    	textfeild2.setFont(new Font("arial",Font.CENTER_BASELINE,15));
    	pan.add(textarea);
    	pan.add(textfeild2);
    	textfeild2.setEditable(false);
    	pan.add(buttonsquare);pan.add(buttonsqrt);pan.add(buttonC);pan.add(buttonplus);
    	pan.add(button7);pan.add(button8);pan.add(button9);pan.add(buttonminus);
    	pan.add(button4);pan.add(button5);pan.add(button6);pan.add(buttonmultiply);
    	pan.add(button3);pan.add(button2);pan.add(button1);pan.add(button0);pan.add(buttonDot);
    	pan.add(buttondivide);pan.add(buttonequals);
    	buttonsqrt.setBackground(Color.LIGHT_GRAY);buttonsquare.setBackground(Color.LIGHT_GRAY);button1.setBackground(Color.LIGHT_GRAY);button2.setBackground(Color.LIGHT_GRAY);button3.setBackground(Color.LIGHT_GRAY);button4.setBackground(Color.LIGHT_GRAY);button5.setBackground(Color.LIGHT_GRAY);button6.setBackground(Color.LIGHT_GRAY);button7.setBackground(Color.LIGHT_GRAY);button8.setBackground(Color.LIGHT_GRAY);button9.setBackground(Color.LIGHT_GRAY);buttonC.setBackground(Color.LIGHT_GRAY);buttonplus.setBackground(Color.LIGHT_GRAY);buttonminus.setBackground(Color.LIGHT_GRAY);buttonequals.setBackground(Color.LIGHT_GRAY);buttonmultiply.setBackground(Color.LIGHT_GRAY);buttondivide.setBackground(Color.LIGHT_GRAY);buttonDot.setBackground(Color.LIGHT_GRAY);button0.setBackground(Color.LIGHT_GRAY);
    	buttonsquare.setFont(new Font("arial",Font.BOLD,16));buttonsqrt.setFont(new Font("arial",Font.BOLD,16));button0.setFont(new Font("arial",Font.BOLD,20));button1.setFont(new Font("arial",Font.BOLD,20));button2.setFont(new Font("arial",Font.BOLD,20));button3.setFont(new Font("arial",Font.BOLD,20));button4.setFont(new Font("arial",Font.BOLD,20));button5.setFont(new Font("arial",Font.BOLD,20));button6.setFont(new Font("arial",Font.BOLD,20));button7.setFont(new Font("arial",Font.BOLD,20));button8.setFont(new Font("arial",Font.BOLD,20));button9.setFont(new Font("arial",Font.BOLD,20));buttonminus.setFont(new Font("arial",Font.BOLD,20));buttonequals.setFont(new Font("arial",Font.BOLD,20));buttonmultiply.setFont(new Font("arial",Font.BOLD,20));buttondivide.setFont(new Font("arial",Font.BOLD,20));buttonDot.setFont(new Font("arial",Font.BOLD,20));buttonC.setFont(new Font("arial",Font.BOLD,16));buttonplus.setFont(new Font("arial",Font.BOLD,20)); 
    	buttonC.setPreferredSize(new Dimension(60,60));buttonsqrt.setPreferredSize(new Dimension(60,60));buttonsquare.setPreferredSize(new Dimension(60,60));buttondivide.setPreferredSize(new Dimension(60,60));buttonmultiply.setPreferredSize(new Dimension(60,60));buttonDot.setPreferredSize(new Dimension(60,60));button0.setPreferredSize(new Dimension(60,60));button1.setPreferredSize(new Dimension(60,60));button2.setPreferredSize(new Dimension(60,60));button3.setPreferredSize(new Dimension(60,60));button4.setPreferredSize(new Dimension(60,60));button5.setPreferredSize(new Dimension(60,60));button6.setPreferredSize(new Dimension(60,60));button7.setPreferredSize(new Dimension(60,60));button8.setPreferredSize(new Dimension(60,60));button9.setPreferredSize(new Dimension(60,60));buttonplus.setPreferredSize(new Dimension(60,60));buttonminus.setPreferredSize(new Dimension(60,60));buttonequals.setPreferredSize(new Dimension(125,60));
    	event e = new event();
        buttonplus.addActionListener(e);
        buttonminus.addActionListener(e);
        buttonmultiply.addActionListener(e);
        buttondivide.addActionListener(e);
        buttonequals.addActionListener(e);
        buttonDot.addActionListener(e);
        button0.addActionListener(e);
        button1.addActionListener(e);
        button2.addActionListener(e);
        button3.addActionListener(e);
        button4.addActionListener(e);
        button5.addActionListener(e);
        button6.addActionListener(e);
        button7.addActionListener(e);
        button8.addActionListener(e);
        button9.addActionListener(e);
        buttonC.addActionListener(e);
        buttonsqrt.addActionListener(e);
        buttonsquare.addActionListener(e);
        
    }
    public class event implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
			try {
				String soundName = "sound2.wav";    
				AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
				Clip clip = AudioSystem.getClip();
				clip.open(audioInputStream);
				clip.start();
		        } catch (Exception ex) {
		          System.err.println(ex.getMessage());
		        }
			S=e.getActionCommand();
			if(S=="+"||S=="-"||S=="*"||S=="/"||S=="%")
			{
				 num1=Double.parseDouble(textarea.getText());
				 textarea.setText("");
				 if(S!="="&&S!="C"&&S!="AC"&&S!="del")
				 op=S;
				 textfeild2.setText(Double.toString(num1)+" "+op+" ");
			}else if(S=="=") {
				 num2=Double.parseDouble(textarea.getText());
				 textfeild2.append(Double.toString(num2));
				 textarea.setText("");
				switch(op) {
				case "+":result=num1+num2;
				break;
				case "-":result=num1-num2;
				break;
				case "*":result=num1*num2;
				break;
				case "/":try {
					if(num2==0) {
						throw new Exception();
					}
					else {
						result=num1/num2;
					}
				}
				catch(Exception excep){
					textarea.setText("IILEGAL STATEMENT");
					return;
				}
				break;
				default:result=0.0;
				break;
			 }
			 	textarea.setText(Double.toString(result));// here i need to append that text to the System;
			    textfeild2.append(" = "+Double.toString(result));
			}
			else if(S=="C") {
				textarea.setText("");
			}
			else if(S=="del") {
				String Store="";
			     int length=textarea.getText().length();
		
			     if(length>0) {
			    	 StringBuilder back = new StringBuilder(textarea.getText());
			    	 back.deleteCharAt(--length);
			    	 Store=back.toString();
			     }	        
			     textarea.setText(Store);
			}
			else if(S=="1"||S=="2"||S=="3"||S=="4"||S=="5"||S=="6"||S=="7"||S=="8"||S=="9"||S=="0"||S=="."){
				textarea.append(S);
			}
			else if(S=="AC") {
				textarea.setText("");
				textfeild2.setText("");
				S=null;op=null;num1=0;num2=0;
			}
		}	
    
     int valuetobereturned(int a) {
    	 return 0;
     }
    }
    
   
}


