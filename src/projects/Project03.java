package projects;

public class Project03 {
    public static void main(String[] args) {
        System.out.println("\n-------TASK-1-------\n");
        String s1 = "24", s2 = "5";
        System.out.println("The sum of " + Integer.parseInt(s1) + " and " + Integer.parseInt(s2) + " = " +
                (Integer.parseInt(s1) + Integer.parseInt(s2)));
        System.out.println("The subtraction of " + Integer.parseInt(s1) + " and " + Integer.parseInt(s2) + " = " +
                (Integer.parseInt(s1) - Integer.parseInt(s2)));
        System.out.println("The division of " + Integer.parseInt(s1) + " and " + Integer.parseInt(s2) + " = " +
                (double)Integer.parseInt(s1) / Integer.parseInt(s2));
        System.out.println("The multiplication of " + Integer.parseInt(s1) + " and " + Integer.parseInt(s2) + " = " +
                (Integer.parseInt(s1) * Integer.parseInt(s2)));
        System.out.println("The remainder of " + Integer.parseInt(s1) + " and " + Integer.parseInt(s2) + " = " +
                (Integer.parseInt(s1) % Integer.parseInt(s2)));

        System.out.println("\n-------TASK-2-------\n");

        int r1 =(int)(Math.random() * 35 ) + 1;
        System.out.println("Random number = " + r1);


        if (r1 == 1 || r1 == 2 || r1 == 3 || r1 == 5 || r1 == 7 || r1 == 11
                || r1 == 13 || r1 == 17 || r1 == 19 || r1 == 23 || r1 == 29 || r1 == 31)
            System.out.println("THE NUMBER IS A PRIME NUMBER");
        else System.out.println("THE NUMBER IS NOT A PRIME NUMBER");

        System.out.println("\n-------TASK-3-------\n");

        int ra1 =(int) (Math.random() * 50) + 1;
        int ra2 =(int) (Math.random() * 50) + 1;
        int ra3 =(int) (Math.random() * 50) + 1;

        if (ra1>ra2 && ra1>ra3 && ra2>ra3){
            System.out.println("Lowest number is " + ra3);
            System.out.println("Middle number is " + ra2);
            System.out.println("Greatest number is " + ra1);
        }else if (ra1>ra2 && ra1>ra3 && ra3>ra2){
            System.out.println("Lowest number is " + ra2);
            System.out.println("Middle number is " + ra3);
            System.out.println("Greatest number is " + ra1);
        }else if (ra2>ra1 && ra2>ra3 && ra1>ra3){
            System.out.println("Lowest number is " + ra3);
            System.out.println("Middle number is " + ra1);
            System.out.println("Greatest number is " + ra2);
        }else if (ra2>ra1 && ra2>ra3 && ra3>ra1) {
            System.out.println("Lowest number is " + ra1);
            System.out.println("Middle number is " + ra3);
            System.out.println("Greatest number is " + ra2);
        }else if (ra3>ra1 && ra3>ra2 && ra2>ra1) {
            System.out.println("Lowest number is " + ra1);
            System.out.println("Middle number is " + ra2);
            System.out.println("Greatest number is " + ra3);
        }else if (ra3>ra1 && ra3>ra2 && ra1>ra2) {
            System.out.println("Lowest number is " + ra2);
            System.out.println("Middle number is " + ra1);
            System.out.println("Greatest number is " + ra3);
        }

        /*
        System.out.println("Lowest number is " + min)
        int max = Math.max(Math.max(ra1, ra2), ra3);
        int max = Math.min(Math.min(ra1, ra2), ra3);
        int mid= 0;
        if (ra1 != max || ra1 != min){
            System.out.println("Middle number is = " + ra1)
        }else if (ra2 != max && ra2 !=min){
            System.out.println("Middle number is = " + ra2)
        }else{
            System.out.println("Middle number is = " + ra3)
        }
        System.out.println("Greatest number is = " + max)
         */

        System.out.println("\n-------TASK-4-------\n");
        char c = '5';

        if (c>='A' && c<= 'Z'){
            System.out.println("The letter is uppercase");
        }else if (c>= 'a' && c<= 'z'){
            System.out.println("The letter is lowercase");
        }else{
            System.out.println("Invalid character detected!!!");
        }
        System.out.println("\n-------TASK-5-------\n");
        char c1 = '-';

        if ((c1 >= 'A' && c1 <= 'Z') || (c1>= 'a' && c1<= 'z'))
            if (c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u')
                System.out.println("The letter is vowel");
            else System.out.println("The letter is consonant");
        else System.out.println("Invalid character detected!!!");


//          2nd WAY
//        if ((c1 >= 'A' && c1 <= 'Z') || (c1>= 'a' && c1<= 'z'))
//            switch (c1){
//                case 'a': // 97 YOU CAN USE 'a' or 97
//                case 'e': // 101
//                case 'i': // 105
//                case 'o': // 111
//                case 'u': // 117
//                case 'A': // 65
//                case 'E': // 69
//                case 'I': // 73
//                case 'O': // 79
//                case 'U': // 85
//                    System.out.println("The letter is vowel");
//                    break;
//                default:
//                    System.out.println("The letter is consonant");
//            }
//        else System.out.println("Invalid character detected!!!");

        System.out.println("\n-------TASK-6-------\n");

        char c2 = '+';

        if ((c2 >= 'A' && c2<= 'Z') || (c2 >= 'a' && c2 <= 'z') || (c2 >= 48 && c2<= 57)){
            System.out.println("Invalid character detected!!!");
        }else {
            System.out.println("Special character is = " + c2);
        }

        System.out.println("\n-------TASK-7-------\n");

        char c3 = '*';

        if ((c3 >= 'A' && c3 <= 'Z') || (c3 >= 'a' && c3 <= 'z'))
            System.out.println("Character is a letter");
        else if (c3 >= '0' && c3 <= '9')
            System.out.println("Character is a digit");
        else System.out.println("Character is a special character");




        System.out.println("End of the program!");
    }
}
