package algbook;

public class BinarySearch {
    int[] items;
    int target;

    BinarySearch(int n, int target)
    {
        this.target = target;
        this.items = new int[n];
        for ( int i = 0; i < this.items.length; i++ )
        {
            this.items[i] = i;
        }
    }


    public void search()
    {
        double low = 0;
        double high = this.items.length - 1;

        while( low <= high)
        {
            int middle = (int) Math.floor((low + high) / 2) ;
            int guess = this.items[middle];

            if (guess == this.target)
            {
                System.out.println(middle);
            }

            if (guess > this.target)
            {
                high = middle - 1;
            } else
            {
                low = middle + 1;
            }
        }

    }


    public void listItems()
    {
        for (int item: this.items)
        {
            System.out.print(item + " ");
        }
    }
}
