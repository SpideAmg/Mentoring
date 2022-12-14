package Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class classss {
     /*
               Java program to reverse a given array in place:
               Write a method to reverse a given array in place.
               Note: Avoid using in-built methods.
               Note: Use in-built methods.
               Input : int [] array={-1,-3,5,77,0,1,2,3,4,5,6,7,8,9,99}
               Expected Result : [99, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 77, 5, -3, -1]
               Input :  int [] array={-1,-3};
               Expected Result : [-3, -1]
               Input :   int [] array={};
               Expected Result : []
               Input : int [] array={1};
               Expected Result : [1]
                */

    public static void main(String[] args) {
        int [] array={-1,-3,5,77,0,1,2,3,4,5,6,7,8,9,99};
        System.out.println(Arrays.toString(array_Reverse(array)));
//        System.out.println(Arrays.toString(reverse_an_array(array)));
//        System.out.println(Arrays.toString(Reverse_Given_Array(array)));
//        reverse_an_Array(array);
//        System.out.println(Arrays.toString(reverse_Array(array)));
//        System.out.println(Arrays.toString(Reverse_Array(array)));
        System.out.println("*************************************************");
//        System.out.println(Arrays.toString(Array_Reverse(array)));
    //    System.out.println(Arrays.toString(ArrayReverse(array, array.length)));

    }
    public static int[] array_Reverse(int []array){
        int i,j;
        int tump;
        int [] arrayReverse = new int[array.length];
        for(i=0,j=array.length-1;i< array.length;i++){
            tump=array[i];
            arrayReverse[i]=array[j-i];
            arrayReverse[j-i]=tump;
        }
        return arrayReverse;
    }
    public static int[] Array_Reverse(int []array){
        int i,j,tump;
        for(i=0,j=array.length-1;i<= array.length/2;i++,j--){
            tump=array[i];
            array[i]=array[j];
            array[j]=tump;
        }
        return array;
    }
    public static int[] ArrayReverse(int []array,int j){
        int i,tump;
        for(i=0;i< j/2;i++){
            tump=array[i];
            array[i]=array[j-i-1];
            array[j-i-1]=tump;
        }
        return array;
    }
    //Method N01:
    public static int[] reverse_Array(int [] InpArray){
        if(InpArray==null){ return null;}
        int i,j;
        int [] ReverArray =new int [InpArray.length];
        for(i=0 ,j=InpArray.length-1 ;i<InpArray.length; i++ ,j--){
            ReverArray[i]=InpArray[j];
        }
        return ReverArray;
    }
    public static int [] reverse_an_array(int []array){
        int num;
        int j=array.length-1;
        int[]Reversarray=new int[array.length];
        for(int i=0; i<array.length; i++ ){
            num=array[i];
            Reversarray[i]=array[j-i];
            Reversarray[j-i]=num;
        }
        return Reversarray;
    }
    public static int [] Reverse_given_Array(int [] Numarray){

        int leng= Numarray.length;
        int [] ReversedArray= new int[leng];
        int j= 0;
        for (int i=leng-1; i>=0; i-- ){
            ReversedArray[j]=Numarray[i];
            j++;
            // System.out.print(ReversedArray[i]+" ");
        }
        return ReversedArray;
    }
    public static int [] Reverse_Given_Array(int [] Numarray){
        int [] ReversedArray= new int[Numarray.length];
        for (int i=Numarray.length-1, j=0;i>=0; i-- ,j++ ){
            ReversedArray[j]=Numarray[i];
        }
        return ReversedArray;
    }
    public static void reverse_an_Array(int []array){
        Collections.reverse(Arrays.asList(array));
    }
    //Method N02:
    //I have to work on this method
    public static Object[] Reverse_Array(int [] InpArray){
        List InpList =Arrays.asList(InpArray);
        Object [] ReverInp= InpList.subList(InpArray.length-1,0).toArray();

        return ReverInp;
    }
}
