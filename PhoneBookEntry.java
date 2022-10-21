public class PhoneBookEntry {
    private String name,phoneNumber;

    // Constractors
    public PhoneBookEntry(String name,String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    // Accessors
    public String getName(){
        return name;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    // Mutators
    public void setName(String name){
        this.name = name;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    // Other
    public String toString(){
        String msg = name+ " Phone number: " + phoneNumber;
        return msg;
    }
}
