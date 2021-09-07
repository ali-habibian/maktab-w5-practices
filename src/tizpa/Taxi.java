package tizpa;

public class Taxi {
    private double[][] orderRatio;
    private final City city;

    public Taxi(City city) {
        initOrderRatio();
        this.city = city;
    }

    public double getOrderRatio(int row, int col) {
        return orderRatio[row][col];
    }

    private void initOrderRatio() {
        orderRatio = new double[3][4];

        // Economic orders row
        orderRatio[0][0] = 5000; // Base price
        orderRatio[0][1] = 1.4; // Rainfall and peak hours of traffic ratio
        orderRatio[0][2] = 1.2; // Peak hours of traffic ratio
        orderRatio[0][3] = 1.2; // Rainfall ratio

        // Special orders row ratios
        orderRatio[1][0] = 10000; // Base price
        orderRatio[1][1] = 3; // Rainfall and peak hours of traffic ratio
        orderRatio[1][2] = 2; // Peak hours of traffic ratio
        orderRatio[1][3] = 2; // Rainfall ratio

        // Motorcycle orders row ratios
        orderRatio[2][0] = 4000; // Base price
        orderRatio[2][1] = 1.5; // Rainfall and peak hours of traffic ratio
        orderRatio[2][2] = 2; // Peak hours of traffic ratio
        orderRatio[2][3] = 0.8; // Rainfall ratio
    }

    public double tripCost(int tripMethod, int tripCondition, int cityMapRow, int cityMapCol) {
        double baseCost = orderRatio[tripMethod][0] * city.getMapRatio(cityMapRow, cityMapCol);
        return baseCost * orderRatio[tripMethod][tripCondition];
    }
}
