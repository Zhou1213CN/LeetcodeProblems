class Solution {
    int[][] directions = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<int[]> pacificBorder = new LinkedList<>();
        Queue<int[]> atlanticBorder = new LinkedList<>();
        int n = heights.length;
        int m = heights[0].length;
        boolean[][] pacific = new boolean[n][m];
        boolean[][] atlantic = new boolean[n][m];
        for (int i = 0; i < n;i++){
            pacificBorder.add(new int[]{i,0});
            atlanticBorder.add(new int[]{i,m-1});
            pacific[i][0] = true;
            atlantic[i][m-1] = true;
        }
        for (int i = 0; i < m;i++){
            pacificBorder.add(new int[]{0,i});
            atlanticBorder.add(new int[]{n-1,i});
            pacific[0][i] = true;
            atlantic[n-1][i] = true;
        }
        bfs(heights, pacificBorder, pacific);
        bfs(heights, atlanticBorder, atlantic);
        
        for (int i = 0; i < n;i++){
            for (int j = 0; j < m;j++){
                if (pacific[i][j] && atlantic[i][j]) {
                    List<Integer> add = new ArrayList<>();
                    add.add(i);
                    add.add(j);
                    res.add(add);
                }
            }
        }
        
        return res;
    }
    private void bfs(int[][] heights, Queue<int[]> border, boolean[][] ocean){
        while (!border.isEmpty()){
            int[] cur = border.poll();
            for (int[] d : directions){
                if (cur[0]+d[0] < heights.length && cur[0]+d[0] >= 0 && cur[1]+d[1] >= 0 && cur[1]+d[1] < heights[0].length && heights[cur[0]+d[0]][cur[1]+d[1]] >= heights[cur[0]][cur[1]] && !ocean[cur[0]+d[0]][cur[1]+d[1]]){
                    ocean[cur[0]+d[0]][cur[1]+d[1]] = true;
                    border.add(new int[]{cur[0]+d[0],cur[1]+d[1]});                   
                }
            }
        }
        
    }
}