package com.epam.rd.autotasks.chesspuzzles.services;

import com.epam.rd.autotasks.chesspuzzles.Cell;

import java.util.List;
import java.util.Map;

/**
 * @author Denys Parshutkin
 * @version 1.0.0
 */
public class CellPiece {
    private final Map<Character, List<Integer>> map;

    public CellPiece(String filePath) {
        this.map = ChessPieceMapFromFile.getChessPieceMap(filePath);
    }

    public Cell getCell(char piece){
        if (!map.containsKey(piece)){
            return null;
        }
        List<Integer> chessPieceList = map.get(piece);
        int value = map.get(piece).get(0);
        char letter = ' ';
        int number = 9 -(int)Math.ceil((double) value /8);
        switch (value % 8) {
            case 1:
                letter = 'A';
                break;
            case 2:
                letter = 'B';
                break;
            case 3:
                letter = 'C';
                break;
            case 4:
                letter = 'D';
                break;
            case 5:
                letter = 'E';
                break;
            case 6:
                letter = 'F';
                break;
            case 7:
                letter = 'G';
                break;
            case 0:
                letter = 'H';
                break;
        }
        if (chessPieceList.size()>1){
            chessPieceList.remove(Integer.valueOf(value));
            map.put(piece, chessPieceList);
        }
        return Cell.cell(letter, number);
    }
}
