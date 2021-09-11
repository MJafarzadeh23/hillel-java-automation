package lessons;

public class task5 {
    public static void main(String[] args) {
        System.out.println(isEven(6));
    }


    public static boolean isEven(int number) {
        if(number % 2 == 0) {
            return true;
        } else  {
            return  false;
        }

        /*return (number % 2 == 0) ? true : false;

        return number % 2 == 0;*/
    }
}
