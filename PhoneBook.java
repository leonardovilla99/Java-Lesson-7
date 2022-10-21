import java.util.ArrayList;

public class PhoneBook {
    private ArrayList<PhoneBookEntry>phoneBook;

    // Constractor
    public PhoneBook(){
        phoneBook = new ArrayList<>();
    }

    // Other
    public void addNewPhoneBookEntry(PhoneBookEntry pbEntry){
        phoneBook.add(pbEntry);
    }
    public PhoneBookEntry getPhoneBookEntry(int index){
        if(index >=0 && index < phoneBook.size()){
            return phoneBook.get(index);
        }else{
            return null;
        }
        
    }
    public int getPhoneBookSize(){
        return phoneBook.size();
    }
    public void removePhoneBookEntry(String name){
        if(phoneBook.isEmpty()){
            System.out.println("There are no entries in this phone book");
        }else{
            for(int i=0;i<phoneBook.size(); i++){
                if(phoneBook.get(i).getName().equalsIgnoreCase(name)){
                    phoneBook.remove(i);
                    return;
                }
            }
        }
        System.out.println("Phone book entry not found");
    }
}

