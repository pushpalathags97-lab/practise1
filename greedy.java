public class greedy {
    public static void main(String[] args) {
    
    int[] price={10,20,30,40,50};
    int money=100;
    int chocolatesprice=50;
    int noofchocolates=money/chocolatesprice;
    int remainingmoney=money%chocolatesprice;
    System.out.println("No of chocolates: "+noofchocolates);
    System.out.println("Remaining money: "+remainingmoney);
    
}
}

