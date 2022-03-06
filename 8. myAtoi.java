class Solution {
    public int myAtoi(String s) {
        String str = s.trim();
        if (str == null || str.length() == 0) return 0;
        int sign = 1, idx = 0;
        if (str.charAt(0) == '-'){
            sign = 0;
            idx = 1;
        } else if (str.charAt(0) == '+'){
            sign = 1;
            idx = 1;
        }
        String numStr = "";
        while (idx < str.length()){
            // if (Character.isLetter(str.charAt(idx)) || !Character.isLetterOrDigit(str.charAt(idx))) {
            //     idx++;
            // }else {
            //     numStr+=str.charAt(idx++);
            // }
            if (Character.isLetter(str.charAt(idx)) || !Character.isLetterOrDigit(str.charAt(idx))) {
                break;
            }
            numStr+=str.charAt(idx++);
            
        }
        if (numStr.length() == 0 || numStr == null) return 0;
        double numLong = 0;
        numLong = Double.valueOf(numStr);
        // long numLong = 0;
        // numLong = Long.valueOf(numStr);
        if (sign == 0) numLong*=(-1);
        if (numLong > Math.pow(2,31)-1) return (int) 
2147483647;
        else if (numLong < Math.pow(2,31)*(-1)) return (int) -2147483648;
        else return (int) numLong;
        //System.out.println(str);
        
    }
}