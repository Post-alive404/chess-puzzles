package com.epam.rd.autotasks.chesspuzzles;

import com.epam.rd.autotasks.chesspuzzles.services.ChessBoardImpl;

import java.util.Collection;

public interface ChessBoard {
    static ChessBoard of(Collection<ChessPiece> pieces){

        return new ChessBoardImpl(pieces);
    }

    String state();
}
