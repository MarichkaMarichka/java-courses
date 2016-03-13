package ua.lesson.lessons.clinic;

import ua.lesson.lessons.calculator.Calculator;
import ua.lesson.lessons.io.Input;
import ua.lesson.lessons.io.Output;

/**
 * Created by Marichka on 02.03.2016.
 */
public class Active {
    private final Output output;
    private final Input input;
    private final Clinic clinic;
    Active(Output output, Clinic clinic, Input input){
        this.output = output;
        this.clinic = clinic;
        this.input = input;
    }
    public void activeRegistr() {
        clinic.initClinic();
        boolean active = true;
        while(active) {
            output.println("\nENTER THE NUMBER OF OPERATION: ");
            output.println("[1] - LIST;                         [6] - DELETE PET BY PET NAME;"+
                           "\n[2] - ADD CLIENT;                   [7] - CHANGE CLIENT NAME;"+
                           "\n[3] - SEARCH BY CLIENT NAME;        [8] - CHANGE PET NAME;" +
                           "\n[4] - SEARCH BY PET NAME;           [9] - QUIT."+
                           "\n[5] - DELETE CLIENT BY CLIENT NAME; ");
            try {
                int number = Integer.valueOf(input.next().trim());
                switch (number) {
                    case 1:
                        output.println("List: ");
                        writeList();
                        break;
                    case 2:
                        int index = clinic.lookForFree();
                        output.println("Registration ");
                        clinic.addClient(index);
                        output.println("List ");
                        writeList();
                        break;
                    case 3:
                        try {
                            Client cl = clinic.searchByClientName(input.ask("Enter client name for searching:"));
                            this.write(cl);
                        } catch (NullPointerException e) {
                            output.println("Has no client with the same name!");
                        }
                        break;
                    case 4:
                        try {
                            Client cl = clinic.searchByPetName(input.ask("Enter pet name for searching:"));
                            this.write(cl);
                        } catch (NullPointerException e) {
                            output.println("Has no pet with the same name!");
                        }
                        break;
                    case 5:
                        clinic.removeClient(input.ask("Enter client name for deleting:"));
                        output.println("List: ");
                        writeList();
                        break;
                    case 6:
                        clinic.removePet(input.ask("Enter pet name for deleting:"));
                        output.println("List: ");
                        writeList();
                        break;
                    case 7:
                        try {
                            clinic.changeClientName(input.ask("Enter name new client:"), Integer.valueOf(input.ask("Enter index of client:")));
                            output.println("List: ");
                            writeList();
                        }catch (NullPointerException e){
                            output.println("Has no client with the same index");
                        }
                        break;
                    case 8:
                        try {
                            clinic.changePetName(input.ask("Enter name new pet:"), Integer.valueOf(input.ask("Enter index of client:")));
                            output.println("List: ");
                            writeList();
                        }catch (NullPointerException e){
                            output.println("Has no client with the same index");
                        }
                        break;
                    case 9:
                        active = false;
                        break;
                    default:
                        output.println("Enered incorrect data!");
                }
            } catch (NumberFormatException e) {
                output.println("Input number!");
            }
        }
    }
    public void write(Client cl){
        output.println("ClientName :"+ cl.getClientName());
        output.println("PetName :"+ cl.getPetName());
        output.println("PetKind :"+ cl.getPetKind());
    }
    public void writeList(){
        int len = clinic.lookForFree();
        int i = 0;
        Client c;
        while(i < len){
            c = clinic.clients[i];
            output.println(c.getClientName()+"  "+c.getPetName()+"  "+c.getPetKind());
            i++;
        }
    }

}
