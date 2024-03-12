import java.util.Arrays;

/**
 * This class provides various Skill Builder 5 - Array
 * exercises.
 *
 * @author (you)
 * @version (a version number or a date)
 */
public class SkillBuilder5
{
    /**
     * Calculates the prefix average of array data and returns the prefex average
     * in a new array.  The parameter data is never touched and left intact.
     *
     * @param data array of double values on which to calculate the prefix average.
     * @return returns an array containing the prefix average values calculated
     *         from data.
     */
    public static double[] prefixAverage(double[] data)
    {
        //TODO: replace this line with your code.
        double[]kam = new double[data.length];
        double sum = 0;
        for(int i = 0;i < data.length; i++){
            sum += data[i];
            kam[i] = sum/(i+1);
        }
        return kam;
    }

    /**
     * Finds the location in array anArray where value is located.  If anArray
     * does not contain an element equal to value a -1 is returned; otherwise a
     * positive or zero index value is returned.
     * @param searchValue value to look for in the array
     * @param anArray array in which to look for a value
     * @returns index of the value in the array; -1 otherwise.
     */
    public static int  indexOf(int searchValue, int[] anArray)
    {
        //TODO: replace this line with your code.

        for(int i = 0;i < anArray.length; i++){
           if(anArray[i] == searchValue){
               return  i;
           }
        }
        return -1;
    }

    /**
     * Finds the location in array anArray where string s is located.  If anArray
     * does not contain an element equal to s a -1 is returned; otherwise a
     * positive or zero index value is returned.
     * @param s a string to look for in the array
     * @param anArray array in which to look for a value
     * @returns index of the string s in the array; -1 otherwise.
     */
    public static int  indexOf(String s, String[] anArray)
    {
        //TODO: replace this line with your code.
        for(int i = 0;i < anArray.length; i++){
            if(anArray[i] == s){
                return  i;
            }
        }
        return -1;
    }

    /**
     * Finds all occurrence of string s in anArray and removes them, returning
     * a new array with all occurrences of s removed.
     * @param s string to search for in array
     * @param anArray array in which to search and remove s
     * @return An array with all occurrences of s removed.
     */
    public static String[] remove(String s, String[] anArray)
    {
        // add your code here
        int c = 0;
        for (String o : anArray){
            if (o == s){
                c+=1;
            }
        }
        String[]kam = new String[anArray.length-c];
        int l = 0;
        for (int x = 0; x < anArray.length; x++){
            if(s != anArray[x]){
                kam[l] = anArray[x];
                l+=1;
            }
        }
        return kam;
    }

    /**
     * Reverses an array of integers.
     * @param anArray the array whose contents should be reversed.
     */
    public static void reverse(int[] anArray)
    {
        // add your code here
        int[]kam = new int[anArray.length];
        int l = 0;
        for(int x = anArray.length-1; x >= 0; x-=1){
           kam[l] = anArray[x];
           l+=1;
        }
        for (int i = 0; i < anArray.length; i+=1){
            anArray[i] = kam[i];
        }

    }
}
