package inhertance;

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
        }
    }

}
