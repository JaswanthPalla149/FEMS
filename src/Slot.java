public class Slot {
    static Farmer f0 = new Farmer(0, " ", 0, " ", " ", " ");
    Receptionist r = new Receptionist();
    public Slot(){
        
    }
     static int alpha =0;
    public void BookSlots(){
        System.out.println("in booking of slots");
        int k=0;
        Farmer[] Slots = new Farmer[500];
        for(int j=0;j<500;j++){
            Slots[j]=f0;
        }
       
        System.out.println("getting in book slots");
       
       
        while(r.getFarmeData(alpha).getPhone()!=0){
            if(r.getFarmeData(alpha).getRT()==0){
                /*long z = r.getFarmeData(alpha).getPhone();
                System.out.println(z);
                int n = r.getFarmeData(alpha).getRT();
                System.out.println("RT :" + n);*/
            Slots[k] = r.getFarmeData(alpha);
            System.out.println(r.getFarmeData(alpha).getName());
            System.out.println("k :"+ k);
            k++;
            r.setRT(alpha);
           
            }
            else{

            }
            System.out.println("alpha :"+ alpha);
            alpha++;
        }
        System.out.println(alpha);
        //System.out.println(Slots[0].getPhone());
        for(int j=0;j<500;j++){
            if(Slots[j].getPhone()!=0){
            for(int i=0; i<50; i++){
                String str1 = Slots[j].getProblem();
                String str2 = r.getExpertData(i).getSpecialization();
                if(str1.equals(str2)){
                    int n = Slots[j].getId();
                    String s = "you have to meet Mr."+r.getExpertData(i).getName()+" his Phone no:"+r.getExpertData(i).getPhone();
                    r.setSolution(s,n);
                    System.out.println(r.getSolution(n));
                    String robb =  r.getExpertData(i).getCases();
                    String jon = "you have no Cases yet!!";
                    String Case = "You have a case of mr."+Slots[j].getName()+"with problem"+Slots[j].getProblem()+"for crop"+Slots[j].getCrop();
                    if(robb.equals(jon)){
                        r.setCase(Case, i);
                    }
                    else{
                        /*String ned = robb + " " + jon;
                        r.setCase(ned, i);*/
                        r.addCase(Case, i);
                    }
                    System.out.println(r.getExpertData(i).getCases());
                    System.out.println("message sent to farmer "+Slots[j].getName()+"and expert "+r.getExpertData(i).getName());
                    //r.sendmessage(j,i);
                    Slots[j]=f0;
                    break;
                }
                else{
                }
            }
        }
        else{
            break;
        }
        }
        /*Slots[0] = r.getFarmeData(0);
        r.sendmessage(0,0 );*/
    }
    public static void main(String[] args) {
       /*  Receptionist r = new Receptionist();
    Farmer f = new Farmer(9, "nubghll", 87989, "ghdcefc", "Viral pathogens", "yjbb");
    r.addFramerData(f);
    Slot m = new Slot();
    m.BookSlots();*/
    }
}