//  This is the revers array 

class  Reversarray{
    static void revers(int a[],int n){
        int [] b=new int[n];
        int j=n;
        for(int i=0;i<n;i++){
            b[j-1]=a[i];
            j=j-1;
        }
        System.out.println("revers array is :\n");
        for(int k=0;k<n;k++){
            System.out.println(b[k]);
        }
    }
    public static void main(String[] args) {
        int []arr={10,20,30,40,50};
        revers(arr, arr.length);
    }
}