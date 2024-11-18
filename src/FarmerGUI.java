import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class FarmerGUI extends JFrame {
    static Farmer Dynamic;
    //static Farmer Dynamic2;
    int id;long phone;String name;String town;String problem;String crop;
    static Receptionist r = new Receptionist();
    public FarmerGUI(int id,String name,String town,long phone){
        this.id = id;
        this.name = name;
        this.town = town;
        this.phone = phone;
        setTitle("FarmerGUI");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400,400);
        setLocationRelativeTo(null);
        setVisible(true);
        JPanel panel = new JPanel(new GridLayout(3, 2));
       // JLabel idlabel = new JLabel("ID :");
        JTextField idField = new JTextField();
       // JLabel namelabel = new JLabel("Name :");
        JTextField nameField = new JTextField();
        //JLabel Phonelabel = new JLabel("Phone :");
         JTextField phonField = new JTextField();
        //JLabel Townlabel = new JLabel("Town :");
        JTextField Townfield = new JTextField();
        JLabel cropLabel = new JLabel("Crop :");
        JTextField cropField = new JTextField();
        JLabel problemlabel = new JLabel("Problem :");
        JTextField ProblemField = new JTextField();
        JButton RegisterButton = new JButton("Register your problem");
        JButton PayBill = new JButton("Pay Bill");
        /*panel.add(idlabel);
        panel.add(idField);
        panel.add(namelabel);
        panel.add(nameField);
        panel.add(Phonelabel);
        panel.add(phonField);
        panel.add(Townlabel);
        panel.add(Townfield);*/
        panel.add(cropLabel);
        panel.add(cropField);
        panel.add(problemlabel);
        panel.add(ProblemField);
        panel.add(RegisterButton);
        panel.add(PayBill);
        add(panel);
        RegisterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){

                /*String name = nameField.getText();
                long ph= Long.parseLong(phonField.getText());
                String town = Townfield.getText();*/
                String prob = ProblemField.getText();
                String crop = cropField.getText();
                Dynamic = new Farmer(id,name,phone,town,prob,crop);
                
                r.addFramerData(Dynamic);
               // Dynamic2 = Dynamic;
            }
        });
        PayBill.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "Registered Succesfully "+Dynamic.getName());
                idField.setText(" ");
                nameField.setText(" ");
                Townfield.setText(" ");
                ProblemField.setText(" ");
                cropField.setText(" ");
                phonField.setText(" ");
            }
        });
    }
}