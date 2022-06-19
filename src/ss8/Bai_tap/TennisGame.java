package ss8.Bai_tap;

public class TennisGame {
    final static int LOVE = 0 ;
    final static int FIFTEEN = 1 ;
    final static int THIRTY = 2 ;
    final static int FORTY = 3 ;

    public static String getScore(String player1Name, String player2Name, int pointOfPlayer1, int pointOfPlayer2) {

        String score = "";
        int tempScore = 0;
        boolean pointGreaterThan4 = (pointOfPlayer1 >= 4 || pointOfPlayer2 >= 4);

        if (pointOfPlayer1 == pointOfPlayer2) {
            switch (pointOfPlayer1) {
                case LOVE:
                    score = "Love-All";
                    break;
                case FIFTEEN:
                    score = "Fifteen-All";
                    break;
                case THIRTY:
                    score = "Thirty-All";
                    break;
                case FORTY:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        } else if (pointGreaterThan4) {

            int minusResult = pointOfPlayer1 - pointOfPlayer2;

            if (minusResult == 1){
                score = "Advantage player1";
            } else if (minusResult == -1){
                score = "Advantage player2";
            } else if (minusResult >= 2){
                score = "Win for player1";
            } else {
                score = "Win for player2";
            }

        } else {
            for (int point = 1; point < 3; point++) {
                if (point == 1){
                    tempScore = pointOfPlayer1;
                } else {
                    score += "-";
                    tempScore = pointOfPlayer2;
                }
                switch (tempScore) {
                    case LOVE:
                        score += "Love";
                        break;
                    case FIFTEEN:
                        score += "Fifteen";
                        break;
                    case THIRTY:
                        score += "Thirty";
                        break;
                    case FORTY:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }
}