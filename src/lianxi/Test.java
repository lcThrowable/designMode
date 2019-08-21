package lianxi;

import java.io.PrintWriter;

public class Test{
        public static void main(String[] args) {
            Test test=new Test();
            test.print("cababa");

        }
        public void print(String str){
            for (int i=1;i<=str.length();i++){
                if(str.split(str.substring(0,i)).length==0){
                    System.out.println(str.length()/i+str.substring(0,i));
                    break;
                }
            }
            test();
        }
        public static void test(){
          /*  print();*/
        }
}
