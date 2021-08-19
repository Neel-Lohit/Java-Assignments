public class Student {
    int id,age,yearOfEnrollment;
    String name,gender,engDepartment;
    double perTillDate;

    public Student(int id, String name, int age, String gender, String engDepartment, int yearOfEnrollment, double perTillDate) {
        this.id=id;
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.engDepartment=engDepartment;
        this.yearOfEnrollment=yearOfEnrollment;
        this.perTillDate=perTillDate;
    }
    int getId(){ return this.id;}
    String getName(){ return this.name;}
    int getAge(){ return this.age; }
    String getGender(){ return this.gender; }
    String getEngDepartment(){ return this.engDepartment;}
    int getYearOfEnrollment(){ return this.yearOfEnrollment; }
    double getPerTillDate(){ return this.perTillDate;}
    @Override
    public String toString(){
        return "Id:"+getId()+" Name:"+getName()+" Age:"+getAge()+" Gender:"+getGender()+" engDepartment:"+getEngDepartment()+
                " year of enrollment t:"+getYearOfEnrollment()+" perTillDate:"+getPerTillDate();

    }
}
