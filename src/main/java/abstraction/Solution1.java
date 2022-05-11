package abstraction;

import java.util.List;

public class Solution1 {
    List<Employee> empList;
    List<Manager> mgrList;
    //schema is better
    //some logical entities are written in code
    //quite easy to understand
    //less details in solution
    //----------------------------------------------------
    //memory (size complexity) = e * 3 + m * 4
    // variables are more optimized now
    //-------------------------
    // code performance (time complexity) = number of operations applicable * n emps +number of operations applicable * m mgrs  (process)
    //code runs on eligible entities only
    // given I have 0 mgrs , I won't loop
    //better performance


    public void main (String [] args )
    {
        while(true) {
            getInputData();
            process();
            saveInDB();
        }
    }
    private void saveInDB() {
        for (Employee e: empList)
        { //I DON't have to hold the relationship of data an index in my mind
            // data corruption is not easy
            //do some input
        }
        for (Manager m: mgrList)
        { //I DON't have to hold the relationship of data an index in my mind
            // data corruption is not easy
            //do some input
        }
    }

    private void getInputData() {
        for (Employee e: empList)
        { //I DON't have to hold the relationship of data an index in my mind
            // data corruption is not easy
            //do some input
        }
        for (Manager m: mgrList)
        { //I DON't have to hold the relationship of data an index in my mind
            // data corruption is not easy
            //do some input
        }
    }
    private void process() {
        //don't need to check type, different types= different classes
        for (Employee e: empList)
        { e.totalSalary=e.salary;
        }
        for (Manager m: mgrList)
        { m.totalSalary=m.salary*(1+m.bonus);

        }}
}
