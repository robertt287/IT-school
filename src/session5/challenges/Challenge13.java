package session5.challenges;

//13. Pathfinding in a Maze
//Consider a simple maze represented by a 2D grid. The maze consists of open cells, walls, a start, and an end.
// You have to find a path from the start to the end, moving only up, down, left, or right. You can't move diagonally.
// If a path exists, print it; otherwise, inform the user that there's no solution.
//
//The maze will be represented by a 2D array where:
//0 represents an open cell.
//1 represents a wall.
//S represents the start.
//E represents the end.
//
//Example:
//S 1 0 1
//0 1 0 1
//0 1 0 1
//1 0 0 E
import java.util.ArrayList;
import java.util.List;

public class Challenge13 {

    // Helper class that represents a point in the maze.
    private static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        // Check if this point is the same as another.
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Point point = (Point) obj;
            return x == point.x && y == point.y;
        }
    }

    // Directions representing up, down, left, and right.
    private static final int[][] DIRECTIONS = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public static void main(String[] args) {
        // Example maze.
        char[][] maze = {
                {'S', '1', '0', '1'},
                {'0', '1', '0', '1'},
                {'0', '1', '0', '1'},
                {'1', '0', '0', 'E'}
        };

        List<Point> path = new ArrayList<>();
        if (solveMaze(maze, path)) {
            System.out.println("Path found:");
            for (Point point : path) {
                System.out.println("(" + point.x + ", " + point.y + ")");
            }
        } else {
            System.out.println("No path found.");
        }
    }

    // The main recursive method to solve the maze.
    private static boolean solveMaze(char[][] maze, List<Point> path) {
        Point start = findStart(maze);
        if (start == null) {
            return false;  // The maze doesn't have a start point.
        }

        return dfs(maze, start.x, start.y, path);
    }

    // Depth-first search method to explore the maze.
    private static boolean dfs(char[][] maze, int x, int y, List<Point> path) {
        // Check if this is a valid location in the maze.
        if (!isValid(maze, x, y)) {
            return false;
        }

        // Add this point to the path.
        path.add(new Point(x, y));

        // Check if we've reached the end.
        if (maze[x][y] == 'E') {
            return true;
        }

        // Mark this point as visited.
        char backup = maze[x][y];
        maze[x][y] = '1';  // Here '1' is used to indicate the cell is visited.

        // Explore in all directions: up, down, left, right.
        for (int[] direction : DIRECTIONS) {
            int newX = x + direction[0];
            int newY = y + direction[1];

            if (dfs(maze, newX, newY, path)) {
                return true;  // Path found.
            }
        }

        // Backtrack, we remove this point from the path.
        path.remove(path.size() - 1);
        maze[x][y] = backup;  // Restore the original value for backtracking.

        return false;  // No path found from this point.
    }

    // Check if a point is valid (inside the maze and not a wall).
    private static boolean isValid(char[][] maze, int x, int y) {
        return x >= 0 && y >= 0 && x < maze.length && y < maze[0].length && maze[x][y] != '1';
    }

    // Find the starting point in the maze.
    private static Point findStart(char[][] maze) {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                if (maze[i][j] == 'S') {
                    return new Point(i, j);
                }
            }
        }
        return null;  // No starting point found.
    }
}