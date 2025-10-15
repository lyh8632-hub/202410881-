package ch05.sec07;

public class MultidimensionalArrayByNewExample {
    public static void main(String[] args) {
        // 수학 점수 3명 2개 과목 점수를 위한 2차원 배열 생성
        int[][] mathScores = new int[2][3];
        for (int i = 0; i < mathScores.length; i++) {    // 행의 수 만큼 반복
            for (int k = 0; k < mathScores[i].length; k++) {  // 열의 수 만큼 반복
                System.out.println("mathScores[" + i + "][" + k + "] = " + mathScores[i][k]);
            }
        }

        System.out.println();

        mathScores[0][0] = 80;
        mathScores[0][1] = 83;
        mathScores[0][2] = 85;
        mathScores[1][0] = 86;
        mathScores[1][1] = 90;
        mathScores[1][2] = 92;
        // 점수 입력 후 출력
        for (int i = 0; i < mathScores.length; i++) {    // 행의 수 만큼 반복
            for (int k = 0; k < mathScores[i].length; k++) {  // 열의 수 만큼 반복
                System.out.println("mathScores[" + i + "][" + k + "] = " + mathScores[i][k]);
            }
        }

        // 전체 학생의 수학 평균 점수 구하기
        int totalStudent = 0;
        int totalMathSum = 0;
        for (int i = 0; i < mathScores.length; i++) {    // 행의 수 만큼 반복
            totalStudent += mathScores[i].length;        // 열의 수 만큼 더함
            for (int k = 0; k < mathScores[i].length; k++) {  // 열의 수 만큼 반복
                totalMathSum += mathScores[i][k];        // 점수 합산
            }
        }

        double totalMathAvg = (double) totalMathSum / totalStudent;
        System.out.println("전체 학생의 수학 평균 점수: " + totalMathAvg);
        System.out.println();

        int[][] englishScores = new int[2][2];
        for (int i = 0; i < englishScores.length; i++) {    // 행의 수 만큼 반복
            for (int k = 0; k < englishScores[i].length; k++) {  // 열의 수 만큼 반복
                System.out.println("englishScores[" + i + "][" + k + "] = " + englishScores[i][k]);
            }
        }

        System.out.println();

        englishScores[0][0] = 90;
        englishScores[0][1] = 91;
        englishScores[1][0] = 92;
        englishScores[1][1] = 93;
        // 점수 입력 후 출력
        for (int i = 0; i < englishScores.length; i++) {    // 행의 수 만큼 반복
            for (int k = 0; k < englishScores[i].length; k++) {  // 열의 수 만큼 반복
                System.out.println("englishScores[" + i + "][" + k + "] = " + englishScores[i][k]);
            }
        }

        // 전체 학생의 영어 평균 점수 구하기
        int totalEnglishStudent = 0;
        int totalEnglishSum = 0;
        for (int i = 0; i < englishScores.length; i++) {    // 행의 수 만큼 반복
            totalEnglishStudent += englishScores[i].length; // 열의 수 만큼 더함
            for (int k = 0; k < englishScores[i].length; k++) {  // 열의 수 만큼 반복
                totalEnglishSum += englishScores[i][k];     // 점수 합산
            }
        }

        double totalEnglishAvg = (double) totalEnglishSum / totalEnglishStudent;
        System.out.println("전체 학생의 영어 평균 점수: " + totalEnglishAvg);
    }
}



