import java.util.Arrays;

public class BFS {
    
    // Example binary maze
    int rows = 5;  
    int cols = 6; 
    boolean[][] maze = {
        {true , true , true , false , true, true },
        {false, false, true , false, true , true},
        {true , false, true , false, true , true},
        {true , false, false, false, false , false},
        {true , true , true , true , true , true}
        }; // false = path, true = wall

    // Example Start and End coordinates
    int startX = 1, startY = 0; 
    int endX = 3, endY = 5;  

    boolean[][] visited = new boolean[rows][cols];
    boolean[][] path = new boolean[rows][cols];    

    public void solveMaze() {
        
        // Fill the two arrays with False value
        for(boolean[] r : visited){
            Arrays.fill(r, false);
        }
        for(boolean[] r : path){
            Arrays.fill(r, false);
        }

        boolean sol = recursiveSolve(startX, startY); // if sol == true, solved else no solution
        
        if (sol) {
            for (int row = 0; row < maze.length; row++) {
                for (int col = 0; col < maze[row].length; col++) {
                    if (row == startX && col == startY)
                        System.out.print("S ");
                    else if (row == endX && col == endY)
                        System.out.print("E ");
                    else if (path[row][col])
                        System.out.print("O ");
                    else
                        System.out.print("X ");
                    }
                System.out.println();
            }
        } else {
            System.out.println("No solution");
        }
    }

    public boolean recursiveSolve(int x, int y) {

        if (x == endX && y == endY) return true; // If you reached the end
        if (maze[x][y] || visited[x][y]) return false; // Wall or already visited

        visited[x][y] = true;

        if (x != 0) { // Left
            if (recursiveSolve(x - 1, y)) {
                path[x][y] = true;
                return true;
            }
        }
        if (x != (rows - 1)) { // Right
            if (recursiveSolve(x + 1, y)) {
                path[x][y] = true;
                return true;
            }
        }
        if (y != 0) { // Up
            if (recursiveSolve(x, y - 1)) {
                path[x][y] = true;
                return true;
            }
        }
        if (y != (cols - 1)) { // Down
            if (recursiveSolve(x, y + 1)) {
                path[x][y] = true;
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        BFS mazeSolver = new BFS();
        mazeSolver.solveMaze();
    }
}