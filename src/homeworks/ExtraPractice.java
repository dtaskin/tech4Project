package homeworks;

public class ExtraPractice {
    /*
    Create a method which will take an int as ang argument and
    returns a String.
    •If the int number is in between -50/ 0 return "The number is negative
    and more than -50"
    •If the int number is in between 0/ 50 return "The number is positive
    and less than 50"
    •If the int number is  0 return "The number is zero"
    •If the number is 9 return "You have hit the lucky number!"
    •If the number is -11 return "You have hit the unlucky number!"
     */
    public static String luckyUnluckyGame(int num) {
        if (num > -50 && 0 > num) {
            if (num == -11) return "You have hit the unlucky number";
            return "The number is negative and more than -50";
        } else if (num > 0 && num < 50) {
            if (num == 9) return "You have hit the lucky number";
            return "The number is positive and less than 50";
        } else if (num == 0) {
            return "The number is zero";
        }
        return "The number you provided is not for this game";

    }

    public static void main(String[] args) {
        System.out.println(luckyUnluckyGame(9));
    }
}


