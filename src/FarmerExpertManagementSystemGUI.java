import java.awt.*;
import java.awt.event.*;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FarmerExpertManagementSystemGUI extends JFrame{

    public FarmerExpertManagementSystemGUI(){
        JLabel t = new JLabel("Proceed As");
        setTitle("FarmerExpertManagement");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1600,1600);
        setLocationRelativeTo(null);
        setVisible(true);
        JPanel panel = new JPanel(new GridLayout(4,1));
        JButton FarmerButton = new JButton("Farmer");
        JButton ExpertButton = new JButton("Expert");
        JButton ReceptionistButton = new JButton("Receptionist");
        panel.add(t);
        panel.add(FarmerButton);
        panel.add(ExpertButton);
        panel.add(ReceptionistButton);
        add(panel);
        FarmerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                MainFarmerGUI farmerGUI = new MainFarmerGUI();
            }
        });
        ReceptionistButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                ReceptionistLoginGUI receptionistLoginGUI = new ReceptionistLoginGUI();
            }
        });
        ExpertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                ExpertGUI expertGUI = new ExpertGUI();
            }
        });
    }
public static void main(String[] args){
    Expert nde = new Expert(0, 784647, "nellore", "John Daniel", " Botany", "Fungal pathogens");
    Receptionist.addExp(nde);
    Expert nd = new Expert(1, 8979, "nlr", "Emilia clarke", "Agriculuture", "Viral pathogens");
    Receptionist.addExp(nd);
    nd = new Expert(2, 76897656, "nlr", "David Warner", " Plant Science",  "Bacterial Diseases");
    Receptionist.addExp(nd);
   
    //Receptionist r = new Receptionist();
   
    /*r.setRT(0);*/
    Farmer f0 = new Farmer(0, "", 0, "", "", "");
    for(int j=0;j<500;j++){
        Receptionist.fdb.addData(f0, j);
        }
   /*  Farmer f = new Farmer(0, "nubghll", 87989, "ghdcefc", "Viral pathogens", "yjbb");
        r.addFramerData(f);
        System.out.println(r.getSolution(0));*/
    FarmerExpertManagementSystemGUI MainGUI = new FarmerExpertManagementSystemGUI();
    System.out.println("out of FEMSGUI");
    //System.out.println(r.getSolution(0));
}

}