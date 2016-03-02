package ua.lesson.lessons.clinic;

import org.junit.Test;
import ua.lesson.lessons.clinic.Client;
import ua.lesson.lessons.clinic.Clinic;

import static org.junit.Assert.*;

/**
 * Created by Marichka on 29.02.2016.
 */
public class ClinicTest {

    @Test
    public void testLookForFree() throws Exception {
        Clinic clinic  = new Clinic();
        int res = clinic.lookForFree();
        assertEquals(res,0);
    }
    @Test
    public void testSearchByClientName() throws Exception {
        Clinic clinic  = new Clinic();
        Client client = new Client("cName","pName","pKind");
        clinic.clients[0] = client;
        assertNotNull(clinic.searchByClientName("cName"));
    }
    @Test
    public void testSearchByPetName() throws Exception {
        Clinic clinic  = new Clinic();
        Client client = new Client("cName","pName","pKind");
        clinic.clients[0] = client;
        assertNotNull(clinic.searchByPetName("pName"));
    }
    @Test
    public void testChangeClientName() throws Exception {
        Clinic clinic  = new Clinic();
        Client client = new Client("cName","pName","pKind");
        clinic.clients[0] = client;
        clinic.changeClientName("newName",0);
        assertEquals(clinic.clients[0].getClientName(),"newName");
    }
    @Test
    public void testChangePetName() throws Exception {
        Clinic clinic  = new Clinic();
        Client client = new Client("cName","pName","pKind");
        clinic.clients[0] = client;
        clinic.changePetName("newName",0);
        assertEquals(clinic.clients[0].getPetName(),"newName");
    }
    @Test
    public void testRemoveClient() throws Exception {
        Clinic clinic  = new Clinic();
        Client client = new Client("cName","pName","pKind");
        clinic.clients[0] = client;
        clinic.removeClient("cName");
        assertNull(clinic.clients[0]);
    }
    @Test
    public void testRemovePet() throws Exception {
        Clinic clinic  = new Clinic();
        Client client = new Client("cName","pName","pKind");
        clinic.clients[0] = client;
        clinic.removePet("pName");
        assertNull(clinic.clients[0].getPetName());
    }
}