/*
Problem statement: https://www.codingninjas.com/codestudio/guided-paths/basics-of-java/content/120302/offering/1459173
my solution is correct but time limit is exceeded
*/
	 public static int fibonacciNumber(int n){
        int num1 = 0, num2 = 1, num3;
        if (n == 0) {
            return 0;
        }else if(n==1 || n==2){
            return 1;
        }else{
            for (int i=2; i<=n; i++) {
            num3 = (num1 + num2)%1000000007;
            num1 = num2%1000000007;
            num2 = num3%1000000007;
            }
        }
        return num2%1000000007;
    }
	 
