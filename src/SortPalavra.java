import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class SortPalavra {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" ");
        String s = scan.nextLine();
        List<String> b = new ArrayList<String>();
        ArrayList<Palavra> palavras = new ArrayList<Palavra>();
        for (Character c: s.toCharArray()) {
            b.add(String.valueOf(c));
        }
        for (int i = 0; i < b.size(); i++) {
            int j = 0;
            String l = "";
            String letra = b.get(i);
            for (String value : b) {
                if (letra.equals(value)) {
                    j++;
                    l = letra;
                }
            }
            Palavra pala = new Palavra();
            pala.setLetra(l);
            pala.setId(j);
            palavras.add(pala);
            }

        removeDuplicates(palavras);

//        List<Palavra> newList = palavras.stream()
//                .distinct()
//                .collect(Collectors.toList());
//        System.out.println(newList);

        StringBuilder sb = new StringBuilder();
        for (Palavra value : palavras) {
            sb.append(String.valueOf(value.getLetra()).repeat(Math.max(0, value.getId())));

        }
        String res = sb.toString();
        System.out.println(res);
        
    }

    public static <Palavra> ArrayList<Palavra> removeDuplicates(ArrayList<Palavra> list )
    {

        Set<Palavra> set = new LinkedHashSet<>();
        set.addAll(list);
        list.clear();
        list.addAll(set);
        return list;
    }
}
