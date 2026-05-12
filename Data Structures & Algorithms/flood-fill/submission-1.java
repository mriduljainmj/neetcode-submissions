class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        if(originalColor==color){
            return image;
        }
        int maxRow = image.length;
        int maxColumn = image[0].length;
        dfs(image, sr, sc, maxRow, maxColumn, color, originalColor);
        return image;
    }

    private void dfs(int[][]image, int r, int c, int maxR, int maxC, int color, int originalColor){
        if(r<0 || r>=maxR || c<0 || c>=maxC || image[r][c]!=originalColor){
            return;
        }
        image[r][c] = color;
        dfs(image, r+1, c, maxR, maxC, color, originalColor);
        dfs(image, r-1, c, maxR, maxC, color, originalColor);
        dfs(image, r, c+1, maxR, maxC, color, originalColor);
        dfs(image, r, c-1, maxR, maxC, color, originalColor);
    }
}