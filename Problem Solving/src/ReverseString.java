import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println("Enter String: ");
        Scanner sc = new Scanner(System.in);
        String l = sc.nextLine();
        char[] arr = l.toCharArray();
        char[] rev = new char[l.length()];
        for (int i = arr.length-1; i >= 0; i--){
           rev[arr.length-1 - i] = arr[i];
        }

        System.out.println(rev);
    }

}
