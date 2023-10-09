// n! = n x (n-1) x (n-2) x ........1    [0! = 1]
// 3! = 3 x 2 x 1 => or 3! = 3 x 2! 
// n! = n x (n-1)!


public class Main
{
    public static int factorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        int fact_n_minus_1 = factorial(n-1);
        int fact_n = n * fact_n_minus_1;
        return fact_n;
    }
	public static void main(String[] args) {
	    int n = 5;
	    int ans = factorial(n);
	    System.out.println(ans);
	}
}

