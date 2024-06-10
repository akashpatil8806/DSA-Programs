import java.util.Arrays;

public class UsingStringB03 {
    public static void main(String[] args) {
        String[] arr = { "Hello", "world" };
        StringBuilder reversed = new StringBuilder();
        for (int i = arr.length; i > 0; i--)

        {
            reversed.append(arr[i - 1]).append(" "); 

        }
        ;
        String[] reversedArray = reversed.toString().split(" ");
        System.out.println(Arrays.toString(reversedArray));
    }
}
