package oldparadigm;

public class Solution {
    //schema is scattered
    //all logical info are inside my head
    //it takes effort to write and remember what this code do
    //horrible details
    //----------------------------------------------------
    //memory (size complexity) = t (total) * 5
    //-------------------------
    // code performance (time complexity) = number of operations *( n emps + m mgrs) (process)
    //code runs for all even if only small number of records who gets the update
    // given I have 0 mgrs , I will run a full loop
    //bad performance


    String [] names;
    int [] ages;
    float[] salary;
    Boolean[] isManager;
    float[] totalSalary;
    float bonus= .25f;

    public void main (String [] args )
    {

        while(true) {
            getInputData();
            process();
            saveInDB();
        }
    }

    private void saveInDB() {
        for (int i =0; i< 10 ;i++)
        {
            //save in db
        }
    }

    private void getInputData() {
        //I have to hold the relationship of data an index in my mind
        // data corruption is very easy
         for (int i =0; i< 10 ;i++)
         {
             //do some input
         }
    }
    private void process() {
        //I have to store types in variables

        if(isManager[1]==true)
        {
         totalSalary[1]=salary[1]*(1+bonus)    ;
        }
        else
        {
            totalSalary[1]=salary[1];
        }

    }

}
