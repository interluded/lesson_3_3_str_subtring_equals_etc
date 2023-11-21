// enter name
// marcus
// kongjika

import java.util.Scanner;
public class UserID2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter ur name: ");
        String name = scan.nextLine();
        name = name.toLowerCase();
        int x = name.indexOf(" ");
        String middlename = (name.charAt(x + 1) + "");
        int y = name.indexOf(" ", x + 1);
        String lastname = (name.substring(y + 1));
        char firstinital = (name.charAt(0));
        String UserID = (lastname + firstinital + middlename);
        if (UserID.length() > 8){
            System.out.println("Too long");
        }
        else {
            System.out.println(UserID);
        }
    }
        }


