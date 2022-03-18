import java.util.Scanner;
public class Watermelon {
    /* Nour Hany Abdallah 19p4089 */
    /* CodeForces Problem 4A. Watermelon: https://codeforces.com/problemset/problem/4/A */

    public static void main(String[] args){

        System.out.println("Enter the weight of the watermelon in kilos: ");
        Scanner input = new Scanner(System.in);
        int w = input.nextInt();

        if (isEven(w))
                System.out.println("YES");
            else
                System.out.println("NO");
    }

    public static boolean isEven(int w){
        if (w >2){
            if(w %2 == 0)
                return true;
            else
                return false;
        }
        else
            return false;
    }
}
