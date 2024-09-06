class Factorial{
    public static void main(String[] args) {
        int fact = fact(5);
        int SumDigit = SumDigit(1234);

        System.out.println(fact);
        System.out.println(SumDigit);
    }

    static int sum = 0;

    static int fact(int n){
        if(n<=1){
            return 1;
        }
        return n*fact(n-1);
    }

    static int SumDigit(int n){
        if(n==0){
            return 0;
        }
        return SumDigit(n/10)+(n%10);
    }

    static void rev(int n){
        if(n==0){
            return ;
        }
        int rem = n%10;
        sum = sum*10 + rem;
        rev(n/10);
    }
}