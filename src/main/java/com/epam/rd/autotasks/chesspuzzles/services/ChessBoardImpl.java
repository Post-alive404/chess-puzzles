package com.epam.rd.autotasks.chesspuzzles.services;

import com.epam.rd.autotasks.chesspuzzles.Cell;
import com.epam.rd.autotasks.chesspuzzles.ChessBoard;
import com.epam.rd.autotasks.chesspuzzles.ChessPiece;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Denys Parshutkin
 * @version 1.0.0
 */
public class ChessBoardImpl implements ChessBoard {

    private final List<ChessPiece> chessPieces;
    public ChessBoardImpl(Collection<ChessPiece> pieces) {
        this.chessPieces = new ArrayList<>(pieces);
    }

    @Override
    public String state() {
        StringBuilder sb = new StringBuilder();
        for (int number = 8; number >= 1; number--) {
            for (char letter = 'A'; letter <= 'H'; letter++) {
                char finalLetter = letter;
                int finalNumber = number;
                char let = chessPieces.stream()
                        .filter(c -> {
                            Cell cell = c.getCell();
                            return cell != null && finalLetter == cell.letter && finalNumber == cell.number;
                        })
                        .map(ChessPiece::toChar)
                        .findFirst()
                        .orElse('.');
                sb.append(let);

            }
            sb.append("\n");
        }
        return sb.toString().trim();
    }
}
