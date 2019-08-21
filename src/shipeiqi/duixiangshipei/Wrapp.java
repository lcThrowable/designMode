package shipeiqi.duixiangshipei;
import shipeiqi.leideshipeiqi.Source;
import shipeiqi.leideshipeiqi.Targetable;

public class Wrapp implements Targetable {



    private Source source;



    public Wrapp(Source source){

        super();

        this.source = source;

    }

    @Override

    public void method2() {

        System.out.println("this is the targetable method!");

    }



    @Override

    public void method1() {

        source.method1();

    }

}
