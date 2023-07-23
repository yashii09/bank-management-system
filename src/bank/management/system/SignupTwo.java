package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {
    
    JTextField panTextField ,aadharTextField;
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    JComboBox religionComboBox, categoryComboBox, occupationComboBox, educationComboBox, incomeComboBox;
    String formno;
    
    SignupTwo(String formno){
        this.formno = formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);
        
        JLabel religion = new JLabel("Religion: ");
        religion.setFont(new Font("Raleway", Font.BOLD, 20));
        religion.setBounds(100, 140, 100, 30);
        add(religion);
        
        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        religionComboBox = new JComboBox(valReligion);
        religionComboBox.setBounds(300, 140, 400, 30);
        religionComboBox.setBackground(Color.WHITE);
        add(religionComboBox);      
        
        JLabel category = new JLabel("Category: ");
        category.setFont(new Font("Raleway", Font.BOLD, 20));
        category.setBounds(100, 190, 200, 30);
        add(category);
        
        String valCategory[] = {"General", "OBC", "SC", "ST"};
        categoryComboBox = new JComboBox(valCategory);
        categoryComboBox.setBounds(300, 190, 400, 30);
        categoryComboBox.setBackground(Color.WHITE);
        add(categoryComboBox);
        
        JLabel income = new JLabel("Income: ");
        income.setFont(new Font("Raleway", Font.BOLD, 20));
        income.setBounds(100, 240, 200, 30);
        add(income);
        
        String incomeCategory[] = {"Null", "< 1,50,000", "< 2,50,000", "< 5,00,000", "Upto 10,00,000"};
        occupationComboBox = new JComboBox(incomeCategory);
        occupationComboBox.setBounds(300, 240, 400, 30);
        occupationComboBox.setBackground(Color.WHITE);
        add(occupationComboBox);
        
        JLabel education = new JLabel("Educational: ");
        education.setFont(new Font("Raleway", Font.BOLD, 20));
        education.setBounds(100, 290, 200, 30);
        add(education);
        
        JLabel qualification = new JLabel("Qualification: ");
        qualification.setFont(new Font("Raleway", Font.BOLD, 20));
        qualification.setBounds(100, 315, 200, 30);
        add(qualification);
        
        String educationValues[] = {"Non-Graduation", "Graduate", "Post Graduation", "Doctrate", "Others"};
        educationComboBox = new JComboBox(educationValues);
        educationComboBox.setBounds(300, 315, 400, 30);
        educationComboBox.setBackground(Color.WHITE);
        add(educationComboBox);
        
        JLabel occupation = new JLabel("Occupation: ");
        occupation.setFont(new Font("Raleway", Font.BOLD, 20));
        occupation.setBounds(100, 390, 200, 30);
        add(occupation);
        
        String occupationValues[] = {"Salaried", "Self-Employed", "Business", "Student", "Retired", "Others"};
        occupationComboBox = new JComboBox(occupationValues);
        occupationComboBox.setBounds(300, 390, 400, 30);
        occupationComboBox.setBackground(Color.WHITE);
        add(occupationComboBox);
        
        JLabel pan = new JLabel("PAN Number: ");
        pan.setFont(new Font("Raleway", Font.BOLD, 20));
        pan.setBounds(100, 440, 200, 30);
        add(pan);
        
        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        panTextField.setBounds(300, 440, 400, 30);
        add(panTextField);
        
        JLabel aadhar = new JLabel("Aadhar Number: ");
        aadhar.setFont(new Font("Raleway", Font.BOLD, 20));
        aadhar.setBounds(100, 490, 200, 30);
        add(aadhar);
        
        aadharTextField= new JTextField();
        aadharTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        aadharTextField.setBounds(300, 490, 400, 30);
        add(aadharTextField);
        
        JLabel seniorCitizen = new JLabel("Senior Citizen: ");
        seniorCitizen.setFont(new Font("Raleway", Font.BOLD, 20));
        seniorCitizen.setBounds(100, 540, 200, 30);
        add(seniorCitizen);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(450, 540, 100, 30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup seniorGroup = new ButtonGroup();
        seniorGroup.add(syes);
        seniorGroup.add(sno);
        
        
        JLabel existingAccount = new JLabel("Existing Account: ");
        existingAccount.setFont(new Font("Raleway", Font.BOLD, 20));
        existingAccount.setBounds(100, 590, 200, 30);
        add(existingAccount);
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(450, 590, 100, 30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup existingGroup = new ButtonGroup();
        existingGroup.add(eyes);
        existingGroup.add(eno);
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);

                
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        String sreligion = (String)religionComboBox.getSelectedItem();
        String scategory = (String)categoryComboBox.getSelectedItem();
        String sincome = (String)occupationComboBox.getSelectedItem();
        String seducation = (String)educationComboBox.getSelectedItem();
        String soccupation = (String)occupationComboBox.getSelectedItem();
        String span = panTextField.getText();
        String saadhar = aadharTextField.getText();
        
        String seniorcitizen = null;
        if(syes.isSelected()){
            seniorcitizen = "Yes";
        } else if(sno.isSelected()){
            seniorcitizen = "No";
        }
        
        String existingaccount  = null;
        if(eyes.isSelected()){
            existingaccount = "Yes";
        } else if(eno.isSelected()){
            existingaccount = "No";
        } 
        
        
        try {
            Conn c = new Conn();
            String query = "insert into signuptwo values('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+span+"', '"+saadhar+"', '"+seniorcitizen+"', '"+existingaccount+"')";
            c.s.executeUpdate(query);
            
            //Signup3 Object
            setVisible(false);
            new SignupThree(formno).setVisible(true);
        } catch(Exception e){
            System.out.println(e);
        }
        
        
    }
    
    public static void main(String args[]){
        new SignupTwo("");
    };
}