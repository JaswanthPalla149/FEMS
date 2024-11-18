import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;
public class ExpertRegistrationGUI extends JFrame {
    static Expert dyne;
    public ExpertRegistrationGUI(){
        {
            setTitle("ExpertRegistrationGUI");
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setSize(1200,1200);
            setLocationRelativeTo(null);
            setVisible(true);
            JPanel panel = new JPanel(new GridLayout(7,2));
        JLabel namelabel = new JLabel("Name :");
        JTextField nameField = new JTextField();
        JLabel d = new JLabel("Department :");
        JTextField dt = new JTextField();
        JLabel Phonelabel = new JLabel("Phone :");
         JTextField phonField = new JTextField();
        JLabel Townlabel = new JLabel("Town :");
        JTextField Townfield = new JTextField();
        JLabel s = new JLabel("Specialization :");
        JTextField st = new JTextField();
        JLabel plabel = new JLabel("set your password :");
        JTextField tfield = new JTextField();
        JButton RegisterButton = new JButton("Register");
       JButton confirm = new JButton("confirm");
        panel.add(namelabel);
        panel.add(nameField);
        panel.add(Phonelabel);
        panel.add(phonField);
        panel.add(Townlabel);
        panel.add(Townfield);
        panel.add(d);
        panel.add(dt);
        panel.add(s);
        panel.add(st);
        panel.add(plabel);
        panel.add(tfield);
        panel.add(confirm);
        panel.add(RegisterButton);
        add(panel);
        RegisterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String name = nameField.getText();
                long ph= Long.parseLong(phonField.getText());
                String town = Townfield.getText();
                String s = st.getText();
                String d = dt.getText();
                int code = Integer.parseInt(tfield.getText());
                int p = Receptionist.getLastio();
                 dyne = new Expert(p, ph, town, name, d, s);
                 dyne.passcode=code;
                 Receptionist.addExp(dyne);
                 JOptionPane.showMessageDialog(confirm, "Registration successfull , your id is "+p );
            }
            });
        }

    }
    public static void main(String[] args) {
        ExpertRegistrationGUI egui = new ExpertRegistrationGUI();
    }
}
