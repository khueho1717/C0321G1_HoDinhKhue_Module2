package bai11_java_collection_framework.bai_tap.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountWordAppear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào môt chuỗi");
        String string = scanner.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            char key = string.charAt(i);
            if (key!=' '){
                if (map.containsKey(key)) {
                    int cnt = map.get(key);
                    map.put(key, ++cnt);
                } else {
                    map.put(key, 1);
                }
            }
        }
        System.out.println(map);
    }
}
