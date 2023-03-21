package Map;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "123456");

        cookies.remove("email");
        cookies.put("phone", "12345"); // vai substituir a linha 13.

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Email: " + cookies.get("email"));
        System.out.println("Size: " + cookies.size());

        System.out.println();
        System.out.println("ALL COOKIES");
        for (String key: cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}