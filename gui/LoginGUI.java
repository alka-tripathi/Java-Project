package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;

import java.util.Scanner;



class Login extends JFrame {
    JFrame frame = new JFrame();
    //constructor
    public Login(){
        this.setSize(600,600);
//     frame.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(163,217,217));
this.setFont(new Font("Arial",Font.BOLD,16));
this.setVisible(true);
this.setLayout(new BorderLayout());
    }

    public void addGUIcomponents() {

//        this.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(new GridLayout(5,1,15,10));



        //Add a label with some text
        JLabel label = new JLabel("FILEFORTRESS");
        label.setFont(new Font("Arial",Font.BOLD,30));
        label.setForeground(Color.BLACK);






//create and align the username label and field
        JLabel usernameLabel = new JLabel("UserName:");

        usernameLabel.setFont(new Font("Arial",Font.BOLD,15));


        JTextField usernameField = new JTextField(5);


        JLabel footerLabel = new JLabel();

        //password
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Arial",Font.BOLD,15));

        JTextField password = new JTextField(5);

        JPasswordField passwordField  = new JPasswordField(15);

        passwordField .setPreferredSize(new Dimension(100,20));



        loginPanel.add(usernameLabel);
        loginPanel.add(usernameField);

        loginPanel.add(passwordLabel);

        loginPanel.add(passwordField);



        this.add(loginPanel);
this.add(label,BorderLayout.NORTH);
this.add(loginPanel,BorderLayout.CENTER);

        //add the button panel to the frame
JPanel buttonPanel = new JPanel();
//buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        JButton btn = new JButton("GET IN");
        buttonPanel.add(btn);
        this.add(buttonPanel,BorderLayout.SOUTH);



        btn.setFocusable(false);

        btn.setSize(100, 50);
//        JLabel footerLabel = new JLabel("Footer Text Here", SwingConstants.CENTER);
//        footerLabel.setFont(new Font("Arial", Font.ITALIC, 12));
//        footerLabel.setForeground(Color.DARK_GRAY);
//
//        frame.add(footerLabel, BorderLayout.SOUTH);


        class UserPassword{



            public String checkPassword(int userpass){
                int myPass =678;

                if(userpass==myPass){
//                   return "Password correct";
                }
                else{
//
                    return "Incorrect password";

                }
                return "Password matches";
            }


        }






        class myUserName{


            String  username1 = "Alkatripathi";
            String myusername2 ="ShivanshSingh";
            String myusername3="ShereyaSingh";

            public String checkUserName(String username){

                if (username.equals(username1)||username.equals(myusername2)||username.equals(myusername3)){
return "username matches";
//
                }
                else if(username.isEmpty()){
//
                return "Enter user name";

                }

                else {
//                    System.out.println("UserName does not matches");
                    return "UserNmae does not mactches";

                }
            }



        }

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enterUserName = usernameField.getText();

                String enterPassword=  passwordField.getText();;

                UserPassword pass = new UserPassword();
                myUserName user = new myUserName();



                String userMessage=" ";
                String passwordmes="";
               userMessage= user.checkUserName(enterUserName);

                try{
                    int enterPass = Integer.parseInt(enterPassword);
                   passwordmes= pass.checkPassword(enterPass);



                }

                catch(NumberFormatException ea){
passwordmes="password must be numeric";
//                    footerLabel.setText("Password must be numeric");
                }
//update footer
                footerLabel.setText(userMessage +"|" +passwordmes);
                footerLabel.setFont(new Font("Arial", Font.ITALIC, 12));
                footerLabel.setForeground(Color.DARK_GRAY);
                add(footerLabel, BorderLayout.SOUTH);
                loginPanel.add(footerLabel);
                revalidate();
                repaint();





            }
        });



        this.setVisible(true);
    }




}





public class LoginGUI{
    public static void main(String[] args) {

        Login p = new Login();
        p.addGUIcomponents();

    }

}

