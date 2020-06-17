public class Task42 {
    private static int LetterDiff;
    private static int NumDiff;

    public static void main(String[] args) {
        System.out.println(canMove("Pawn", "E2", "E4"));
    }

    public static boolean canMove(String figure, String start, String end) {
        if (figure.equals("Pawn")) return pawnCanMove(start, end);
        else if (figure.equals("Rook")) return rookCanMove(start, end);
        else if (figure.equals("Knight")) return knightCanMove(start, end);
        else if (figure.equals("Bishop")) return bishopCanMove(start, end);
        else if (figure.equals("Queen")) return queenCanMove(start, end);
        else if (figure.equals("King")) return kingCanMove(start, end);
        return false;
    }

    private static void FindDiffs(String start, String end) {
        LetterDiff = java.lang.Math.abs(end.charAt(0) - start.charAt(0));
        NumDiff = java.lang.Math.abs(end.charAt(1) - start.charAt(1));
    }

    private static boolean rookCanMove(String start, String end) {
        FindDiffs(start, end);
        return LetterDiff == 0 || NumDiff == 0;
    }

    private static boolean knightCanMove(String start, String end) {
        FindDiffs(start, end);
        return LetterDiff == 2 && NumDiff == 1 || LetterDiff == 1 && NumDiff == 2;
    }

    private static boolean bishopCanMove(String start, String end) {
        FindDiffs(start, end);
        return LetterDiff == NumDiff;
    }

    private static boolean queenCanMove(String start, String end) {
        return rookCanMove(start, end) || bishopCanMove(start, end);
    }

    private static boolean kingCanMove(String start, String end) {
        return NumDiff <= 1 && LetterDiff <= 1;
    }

    private static boolean pawnCanMove(String start, String end) {
        if (LetterDiff != 0)
            return false;
        if (NumDiff > 2)
            return false;
        if (start.charAt(1) != '2' && NumDiff > 1)
            return false;
        return true;
    }
}
