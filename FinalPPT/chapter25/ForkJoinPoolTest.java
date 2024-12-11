import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
import java.util.stream.LongStream;

public class ForkJoinPoolTest {

    public static void main(String[] args) {
        // 배열 생성 (1부터 100,000까지의 숫자 배열)
        long[] numbers = LongStream.rangeClosed(1, 100_000).toArray();

        // ForkJoinTask 생성 및 ForkJoinPool을 통한 병렬 합계 계산
        ForkJoinTask<Long> task = new ForkJoinSumCalculator(numbers);
        long result = (new ForkJoinPool()).invoke(task);

        // 결과 출력
        System.out.println("Sum: " + result);
    }
}

class ForkJoinSumCalculator extends RecursiveTask<Long> {
    private final long[] numbers;
    private final int start;
    private final int end;
    public static final long THRESHOLD = 1000; // 임계값

    // 생성자
    public ForkJoinSumCalculator(long[] numbers) {
        this(numbers, 0, numbers.length);
    }

    private ForkJoinSumCalculator(long[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        int length = end - start;

        // 작은 작업은 순차적으로 계산
        if (length <= THRESHOLD) {
            return computeSequentially();
        }

        // 작업 분할
        ForkJoinSumCalculator leftTask =
                new ForkJoinSumCalculator(numbers, start, start + length / 2);
        leftTask.fork(); // 비동기 실행

        ForkJoinSumCalculator rightTask =
                new ForkJoinSumCalculator(numbers, start + length / 2, end);
        Long rightResult = rightTask.compute(); // 동기 실행
        Long leftResult = leftTask.join(); // 결과 대기 후 합산

        return leftResult + rightResult;
    }

    // 순차적으로 계산
    private long computeSequentially() {
        long sum = 0;
        for (int i = start; i < end; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
