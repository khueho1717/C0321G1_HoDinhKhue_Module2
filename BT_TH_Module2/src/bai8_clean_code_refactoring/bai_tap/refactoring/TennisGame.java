package bai8_clean_code_refactoring.bai_tap.refactoring;

public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int markScore1, int markScore2) {
        String message = "";
        int tempScore = 0;
        if (markScore1 == markScore2) {
            switch (markScore1) {
                case 0:
                    message = "Love-All";
                    break;
                case 1:
                    message = "Fifteen-All";
                    break;
                case 2:
                    message = "Thirty-All";
                    break;
                case 3:
                    message = "Forty-All";
                    break;
                default:
                    message = "Deuce";
                    break;

            }
        } else if (markScore1 >= 4 || markScore2 >= 4) {
            int minusResult = markScore1 - markScore2;
            if (minusResult == 1) message = "Advantage player1";
            else if (minusResult == -1) message = "Advantage player2";
            else if (minusResult >= 2) message = "Win for player1";
            else message = "Win for player2";
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = markScore1;
                else {
                    message += "-";
                    tempScore = markScore2;
                }
                switch (tempScore) {
                    case 0:
                        message += "Love";
                        break;
                    case 1:
                        message += "Fifteen";
                        break;
                    case 2:
                        message += "Thirty";
                        break;
                    case 3:
                        message += "Forty";
                        break;
                }
            }
        }
        return message;
    }
}
