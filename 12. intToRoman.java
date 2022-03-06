class Solution {
    public String intToRoman(int num) {
        Map<Integer, String> conversion = new HashMap<>();
        conversion.put(1,"I");
        conversion.put(4,"IV");
        conversion.put(5,"V");
        conversion.put(9,"IX");
        conversion.put(10,"X");
        conversion.put(40,"XL");
        conversion.put(50,"L");
        conversion.put(90,"XC");
        conversion.put(100,"C");
        conversion.put(400,"CD");
        conversion.put(500,"D");
        conversion.put(900,"CM");
        conversion.put(1000,"M");
        
        String res = "";
        int tmp = num;
        for (int i = num; i > 0;i--){
            if (tmp == 0) break;
            if (conversion.containsKey(i)){
                while(tmp-i > -1){
                    res+=conversion.get(i);
                    tmp-=i;
                }                
            } 
        }
        return res;
    }
}