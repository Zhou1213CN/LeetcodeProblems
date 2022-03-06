class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < numRows;i++){
            int j = 0; //j represents the number indexes on the straight columns
            while (j+i < s.length()){
                res.append(s.charAt(j+i));
                if (i != 0 && i < numRows-1 && j+numRows*2-2-i < s.length()){
                    res.append(s.charAt(j+numRows*2-2-i));
                }
                j+=numRows*2-2;
            }
        }
       return res.toString(); 
    }
}