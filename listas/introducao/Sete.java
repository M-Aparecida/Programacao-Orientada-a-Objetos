package listas.introducao;

import java.util.Scanner;

public class Sete {
    public static void main(String[] args) {
        int[] nums = new int[3];
        int maior = 0;
        Scanner ent = new Scanner(System.in);
        for(int i = 0; i <3 ; i++){
            System.out.print("Digite n" + (i + 1) + ": ");
            nums[i] = ent.nextInt();
        }

        for(int i = 1; i < 3 ; i++){
            if(nums[i] > nums[maior]){
                maior = i;
            }
        }

        System.out.println("o maior eh : " + nums[maior]);

        ent.close();
    }
}
