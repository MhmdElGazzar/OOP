package inhertance2;

public class Contractor extends Employee{


    void saveInDB() {
        //we dont save contractors in our data base
    }

    @Override
    void process() {
        //we don't have salary info for contractors
    }
}
