import java.util.List;

public class FindMaxValue {
    public static int findMaxValue(List<Integer> number) {
        int max = number.get(0);
        for (int i = 0; i < number.size(); i++) {
            if (max < number.get(i)) {
                max = number.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        String PATH_NUMBER = "./src/files/numbers.txt";
        String PATH_RESULT = "./src/files/result.txt";
        List<Integer> numbers = readAndWriteFile.readFile(PATH_NUMBER);
        int maxValue = findMaxValue(numbers);
        readAndWriteFile.writeFile(PATH_RESULT, maxValue);
    }
}
