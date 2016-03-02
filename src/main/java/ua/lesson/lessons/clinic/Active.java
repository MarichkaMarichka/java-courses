package ua.lesson.lessons.clinic;

import ua.lesson.lessons.calculator.Calculator;
import ua.lesson.lessons.io.Input;
import ua.lesson.lessons.io.Output;

/**
 * Created by Marichka on 02.03.2016.
 */
public class Active {
    private final Output output;
    private final Clinic clinic;
    Active(Output output, Clinic clinic){
        this.output = output;
        this.clinic = clinic;
    }
    public void activeRegistr()  throws Exception {

        int index = clinic.lookForFree();

        clinic.addClient(index);
        try{
            clinic.searchByClientName("h");
        }catch(Exception e){
            output.println("Customer with the same name is not in the registry!");
        }
        clinic.changeClientName("qwerty",index);

        System.out.println(clinic.clients[index].getClientName());
        clinic.removeClient("h");
    }

}
