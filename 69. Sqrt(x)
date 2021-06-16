class Solution {
    public int mySqrt(int x) {
        if(x<=1)
            return x;
        int sqrt=x/2;
        int quotient=x/sqrt;
        while(sqrt>quotient)
        {
            sqrt=(sqrt+quotient)>>1;//bitwise operator used to make the process faster
            quotient=x/sqrt;   
        }
        return sqrt;
    }
}
