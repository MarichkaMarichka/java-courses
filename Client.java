/**
 * Contains information about name client,name and kind client's pet 
 * @author Marichka
 * @since 08.02.16
 */
public class Client {
	private String clientName;
	private String petKind;
	private String petName;
	/**
	 * 
	 * @param cName - client name 
	 * @param pName - pet name
	 * @param pKind - kind of pet
	 */
	Client(String cName,String pName,String pKind){
		this.clientName = cName;
		this.petName = pName;
		this.petKind = pKind;
	}
	/**
	 * @return client name
	 */
	public String getClientName(){
		return this.clientName;
	}
	/**
	 * @param name to change the name of the client in the list clinics
	 */
	public void setClientName(String name){
		this.clientName = name;
	}
	/**
	 * @return kind of pet 
	 */
	public String getPetKind(){
		return this.petKind;
	}
	/**
	 * @param kind to change the kind of pet of the client in the list clinics
	 */
	public void setPetKind(String kind){
		this.petKind = kind;
	}
	/**
	 * @return name pet 
	 */
	public String getPetName(){
		return this.petName;
	}
	/**
	 * @param name to change name of the pet in the list clinics
	 */
	public void setPetName(String name){
		this.petName = name;
	}
}
