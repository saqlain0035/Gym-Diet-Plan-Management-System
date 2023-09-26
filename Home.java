    package Gym_management;
    import java.awt.*;
    import java.awt.event.*;
    import javax.swing.*;
    import java.sql.*;

    public class Home extends JFrame implements ActionListener{
        JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
        Font f,f1,f2;
        JPanel p1;

        Home(){
            super("Home Page");
            setSize(1600,900);
            setLocation(0,0);

            f=new Font("Lucida Fax",Font.BOLD,20);
            f2=new Font("Gadugi",Font.BOLD,35);
            f1=new Font("MS UI Gothic",Font.BOLD,18);

    //        ImageIcon ic=new ImageIcon("bg1.jpg");
    //        Image img=ic.getImage().getScaledInstance(1600, 900, Image.SCALE_DEFAULT);
    //        ImageIcon ic1=new ImageIcon(img);
    //        l1=new JLabel(ic1);
    //        add(l1);
    //        
            l1=new javax.swing.JLabel();
            l1.setIcon(new javax.swing.ImageIcon(getClass().getResource("bg2.jpg")));
            l1.setSize(1600, 900);
            add(l1);

            JMenuBar m1=new JMenuBar();
            JMenu men1=new JMenu("Master");
            JMenuItem ment1=new JMenuItem("Add Trainer");
            JMenuItem ment2=new JMenuItem("Add Customer");

            JMenu men2=new JMenu("Attendunce");
            JMenuItem ment3=new JMenuItem("Trainer Attendunce");
            JMenuItem ment4=new JMenuItem("Customer Attendunce");

            JMenu men3=new JMenu("Personal Information");
            JMenuItem ment5=new JMenuItem("Trainer Information");
            JMenuItem ment6=new JMenuItem("Customer Information");

            JMenu men4=new JMenu("Update Information");
            JMenuItem ment7=new JMenuItem("Update Trainer");
            JMenuItem ment8=new JMenuItem("Update Customer");

            JMenu men5=new JMenu("Fees Information");
            JMenuItem ment9=new JMenuItem("Trainer Fees");
            JMenuItem ment10=new JMenuItem("Customer Fees");

            JMenu men6=new JMenu("All Details");
            JMenuItem ment11=new JMenuItem("Diet Plan");
            JMenuItem ment12=new JMenuItem("Gym Gadets");

            JMenu men7=new JMenu("Exit");
            JMenuItem ment13=new JMenuItem("Exit");

            JMenu men8=new JMenu("Exercises Rutein");
            JMenuItem ment14=new JMenuItem("Exercises Images");
            JMenuItem ment15=new JMenuItem("BMR Calculator");

            men1.add(ment1);
            men1.add(ment2);

            men2.add(ment3);
            men2.add(ment4);

            men3.add(ment5);
            men3.add(ment6);

            men4.add(ment7);
            men4.add(ment8);

            men5.add(ment9);
            men5.add(ment10);

            men6.add(ment11);
            men6.add(ment12);

            men7.add(ment13);

            men8.add(ment14);
            men8.add(ment15);

            m1.add(men1);
            m1.add(men2);
            m1.add(men3);
            m1.add(men4);
            m1.add(men5);
            m1.add(men6);
            m1.add(men8);
            m1.add(men7);

            men1.setFont(f);
            men2.setFont(f);
            men3.setFont(f);
            men4.setFont(f);
            men5.setFont(f);
            men6.setFont(f);
            men7.setFont(f);
            men8.setFont(f);

            ment1.setFont(f1);
            ment2.setFont(f1);
            ment3.setFont(f1);
            ment4.setFont(f1);
            ment5.setFont(f1);
            ment6.setFont(f1);
            ment7.setFont(f1);
            ment8.setFont(f1);
            ment9.setFont(f1);
            ment10.setFont(f1);
            ment11.setFont(f1);
            ment12.setFont(f1);
            ment13.setFont(f1);
            ment14.setFont(f1);
            ment15.setFont(f1);

            m1.setBackground(Color.BLACK);

            men1.setForeground(Color.GRAY);
            men2.setForeground(Color.GRAY);
            men3.setForeground(Color.GRAY);
            men4.setForeground(Color.GRAY);
            men5.setForeground(Color.GRAY);
            men6.setForeground(Color.GRAY);
            men7.setForeground(Color.RED);
            men8.setForeground(Color.GRAY);


    //        ment1.setForeground(Color.BLACK);
    //        ment2.setForeground(Color.YELLOW);
    //        ment3.setForeground(Color.YELLOW);
    //        ment4.setForeground(Color.YELLOW);
    //        ment5.setForeground(Color.YELLOW);
    //        ment6.setForeground(Color.YELLOW);
    //        ment7.setForeground(Color.YELLOW);
    //        ment8.setForeground(Color.YELLOW);
    //        ment9.setForeground(Color.YELLOW);
    //        ment10.setForeground(Color.YELLOW);
    //        ment11.setForeground(Color.YELLOW);
    //        ment12.setForeground(Color.YELLOW);
    //        ment13.setForeground(Color.RED);
    //        ment14.setForeground(Color.YELLOW);
    //        ment15.setForeground(Color.YELLOW);
    //        
            ment1.addActionListener(this);
            ment2.addActionListener(this);
            ment3.addActionListener(this);
            ment4.addActionListener(this);
            ment5.addActionListener(this);
            ment6.addActionListener(this);
            ment7.addActionListener(this);
            ment8.addActionListener(this);
            ment9.addActionListener(this);
            ment10.addActionListener(this);
            ment11.addActionListener(this);
            ment12.addActionListener(this);
            ment13.addActionListener(this);
            ment14.addActionListener(this);
            ment15.addActionListener(this);

            setJMenuBar(m1);

        }
        public void actionPerformed(ActionEvent e){
            String comnd=e.getActionCommand();

            if(comnd.equals("Add Trainer")){
                new Add_Trainer().setVisible(true);
            }
            else if(comnd.equals("Add Customer")){
                new ADD_Customer2().setVisible(true);
            }
            else if(comnd.equals("Trainer Attendunce")){
                new Trainer_Attendunce().setVisible(true);
            }
            else if(comnd.equals("Customer Attendunce")){
                new Customer_Attendunce().setVisible(true);
            }
            else if(comnd.equals("Trainer Information")){
                new Trainer_Information().setVisible(true);
            }
            else if(comnd.equals("Customer Information")){
                new Customer_Information().setVisible(true);
            }
            else if(comnd.equals("Update Trainer")){
                new Update_Trainer().setVisible(true);
            }
            else if(comnd.equals("Update Customer")){
                new Update_Customer().setVisible(true);
            }
            else if(comnd.equals("Trainer Fees")){
                new Trainer_Fees().setVisible(true);
            }
            else if(comnd.equals("Customer Fees")){
                new Customer_Fees().setVisible(true);
            }
            else if(comnd.equals("Diet Plan")){
                new DietChart().setVisible(true);
            }
            else if(comnd.equals("Gym Gadets")){
                new Gym_Gadets().setVisible(true);
            }
            else if(comnd.equals("Exercises Images")){
                new Daily_Excersice().setVisible(true);
            }
            else if(comnd.equals("BMR Calculator")){
                new BMI_Calculator().setVisible(true);
            }
            else if(comnd.equals("Exit")){
                System.exit(0);
            }
        }

        public static void main(String[] args){
            new Home().setVisible(true);
        }
    }
