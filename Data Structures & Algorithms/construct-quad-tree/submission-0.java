/*
// Definition for a QuadTree node.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;


    public Node() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }

    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }

    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node
bottomRight) { this.val = val; this.isLeaf = isLeaf; this.topLeft = topLeft; this.topRight =
topRight; this.bottomLeft = bottomLeft; this.bottomRight = bottomRight;
    }
}
*/

class Solution {
    public Node construct(int[][] grid) {
        int len = grid.length;
        return dfs(len, 0, 0, grid);
    }

    private Node dfs(int len, int r, int c, int[][] grid) {
        boolean allSame = true;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (grid[r][c] != grid[r + i][c + j]) {
                    allSame = false;
                    break;
                }
            }
        }
        if (allSame) {
            return new Node(grid[r][c] == 1, true);
        }
        int mid = len / 2;
        Node topLeft = dfs(mid, r, c, grid);
        Node topRight = dfs(mid, r, c + mid, grid);
        Node bottomLeft = dfs(mid, r + mid, c, grid);
        Node bottomRight = dfs(mid, r + mid, c + mid, grid);

        return new Node(false, false, topLeft, topRight, bottomLeft, bottomRight);
    }
}