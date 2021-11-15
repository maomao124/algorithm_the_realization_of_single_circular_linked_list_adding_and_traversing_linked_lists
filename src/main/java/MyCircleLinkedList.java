import java.awt.*;

/**
 * Project name(项目名称)：算法_单循环链表的实现_链表的添加和遍历
 * Package(包名): PACKAGE_NAME
 * Class(类名): MyCircleLinkedList
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/15
 * Time(创建时间)： 21:37
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class MyCircleLinkedList
{
    private Node head;//头结点, 不存数据
    private Node tail;//尾结点, 指向链表的最后一个节点
    private int size;   //大小

    public MyCircleLinkedList()
    {
        head = new Node(Integer.MIN_VALUE, null);
        head.next = head;  //自己指向自己
        tail = head;
        size = 0;
    }

    /**
     * 添加到链表尾部
     *
     * @param item
     */
    public void add(int item)
    {
        /********** Begin *********/
        if (size == 0)
        {
            Node node = new Node(item, head);
            node.next = head;
            head.next = node;
            tail = node;
            size++;
        }
        else
        {
            Node node = new Node(item, head);
            Node node1 = head;
            while (node1 != tail)
            {
                node1 = node1.next;
            }
            node.next = head;
            node1.next = node;
            tail = node;
            size++;
        }

        /********** End *********/
    }

    public void add(int item, int index)
    {
        if (size == 0 && index == 0)
        {
            Node node = new Node(item, head);
            node.next = head;
            head.next = node;
            tail = node;
            size++;
            return;
        }
        if (index < 0 || index > size)
        {
            System.out.println("异常！！！索引为" + index + "大小为" + size);
            Toolkit.getDefaultToolkit().beep();
            return;
        }
        if(index==size)
        {
            Node node = new Node(item, head);
            Node node1 = head;
            while (node1 != tail)
            {
                node1 = node1.next;
            }
            node.next = head;
            node1.next = node;
            tail = node;
            size++;
        }
        else
        {
            Node node = new Node(item, head);
            Node node1 = head;
            for (int i = 0; i < index; i++)
            {
                node1 = node1.next;
            }
            node.next = node1.next;
            node1.next = node;
            //tail = node;
            size++;
        }
    }

    /**
     * 遍历链表并输出元素
     */
    public void output()
    {
        /********** Begin *********/
        Node node = head;
        node = node.next;
        System.out.println("数量：" + size);

        while (node != tail)
        {
            System.out.print(node.item + " ");
            node = node.next;
        }
        System.out.print(node.item);
         /*
        for (int i = 0; i < size; i++)
        {
            System.out.print(node.item + " ");
            node = node.next;
        }
        */
        System.out.println();

        /********** End *********/
    }

    public boolean isEmpty()
    {
        return head.next == head;
    }

    public int size()
    {
        return size;
    }

    //结点内部类
    private static class Node
    {
        int item;       //数据
        Node next;      //下一节点

        Node(int item, Node next)  //构造方法
        {
            this.item = item;
            this.next = next;
        }
    }
}
