import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class SortPalavra {

    public static void main(String[] args) {
        Palavra palavra = new Palavra();

        Scanner scan = new Scanner(System.in);
        System.out.println(" ");
        String s = scan.nextLine();
        List<String> b = new ArrayList<String>();
        ArrayList<Palavra> palavras = new ArrayList<Palavra>();
        for (Character c: s.toCharArray()) {
            b.add(String.valueOf(c));
        }
        System.out.println(b);

        int z = 0;

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

//            for (Palavra p : palavras ) {
//                if (!p.getLetra().equals(l) || z==0){
//                    Palavra pala = new Palavra();
//                    pala.setLetra(l);
//                    pala.setId(j);
//                    palavras.add(pala);
//                }
//            }
            z++;

        //}

      //  removeDuplicates(palavras);

        List<Palavra> newList = palavras.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(newList);



        for (Palavra p:
             newList) {
            System.out.println(p.getLetra() + " + " +p.getId());

        }

        StringBuilder sb = new StringBuilder();
        for (Palavra value : newList) {
            sb.append(String.valueOf(value.getLetra()).repeat(Math.max(0, value.getId())));

        }
        String res = sb.toString();
        System.out.println(res);







    }

    public static <Palavra> ArrayList<Palavra> removeDuplicates(ArrayList<Palavra> list )
    {

        // Create a new LinkedHashSet
        Set<Palavra> set = new LinkedHashSet<>();

        // Add the elements to set
        set.addAll(list);

        // Clear the list
        list.clear();

        // add the elements of set
        // with no duplicates to the list
        list.addAll(set);

        // return the list
        return list;
    }
}
