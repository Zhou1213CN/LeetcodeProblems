class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        backTrack(res, new StringBuilder(), 0, 0, n);
        return res;
    }
    public void backTrack(List<String>res, StringBuilder cur, int open, int close, int max){
        if (cur.length() == max*2) {
            res.add(cur.toString());
            return;
        }
        if (open < max){
            cur.append("(");
            backTrack(res, cur, open+1, close, max);
            cur.deleteCharAt(cur.length()-1);
        }
        
        if (close < open) {
            cur.append(")");
            backTrack(res, cur, open, close+1, max);
            
            cur.deleteCharAt(cur.length() - 1);
        }
        
    }
}