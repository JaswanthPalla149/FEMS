public class CFDB {
    static Farmer f0 = new Farmer(0, " ", 0, " ", " ", " ");
    static Farmer[] Farmers;
    //Farmer[] Farmers;
    CFDB(int size){
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
}
