package QuickFind;

public class QuickFindEx
{
    public static void main(String[] args)
    {
        QuickFindUF n =  new QuickFindUF(8);
        n.union(4, 3);
        boolean result = n.isConnected(3, 4);
        System.out.println(result);
        n.showList();
    }
}
