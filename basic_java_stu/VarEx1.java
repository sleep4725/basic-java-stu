/**
 * 두 변수의 값 교환하기
 */
public class VarEx1 {
    public static void main(String[] args) {
        int xData = 10;
        int yData = 11;
        int temp = 0;

        System.out.println("xData : " + xData + ", yData : " +yData);

        temp = xData;
        xData = yData;
        yData = temp;

        System.out.println("xData : " + xData + ", yData : " +yData);
    }
}