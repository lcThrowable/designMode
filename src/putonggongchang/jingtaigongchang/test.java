package putonggongchang.jingtaigongchang;

import putonggongchang.Sender;

public class test {
    public static void main(String[] args) {
        Sender sender = SendFactory.produceMail();

        sender.Send();
    }

}
