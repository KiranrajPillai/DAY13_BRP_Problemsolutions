import java.util.Arrays;

public class BinarySearchWord {
    public static void main(String[] args) {
        char charArr[] = {'A','B','C','D'};
        Arrays.sort(charArr);
        char charKey = 'A';
        System.out.println(charKey + " found at index = "
                + Arrays.binarySearch(charArr, charKey));
    }
}
