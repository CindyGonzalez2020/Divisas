/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertidordemonedas;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author CINDY GONZALEZ
 */


public class ConvertidorDeMonedas extends JFrame{

    private JLabel title, tag1, tag2, tag3, tag4;
    private JTextField txt1, txt2;
    private JComboBox cmb1, cmb2;
    private JButton btn1;
    private Double cant_final, cant_inicial;
    int indice_origen, indice_objetivo;
    
    ConvertidorDeMonedas(){
        super("UTH | LA MEJOR");
        setSize(500,500);
        setLocationRelativeTo(null);
        panel();
        setVisible(true);
    }
    
    private void panel(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
        txt2 = new JTextField();
        txt2.setBounds(180, 400, 100, 25);
        
        title = new JLabel("Conversor de Monedas UTH");
        title.setBounds(90, 30, 400, 30);
        title.setFont(new Font("Times New Roman", Font.BOLD, 26));
        panel.add(title);
        
        tag1 = new JLabel("Seleccione moneda de origen:");
        tag1.setBounds(30, 100, 300, 30);
        tag1.setFont(new Font("Times New Roman", Font.BOLD, 14));
        panel.add(tag1);
        
        cmb1 = new JComboBox();
        cmb1.setBounds(30, 130, 200, 25);
        cmb1.setFont(new Font("Times New Roman", Font.BOLD, 14)); // NOI18N
        cmb1.setModel(new DefaultComboBoxModel(new String[] { "HNL - Lempiras", "USD - Dólar ", "EUR - Euro"}));
        panel.add(cmb1);
        
        tag2 = new JLabel("Seleccione moneda a convertir:");
        tag2.setBounds(30, 200, 300, 30);
        tag2.setFont(new Font("Times New Roman", Font.BOLD, 14));
        panel.add(tag2);
        
        cmb2 = new JComboBox();
        cmb2.setBounds(30, 230, 200, 25);
        cmb2.setFont(new Font("Times New Roman", Font.BOLD, 14)); // NOI18N
        cmb2.setModel(new DefaultComboBoxModel(new String[] { "HNL - Lempiras","USD - Dólar", "EUR - Euro"  }));
        panel.add(cmb2);
        
        tag3 = new JLabel("Ingrese la cantidad a convertir") ;
        tag3.setBounds(30, 320, 400, 30);
        tag3.setFont(new Font("Times New Roman", Font.BOLD, 14));
        panel.add(tag3);
        txt1 = new JTextField();
        txt1.setBounds(30, 350, 140, 25);
        panel.add(txt1);
        
        btn1 = new JButton();
        btn1.setText("Convertir");
        btn1.setBounds(180, 350, 100, 25);
        panel.add(btn1);
        
        btn1.addActionListener((ActionEvent event) -> {
            cant_inicial = Double.parseDouble(txt1.getText());
            indice_origen = cmb1.getSelectedIndex();
            indice_objetivo = cmb2.getSelectedIndex();
            switch(indice_origen){
                case 0:
                    Lempiras lps = new Lempiras();
                    lps.setDato_Inicial(cant_inicial);
                    lps.setResultado(indice_objetivo);
                    lps.conversion(indice_objetivo);
                    cant_final = lps.getDato_final();
                    break;
                case 1:
                    Dolares usd = new Dolares();
                    usd.setDato_Inicial(cant_inicial);
                    usd.setResultado(indice_objetivo);
                    usd.conversion(indice_objetivo);
                    cant_final = usd.getDato_final();
                    break;
                case 2:
                    Euros eur = new Euros();
                    eur.setDato_Inicial(cant_inicial);
                    eur.setResultado(indice_objetivo);
                    eur.conversion(indice_objetivo);
                    cant_final = eur.getDato_final();
                    break;
                    
                default: JOptionPane.showMessageDialog(null, "Error de selección");
            }
            String cant_Fstring = String.valueOf(String.format("%.2f", cant_final));
            txt2.setText(cant_Fstring);
            panel.add(txt2);
        });
        
        tag4 = new JLabel("Convercion: ");
        tag4.setBounds(70, 400, 150, 25);
        tag4.setFont(new Font("Times New Roman", Font.BOLD, 22));
        panel.add(tag4);
        
        
    }
    
    public static void main(String[] args) {
        ConvertidorDeMonedas app = new ConvertidorDeMonedas();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
