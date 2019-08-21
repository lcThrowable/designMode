package shipeiqi.duixiangshipei;

import shipeiqi.leideshipeiqi.Source;
import shipeiqi.leideshipeiqi.Targetable;


public class AdapterTest {



    public static void main(String[] args) {

        Source source = new Source();

        Targetable target = new Wrapp(source);

        target.method1();

        target.method2();

    }

}
