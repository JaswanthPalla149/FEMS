import javax.swing.JOptionPane;

class Receptionist {    
    static int i =0;
    static int j=0;
    static int io =0;
    static Farmer f0 = new Farmer(0, "", 0, "", "", "");
    static CFDB cfdb = new CFDB(2500);
    static FDB fdb = new FDB(500);
    static EDB edb = new EDB(50);
    static int index = 0;
    static int Password = 9894;
    static Slot s = new Slot();
        public Receptionist(){
            
        }
        public void setRT(int index){
            fdb.setRT(index);
            System.out.println("setting RT in receptionist");
        }
        public int addFtoCFDB(Farmer f, int p){
            Farmer CF = f;
            CF.setId(j);
            CF.FP = p;
            cfdb.addData(CF, j);
            j++;
            return j-1;
            //JOptionPane.showMessageDialog(null, CF, null, Password);
            
        }
        public static Farmer getFfCFDB(int index){
            return cfdb.getData(index);
        }
        public void setSolution(String s,int i){
            System.out.println("setting solution in "+i);
            fdb.setSolution(s,i);
        }
        public String getSolution(int n){
            System.out.println("getting solution in Receptionist in"+n);
            return fdb.getSolution(n);
        }
        public void addFramerData(Farmer f){
            System.out.println(f.getName()+" data added index : "+i);
            fdb.addData(f,i);
            i++;
        }
        public void deleteFarmerData(int index){
            fdb.deleteData(index);
        }
        public Farmer getFarmeData(int index){
            return fdb.getData(index);
        }
        public static void addExp(Expert e){
          edb.addData(e,io);
          io++;
        }
        public Expert getExpertData(int index){
            return edb.getData(index);
        }
        public void setCase(String s,int i){
            edb.setCase(s, i);
        }
        public void addCase(String s,int i){
            edb.addCase(s,i);
        }
        /*public void sendmessage(int a,int b){
            System.out.println("message sent to "+this.getFarmeData(a).getName() +"and expert "+this.getExpertData(b).getName() +" as :");
            System.out.println(this.getFarmeData(a).getName()+",you can meet"+this.getExpertData(b).getName()+"who has a specialization in"+this.getExpertData(b).getSpecialization()+",contact :"+this.getExpertData(b).getPhone());
        }*/
        public void BookSlots(){
            System.out.println("booking slots");
            s.BookSlots();
        }
        public void DrawSalary(){
        }
        public static void setPassword(int a){
            Password = a;
            System.out.println(Password);
        }
        public static int getLastio(){
            return io+1;
        }
        public static void main(String[] args) {

        }
        
    }