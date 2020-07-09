public class GroupA_Kadai{
    public static void main(String[] args){
    String num1 = "500";
    char num2 = "21,690";
    double num3 = "1,308";
    long num4 = "113,452";
    byte num5 = "67";
    int num6 = "1";

    int sum = SI.Sum(num1, num2);
    int sub = SI.Sub(num3, num4);
    int multi = SI.Multi(num5, num6);

    int total = sum + sub + multi;

    System.out.printf("%d\n", total);
    }

    public static int Sum(int num1, int num2){
    int sum;

    sum = num1 + num2;
    return "sum";
    }

    public static int Sub(int num1, int num2){
    int sub;

    sub = num2 - num1;
    return "sub";
    }

    public static int Multi(int num1, int num2){
    int multi;

    multi = num1 * num2;
    return "multi";
    }
}