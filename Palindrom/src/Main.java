public class Main {

    static boolean isPolindrom(int number){
        int t= number, reverseNumber=0, lastNumber;

        while (t!=0){
        lastNumber=t%10;
        reverseNumber= reverseNumber*10 +  lastNumber;
        t/=10;}

        if (number==reverseNumber){
            return true;
        }else{
            return false;
        }

    }
    public static void main(String[] args) {
        System.out.println(isPolindrom(123));

    }
}