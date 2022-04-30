package date_practices;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UnderstandingDataFormat {
    public static void main(String[] args){

        Date currentDate = new Date();

        System.out.println(currentDate); //Sat Apr 30 11:13:52 EDT 2022

        // mm/dd/yyyy  04/30/2022

        SimpleDateFormat sdt = new SimpleDateFormat("MM/dd/yyy"); // you can use - instead of / or . or whatever you want
        System.out.println("Today is = " + sdt.format(currentDate)); //Today is = 04/30/2022

        // Print date in the format if Sat hh.mm.ss a
        sdt = new SimpleDateFormat("EEE hh:mm a"); //ALL FORMATS ARE ON THE PRESENTATION
        System.out.println(sdt.format(currentDate));  //Sat 11:27 AM

        System.out.println(new SimpleDateFormat("EEEE").format(currentDate)); //Saturday
        System.out.println(new SimpleDateFormat("yyyy").format(currentDate)); //2022
        System.out.println(new SimpleDateFormat("dd.MMM.yyyy").format(currentDate)); //30.Apr.2022

        System.out.println(new SimpleDateFormat("hh 'o''clock' a, zzzz").format(currentDate)); //11 o'clock AM, Eastern Daylight Time


    }
}
