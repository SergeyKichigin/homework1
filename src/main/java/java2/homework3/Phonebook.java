package java2.homework3;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Phonebook {
    private Map<String, String> map = new LinkedHashMap<>();
    private String phone;
    private String surname;

    public Phonebook() {
    }

    public void display() {
        for (Map.Entry<String, String> pam : map.entrySet())
        {
            System.out.println("Surname: " + pam.getValue() + "  Phone: " + pam.getKey());
        }
        System.out.println();
    }

    public void add(String phone, String surname) {
        map.put(phone, surname);
    }

    public void get(String surname) {
        Iterator it = map.entrySet().iterator();
        int k = 0;
        while (it.hasNext()) {
            Map.Entry pam = (Map.Entry)it.next();
            if (pam.getValue() == surname) {
                System.out.println("Surname: " + pam.getValue() + "  Phone: " + pam.getKey());
                k++;
            }
        }
        if (k == 0) { System.out.println("Your search returned no results!"); }
        System.out.println();
    }

}
