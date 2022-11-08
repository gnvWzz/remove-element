import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N;
        int[] array;

        do {
            System.out.print("Enter a size: ");
            N = sc.nextInt();
            if (N > 20)
                System.out.println("Size should not exceed 20");
        } while (N > 20);

        array = new int[N];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + " : ");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.println("Array now:");
        for (int a = 0; a < array.length; a++) {
            System.out.print(array[a] + " ");
        }
        System.out.println();

        System.out.println("Remove an element in array");
        System.out.println("Lets check if the element exists or not");
        System.out.println("Enter the number you wanna check:");
        int X = sc.nextInt();
        int j = 0;
        while (j < array.length) {
            if (X == array[j]) {
                System.out.println(X + " exists at position " + j);
                System.out.println("Lets remove the element:");
                for (int k = j; k < array.length - 1; k++) {
                    array[k] = 0;
                    array[k] = array[k+1];
                }
                array[array.length - 1] = 0;
            }
            j++;
        }

        System.out.println("Array after removing element: ");
        for (int a = 0; a < array.length; a++) {
            System.out.print(array[a] + " ");
        }
    }
}