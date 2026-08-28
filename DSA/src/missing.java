public class missing {
    public static void main(String[] args){
        int arr[]={50,20,40,60};
        int n=5;
        int total=n*(n+1)/2;
        int sum=0;
        for (int i=0;i< arr.length;i++){
            sum+=arr[i];
            }
        int missing=total-sum;

        System.out.println("Missing number;"+missing);
        }
    }

