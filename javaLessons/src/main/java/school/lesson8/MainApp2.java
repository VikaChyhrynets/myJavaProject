package school.lesson8;

public class MainApp2 {
    public static void main(String[] args) {
        Contacts myContacts = new Contacts();
        myContacts.add("Chyhrynets", "+375445994795");
        System.out.println(myContacts.get("Chyhrynets"));
        myContacts.add("Chyhrynets", "+375293326333");
        System.out.println(myContacts.get("Chyhrynets"));
        myContacts.add("Dolgikh", "+375441123456");
        System.out.println(myContacts.get("Dolgikh"));
        myContacts.add("Chyhrynets", "+375445994795");
        System.out.println(myContacts.get("Chyhrynets"));
        myContacts.add("Dolgikh", "+375443457891");
        System.out.println(myContacts.get("Dolgikh"));
    }
}
