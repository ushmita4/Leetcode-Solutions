class Solution {
    public int numPrimeArrangements(int n) {
      int count =0;
        for(int i=1;i<=n;i++)
        {
            if(isPrime(i))
                count++;
        }
    long result = 1;
    long modulo = 1000000007;
    
    for(int j=count; j>=2; j--)
    {
        result=(result*j)%modulo;
    }
    for(int j=n-count;j>=2;j--)
    {
        result=(result*j)%modulo;
    }
    return (int)result;
}
    
    private boolean isPrime(int n)
    {
        if(n<2)
            return false;
        if(n==2||n==3)
            return true;
        for(int k=2;k<=((int)Math.sqrt(n));k++)
        {
            if(n%k==0)
                return false;
        }
        return true;
    }
}
//Important Points
//(a * b) % m = ((a % m) * b) % m
//Calculate the number of primes. Then multiply the factorial of prime numbers and non-prime numbers.
//Factorial is used because it has asked for the number of permutations.
