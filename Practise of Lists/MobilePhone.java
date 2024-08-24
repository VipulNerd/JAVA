
import java.util.ArrayList;

class Contact{
   private String name;
   private String phoneNumber;

    public  Contact(String name, String phoneNumber){
         this.name = name;
         this.phoneNumber = phoneNumber;
    }

    public  String getName(){
        return name;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public static Contact createContact(String name, String phoneNumber){
         return new Contact(name, phoneNumber);
    }
}
public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone (String myNumber){
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName()) >= 0){
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean  updateContact(Contact oldContact, Contact newContact){
        int postion = findContact(oldContact);
        if (postion < 0){
            return false;
        }
        myContacts.set(postion, oldContact);
        return true;
    }

    public boolean  removeContact(Contact contact){
        int postion = findContact(contact);
        if (postion >= 0){
            myContacts.remove(postion);
            return  true;
        }
        return false;
    }

    private int findContact(Contact contact){
        return myContacts.indexOf(contact);
    }

    private int findContact(String contactName){
        for(int i = 0; i < myContacts.size(); i++){
            Contact contact = myContacts.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }return -1;
    }
    
    public Contact queryContact(String name){
        int postion = findContact(name);
        if (postion >= 0){
           return myContacts.get(postion);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            System.out.println((i + 1) + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }
}