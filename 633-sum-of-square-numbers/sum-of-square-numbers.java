class Solution {
    public boolean judgeSquareSum(int c) {
        int a;
        for (a = 0; a<= Math.sqrt(c) ; a++){
            int temp = c - (a * a);
            double b = Math.sqrt(temp); 
            if (b == (int)b){
               return true;
            } 
            
        }
        return false;

    }
}