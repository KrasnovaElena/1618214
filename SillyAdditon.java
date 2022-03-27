public class SillyAdditon {
    public static int add(int num1,int num2){
        int res = 0, m = 1;
        while (num1 != 0 || num2 != 0) {
            int s = num1 % 10 + num2 % 10;
            res += s * m;
            m *= s < 10 ? 10 : 100;
            num1 /= 10;
            num2 /= 10;
        }
        return res;
    }
}
