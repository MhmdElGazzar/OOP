package inhertance2;

import java.util.List;

public class Solution1 {
    List<Employee> empList;
    List<Manager> mgrList;

    //schema is much better
    //some logical entities are written in code
    //quite easy to understand
    //min details in solution
    //----------------------------------------------------
    //memory (size complexity) = e * 3 + m * 4
    // variables & methods are more optimized now
    //-------------------------
    // code performance (time complexity) = number of operations applicable * n emps +number of operations applicable * m mgrs  (process)
    //code runs on eligible entities only
    // given I have 0 mgrs , I won't loop
    //better performance


    public void main (String [] args )
    {
        while(true) {
            Employee emp = new Employee();
            //correct lingual mistakes
            emp.Name= "ahmed";
            emp.process();
            Manager mgr = new Manager();
            mgr.Name= "ahmed";
            mgr.process();
            Contractor c= new Contractor();
            c.salary = 23; //invalid
            c.saveInDB();  //invalid
            c.process(); //invalid operation
            //this is due to the wrong abstraction
            // to fix it have 2 options
            // make a separate contractor class, but will suffer from inconsistancy and duplication
            // make a new class with a name of Person, Human , Individual to have name and age
            //inhert from it in employee and contractor
            // code will always evolve while you are working on it  as per project needs
        }
    }

}
