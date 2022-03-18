import java.util.Scanner;
public class Equilibrium {
    /* Nour Hany Abdallah 19p4089 */
    /* CodeForces Problem 69A. Young Physicist: https://codeforces.com/problemset/problem/69/A */

    public static int n;
    public static void main(String[] args) {

        int x, y, z;
        int sumOfxCoord = 0, sumOfyCoord = 0, sumOfzCoord = 0;

        System.out.println("Enter the number of forces affecting the idle body.");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        if (n<0||n>100)
            System.out.println("Please enter a valid number of forces from 1 to 100. ");

        System.out.println("Enter the force vector in the form x y z.");

        while (n-->=1){
            x = input.nextInt();
            y = input.nextInt();
            z = input.nextInt();
            sumOfxCoord = addCoordinates(sumOfxCoord, x);
            sumOfyCoord = addCoordinates(sumOfyCoord, y);
            sumOfzCoord = addCoordinates(sumOfzCoord, z);

        }

        if (sumOfxCoord == 0 && sumOfyCoord == 0 && sumOfzCoord == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static int addCoordinates(int oldValue, int newValue){
        int sum = oldValue + newValue;
        return sum;
    }


}
