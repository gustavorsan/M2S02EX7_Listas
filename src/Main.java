import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("kirk", "spock", "scott", "mccoy", "sulu");

        //iterando da forma clássica
        System.out.println("Iterando da forma clássica:");
        for(int i = 0; i < nomes.size(); i++ ){
            System.out.println(nomes.get(i));
        }
        //iterando for each
        System.out.println("Iterando utilizando for each:");
        for(String nome : nomes){
            System.out.println(nome);
        }
        System.out.println("Iterando utilizando foreach:");
        nomes.forEach(nome -> System.out.println(nome));

        //iterando com while
        int i = 0;
        System.out.println("Iterando utilizando while:");
        while (i < nomes.size()){
            System.out.println(nomes.get(i));
            i++;
        }

    }
}