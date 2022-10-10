import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {

    public static void main(String[] args) {
     BMI bmi = new BMI();

    }
}



    class BMI {
    JFrame f = new JFrame();
    JLabel lb = new JLabel();
    JLabel lb2 = new JLabel();
    JLabel lb3 = new JLabel();
    JLabel lb4 = new JLabel();
    JLabel lb5 = new JLabel();
    JLabel lb6 = new JLabel();
    JLabel lb7 = new JLabel();
    JLabel lb8 = new JLabel();
    JLabel lb9 = new JLabel();
    JLabel lb10 = new JLabel();
    JLabel lb11 = new JLabel();
    JLabel lb12 = new JLabel();
    JLabel lb13 = new JLabel();
    JLabel lb14 = new JLabel();
    JLabel lb15 = new JLabel();
    JPanel titlepanel = new JPanel();
    JButton btn = new JButton();
    JCheckBox ch1 = new JCheckBox();
    JCheckBox ch2 = new JCheckBox();
    JTextField tf1 = new JTextField();
    JTextField tf2 = new JTextField();
    JTextField tf3 = new JTextField();
    JButton btn2 = new JButton();

    BMI(){
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(800,750);
        f.setTitle("BMI Calculator");
        f.getContentPane().setBackground(new Color(225,245,255));
        f.add(titlepanel , BorderLayout.NORTH);
        f.setLayout(null);
        titlepanel.setBounds(0,0,800,80);
        titlepanel.setBackground(new Color(40,60,120));
       titlepanel.setBorder(new LineBorder(Color.BLACK,1,false));
        lb.setHorizontalAlignment(JLabel.CENTER);
        lb.setText("BMI CALCULATOR");
        lb.setForeground(new Color(255,255,220));
        lb.setFont(new Font("Cambria", Font.HANGING_BASELINE  , 55));
        titlepanel.add(lb);
        f.add(lb2);
        f.add(lb3);
        f.add(btn);
        f.add(lb4);
        f.add(ch2);
        f.add(ch1);
        f.add(lb5);
        f.add(tf1);
        f.add(tf2);
        f.add(lb6);
        f.add(lb7);
        f.add(tf3);
        f.add(btn2);
        f.add(lb8);
        f.add(lb9);
        f.add(lb10);
        f.add(lb11);
        f.add(lb12);
        f.add(lb13);
        f.add(lb14);
        f.add(lb15);
        lb2.setText("<HTML><U>Information</U></HTML> ");
        lb2.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        lb2.setFont(new Font("Cambria" , Font.BOLD, 19));
        lb2.setBounds(25,100,250,20);
        lb3.setText("<html>  If your BMI is:<br/> • below 18.5 – you're UNDERWEIGHT<br/> • between 18.5 and 24.9 - you're HEALTHY<br/> • between 25 and 29.9 – you're OVERWEIGHT<br/> • above 30 - you're OBESE");
        lb3.setBounds(25,135,400,100);
        lb3.setBorder(new LineBorder(new Color(166,19,19),3,true));
        lb3.setFont(new Font("Arial", Font.ITALIC , 15));
        lb3.setForeground(Color.darkGray);
        btn.setVisible(true);
        btn.setText("Find your BMI");
        btn.setBounds(485,170,150,32);
        btn.setFocusable(false);
        btn.setForeground(Color.WHITE);
        btn.setBackground(new Color(206,17,20));
        btn.setFont(new Font("Cambria" , Font.TRUETYPE_FONT, 15));
        btn.setBorder(new LineBorder(Color.black, 2, true));
        lb4.setVisible(false);
        lb4.setText("• What is your gender ? ");
        lb4.setFont(new Font("Constantia" , Font.BOLD , 15));
        lb4.setBounds(45 , 265 , 190 , 20);
        ch1.setText("Male");
        ch1.setFocusable(false);
        ch2.setFocusable(false);
        ch1.setBounds(50 , 290 , 90 , 25);
        ch1.setVisible(false);
        ch1.setBackground(new Color(225,245,255));
        ch1.setFont(new Font("Serif" , Font.BOLD , 15));
        ch2.setFont(new Font("Serif" , Font.BOLD , 15));
        ch2.setText("Female");
        ch2.setBounds(150 , 290 , 100 , 25);
        ch2.setVisible(false);
        ch2.setBackground(new Color(225,245,255));
        lb5.setText("• What is your height ? ");
        lb5.setFont(new Font("Constantia" , Font.BOLD , 15));
        lb5.setBounds(45 , 335 , 190 , 20);
        lb5.setVisible(false);
        tf1.setBounds(60,365,80,25);
        tf1.setEditable(true);
        tf1.setBorder(new LineBorder(Color.DARK_GRAY, 1 , true));
        tf1.getActionListeners();
        tf1.setVisible(false);
        lb6.setText("• What is your weight ? ");
        lb6.setFont(new Font("Constantia" , Font.BOLD , 15));
        lb6.setBounds(45 , 396 , 190 , 20);
        lb6.setVisible(false);
        tf2.setBounds(60,425,80,25);
        tf2.setEditable(true);
        tf2.setBorder(new LineBorder(Color.DARK_GRAY, 1 , true));
        tf2.getActionListeners();
        tf2.setVisible(false);
        lb7.setText("• What is your age ? ");
        lb7.setFont(new Font("Constantia" , Font.BOLD , 15));
        lb7.setBounds(45 , 456 , 190 , 20);
        lb7.setVisible(false);
        tf3.setBounds(60,486,80,25);
        tf3.setEditable(true);
        tf3.setBorder(new LineBorder(Color.DARK_GRAY, 1 , true));
        tf3.getActionListeners();
        tf3.setVisible(false);
        btn2.setVisible(false);
        btn2.setText("Calculate");
        btn2.setBounds(60,540,100,30);
        btn2.setFocusable(false);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(new Color(206,50,20));
        btn2.setFont(new Font("Cambria" , Font.TRUETYPE_FONT, 15));
        btn2.setBorder(new LineBorder(Color.black, 1, true));
        lb8.setVisible(false);
        lb8.setBounds(66 , 590 ,80 , 20 );
        lb8.setFont(new Font("Arial" , Font.TYPE1_FONT, 14));
       lb9.setVisible(false);
       lb9.setBounds(368,396,330,75);
       lb9.setFont(new Font("Cambria", Font.BOLD , 28 ));
       lb10.setBounds(330,480,150,150);
       lb10.setVisible(false);
        lb11.setBounds(485,490,181,150);
        lb11.setVisible(false);
        lb12.setBounds(348,298,135,100);
        lb12.setVisible(false);
        lb13.setBounds(520 ,280,130,130);
        lb13.setVisible(false);
        lb14.setBounds(110,30,80,20);
        lb14.setVisible(false);
        lb14.setForeground(Color.black);
        lb14.setFont(new Font("Arial" , Font.PLAIN , 10));







        ImageIcon icon = new ImageIcon(Main.class.getResource("/a.png"));
        lb10.setIcon(new ImageIcon(icon.getImage()));
        ImageIcon icon2 = new ImageIcon(Main.class.getResource("/combo.png"));
        lb11.setIcon(new ImageIcon(icon2.getImage()));
        ImageIcon icon3 = new ImageIcon(Main.class.getResource("/dont.png"));
        lb12.setIcon(new ImageIcon(icon3.getImage()));
        ImageIcon icon4 = new ImageIcon(Main.class.getResource("/b.png"));
        lb13.setIcon(new ImageIcon(icon4.getImage()));

        // lb9.setBorder(new LineBorder(Color.black , 4, false ));


        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                lb4.setVisible(true);
                ch1.setVisible(true);
                ch2.setVisible(true);

            }
        });




        ch1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ch1 = (JCheckBox) e.getSource();
            lb5.setVisible(true);
            tf1.setVisible(true);
            lb6.setVisible(true);
            tf2.setVisible(true);
            lb7.setVisible(true);
            tf3.setVisible(true);
            btn2.setVisible(true);
            lb14.setVisible(true);
                lb14.setText("Ex : 170");
            if(ch2.isSelected()){
                ch2.setSelected(false);
            }

            }
        });

        ch2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ch2 = (JCheckBox) e.getSource();
                lb5.setVisible(true);
                tf1.setVisible(true);
                lb6.setVisible(true);
                tf2.setVisible(true);
                lb7.setVisible(true);
                tf3.setVisible(true);
                btn2.setVisible(true);
                lb14.setVisible(true);
                lb14.setText("Ex : 170");
                if(ch1.isSelected()){
                    ch1.setSelected(false);
                }

            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String height = tf1.getText();
                String weight = tf2.getText();
                String age = tf3.getText();
                float h = (float) ((Integer.parseInt(height)) / (100.0));
                double w = Integer.parseInt(weight);
                double a = Integer.parseInt(age);
                double cal = 0;

                if(e.getSource() ==btn2 ){
                    cal =  ((w) / (h*h));
                }
                String result = String.valueOf(cal);
                lb8.setVisible(true);
                lb8.setText("BMI : " + result);
                if(cal < 18.5){
                    lb9.setVisible(true);
                    lb9.setText("  You are UNDERWEIGHT");
                    lb9.setForeground(new Color(182,9,45));
                    lb10.setVisible(true);
                    lb11.setVisible(true);
                    lb12.setVisible(true);
                    lb13.setVisible(true);

                }
                else if(cal>=18.5 && cal<=24.9){
                    lb9.setVisible(true);
                    lb9.setText("   You are HEALTHY   :)");
                    lb9.setFont(new Font("Cambria", Font.BOLD , 28 ));
                    lb9.setForeground(new Color(23,102,15));
                    lb10.setVisible(true);
                    lb11.setVisible(true);
                    lb12.setVisible(true);
                    lb13.setVisible(true);
                }
                else if(cal>= 25 && cal<= 29.9){
                    lb9.setVisible(true);
                    lb9.setText("   You are OVERWEIGHT");
                    lb9.setForeground(new Color(182,9,45));
                    lb10.setVisible(true);
                    lb11.setVisible(true);
                    lb12.setVisible(true);
                    lb13.setVisible(true);
                }
                else if(cal >= 30){
                    lb9.setVisible(true);
                    lb9.setText("   You are OBESE");
                    lb9.setForeground(new Color(182,9,45));
                    lb10.setVisible(true);
                    lb11.setVisible(true);
                    lb12.setVisible(true);
                    lb13.setVisible(true);
                }


            }
        });





    }

}
