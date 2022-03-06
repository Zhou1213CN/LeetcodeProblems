class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String pre = "";
        
        int comlen = strs[0].length();
        for (int i = 1; i < strs.length; i ++){
            comlen = Math.min(comlen, strs[i].length());
        }
        System.out.println("comlen"+comlen);
        for (int j = 0; j < comlen; j++){
            int fun = 0;
            String temp = Character.toString(strs[0].charAt(j));
            System.out.println("hi"+temp);
            for (String s : strs){
                //System.out.println("j"+s);
                if (Character.toString(s.charAt(j)).equals(temp)){
                    fun = fun + 1;
                }else{
                    System.out.println("j"+s);
                    return pre;
                }
            }
            pre = pre + temp;
            
        }
        
        return pre;
    }
}