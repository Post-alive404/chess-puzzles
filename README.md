# Spring Chess Puzzles

Chess is a famous table game. This project is about representing chess board states as Spring configurations.

## Details

([com.epam.rd.autotasks.chesspuzzles.config](src/main/java/com/epam/rd/autotasks/chesspuzzles/config) package):
- Default
- DefaultBlack
- DefaultWhite
- Puzzle01
- Puzzle02
- Puzzle03


### State String Symbols:

|Symbols|Meaning|
|---|---| 
| . | empty cell|
| K | black king|
| Q | black queen|
| R | black rook, castle|
| B | black bishop|
| N | black knight|
| P | black pawn|
| k | white king|
| q | white queen|
| r | white rook, castle|
| b | white bishop|
| n | white knight|
| p | white pawn|

Example:
```
RNBQKBNR
PPPPPPPP
........
........
....p...
........
pppp.ppp
rnbqkbnr
```

### Cell address
To address a cell, we use a regular chess scheme, as in an example below:
```
8│RNBQKBNR
7│PPPPPPPP
6│........
5│........
4│....p...
3│........
2│pppp.ppp
1│rnbqkbnr
 └────────
  ABCDEFGH      
```