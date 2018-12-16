public class FindMissingNumber {

    public static void main(String[] args) {

        int a[] ={-1,0,1,2,4,5,6,7,8,9,10};
        int sum = 0;
        for (int i=0; i<a.length;i++)
        {
            sum = sum+ a[i];

        }

        System.out.println(sum);

        int total = 0;
        for (int j=-1;j<=10;j++) {
            total = total + j;
        }
        System.out.println(total);
        System.out.println("missing Number is ------>"+(total-sum));


    }


}
