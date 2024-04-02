
package bank.management.system;

/**
 *
 * @author nishi
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{
    
//    long random;
    JTextField pan,aadhar;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JComboBox religion,category,income,occupation,education;
    String formno;
    
    SignupTwo(String formno){
        this.formno = formno;
        setLayout(null);
        
        setTitle("New Account Application Form- Page 2");
    
        JLabel AdditionalDetails = new JLabel("Page 2: Additional Details");
        AdditionalDetails.setFont(new Font("Raleway", Font.BOLD,20));
        AdditionalDetails.setBounds(290, 80, 400, 30);
        add(AdditionalDetails);
        
        JLabel name = new JLabel("Religion:");
        name.setFont(new Font("Raleway", Font.BOLD,20));
        name.setBounds(100, 140, 100, 30);
        add(name);
        
        String valReligion[]={"Hindu","Muslim","Shikh","Christian","other"};
        religion= new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        JLabel fname = new JLabel("Category:");
        fname.setFont(new Font("Raleway", Font.BOLD,20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);
        
        String valcategory[]={"General","OBC","ST","SC","OTHER"};
        category= new JComboBox(valcategory);
        category.setBounds(300, 190, 400, 30); 
        category.setBackground(Color.WHITE);
        add(category);
        
        JLabel dob = new JLabel("Income:");
        dob.setFont(new Font("Raleway", Font.BOLD,20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        
        String incomecategory[]={"Null","< 1,50,000","< 2,50,000","< 5,00,000","UPTO 10,00,000"};
        income = new JComboBox(incomecategory);
        income.setBounds(300, 240, 400, 30); 
        income.setBackground(Color.WHITE);
        add(income);

        JLabel gender = new JLabel("Educational");
        gender.setFont(new Font("Raleway", Font.BOLD,20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);
        
        JLabel emails = new JLabel("Qualification:");
        emails.setFont(new Font("Raleway", Font.BOLD,20));
        emails.setBounds(100, 315, 200, 30);
        add(emails);
        
        String educationalValues[]={"Non-Graduation","Graduate","Post-Graduate","Doctrate","Others"};
        education = new JComboBox(educationalValues);
        education.setBounds(300, 315, 400, 30); 
        education.setBackground(Color.WHITE);
        add(education); 
    
        JLabel address = new JLabel("Occupation:");
        address.setFont(new Font("Raleway", Font.BOLD,20));
        address.setBounds(100, 390, 200, 30);
        add(address );
        
        String occupationValues[]={"Salaried","Self-Employed","Business","Student","Retired","Others"};
        occupation = new JComboBox(occupationValues);
        occupation.setBounds(300, 390, 400, 30); 
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
        JLabel panno= new JLabel("Pan No:");
        panno.setFont(new Font("Raleway", Font.BOLD,20));
        panno.setBounds(100, 440, 200, 30);
        add(panno);
        
        pan = new JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD,14));
        pan.setBounds(300, 440, 400, 30); 
        add(pan);
        
        JLabel aadharno = new JLabel("Aadhar No:");
        aadharno .setFont(new Font("Raleway", Font.BOLD,20));
        aadharno .setBounds(100, 490, 200, 30);
        add(aadharno );
        
        aadhar  = new JTextField();
        aadhar.setFont(new Font("Raleway",Font.BOLD,14));
        aadhar.setBounds(300, 490, 400, 30); 
        add(aadhar);
        
        JLabel seniorcitizen = new JLabel("Senior Citizen:");
        seniorcitizen.setFont(new Font("Raleway", Font.BOLD,20));
        seniorcitizen.setBounds(100, 540, 200, 30);
        add(seniorcitizen);
        
        syes= new JRadioButton("Yes");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.white);
        add(syes);
        
        sno= new JRadioButton("No");
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.white);
        add(sno);
        
        ButtonGroup seniorcitizengroup= new ButtonGroup();
        seniorcitizengroup.add(syes);
        seniorcitizengroup.add(sno);
        
        JLabel existingaccount = new JLabel("Existing Account:");
        existingaccount.setFont(new Font("Raleway", Font.BOLD,20));
        existingaccount.setBounds(100, 590, 200, 30);
        add(existingaccount);
        
        eyes= new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.white);
        add(eyes);
        
        eno= new JRadioButton("No");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.white);
        add(eno);
        
        ButtonGroup existingaccountgroup= new ButtonGroup();
        existingaccountgroup.add(syes);
        existingaccountgroup.add(sno);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raileway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
                
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
//        String formno = "" + random;//long
        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        String seniorcitizen = null;
        if(syes.isSelected()){
            seniorcitizen = "YES";
        }else if(sno.isSelected()){
            seniorcitizen = "NO";
        }
        String existingaccount = null;
        if(eyes.isSelected()){
            existingaccount = "YES";
        }else if(eno.isSelected()){
            existingaccount = "NO";
        }        
        String span = pan.getText();
        String saadhar = aadhar.getText();
        
        try{
            Conn c = new Conn();
            String query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
            c.s.executeUpdate(query); 
//            signup3 object
            setVisible(false);
            new SignupThree(formno).setVisible(true);
        }
        catch (Exception e){
        System.out.println(e);
         
        }
    }
//    "String'"+variable+"'String"
    public static void main(String args[]) {
     new SignupTwo("");
    }
}

//create table signuptwo(formno varchar(20), religion varchar(20),category varchar(20), income varchar(20), education varchar(20), occupation varchar(30), pan varchar(40), aadhar varchar(20), seniorcitizen varchar(25), existingaccount varchar(20));