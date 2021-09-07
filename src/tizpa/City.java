package tizpa;

public class City {
    private int[][] mapRatio;

    public City() {
        initMap();
    }

    public int getMapRatio(int row, int col) {
        return mapRatio[row][col];
    }

    private void initMap(){
        mapRatio = new int[5][5];

        mapRatio[0][0] = 1;
        mapRatio[0][1] = 2;
        mapRatio[0][2] = 2;
        mapRatio[0][3] = 4;
        mapRatio[0][4] = 3;

        mapRatio[1][0] = 2;
        mapRatio[1][1] = 1;
        mapRatio[1][2] = 4;
        mapRatio[1][3] = 2;
        mapRatio[1][4] = 3;

        mapRatio[2][0] = 3;
        mapRatio[2][1] = 5;
        mapRatio[2][2] = 1;
        mapRatio[2][3] = 3;
        mapRatio[2][4] = 2;

        mapRatio[3][0] = 4;
        mapRatio[3][1] = 3;
        mapRatio[3][2] = 3;
        mapRatio[3][3] = 1;
        mapRatio[3][4] = 2;

        mapRatio[4][0] = 3;
        mapRatio[4][1] = 3;
        mapRatio[4][2] = 2;
        mapRatio[4][3] = 2;
        mapRatio[4][4] = 1;
    }
}
