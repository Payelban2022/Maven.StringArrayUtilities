package com.zipcodewilmington;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        int length = array.length;
        return array[length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        int length = array.length;
        return array[length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (int i =0; i < array.length; i ++) {
            if(array[i] == value) {
                return true;
            }
        }

        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {

        int arrLen= array.length;;
        String ans[] = new String[arrLen];
       int j=0;
        String val;
        for (int i = array.length - 1; i >= 0; i--) {


                val = array[i];
                System.out.println("thi is actual: " + val);
            System.out.println(j);
                ans[j] = val;

                System.out.println(ans[j]);
                j++;

        }
        return ans;

    }







    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int length = array.length - 1;
        boolean result=false;
        for (int i = 0; i < array.length; i++) {

            if (array[i] == array[length - i]) {
                result= true;
            }

        }
        return result;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
//    public static boolean isPangramic(String[] array) {
//
//        return false;
//    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
//    public static int getNumberOfOccurrences(String[] array, String value) {
//        return 0;
//    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int length = array.length-1;
        String[] newArray = new String[length];
        int j=0;
        for (int i = 0; i < length+1; i ++){
            if (array[i] != valueToRemove){
                newArray[j]=array[i];
                System.out.println(newArray[j]);
                j++;

            }

        }
        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        int length = array.length;
        String[] newarr=new String[length];
        int j = 0;
        for(int i = 0; i < length;i++){

            if (array[i] == array[i+1]){


                if((j !=0) ){
                    if((array[i]== newarr[j])){
                        i++;
                    }

                }else{
                    newarr[j] = array[i];
                    System.out.println(newarr[j]);
                    j++;
                    i++;
                }

            }else{
                newarr[j] = array[i];
                j++;
            }
//            System.out.println("This is new array: "+ newarr[j-1]);
//            System.out.println("this is value of j: "+j);
        }
        return newarr;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}



