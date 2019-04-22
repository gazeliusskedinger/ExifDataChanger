import java.util.ArrayList;

public class X {
    /**
     * Extra over all is just a class to make the everyday coding stuff easier to write.
     * Simples said just a bunch of help methods;
     */

    public X(){

    }

    public static void printToStringArray (Object[] o){
        String str = "";
        for(int i = 0; i < o.length; i++){
            print(o[i].toString()+"\n");
        }
    }

    public static boolean generateBool(){
        int bool = ran(1,3);
        if(bool == 2){
            return true;
        }else{
            return false;
        }
    }

    /**
     * An easier random funktion
     * @param min
     * @param max
     * @return double
     */


    public static int ran(int min, int max){
        // makes max the max possible
        max = max - min;
        return ((int)(Math.random()*max)+min);
    }

    /**
     *  An easier random help funktion
     * @param max
     * @return
     */

    public static int ran(int max){
        return ran(0,max);
    }

    /**
     * Console println
     * @param text
     */

    public static void println(String text){
        System.out.println(text);
    }

    /**
     * Console print
     * @param text
     */

    public static void print(String text){
        System.out.print(text);
    }

    /**
     * Print int arrays
     * @param array
     */

    public static void printIntArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    /**
     * Print char arrays
     * @param array
     */

    public static void printCharArray(char[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    /**
     * Print double arrays
     * @param array
     */

    public static void printDoubleArray(double[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    /**
     * Print String arrays
     * @param array
     */

    public static void printStringArray(String[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    /**
     * Prints arraylist all types
     * @param arraylist
     */

    public static void printArrayList(ArrayList arraylist){
        for(int i = 0; i < arraylist.size(); i++){
            System.out.println(arraylist.get(i));
        }
    }

    /**
     * String array to char array covnerter
     * @param Text
     * @return char array
     */
    public static char[] toArray( String Text){
        return Text.toCharArray();
    }

    /**
     * Removes All white Spaces
     * @param Text
     * @return
     */

    public static String rmWhite(String Text){
        return Text.replaceAll("\\s+", "");
    }

}
