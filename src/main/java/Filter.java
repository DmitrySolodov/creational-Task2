import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int threshold;

    public Filter(int threshold) {
        this.threshold = threshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем фильтрацию");
        List<Integer> result = new ArrayList<>();
        for (Integer i : source) {
            if (i > threshold) {
                logger.log("Элемент " + i + " проходит");
                result.add(i);
            } else {
                logger.log("Элемент " + i + " не проходит");
            }
        }
        logger.log("Прошло фильтр " + result.size() + " элементов из " + source.size());
        return result;
    }
}
