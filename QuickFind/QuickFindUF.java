package QuickFind;

public class QuickFindUF
{

    /*
    * Algoritmo QuickFind
    * */

    private final int[] id;

    public QuickFindUF(int n)
    {
        this.id = new int[n];
        // Preechendo o array
        for (int i = 0; i < this.id.length; i++)
        {
            this.id[i] = i;
        }
    }

    public boolean isConnected(int p, int q)
    {
        return this.id[p] == this.id[q];
    }
    public void union(int p, int q)
    {
        int pid = this.id[p];
        int qid = this.id[q];
        for (int i = 0; i < this.id.length; i++)
        {
            if (this.id[i] == pid) this.id[i] = qid;
        }
    }
    public void showList()
    {
        for( int item: this.id )
        {
            System.out.print(item);
        }
    }
}

