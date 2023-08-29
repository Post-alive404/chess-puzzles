package com.epam.rd.autotasks.chesspuzzles.config;

import com.epam.rd.autotasks.chesspuzzles.chessPieces.*;
import com.epam.rd.autotasks.chesspuzzles.services.CellPiece;
import com.epam.rd.autotasks.chesspuzzles.services.PiecesName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author Denys Parshutkin
 * @version 1.0.0
 */
@Configuration
public class ApplicationConfig {


    private final CellPiece cellPiece;


    @Autowired
    public ApplicationConfig( DefaultConfiguration defaultConfig) {
        String filePath = defaultConfig.getFilePath();
        this.cellPiece = new CellPiece(filePath);
    }


    @Bean
    public WhiteKing whiteKing(){
        return new WhiteKing(cellPiece.getCell(PiecesName.WHITE_KING));
    }


    @Bean
    public WhiteQueen whiteQueen(){
        return new WhiteQueen(cellPiece.getCell(PiecesName.WHITE_QUEEN));
    }
    @Bean
    public WhiteRook whiteRook1(){
        return new WhiteRook(cellPiece.getCell(PiecesName.WHITE_ROOK));
    }
    @Bean
    public WhiteRook whiteRook2(){
        return new WhiteRook(cellPiece.getCell(PiecesName.WHITE_ROOK));
    }
    @Bean
    public WhiteBishop whiteBishop1(){
        return new WhiteBishop(cellPiece.getCell(PiecesName.WHITE_BISHOP));
    }
    @Bean
    public WhiteBishop whiteBishop2(){
        return new WhiteBishop(cellPiece.getCell(PiecesName.WHITE_BISHOP));
    }
    @Bean
    public WhiteKnight whiteKnight1(){
        return new WhiteKnight(cellPiece.getCell(PiecesName.WHITE_KNIGHT));
    }
    @Bean
    public WhiteKnight whiteKnight2(){
        return new WhiteKnight(cellPiece.getCell(PiecesName.WHITE_KNIGHT));
    }

    @Bean
    public WhitePawn whitePawn1(){
        return new WhitePawn(cellPiece.getCell(PiecesName.WHITE_PAWN));
    }
    @Bean
    public WhitePawn whitePawn2(){
        return new WhitePawn(cellPiece.getCell(PiecesName.WHITE_PAWN));
    }
    @Bean
    public WhitePawn whitePawn3(){
        return new WhitePawn(cellPiece.getCell(PiecesName.WHITE_PAWN));
    }
    @Bean
    public WhitePawn whitePawn4(){
        return new WhitePawn(cellPiece.getCell(PiecesName.WHITE_PAWN));
    }
    @Bean
    public WhitePawn whitePawn5(){
        return new WhitePawn(cellPiece.getCell(PiecesName.WHITE_PAWN));
    }
    @Bean
    public WhitePawn whitePawn6(){
        return new WhitePawn(cellPiece.getCell(PiecesName.WHITE_PAWN));
    }
    @Bean
    public WhitePawn whitePawn7(){
        return new WhitePawn(cellPiece.getCell(PiecesName.WHITE_PAWN));
    }
    @Bean
    public WhitePawn whitePawn8(){
        return new WhitePawn(cellPiece.getCell(PiecesName.WHITE_PAWN));
    }

    @Bean
    public BlackKing blackKing(){
        return new BlackKing(cellPiece.getCell(PiecesName.BLACK_KING));
    }
    @Bean
    public BlackQueen blackQueen(){
        return new BlackQueen(cellPiece.getCell(PiecesName.BLACK_QUEEN));
    }
    @Bean
    public BlackRook blackRook1(){
        return new BlackRook(cellPiece.getCell(PiecesName.BLACK_ROOK));
    }
    @Bean
    public BlackRook blackRook2(){
        return new BlackRook(cellPiece.getCell(PiecesName.BLACK_ROOK));
    }
    @Bean
    public BlackBishop blackBishop1(){
        return new BlackBishop(cellPiece.getCell(PiecesName.BLACK_BISHOP));
    }
    @Bean
    public BlackBishop blackBishop2(){
        return new BlackBishop(cellPiece.getCell(PiecesName.BLACK_BISHOP));
    }
    @Bean
    public BlackKnight blackKnight1(){
        return new BlackKnight(cellPiece.getCell(PiecesName.BLACK_KNIGHT));
    }
    @Bean
    public BlackKnight blackKnight2(){
        return new BlackKnight(cellPiece.getCell(PiecesName.BLACK_KNIGHT));
    }
    @Bean
    public BlackPawn blackPawn1(){
        return new BlackPawn(cellPiece.getCell(PiecesName.BLACK_PAWN));
    }
    @Bean
    public BlackPawn blackPawn2(){
        return new BlackPawn(cellPiece.getCell(PiecesName.BLACK_PAWN));
    }
    @Bean
    public BlackPawn blackPawn3(){
        return new BlackPawn(cellPiece.getCell(PiecesName.BLACK_PAWN));
    }
    @Bean
    public BlackPawn blackPawn4(){
        return new BlackPawn(cellPiece.getCell(PiecesName.BLACK_PAWN));
    }
    @Bean
    public BlackPawn blackPawn5(){
        return new BlackPawn(cellPiece.getCell(PiecesName.BLACK_PAWN));
    }
    @Bean
    public BlackPawn blackPawn6(){
        return new BlackPawn(cellPiece.getCell(PiecesName.BLACK_PAWN));
    }
    @Bean
    public BlackPawn blackPawn7(){
        return new BlackPawn(cellPiece.getCell(PiecesName.BLACK_PAWN));
    }
    @Bean
    public BlackPawn blackPawn8(){
        return new BlackPawn(cellPiece.getCell(PiecesName.BLACK_PAWN));
    }


}
