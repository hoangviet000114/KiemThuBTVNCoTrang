import org.junit.platform.commons.util.StringUtils;

public class FindXY {
    public XAndY Cal(int a, int b, int c, int d, int e, int f){
        double D = a*e - d*b;
        double Dx = f*b - c*e;
        double Dy = d*c - a*f;
        double X, Y;

        String tempX, tempY;
        if (D==0){
            tempX = "Unknown";
            tempY = "Unknown";
        }
        else {
            X = Dx / D;
            Y = Dy / D;
            double XX = Math.round(X * 100.0) / 100.0;
            double YY = Math.round(Y * 100.0) / 100.0;
            tempX = String.valueOf(XX);
            tempY = String.valueOf(YY);
            String tempXX = String.valueOf(X);
            String tempYY = String.valueOf(Y);
            if (tempXX.charAt(0) == '-' && XX == 0)
                tempX = "-" + tempX;
            if (tempYY.charAt(0) == '-' && YY == 0)
                tempY = "-" + tempY;
            int x = tempX.indexOf('.');
            if (x == tempX.length() - 2) tempX += "0";
            x = tempY.indexOf('.');
            if (x == tempY.length() - 2) tempY += "0";
        }
        XAndY res = new XAndY(tempX, tempY);

        return res;
    }
}