package utilities;

public class StringHelper {
    public static String getMiddle(String str){
//            if(str.length() % 2 == 0){
//            String middle = "" + str.charAt(str.length()/2-1) + str.charAt(str.length()/2);
//            return middle;
//        }
//        return "" + str.charAt(str.length()/2); //we dont have to add else because if its not true it is going to come to return


//        public static String getMiddle(String str){ // Taylor
//            if(str.length() % 2 == 0) return "" + str.charAt(str.length()/2-1) + str.charAt(str.length()/2);
//            return "" + str.charAt(str.length()/2);



        return (str.length() % 2 == 0) ? "" + str.charAt(str.length()/2-1) + str.charAt(str.length()/2) : "" + str.charAt(str.length()/2);



    }
}
