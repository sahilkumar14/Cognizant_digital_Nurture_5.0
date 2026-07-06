public class FinancialForecasting {
    public static double predictValue(double currentValue, double growthRate,int years){
        if(years == 0){
            return currentValue;
        }

        return predictValue(currentValue, growthRate, years - 1) * (1 + growthRate);
    }
    public static void main(String[] args) {
        
        double currentValue = 1000;
        double growthRate = 0.10;
        int years = 5;

        double futureValue = predictValue(currentValue, growthRate, years);

        System.out.println("Predicted Future Value: "+futureValue);
    }
}
