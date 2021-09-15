public int[] exclusiveTime(int n, List<String> logs) {
        Deque<Integer> stack = new ArrayDeque<>();
        int prev = 0;
        int[] res = new int[n];
        String[] s = logs.get(0).split(":");
        stack.push(Integer.valueOf(s[0]));
        prev = Integer.valueOf(s[2]);
        
        for (int i = 1; i < logs.size();i++){
            s  = logs.get(i).split(":");
            int func = Integer.valueOf(s[0]);
            int time = Integer.valueOf(s[2]);
            
            if (s[1].equals("start")){
                if (!stack.isEmpty()) res[stack.peek()] += time - prev;
                stack.push(func);
                prev = time;
            } else {
                res[stack.pop()] += time-prev+1;
                prev = time+1;
            }
        }
        return res;
    }