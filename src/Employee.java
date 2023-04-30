public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int sallary;
    public Employee(int id, String firstName, String lastName, int sallary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sallary = sallary;
    }
    public int getId(){
        return this.id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getName(){
        return this.firstName+" "+this.lastName;
    }
    public int getSallary() {
        return sallary;
    }
    public void setSallary(int value){
        this.sallary = value;
    }
    public int getAnnualSallary(){
        return this.sallary * 12;
    }
    public void raiseSallary(int percent){
        int increment = this.sallary * percent/100;
        this.sallary += increment;
    }
    public String toString(){
        return "Employee[id = "+this.getId()+" ,name = "+this.getName()+" , sallary = "+this.getSallary()+" ]";
    }
}
