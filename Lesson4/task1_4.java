import java.util.*;

public class task1_4 {
    public static void main(String[] args){
        List<String> words = Arrays.asList(
                "yellow", "green", "red", "purple", "white",
                "purple", "black", "gray", "braun", "green",
                "light", "white", "orange", "pink", "blue",
                "dark"
        );

        Set<String> unique = new HashSet<String>(words);

        System.out.println("�������������� ������");
        System.out.println(words.toString());
        System.out.println("���������� �����");
        System.out.println(unique.toString());
        System.out.println("������� ������������� ����");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}
