package com.epam.rd.autotasks.chesspuzzles.chessPieces;

import com.epam.rd.autotasks.chesspuzzles.Cell;
import com.epam.rd.autotasks.chesspuzzles.ChessPiece;

/**
 * @author Denys Parshutkin
 * @version 1.0.0
 */
public class WhiteBishop implements ChessPiece {
    private final Cell cell;

    public WhiteBishop(Cell cell) {
        this.cell = cell;
    }

    @Override
    public Cell getCell() {
        return cell;
    }

    @Override
    public char toChar() {
        return 'b';
    }
}
