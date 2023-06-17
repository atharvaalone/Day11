public class perfectNo {
    public static void main(String[] args) {

        int n=28;
        boolean b=isPerfectNo(n);
        if(b)
            System.out.println("This is perfect No");
        else
            System.out.println("This is not perfect no");
        }

        public static boolean isPerfectNo(int n){
            int sum=0;
            for(int i=0;i<n;i++){
                if(i%n==0)
                    sum=sum+i;

            }if(n==sum)
                return true;





            return false;

        }

    }

