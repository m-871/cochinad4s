package calculadora.r1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

public class CalculadoraR1 extends JFrame implements ActionListener {
    
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int resultado = 0;
        char operacion;
        
        JFrame ventana = new JFrame();
        
        ventana.setVisible(true);
        ventana.setSize(387, 480);
        ventana.setTitle("Calculadora");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(null);
        
        JTextField recuadro = new JTextField(20);
        recuadro.setBounds(15,15,350,50);
        
        JButton boton1 = new JButton("1");
        JButton boton2 = new JButton("2");
        JButton boton3 = new JButton("3");
        JButton boton4 = new JButton("4");
        JButton boton5 = new JButton("5");
        JButton boton6 = new JButton("6");
        JButton boton7 = new JButton("7");
        JButton boton8 = new JButton("8");
        JButton boton9 = new JButton("9");
        JButton boton0 = new JButton("0");
        JButton botonSuma = new JButton("+");
        JButton botonResta = new JButton("-");
        JButton botonMulti = new JButton("x");
        JButton botonDivis = new JButton("/");
        JButton botonC = new JButton("C");
        JButton botonRes = new JButton("=");     
        
        boton1.setBounds(15, 75, 80, 80);
        boton2.setBounds(105, 75, 80, 80);
        boton3.setBounds(193,75,80,80);
        botonSuma.setBounds(283, 75, 80, 80);
        boton4.setBounds(15, 165, 80, 80);
        boton5.setBounds(105, 165, 80, 80);
        boton6.setBounds(193,165,80,80);
        botonResta.setBounds(283,165,80,80);
        boton7.setBounds(15,255,80,80);
        boton8.setBounds(105,255,80,80);
        boton9.setBounds(193,255,80,80);
        botonMulti.setBounds(283,255,80,80);
        botonC.setBounds(15,345,80,80);
        boton0.setBounds(105,345,80,80);
        botonRes.setBounds(193,345,80,80);
        botonDivis.setBounds(283,345,80,80);
        
        boton1.addActionListener(e -> {
            recuadro.setText(recuadro.getText() + "1");
        });
        
        boton2.addActionListener(e -> {
            recuadro.setText(recuadro.getText() + "2");
        });        

        boton3.addActionListener(e -> {
            recuadro.setText(recuadro.getText() + "3");
        });                    
        
        botonSuma.addActionListener(e -> {
            recuadro.setText("+");
        });                
        
        boton4.addActionListener(e -> {
            recuadro.setText(recuadro.getText() + "4");
        });        
        
        boton5.addActionListener(e -> {
            recuadro.setText(recuadro.getText() + "5");
        });

        boton6.addActionListener(e -> {
            recuadro.setText(recuadro.getText() + "6");
        });

        botonResta.addActionListener(e -> {
            recuadro.setText("-");
        });        
        
        boton7.addActionListener(e -> {
            recuadro.setText(recuadro.getText() + "7");
        });        
        
        boton8.addActionListener(e -> {
            recuadro.setText(recuadro.getText() + "8");
        });        
        
        boton9.addActionListener(e -> {
            recuadro.setText(recuadro.getText() + "9");
        });        
        
        botonMulti.addActionListener(e -> {
            recuadro.setText("x");
        });        
        
        botonC.addActionListener(e -> {
            recuadro.setText("");
        });        
        
        boton0.addActionListener(e -> {
            recuadro.setText(recuadro.getText() + "0");
        });               

        botonRes.addActionListener(e -> {
            recuadro.setText("=");
        });          
        
        botonDivis.addActionListener(e -> {
            recuadro.setText("/");
        });        
        
        
        
        ventana.add(recuadro);
        ventana.add(boton1);
        ventana.add(boton2);
        ventana.add(boton3);
        ventana.add(botonSuma);
        ventana.add(boton4);
        ventana.add(boton5);
        ventana.add(boton6);
        ventana.add(botonResta);
        ventana.add(boton7);
        ventana.add(boton8);
        ventana.add(boton9);
        ventana.add(botonMulti);
        ventana.add(botonC);
        ventana.add(boton0);
        ventana.add(botonRes);
        ventana.add(botonDivis);

        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

    public class ListenButton implements ActionListener {
    
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == botonSuma) {
                num1 = Integer.parseInt(textfield.getText());
                operador = "+";
                textfield.setText("");
            }
            else if (e.getSource() == ) {
                recuadro.setText(num1 - num2);
            }
        
        }
    
    }
}