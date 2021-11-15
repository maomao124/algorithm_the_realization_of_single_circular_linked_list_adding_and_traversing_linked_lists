import java.util.Scanner;

/**
 * Project name(项目名称)：算法_单循环链表的实现_链表的添加和遍历
 * Package(包名): PACKAGE_NAME
 * Class(类名): MyCircleLinkedListTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/15
 * Time(创建时间)： 21:37
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class MyCircleLinkedListTest
{
    public static void main(String[] args)
    {
        /*
        MyCircleLinkedList list = new MyCircleLinkedList();
        Scanner in = new Scanner(System.in);
        while (in.hasNext())
        {
            int item = in.nextInt();
            list.add(item);
        }
        list.output();
         */
        MyCircleLinkedList list = new MyCircleLinkedList();
        list.add(1);
        list.output();
        list.add(2);
        list.output();
        list.add(3);
        list.output();
        list.add(4);
        list.output();
        list.add(6);
        list.output();
        list.add(88,4);
        list.output();
    }
}
