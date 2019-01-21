public class Calc {
    int calculation(int a, int b){
        if (a>b){
            return a+b;
        }
        if (a<b){
            return a*b;
        }
        return a*a;
    }
}
