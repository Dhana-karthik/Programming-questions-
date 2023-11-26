import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] alphano = {2,3 ,5 ,7 ,11 ,13 ,17 ,19 ,23 ,29 ,31 ,37 ,41,43 ,47 ,53 ,59,61,67,71,73 ,79 ,83,89,97 ,101 ,103};
        String[] str = {"kill","sell","lels","klil","lisl","sill","llis", " ","  "};
        Map<Integer, ArrayList<String>> all = new HashMap<>();
        int prod=0,k=0;
        all.put(0,new ArrayList<>());

        for(int i =0;i<=str.length-1;i++) {

            String singleword = str[i];
            if (!(singleword.isBlank())) {
                singleword = singleword.toLowerCase();
                prod = 0;
                k = 0;
                while (k < singleword.length()) {
                    prod = prod + alphano[singleword.charAt(k) - 'a'];
                    k++;
                }
                if (!(all.containsKey(prod))) all.put(prod, new ArrayList<>());
                if (all.containsKey(prod)) {
                    all.get(prod).add(singleword);
                }
            }else{
                all.get(0).add("");
            }



        }System.out.println(all.values());

    }
}
