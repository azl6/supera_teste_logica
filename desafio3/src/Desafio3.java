import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {

        //input
        Scanner sc = new Scanner(System.in);

        int arraySize = sc.nextInt(), i, j, res=0;
        int targetValue = sc.nextInt();

        int[] array = new int[arraySize];

        //colocando os valores no array
        for(i=0; i<arraySize; i++){
            array[i] = sc.nextInt();
        }

        //buscando valor alvo resultante de subtrações
        for(i=arraySize-1; i>0; i--){
            for(j=arraySize-1; j>=0; j--){
                if(array[i] - array[j] == targetValue)
                    res++;
            }
        }

        //printando resultado
        System.out.println(res);
    }
}