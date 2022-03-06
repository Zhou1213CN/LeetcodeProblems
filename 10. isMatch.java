class Solution {
    public boolean isMatch(String s, String p) {
        if (p.length() == 0) return s.length() == 0;
        boolean[][] match = new boolean[s.length()+1][p.length()+1];
        match[0][0] = true;
        for (int i = 2; i <= p.length();i++){
            if (p.charAt(i-1) == '*'){
                match[0][i] = match[0][i-2];
            }
        }
        for (int i = 1; i <= s.length();i++){
            for (int j = 1; j <= p.length();j++){
                char sc = s.charAt(i-1);
                char pc = p.charAt(j-1);
                if (sc == pc || pc == '.') match[i][j] = match[i-1][j-1];
                else if (pc == '*'){
                    if (match[i][j-2]) match[i][j] = true;
                    else if (sc == p.charAt(j-2) || p.charAt(j-2) == '.') match[i][j] = match[i-1][j];
                }
            
            }
        }
        return match[s.length()][p.length()];
    }

    public boolean isMatch1(String s, String p) {
        
        boolean[][] f = new boolean[s.length()+1][p.length()+1];
        //initialize
        f[s.length()][p.length()] = true;
        
        for (int i = s.length(); i > -1; i--){
            for (int j = p.length()-1; j > -1; j--){
                
                boolean first_match = (i < s.length() &&
                                       (p.charAt(j) == s.charAt(i) ||
                                        p.charAt(j) == '.'));
                if (j + 1 < p.length() && p.charAt(j+1) == '*'){
                    f[i][j] = f[i][j+2] || first_match && f[i+1][j];
                    
                } else { 
                    f[i][j] = first_match && f[i+1][j+1];
                    
                }
                
            }
            
        }
        
        return f[0][0];
    }
}