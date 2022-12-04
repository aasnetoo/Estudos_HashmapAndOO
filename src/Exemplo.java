import java.util.*;

public class Exemplo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("String");
        String s = scan.nextLine();

        Map<Character,Integer> b = new HashMap<>();
        for (Character c: s.toCharArray()) {
            b.put(c,b.getOrDefault(c,0)+1);
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(b.entrySet());
        list.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));
        List<String> teste1 = new ArrayList<>();
        list.forEach((c)->
        {
            for (int i = 0; i < c.getValue(); i++) {
              teste1.add(String.valueOf((c.getKey())));
            }
        });
        StringBuilder sb = new StringBuilder();
        for (String value : teste1) {
            sb.append(value);
        }
        String res = sb.toString();
        System.out.println(res);


        

    }

}
