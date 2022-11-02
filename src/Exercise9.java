public class Exercise9 {
    public static void main(String[] args) {
        int[][] multi = new int[10][10];



        for (int i = 0; i < multi.length; i++) {
            for (int j = 0; j < multi[0].length; j++) {
                multi[i][j] = 0;
            }
        }
        multi[0][4] = 1;
        multi[2][6] = 1;
        multi[3][1] = 1;
        multi[8][6] = 1;

        int counterRows = 0;
        int counterCols = 0;
        boolean allZeros;

        for (int row = 0; row < multi.length; row++) {
            allZeros = true;                                                    //Contar filas
            for (int col = 0; col < multi[0].length; col++) {
                if (multi[row][col] != 0) {
                    allZeros = false;
                }
            }

            if (allZeros) {
                counterRows++;
            }

        }
        for (int col = 0; col < multi[0].length; col++) {                                //contar columnas
            allZeros = true;
            for (int row = 0; row < multi.length; row++) {
                if (multi[col][row] != 0) {
                    allZeros = false;
                }
            }
            if (allZeros) {
                counterCols++;
            }
        }
        System.out.println("Rows all 0 = " + counterRows);
        System.out.println("Cols all 0 = " + counterCols);

    }
}

