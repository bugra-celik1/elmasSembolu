import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int number;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        number = inp.nextInt();

        for (int i =1;i<=number;i++){
            for(int j =1;j<=(number-i); j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i)-1; k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for(int b =number;b >= 1;b--){
            for(int c = 1;c<=(number-b);c++ ){
                System.out.print(" ");
            }
            for(int d =1; d<=(2*b)-1;d++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}