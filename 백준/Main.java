package 백준;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int n3 = n;
        int count = 1;
        while(true){
            int a = n % 10;
            int b = n / 10;
            int n2 =(a * 10)+ (((b + a) % 10));
            n = n2;
            if(n3 == n){
                break;
            }

                count++;
        }
        System.out.println(count);
    }
}
