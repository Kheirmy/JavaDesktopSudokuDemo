package sudoku.problemdomain;

import java.io.Serializable;

public class SudokuGame implements Serializable {
    private final GameState gameState;
    private final int[][] gridState;

    public state final int GRID_BOUNDARY = 9;

    public SudokuGame(GameState gameState, int[][] gridState){
        this.gameState = gameState;
        this.gameState = gameState;
    }

    public GameState getGameState() {
        return gameState;
    }

    public int[][] geCopyoftGridState() {
        return SudokuUtilities.CopyToNewArray(gridState);

    }
}
