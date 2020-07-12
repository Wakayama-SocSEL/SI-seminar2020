import java.util.*;
public class Main {
    public static void number_sort(int[] number_array){
        int temp;
        for(int i=0;i<number_array.length;i++){
            for(int j=0;j<number_array.length-i-1;j++){
                if(number_array[j]>number_array[j+1]){
                    temp=number_array[j];
                    number_array[j]=number_array[j+1];
                    number_array[j+1]=temp;
                }
            }
        }
    }
    
    private static int toOdd(int Value)
    {
        int doubleValue =Value *2;
        if (Value %2 ==0)
        {
            return Value;
        }
        else
        {
            return doubleValue;
        }
    }
    public static void main(String[] args) {
        int[] numberList  =  {1,2,3, 4,5 ,6 ,7, 8, 9 , 10 } ;
        
        for ( int i  =  0 ; i  <  numberList.length ; i ++ ) {
            numberList[i]  =  toOdd(numberList[i]) ;
        }
        
        number_sort(numberList);
        for ( int i  =  0 ; i  <  numberList.length ; i ++ ) {
            System.out.println(numberList[i]) ;
        }
    }
}
