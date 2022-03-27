package turlo.lesson8;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Antonov", "25348");
        phoneBook.add("Petrov", "23694");
        phoneBook.add("Sidorov", "25903");
        phoneBook.add("Ivanov", "21600");
        phoneBook.add("Surikov", "21519");
        phoneBook.add("Ivanov", "26254");
        phoneBook.add("Surikov", "25119");
        phoneBook.add("Ivanov", "24812");
        phoneBook.add("Popov", "21055");

        System.out.println("PhoneBook:");
        System.out.println("Antonov: " + phoneBook.get("Antonov"));
        System.out.println("Petrov: " + phoneBook.get("Petrov"));
        System.out.println("Sidorov: " + phoneBook.get("Sidorov"));
        System.out.println("Ivanov: " + phoneBook.get("Ivanov"));
        System.out.println("Surikov: " + phoneBook.get("Surikov"));
        System.out.println("Popov: " + phoneBook.get("Popov"));
    }

    public void add(String lastname, String phone_number) {
        if (namePhone_hm.containsKey(lastname)) {
            phone_number_list = namePhone_hm.get(lastname);
            phone_number_list.add(phone_number);
            namePhone_hm.put(lastname, phone_number_list);
        } else {
            phone_number_list = new ArrayList<>();
            phone_number_list.add(phone_number);
            namePhone_hm.put(lastname, phone_number_list);
        }
    }

    private Map<String, List<String>> namePhone_hm = new HashMap<>();
    private List<String> phone_number_list;

    public List<String> get(String lastname) {
        return namePhone_hm.get(lastname);
    }
}









