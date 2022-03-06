class Solution {
    public boolean isPalindrome(int x) {
        int y = x;
        if (x<0) return false;
        if (x==0) return true;
        if (x%10==0 && x !=0) return false;
        int reverseNumber = 0;
        while (x > 0){
            reverseNumber = reverseNumber*10 + x%10;
            
            x = x/10;
        }
       // System.out.println(reverseNumber);
        if (reverseNumber == y) {
            return true;
        }else {
            return false;
        }
        
    }
    public boolean isPalindrome1(int x) {
        if (x<0) return false;
        if (x==0) return true;
        int y = x;
        String test = "";
        while (y>0){
           
            int z = y % 10;
            String add = z + "";
            test = test + add;
            y = y / 10;
            
            //System.out.println(z);
           
        }
        //int test2 = Integer.parseInt(test);
      //  Long.parseLong(test);
      //  System.out.println(test);
        boolean rtn = (Long.parseLong(test) == x) ? true : false;
        return rtn;
    }
}