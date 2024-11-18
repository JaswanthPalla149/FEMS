public class Farmer {
    int Id;
    String Name, Town, Problem, Crop;
    long Phone;int RT=0;
    int FP=0;
    String sloutionString="Please wait your process is pending";
    Farmer(int Id,String Name,long  Phone,String Town,String Problem,String Crop){
        this.Id = Id;
        this.Name = Name;
        this.Phone = Phone;
        this.Town = Town;
        this.Crop = Crop;
        this.Problem = Problem;
    }
    public void setRT(){
        this.RT = 1;
        System.out.println(this.getName());
    }
    public int getRT(){
       
        return this.RT;
    }
    int getId(){
        return this.Id;
    }
    String getProblem()
    {
        return this.Problem;
    }
    String getCrop(){
        return this.Crop;
    }
    String getName(){
        return this.Name;
    }
    long getPhone(){
        return this.Phone;
    }
    String getTown(){
        return this.Town;
    }
    void setCrop(String crop) {
        this.Crop = crop;
    }
    void setName(String  Name){
        this.Name = Name;
    }
    void setTown(String Town){
        this.Town = Town;
    }
    void setProblem(String Problem){
        this.Problem = Problem;
    }
    void setPhone(long Phone){
        this.Phone = Phone;
    }
    void setId(int Id){
        this.Id = Id;
    }
    void setSolution(String s){
        this.sloutionString = s;
    }
    String getSolution(){
        System.out.println("getting solution in Farmer"+this.Id);
        return this.sloutionString;
    }
    public static void main(String[] args){
       
    }
}
