package ua.lesson.lessons.clinic;

import ua.lesson.lessons.calculator.Calculator;
import ua.lesson.lessons.io.Input;
import ua.lesson.lessons.io.Output;

import java.util.Scanner;
/**
 * Implements clinic for animals. Includes clients register.
 * @author Marichka
 * @since 08.02.16
 */
public class   Clinic {
	private final Output output;
	private final Input input;
	Client client;
	Clinic(Output output, Input input){
		this.output = output;
		this.input = input;
	}
	final Client[]clients = new Client[100];
	public void initClinic(){
		client = new Client("Mary","Murchik","cat");
		clients[0] = client;
		client = new Client("Max","Rex","dog");
		clients[1] = client;

	}
	

	/**
	 * Looks for the index of massive where element is null 
	 * @return index of massive
	 * @throws Exception if massive is full(Clinic is full)
	 */
	public int lookForFree()  {
		int index = 0;
		for(int i = 0; i<clients.length; i++){
			if(clients[i] == null){
				index = i;
				break;
			}
		}
		return index;
	}
	/**
	 * Add client to register of Clinic
	 *
	 * @param index - number client in register of Clinic
	 */
	public void addClient( int index ){
		String cName = input.ask("Enter Your name : ");
		String pName = input.ask("Enter name of Your pet : ");
		String pKind = input.ask("Enter kind of Your pet : ");
		Client client = new Client(cName,pName,pKind);
		clients[index]=client;
	}
	/**
	 * Search client by name
	 * @param name - client name 
	 * @return data about client of Clinic
	 */
	public Client searchByClientName(String name){
		client = null;
		for(int i = 0; i < clients.length; i++){
			if(name.equals(clients[i].getClientName())){
				client = clients[i];
				break;
			}
		}
		return client;
	}
	/**
	 * Search client by name
	 * @param name - client name 
	 * @return data about client of Clinic
	 */
	public Client searchByPetName(String name) {
		client = null;
		for(int i = 0; i < clients.length; i++){
			if(name.equals(clients[i].getPetName())){
				client = clients[i];
				break;
			}
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
		for(int i = 0; i < clients.length; i++){
			if(clients[i]== null){ continue;}
			if(name.equals( clients[i].getPetName())){
				clients[i].setPetName(null);
			}
		}
	}

}
