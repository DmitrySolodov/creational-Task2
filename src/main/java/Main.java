import java.util.*;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер списка: ");
        int size = scanner.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        int maxValue = scanner.nextInt();
        logger.log("Создаём и наполняем список");
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(i, random.nextInt(maxValue));
        }
        System.out.print("Вот случайный список: ");
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");

        int threshold = scanner.nextInt();
        Filter filter = new Filter(threshold);
        List<Integer> result = filter.filterOut(list);
        logger.log("Выводим результат на экран");
        System.out.print("Отфильтрованный список: ");
        for (Integer i : result) {
            System.out.print(i + " ");
        }
        System.out.println();
        logger.log("Завершаем программу");
    }
}
