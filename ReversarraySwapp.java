/**
 * ReversarraySwapp
 */
public class ReversarraySwapp {

     static void revers(int a[],int n){
        int i,t,k;
        for(i=0;i<n/2;i++){
            t=a[i];
            a[i]=a[n-i-1];
            a[n-i-1]=t;
        }
        for(k=0;k<n;k++){
            System.out.println(a[k]);

        }
     }
     public static void main(String[] args) {
        int a[]={10,20,39,40};
        revers(a,a.length);
     }
}