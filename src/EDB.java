public class EDB {
    static Expert e0 = new Expert(0, 0, " ", " ", " ", " ");
    static Expert[] Experts;
    EDB(int size){
        Experts = new Expert[size];
        for(int i=0;i<50;i++){
            Experts[i]=e0;
        }
    }
    void addData(Expert e,int index){
        Experts[index] = e;
    }
    void deleteData(int index){
        Experts[index] = e0;
    }
    Expert getData(int index){
        return Experts[index];
    }
    void setCase(String s,int i){
        Experts[i].Cases=s;
    }
    void addCase(String s,int i){
        String m ;
        m = Experts[i].Cases;
        m = m +" " + s;
        this.setCase(m, i); 
    }
    public static void main(String[] args) {
    }
}