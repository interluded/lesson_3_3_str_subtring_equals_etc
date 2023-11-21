// enter name
// marcus
// kongjika

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter ur name: ");
        String name = scan.nextLine();
        int space = (name.indexOf(" "));
        int length = (name.length());
        System.out.println(name.substring(0, space));
        System.out.println(name.substring(space, length));
    }
}