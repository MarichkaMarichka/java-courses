import java.util.Scanner;
/**
 * Implements clinic for animals. Includes clients register.
 * @author Marichka
 * @since 08.02.16
 */
public class Clinic {
	final private Client []clients = new Client[100];
	
	public static void main(String[] args)  throws Exception {
		Clinic clinic = new Clinic();
		int index = clinic.lookForFree();
		
		clinic.addClient(clinic,index);
		try{
			clinic.searchByClientName("h");
		}catch(Exception e){
			System.out.println("Customer with the same name is not in the registry!");
		}
		clinic.changeClientName("qwerty",index);
		
		System.out.println(clinic.clients[index].getClientName());
		clinic.removeClient("h");
	}
	
	/**
	 * Looks for the index of massive where element is null 
	 * @return index of massive
	 * @throws Exception if massive is full(Clinic is full)
	 */
	public int lookForFree() throws Exception {
		int index = 0;
		for(int i = 0; i<clients.length; i++){
			if(clients[i] == null){
				index = i;
				break;
			}
			else throw new Exception();
		}
		return index;
	}
	/**
	 * Add client to register of Clinic
	 * @param clinic - reference to the object Clinic
	 * @param index - number client in register of Clinic
	 */
	public void addClient(Clinic clinic, int index ){
		String cName = clinic.readClientDate("Enter Your name : ");
		String pName = clinic.readClientDate("Enter name of Your pet : ");
		String pKind = clinic.readClientDate("Enter kind of Your pet : ");
		Client client = new Client(cName,pName,pKind);
		clients[index]=client;
	}
	/**
	 * Search client by name
	 * @param name - client name 
	 * @return data about client of Clinic
	 */
	public Client searchByClientName(String name) throws Exception {
		Client client = null;
		for(int i = 0; i < clients.length; i++){
			if(name.equals(clients[i].getClientName())){
				client = clients[i];
				break;
			}
			/** if person is not registred or client entered incorrectly name */
			else throw new Exception();
		}
		return client;
	}
	/**
	 * Search client by name
	 * @param name - client name 
	 * @return data about client of Clinic
	 */
	public Client searchByPetName(String name) throws Exception {
		Client client = null;
		for(int i = 0; i < clients.length; i++){
			if(clients[i].getPetName() == name){
				client = clients[i];
				break;
			}
			/** if person is not registred or client entered incorrectly name pet */
			else throw new Exception("");
		}
		return client;
	}
	
	
	/**
	 * @param newName - new client name in register of Clinic
	 * @param index - number of client in register of Clinic
	 */
	public void changeClientName(String newName, int index){
		clients[index].setClientName(newName);
	}
	
	
	/**
	 * @param newName - new pet name in register of Clinic
	 * @param index - number of client in register of Clinic
	 */
	public void changePetName(String newName, int index){
		clients[index].setPetName(newName);
	}
	
	
	/**
	 * Reads date about client for register to Clinic
	 * @param output - questions for the client to determine the input
	 * @return date - result of input
	 */
	public String readClientDate(String output){
		Scanner reader = new Scanner(System.in);
			System.out.println(output);
			String date = reader.next();
			return date;	
	}
	/**
	 * Remove client from register
	 * @param name of the client 
	 */
	public void removeClient(String name){
		for(int i = 0; i < clients.length; i++){
			if(clients[i]== null){ continue;}
			if(name.equals( clients[i].getClientName())){
				clients[i]= null;
				break;
			}
		}
	}
	/**
	 * remove pet from register
	 * @param name of pet
	 */
	public void removePet(String name){
		for(int i = 0; i<clients.length; i++){
			if(clients[i].getPetName() == name){
				clients[i].setPetName(null);
			}
		}
	}

}
