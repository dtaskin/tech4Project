package loops.whileLoop;

public class Practice {
    public static void main(String[] args){

        /*
        Write a program that prints all the numbers between 1-100
        But do not print any number that can be divided by 2 or 3
         */

//        String a = "";
//        int i = 1;
//
//        while (i <= 100){
//            if (i % 2 != 0 && i % 3 != 0) System.out.print( i + " - ");;
//            i++;
//        }

        int count = 1;
        do {
            if (count % 2 != 0 && count % 3 != 0) System.out.println(count);
            count++;
        }while (count <= 100);

//       for (int i = 1; i <= 100; i++){
//           if ((i % 2 != 0) && (i % 3 != 0)) System.out.println(i);
//       }



    }
}
