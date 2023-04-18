package game.chess;

public class peace {
    Rule r = new Rule();
    int fail = 1;
    int success = 0;

    public int pawn(String str[][], String color, int i, int a, int b, int c, int d) {


        if (str[a][b].contains("Pawn")) {
            if (i % 2 == 0) {
                if (a == 7 && (b == d && a - 2 == c)) {
                    if (r.straight(str, a, b, c, d, i) == Math.abs(a - c)) {
                        str[a][b] = "";
                        str[c][d] = color + "Pawn";
                        return success;
                    } else {
                        System.out.println("갈 수 없는 위치입니다. 다시 두세요");
                        return fail;
                    }
                } else if (b == d && a - 1 == c) {
                    str[a][b] = "";
                    if (c == 1) {
                        str[c][d] = color + "Queen";
                        return success;
                    } else {
                        str[c][d] = color + "Pawn";
                        return success;
                    }
                } else if (str[c][d].contains("B_") && ((b + 1 == d || b - 1 == d) && a - 1 == c)) {
                    str[a][b] = "";
                    if (c == 1) {
                        str[c][d] = color + "Queen";
                        return success;
                    } else {
                        str[c][d] = color + "Pawn";
                        return success;
                    }
                } else {
                    System.out.println("잘못된 위치입니다. 다시 두세요");
                    return fail;
                }
            } else {
                if (a == 2 && (b == d && a + 2 == c)) {
                    if (r.straight(str, a, b, c, d, i) == Math.abs(a - c)) {
                        str[a][b] = "";
                        str[c][d] = color + "Pawn";
                        return success;
                    } else {
                        System.out.println("갈 수 없는 위치입니다. 다시 두세요");
                        return fail;
                    }
                } else if (b == d && a + 1 == c) {
                    str[a][b] = "";
                    if (c == 8) {
                        str[c][d] = color + "Queen";
                        return success;
                    } else {
                        str[c][d] = color + "Pawn";
                        return success;
                    }
                } else if (str[c][d].contains("W_") && ((b + 1 == d || b - 1 == d) && a + 1 == c)) {
                    str[a][b] = "";
                    if (c == 8) {
                        str[c][d] = color + "Queen";
                        return success;
                    } else {
                        str[c][d] = color + "Pawn";
                        return success;

                    }
                }else {
                    System.out.println("잘못된 위치입니다. 다시 두세요");
                    return fail;
                }
            }
        } else {
            return success;
        }
    }


    public int rook(String str[][], String color, int a, int b, int c, int d, int i) {

        if (str[a][b].contains("Rook")) {
            if (a == c) {
                if (r.straight(str, a, b, c, d, i) == Math.abs(b - d)) {
                    str[a][b] = "";
                    str[c][d] = color + "Rook";
                    return success;
                }
            } else if (b == d) {
                if (r.straight(str, a, b, c, d, i) == Math.abs(a - c)) {
                    str[a][b] = "";
                    str[c][d] = color + "Rook";
                    return success;
                }
            } else {
                System.out.println("잘못된 위치입니다. 다시 두세요");
                return fail;
            }

        } else
            return success;
        return fail;
    }


    public int bishop(String str[][], String color, int a, int b, int c, int d, int i) {

        if (str[a][b].contains("Bishop")) {
            if (r.diagonal(str, a, b, c, d) == Math.abs(a - c)) {
                if (Math.abs(c - a) == Math.abs(d - b)) {
                    str[a][b] = "";
                    str[c][d] = color + "Bishop";
                    return success;
                } else {
                    System.out.println("잘못된 위치입니다. 다시 두세요");
                    return fail;
                }
            } else {
                System.out.println("갈 수 없는 위치입니다. 다시 두세요");
                return fail;
            }
        } else
            return success;
    }

    public int knight(String str[][], String color, int a, int b, int c, int d) {

        if (str[a][b].contains("Knight")) {
            if (Math.abs(a - c) == 2) {
                if (Math.abs(b - d) == 1) {
                    str[a][b] = "";
                    str[c][d] = color + "Knight";
                    return success;
                } else {
                    System.out.println("잘못된 위치입니다. 다시 두세요");
                    return fail;
                }
            } else if (Math.abs(a - c) == 1) {
                if (Math.abs(b - d) == 2) {
                    str[a][b] = "";
                    str[c][d] = color + "Knight";
                    return success;
                } else {
                    System.out.println("잘못된 위치입니다. 다시 두세요");
                    return fail;
                }
            } else {
                System.out.println("잘못된 위치입니다. 다시 두세요");
                return fail;
            }
        } else
            return success;
    }

    public int king(String str[][], String color, int a, int b, int c, int d) {

        if (str[a][b].contains("King")) {
            if (Math.abs(c - a) < 2 && Math.abs(d - c) < 2) {
                str[a][b] = "";
                str[c][d] = color + "King";
                return success;
            } else {
                System.out.println("잘못되 위치입니다. 다시 두세요");
                return fail;
            }
        } else
            return success;
    }

    public int queen(String str[][], String color, int a, int b, int c, int d, int i) {

        if (str[a][b].contains("Queen")) {
            if ((a == c || b == d) || (Math.abs(c - a) == Math.abs(d - b))) {
                if (r.straight(str, a, b, c, d, i) == Math.abs(a - c)) {
                    str[a][b] = "";
                    str[c][d] = color + "Queen";
                    return success;
                }else if (r.diagonal(str, a, b, c, d) == Math.abs(a - c)) {
                    str[a][b] = "";
                    str[c][d] = color + "Queen";
                    return success;
                } else {
                    System.out.println("잘못된 위치입니다. 다시 두세요");
                    return fail;
                }
            } else {
                System.out.println("갈 수 없는 위치입니다. 다시 두세요");
                return fail;
            }
        } else
            return success;
    }
}

