package inhertance;

public class Employee {
    String Name;
    int age;
    float salary;
    float totalSalary;
     void saveInDB() {

    }

     void getInputData() {

    }
     void process() {
        //don't need to check type, different types= different classes

      this.totalSalary=this.salary;
     }
}
