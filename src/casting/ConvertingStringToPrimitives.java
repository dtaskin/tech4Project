package casting;

public class ConvertingStringToPrimitives {
    public static void main(String[] args) {

        /*  1.WrapperClasName.valueOf():
        -This method is going to take "String" and returns an "Wrapper Class".

           2.WrapperClassName.parseDataType();
        -This method is going to take "String" and return a "primitive data type"

        EX: String str = "45";
            String bool = "true";
            String cha = "Y";
            String string = "";

            Double doubleVO = Double.valueOf(str);         ---> 45.0 (Wrapper Class)
            double doublePD = Double.parseDouble(str);     ---> 45.0 (Primitive)

            Boolean boolVO = Boolean.valueOf(bool);        ---> true (Wrapper Class)
            boolean boolPB = Boolean.parseBoolean(bool);   ---> true (Primitive)

            WrapperClassName variableName =WrapperClass.valueOF(string);  (Wrapper Class)
            primitive variableName = WrapperClass.parseWrapperClass(string); (Primitive)



        */
        String num1 = "23";
        String num2 = "12";



        int num1Int = Integer.parseInt(num1); //it's best to use parseInt() with int
        int num2Int = Integer.parseInt(num2); //return to primitive // String to primitive


        Integer num1Integer = Integer.valueOf(num1); //if you use Integer it's best to use valueOf()
        Integer num2Integer = Integer.valueOf(num2); // returns to wrapper class //String -->Integer --> int


        int num1IntValueOf = Integer.valueOf(num1);


        System.out.println(num1 + num2); //2312
        System.out.println(num1Int + num2Int); //35
        System.out.println(num1Integer + num2Integer);



    }
}
