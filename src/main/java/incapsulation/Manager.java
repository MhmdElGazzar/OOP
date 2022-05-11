package incapsulation;

public class Manager {
    String Name;
    int age;
    float salary;
    float bonus= .25f;
    float totalSalary;
     void saveInDB() {

    }

     void getInputData() {

    }
     void process() {
        //don't need to check type, different types= different classes

        this.totalSalary=this.salary*(1+this.bonus);

        }
}
