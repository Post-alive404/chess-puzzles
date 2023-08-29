package com.epam.rd.autotasks.chesspuzzles.services;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * @author Denys Parshutkin
 * @version 1.0.0
 */
public class ChessPieceMapFromFile {
    public static Map<Character, List<Integer>> getChessPieceMap(String boardPath){
        Map<Character, List<Integer>> mapChessPiece = new HashMap<>();

        try(FileReader reader = new FileReader(boardPath)) {
            int number = 1;
            int content;
            while ((content = reader.read()) != -1){
                char letter = (char) content;
                if(Character.getNumericValue(letter)==-1 && letter!='.'){
                    continue;
                }
                if(mapChessPiece.containsKey(letter)){
                    mapChessPiece.get(letter).add(number++);
                }else {
                    mapChessPiece.put(letter, new ArrayList<>());
                    mapChessPiece.get(letter).add(number++);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return mapChessPiece;
    }
}
