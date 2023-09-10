
public class JvmComprehension {// Создается класс JvmComprehension. Загружается с помощью Application ClassLoader,т.к класс некоровый и не java.util-класс

    public static void main(String[] args) {
        int i = 1;                      // 1 создаётся переменная типа данных int, записывается в Stack Memory;
        Object o = new Object();        // 2 создаётся объект класса Object, находится в куче, очищается GС;
        Integer ii = 2;                 // 3 создаётся объект класса Integer, находится в куче, очищается GС;
        printAll(o, i, ii);             // 4 создаётся фрэйм стека метода printAll;
        System.out.println("finished"); //  вызывается статическое поле класса System,
                                        //  у которого вызывается метод println() с аргументом
                                        //  в виде объекта класса String, находится в локальных переменных стэка фрэйма, во время выполнения метода;
    }

    private static void printAll(Object o, int i, Integer ii) {
        Integer uselessVar = 700;                   // 5 создаётся объект класса Integer, находится в куче, очищается GС;
        System.out.println(o.toString() + i + ii);  // 6 находится в куче, очищается GС;
    }
}