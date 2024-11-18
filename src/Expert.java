public class Expert {
    int Id;
    String Specialization;
    String Dept;
    String Name;
    String Town;
    long Phone;
    int passcode=0;
    String Cases = "you have no Cases yet!!";
    Expert(int Id,long Phone,String Town,String Name,String Dept,String Specialization){
        this.Id = Id;
        this.Name = Name;
        this.Phone = Phone;
        this.Dept = Dept;
        this.Town = Town;
        this.Specialization = Specialization;
    }
    String getCases(){
        return this.Cases;
    }
    void setpasscode(int a){
        this.passcode=a;
    }
    void setCases(String s){
        this.Cases = s;
    }
    int getId(){
        return this.Id;
    }
    String getName()
    {
        return this.Name;
    }
    String getDept(){
        return this.Dept;
    }
    String getSpecialization(){
        return this.Specialization;
    }
    long getPhone(){
        return this.Phone;
    }
    String getTown(){
        return this.Town;
    }
    void setSpecialization(String Specialization) {
        this.Specialization = Specialization;
    }
    void setName(String  Name){
        this.Name = Name;
    }
    void setTown(String Town){
        this.Town = Town;
    }
    void setDept(String Dept){
        this.Dept = Dept;
    }
    void setPhone(long Phone){
        this.Phone = Phone;
    }
    void setId(int Id){
        this.Id = Id;
    }
}
