public class FDB {
    static Farmer f0 = new Farmer(0, " ", 0, " ", " ", " ");
    static Farmer[] Farmers;
    //Farmer[] Farmers;
    FDB(int size){
        Farmers = new Farmer[size];
        for(int i=0;i<500;i++){
            Farmers[i]=f0;
        }
    }
    void addData(Farmer f, int index){
        Farmers[index] = f;
    }
    void deleteData(int index){
        Farmers[index] = f0;
    }
    Farmer getData(int index){
        return Farmers[index];
    }
    void setRT(int i){
        System.out.println("setting RT in fdb");
        Farmers[i].RT =1;
    }
    void setSolution(String s,int index){
        Farmers[index].setSolution(s);
    }
    String getSolution(int index){
        System.out.println("getting solution in fdb in "+index);
        return Farmers[index].getSolution();
    }
    public static void main(String[] args) {
      
    }
}