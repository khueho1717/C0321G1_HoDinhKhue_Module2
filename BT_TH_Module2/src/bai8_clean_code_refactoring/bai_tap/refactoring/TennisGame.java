package bai8_clean_code_refactoring.bai_tap.refactoring;

public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int markScore1, int markScore2) {
        String message = "";
        int tempScore = 0;
        final String SCORE = "Love-All";
        final String SCORE1 = "Fifteen-All";
        final String SCORE2 = "Thirty-All";
        final String SCORE3 = "Forty-All";
        final String MORE = "Deuce";
        if (markScore1 == markScore2) {
            switch (markScore1) {
                case 0:
                    return SCORE;
                case 1:
                    return SCORE1;
                case 2:
                    return SCORE2;
                case 3:
                    return SCORE3;
                default:
                    return MORE;

            }
        } else if (markScore1 >= 4 || markScore2 >= 4) {
            int minusResult = markScore1 - markScore2;
            if (minusResult >0 ) {
                if (minusResult==1){
                    return "Advantage player1";
                }else {
                    return "Win for player1";
                }
            } else{
                if (minusResult == -1) {
                    return "Advantage player2";
                }else {
                    return "Win for player2";
                }
            }
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) {
                    tempScore = markScore1;
                }else {
                    message += "-";
                    tempScore = markScore2;
                }
                switch (tempScore) {
                    case 0:
                        message += SCORE;
                        break;
                    case 1:
                        message += SCORE1;
                        break;
                    case 2:
                        message += SCORE2;
                        break;
                    case 3:
                        message += SCORE3;
                        break;
                }
            }
        }
        return message;
    }
}
