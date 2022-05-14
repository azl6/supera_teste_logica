import java.util.*;

public class Desafio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //lendo a qtd total de ints
        int qtd = sc.nextInt();

        //criando listas para separar pares de ímpares
        List<Integer> par = new ArrayList<>();
        List<Integer> impar = new ArrayList<>();

        //separando os pares dos ímpares
        for(int i=0; i<qtd; i++){
            int input = sc.nextInt();
            if(input%2 == 0)
                par.add(input);
            else
                impar.add(input);
        }

        //ordenando os elementos
        Collections.sort(par);
        Collections.sort(impar);
        Collections.reverse(impar);

        //printando
        par.forEach(System.out::println);
        impar.forEach(System.out::println);
    }
}