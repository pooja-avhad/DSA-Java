public class StockProfit 
{
    public static void main(String[] args) 
    {
        int [] prices={7,1,5,3,6,4};

        int Minprice=prices[0];
        int maxprofit=0;

        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]<Minprice)
            {
                Minprice=prices[i];
            }
            int Profit=prices[i]-Minprice;
            if(Profit > maxprofit)
            {
                maxprofit=Profit;
            }
        }
        System.out.println("Minimum Buy price:"+Minprice);
        System.out.println("Maximum profit:"+maxprofit);
    }
}
