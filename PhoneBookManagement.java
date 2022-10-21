public class PhoneBookManagement {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        pb.addNewPhoneBookEntry(new PhoneBookEntry("Carlos", "444-4444"));
        pb.addNewPhoneBookEntry(new PhoneBookEntry("Mary", "333-4444"));
        pb.addNewPhoneBookEntry(new PhoneBookEntry("Brian", "777-7777"));
        pb.addNewPhoneBookEntry(new PhoneBookEntry("Yuri", "999-6666"));
        pb.addNewPhoneBookEntry(new PhoneBookEntry("Sherry", "765-4556"));

        for(int i = 0; i < pb.getPhoneBookSize(); i++){
            System.out.println(pb.getPhoneBookEntry(i));
        }
    }
}
