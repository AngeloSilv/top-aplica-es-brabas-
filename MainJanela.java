import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainJanela extends JFrame {
    final private Font mainFont = new Font("Segoe print", Font.BOLD, 18);

    public void initialize() {
       
        JTextField tfFirstName, tfLastName;
        JLabel lbWelcome;

       //********************Form Panel*******************

       JLabel lbFirstName = new  JLabel("Nome");
       lbFirstName.setFont(mainFont);

       tfFirstName = new JTextField(); 
       tfFirstName.setFont(mainFont);

       JLabel lbLastName = new JLabel("Sobrenome");
       lbLastName.setFont(mainFont);

       tfLastName = new JTextField();
       tfLastName.setFont(mainFont);
       
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 1, 5, 5));
        formPanel.add(lbFirstName);
        formPanel.add(tfFirstName);
        formPanel.add(lbLastName);
        formPanel.add(tfLastName);

        // ********************** Welcome Label*********************

            lbWelcome = new JLabel();
            lbWelcome.setFont(mainFont);

            //******************* Buttons Panel *******************
            
            JButton btnOK = new JButton("OK");
            btnOK.setFont(mainFont);
            btnOK.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                    String firstName = tfFirstName.getText();
                    String lastName = tfLastName.getText();
                    lbWelcome.setText("Coé " + firstName + " " + lastName + " VSF TMJNT");
                }
                
            });

            JButton btnClear = new JButton("Clear");
            btnClear.setFont(mainFont);
            btnClear.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                tfFirstName.setText("");
                tfLastName.setText("");
                lbWelcome.setText("");
                }

            });

          JPanel buttonsPanel = new JPanel();
          buttonsPanel.setLayout(new GridLayout(1, 2, 5, 5));
          buttonsPanel.add(btnOK);
          buttonsPanel.add(btnClear);  


        // ********************** Main Panel ***********************

        JPanel mainPanel = new JPanel();
       mainPanel.setLayout(new BorderLayout());
       mainPanel.setBackground(new Color(128, 128, 255));
       mainPanel.add(formPanel, BorderLayout.NORTH);
       mainPanel.add(lbWelcome, BorderLayout.CENTER);
       mainPanel.add(buttonsPanel, BorderLayout.SOUTH);

       add(mainPanel);

       
        setTitle("Welcome");
        setSize(500, 600);
        setMinimumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        MainJanela myJanela = new MainJanela();
        myJanela.initialize();
    }
}