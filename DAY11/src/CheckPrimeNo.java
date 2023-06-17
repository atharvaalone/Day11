public class CheckPrimeNo {
    public static void main(String[] args) {
        int num = 9;
        int count = 0;
        if (num > 1) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0)
                    count++;


            }
            if (count == 2) {
                System.out.println("The No is prime ");
            } else {
                System.out.println("the no is not peime");
            }
        }
    }
}
