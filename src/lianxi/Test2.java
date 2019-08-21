package lianxi;

public class Test2 {
    public static void main(String[] args) {
        for(int i=0;i<300;i++){
            int a=i%2;
            int b=i%3;
            int c=i%5;
            int d=i%7;
            if(a==1&&b==2&&c==4&&d==0){
                System.out.println(i);
            }
        }
    }


}
