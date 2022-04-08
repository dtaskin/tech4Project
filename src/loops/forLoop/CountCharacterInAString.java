package loops.forLoop;

public class CountCharacterInAString {
    public static void main(String[] args) {
        /*
        how many 'o's in the techglobal school

         */

        String str = "TechGlobal School";
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'o') count++; // count += 1 same as count++
        }
        System.out.println("There are " + count + " o's");


        String str1 = "My name is Deniz Taskin and I am a QA tester";
         int count1 = 0;

         for (int i = 0; i < str1.length(); i++){
             if (str1.charAt(i) == 'e') count1++;
         }
         System.out.println(count1);


    }
}
