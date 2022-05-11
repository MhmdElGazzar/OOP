package inhertance2;

public class Manager extends Employee {
    float bonus= .25f;
     void process() {
        //don't need to check type, different types= different classes

        this.totalSalary=this.salary*(1+this.bonus);

        }
}
