package sudoku.problemdomain;

import java.io.IOException;

public interface IStorage {
    void updateGameDate(SudokuGame game) throws IOException;
    SudokuGame getGameDate() throws IOException;
}
