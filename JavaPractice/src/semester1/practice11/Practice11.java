package semester1.practice11;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

public class Practice11 {
    public static void main(String args[])
    {
        // TASK 1
        demonstrateWrapperTwins();

        System.out.print("\n");

        // TASK 2
        showCompilerUnderTheHood();

        System.out.print("\n");

        // TASK 3
        String[] inputs = {"120", "-45", "300", "abc", "1024", ""};
        System.out.println("Розібрані числа: " + parseNumbersFromStrings(inputs));

        System.out.print("\n");

        // TASK 4
        System.out.println("Integer: " + Integer.MIN_VALUE + " .. " + Integer.MAX_VALUE);
        System.out.println("Byte: " + Byte.MIN_VALUE + " .. " + Byte.MAX_VALUE);
        System.out.println("Short: " + Short.MIN_VALUE + " .. " + Short.MAX_VALUE);
        System.out.println("Long: " + Long.MIN_VALUE + " .. " + Long.MAX_VALUE);
        findMinAndMax(List.of(12, -5, 90, 0, 44));
        int limit = Integer.MAX_VALUE;
        System.out.println("MAX_VALUE + 1 = " + (limit + 1));
        System.out.println("Дорівнює MIN_VALUE: " + (limit + 1 == Integer.MIN_VALUE));
        if (limit < Integer.MAX_VALUE)
        {
            limit++;
        }
        else
        {
            System.out.println("Додавання 1 неможливе без переповнення");
        }

        System.out.print("\n");

        // TASK 5
        testIntegerPool();

        System.out.print("\n");

        // TASK 6
        ArrayList<Integer> temperatures = new ArrayList<>();
        temperatures.add(18);
        temperatures.add(22);
        temperatures.add(null);
        temperatures.add(15);
        temperatures.add(null);
        temperatures.add(20);
        try
        {
            int t = temperatures.get(2);
            System.out.println(t);
        }
        catch (NullPointerException e)
        {
            System.out.println("null не можна розпакувати в int: викликається null.intValue()");
        }
        System.out.println("Сума без null: " + sumIgnoringNulls(temperatures));

        System.out.print("\n");

        // TASK 7
        System.out.println("Цифри: " + extractDigitsFromText("Server-04: CPU 85%, RAM 16GB"));
        double parsedDouble = Double.parseDouble("36.6");
        Double boxedDouble = Double.valueOf("99.95");
        System.out.println("parseDouble: " + parsedDouble + " valueOf: " + boxedDouble);
        double[] values = {parsedDouble, Double.NaN, Double.POSITIVE_INFINITY};
        for (double value : values)
        {
            System.out.println(value + " NaN=" + Double.isNaN(value) + " Infinite=" + Double.isInfinite(value));
        }

        System.out.print("\n");

        // TASK 8
        convertNumberSystems(42);
        System.out.println("101010 (2) = " + Integer.parseInt("101010", 2));
        System.out.println("FF (16) = " + Integer.parseInt("FF", 16));

        System.out.print("\n");

        // TASK 9
        String[] fixedArray = {"Київ", "Львів", "Одеса"};
        try
        {
            fixedArray[3] = "Харків";
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Масив має тільки 3 комірки, четвертої немає");
        }
        ArrayList<String> dynamicList = new ArrayList<>(Arrays.asList(fixedArray));
        dynamicList.add("Харків");
        dynamicList.add("Дніпро");
        dynamicList.add(1, "Тернопіль");
        dynamicList.remove(0);
        System.out.println("Масив: " + Arrays.toString(fixedArray));
        System.out.println("Динамічний список: " + dynamicList);

        System.out.print("\n");

        // TASK 10
        System.out.println("Ємності: " + traceArrayListCapacity(100));

        System.out.print("\n");

        // TASK 11
        Object[] oldData = new Object[10];
        for (int i = 0; i < oldData.length; i++)
        {
            oldData[i] = i + 1;
        }
        Object[] newData = growArrayManually(oldData);
        newData[10] = 11;
        System.out.println("Старий масив: " + Arrays.toString(oldData));
        System.out.println("Новий масив: " + Arrays.toString(newData));
        int dataSize = 11;
        System.arraycopy(newData, 2, newData, 3, dataSize - 2);
        newData[2] = 99;
        dataSize++;
        System.out.println("Вставка на індекс 2: " + Arrays.toString(newData) + " size=" + dataSize);

        System.out.print("\n");

        // TASK 12
        ArrayList<String> pipeline = new ArrayList<>();
        pipeline.add("Compile");
        pipeline.add("Package");
        pipeline.add("Deploy");
        System.out.println(pipeline + " size=" + pipeline.size());
        pipeline.add(0, "Checkout Git");
        System.out.println(pipeline + " size=" + pipeline.size());
        pipeline.add(2, "Run Unit Tests");
        System.out.println(pipeline + " size=" + pipeline.size());

        System.out.print("\n");

        // TASK 13
        ArrayList<Integer> speeds = new ArrayList<>(List.of(60, 85, 110, 95, 130));
        System.out.println("Перший: " + speeds.get(0));
        System.out.println("Центральний: " + speeds.get(speeds.size() / 2));
        System.out.println("Останній: " + speeds.get(speeds.size() - 1));
        for (int i = 0; i < speeds.size(); i++)
        {
            if (speeds.get(i) > 100)
            {
                System.out.println("Замінено: " + speeds.set(i, 100));
            }
        }
        System.out.println(speeds);

        System.out.print("\n");

        // TASK 14
        SimpleArrayList simple = new SimpleArrayList();
        System.out.println("Початкова ємність: " + simple.getCapacity());
        for (int i = 1; i <= 12; i++)
        {
            simple.add(i);
        }
        System.out.println("size=" + simple.size() + " capacity=" + simple.getCapacity());
        System.out.println("Останній: " + simple.get(simple.size() - 1));

        System.out.print("\n");

        // TASK 15
        ArrayList<String> logs = new ArrayList<>(500);
        System.out.println("Ємність 500 наперед зменшує кількість розширень і копіювань масиву");
        logs.ensureCapacity(1000);
        logs.add("Запуск");
        logs.add("Готово");
        System.out.println("ensureCapacity(1000) резервує місце, але size=" + logs.size());
        logs.trimToSize();
        System.out.println("trimToSize() скорочує внутрішній масив до size=" + logs.size());

        System.out.print("\n");

        // TASK 16
        ArrayList<Integer> scores = new ArrayList<>(List.of(45, 88, 92, 59, 74, 100, 38, 65));
        ArrayList<Integer> passed = extractPassedScores(scores, 60);
        System.out.println("Початкова кількість: " + scores.size());
        System.out.println("Відраховано: " + (scores.size() - passed.size()));
        System.out.println("Зараховано: " + passed + " size=" + passed.size());

        System.out.print("\n");

        // TASK 17
        ArrayList<Integer> numbers = new ArrayList<>(List.of(10, 20, 30, 1, 40, 2));
        numbers.remove(1);
        System.out.println("remove(1) видаляє індекс 1, тобто 20: " + numbers);
        numbers.remove(Integer.valueOf(1));
        numbers.remove(Integer.valueOf(2));
        System.out.println("remove(Integer) видаляє значення 1 та 2: " + numbers);

        System.out.print("\n");

        // TASK 18
        ArrayList<String> langs = new ArrayList<>(List.of("Java", "Python", "C++", "Java", "Kotlin", "Java"));
        System.out.println("Kotlin: " + langs.contains("Kotlin") + " Rust: " + langs.contains("Rust"));
        System.out.println("Перша Java: " + langs.indexOf("Java") + " Остання: " + langs.lastIndexOf("Java"));
        System.out.println("Кількість Java: " + countOccurrences(langs, "Java"));

        System.out.print("\n");

        // TASK 19
        ArrayList<String> cart = new ArrayList<>();
        System.out.println("До покупок: empty=" + cart.isEmpty() + " size=" + cart.size());
        cart.add("Хліб");
        cart.add("Молоко");
        cart.add("Кава");
        cart.add("Сир");
        System.out.println("Після покупок: empty=" + cart.isEmpty() + " size=" + cart.size());
        cart.clear();
        System.out.println("Після clear: empty=" + cart.isEmpty() + " size=" + cart.size());
        System.out.println("clear обнуляє посилання на елементи та size, але не скорочує ємність масиву");

        System.out.print("\n");

        // TASK 20
        ArrayList<String> cities = new ArrayList<>(List.of("Київ", "Львів", "Одеса", "Харків", "Дніпро"));
        Object[] objArray = cities.toArray();
        String[] strArray = cities.toArray(new String[0]);
        System.out.println("Object[]: " + Arrays.toString(objArray));
        System.out.println("String[]: " + Arrays.toString(strArray));
        ArrayList<String> restoredCities = new ArrayList<>(Arrays.asList(strArray));
        System.out.println("Знову ArrayList: " + restoredCities);

        System.out.print("\n");

        // TASK 21
        manageTaskList();

        System.out.print("\n");

        // TASK 22
        System.out.println(deduplicate(List.of(5, 12, 5, 8, 12, 20, 5)));
        System.out.println(deduplicate(List.of("Java", "Python", "Java", "Kotlin")));

        System.out.print("\n");

        // TASK 23
        List<String> listA = List.of("Станіслав", "Анна", "Богдан");
        List<String> listB = List.of("Анна", "Богдан", "Іван");
        System.out.println("Обидва іспити: " + findIntersection(listA, listB));
        System.out.println("Тільки Java: " + findDifference(listA, listB));

        System.out.print("\n");

        // TASK 24
        ArrayList<String> statuses = new ArrayList<>(Arrays.asList("NEW", "DONE", "NEW", null));
        System.out.println("Кількість замін: " + replaceAllValues(statuses, "NEW", "READY"));
        System.out.println(statuses);

        System.out.print("\n");

        // TASK 25
        demonstrateTypeInference();

        System.out.print("\n");

        // TASK 26
        demonstrateVarDiamondDanger();

        System.out.print("\n");

        // TASK 27
        exploreCollectionHierarchy();

        System.out.print("\n");

        // TASK 28
        List<List<String>> lists = List.of(
                new ArrayList<>(List.of("A", "B")),
                new LinkedList<>(List.of("C", "D")),
                new Vector<>(List.of("E", "F")),
                new Stack<String>()
        );
        lists.get(3).add("G");
        lists.get(3).add("H");
        for (List<String> list : lists)
        {
            System.out.println(list.getClass().getSimpleName());
            printElements(list);
            printSummary(list);
            getFirstAndLast(list);
        }

        System.out.print("\n");

        // TASK 29
        ArrayList<String> arrayList = new ArrayList<>(List.of("Java", "Python", "C++"));
        System.out.println("ArrayList get(1): " + arrayList.get(1));
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("Початок");
        linkedList.addLast("Кінець");
        System.out.println("LinkedList: " + linkedList);
        Vector<String> vector = new Vector<>();
        vector.addElement("Елемент");
        System.out.println("Vector elementAt(0): " + vector.elementAt(0));
        Stack<String> books = new Stack<>();
        books.push("Книга 1");
        books.push("Книга 2");
        books.push("Книга 3");
        System.out.println("Верхня книга: " + books.peek());
        while (!books.isEmpty())
        {
            System.out.println("pop: " + books.pop());
        }

        System.out.print("\n");

        // TASK 30
        ArrayList<String> modules = new ArrayList<>(List.of("Core Java", "OOP", "Collections", "Streams", "Multithreading"));
        Iterator<String> it = modules.iterator();
        int characterCount = 0;
        while (it.hasNext())
        {
            String module = it.next();
            characterCount += module.length();
            System.out.println(module);
        }
        System.out.println("Усього символів: " + characterCount);

        System.out.print("\n");

        // TASK 31
        ArrayList<Integer> data = new ArrayList<>(List.of(15, -3, 42, -10, 8, -1, 25));
        try
        {
            for (Integer x : data)
            {
                if (x < 0)
                {
                    data.remove(x);
                }
            }
        }
        catch (ConcurrentModificationException e)
        {
            System.out.println("Пряме видалення змінило список під час роботи ітератора");
        }
        data = new ArrayList<>(List.of(15, -3, 42, -10, 8, -1, 25));
        removeNegativesWithIterator(data);
        System.out.println("Безпечне видалення: " + data);

        System.out.print("\n");

        // TASK 32
        ArrayList<String> logMessages = new ArrayList<>(List.of("INFO: Start", "DEBUG: Init", "ERROR: Timeout", "DEBUG: Retry", "INFO: Done"));
        Iterator<String> logIterator = logMessages.iterator();
        while (logIterator.hasNext())
        {
            if (logIterator.next().startsWith("DEBUG:"))
            {
                logIterator.remove();
            }
        }
        ListIterator<String> listIt = logMessages.listIterator();
        while (listIt.hasNext())
        {
            String message = listIt.next();
            if (message.startsWith("ERROR"))
            {
                listIt.set("CRITICAL ERROR: Timeout");
            }
        }
        System.out.println("Вперед: " + logMessages);
        System.out.print("Назад: ");
        while (listIt.hasPrevious())
        {
            System.out.print(listIt.previous() + " | ");
        }
        System.out.println();

        System.out.print("\n");

        // TASK 33
        List<Integer> source = List.of(5, 12, 8, 3, 20, 7);
        ArrayList<Integer> evens = new ArrayList<>();
        ArrayList<Integer> odds = new ArrayList<>();
        splitEvenAndOdd(source, evens, odds);
        System.out.println("Парні: " + evens + " size=" + evens.size());
        findMinAndMax(evens);
        System.out.println("Непарні: " + odds + " size=" + odds.size());
        findMinAndMax(odds);

        System.out.print("\n");

        // TASK 34
        ArrayList<Integer> rangeData = new ArrayList<>(List.of(1, 5, 10, 15, 20, 25, 30, 35, 40, 45));
        System.out.println("Видалено [10; 30]: " + removeInRange(rangeData, 10, 30));
        System.out.println(rangeData);

        System.out.print("\n");

        // TASK 35
        ArrayList<Integer> reversed = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        reverseInPlace(reversed);
        System.out.println("Розворот: " + reversed);

        System.out.print("\n");

        // TASK 36
        String[] merged = mergeUniqueToArray(List.of("Java", "Python", "Java"), List.of("Python", "C++", "Kotlin"));
        System.out.println("Об'єднання: " + Arrays.toString(merged));

        System.out.print("\n");

        // TASK 37
        ArrayList<Integer> rotated = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        rotateRight(rotated, 2);
        System.out.println("Зсув на 2: " + rotated);

        System.out.print("\n");

        // TASK 38
        List<String> receiptLines = List.of("Хліб: 35", "Молоко: 48", "Помилка сканера: N/A", "Кава: 240", "Пакет: 5", "Сир: 185");
        var prices = parseReceiptPrices(receiptLines);
        Iterator<Integer> priceIterator = prices.iterator();
        while (priceIterator.hasNext())
        {
            if (priceIterator.next() < 40)
            {
                priceIterator.remove();
            }
        }
        int total = 0;
        for (Integer price : prices)
        {
            total += price;
        }
        System.out.println("Покупки від 40 грн: " + prices);
        System.out.println("До сплати: " + total);

        System.out.print("\n");

        // TASK 39
        compareListPerformance();

    }

    public static void demonstrateWrapperTwins()
    {
        Byte byteValue = Byte.valueOf((byte) 10);
        Short shortValue = Short.valueOf((short) 100);
        Integer intValue = Integer.valueOf(1000);
        Long longValue = Long.valueOf(10000L);
        Float floatValue = Float.valueOf(1.5f);
        Double doubleValue = Double.valueOf(3.14);
        Character charValue = Character.valueOf('A');
        Boolean booleanValue = Boolean.valueOf(true);
        Object[] wrappers = {byteValue, shortValue, intValue, longValue, floatValue, doubleValue, charValue, booleanValue};
        for (Object wrapper : wrappers)
        {
            System.out.println(wrapper.getClass().getSimpleName() + ": " + wrapper);
        }
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(intValue);
        System.out.println("ArrayList<Integer>: " + numbers);
        System.out.println("ArrayList<int> не компілюється: параметром типу має бути посилальний тип");
    }
    public static void showCompilerUnderTheHood()
    {
        int a = 42;
        Integer boxed = a;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        int unboxed = list.get(0);
        System.out.println("Неявно: boxed=" + boxed + " unboxed=" + unboxed);
        Integer explicitBoxed = Integer.valueOf(a);
        ArrayList<Integer> explicitList = new ArrayList<>();
        explicitList.add(Integer.valueOf(100));
        int explicitUnboxed = explicitList.get(0).intValue();
        System.out.println("Явно: boxed=" + explicitBoxed + " unboxed=" + explicitUnboxed);
        Double doubleBox = Double.valueOf(3.14);
        double doublePrimitive = doubleBox.doubleValue();
        Boolean booleanBox = Boolean.valueOf(true);
        boolean booleanPrimitive = booleanBox.booleanValue();
        System.out.println("Double: " + doublePrimitive + " Boolean: " + booleanPrimitive);
    }
    public static List<Integer> parseNumbersFromStrings(String[] inputs)
    {
        ArrayList<Integer> result = new ArrayList<>();
        int sum = 0;
        for (String input : inputs)
        {
            try
            {
                int number = Integer.parseInt(input);
                sum += number;
                result.add(Integer.valueOf(input));
            }
            catch (NumberFormatException e)
            {
                System.out.println("Некоректний числовий рядок: '" + input + "'");
            }
        }
        System.out.println("Сума: " + sum);
        return result;
    }
    public static void findMinAndMax(List<Integer> numbers)
    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (Integer number : numbers)
        {
            if (number < min)
            {
                min = number;
            }
            if (number > max)
            {
                max = number;
            }
        }
        System.out.println("Мінімум: " + min + " Максимум: " + max);
    }
    public static void testIntegerPool()
    {
        Integer a = 100;
        Integer b = 100;
        Integer x = 250;
        Integer y = 250;
        System.out.println("100: == " + (a == b) + " equals " + a.equals(b));
        System.out.println("250: == " + (x == y) + " equals " + x.equals(y));
        System.out.println("100 береться з кешу [-128; 127], тому посилання однакові");
        System.out.println("250 зазвичай поза кешем: == порівнює посилання, equals порівнює значення");
    }
    public static int sumIgnoringNulls(List<Integer> list)
    {
        int sum = 0;
        for (Integer element : list)
        {
            if (element != null)
            {
                sum += element;
            }
        }
        return sum;
    }
    public static List<Integer> extractDigitsFromText(String text)
    {
        ArrayList<Integer> digits = new ArrayList<>();
        for (int i = 0; i < text.length(); i++)
        {
            char ch = text.charAt(i);
            if (Character.isDigit(ch))
            {
                digits.add(Character.getNumericValue(ch));
            }
        }
        return digits;
    }
    public static void convertNumberSystems(int number)
    {
        System.out.println("Двійкова: " + Integer.toBinaryString(number));
        System.out.println("Вісімкова: " + Integer.toOctalString(number));
        System.out.println("Шістнадцяткова: " + Integer.toHexString(number));
    }
    public static List<Integer> traceArrayListCapacity(int elementsCount)
    {
        ArrayList<Integer> capacities = new ArrayList<>();
        int capacity = 0;
        for (int size = 1; size <= elementsCount; size++)
        {
            if (size > capacity)
            {
                int oldCapacity = capacity;
                capacity = capacity == 0 ? 10 : capacity + (capacity >> 1);
                capacities.add(capacity);
                System.out.println("Елемент " + size + ": " + oldCapacity + " -> " + capacity);
            }
        }
        return capacities;
    }
    public static Object[] growArrayManually(Object[] oldData)
    {
        Object[] newData = new Object[oldData.length + (oldData.length >> 1)];
        System.arraycopy(oldData, 0, newData, 0, oldData.length);
        return newData;
    }
    public static ArrayList<Integer> extractPassedScores(List<Integer> allScores, int minPassScore)
    {
        ArrayList<Integer> passed = new ArrayList<>();
        for (int i = 0; i < allScores.size(); i++)
        {
            if (allScores.get(i) >= minPassScore)
            {
                passed.add(allScores.get(i));
            }
        }
        return passed;
    }
    public static int countOccurrences(List<String> list, String target)
    {
        int count = 0;
        for (String item : list)
        {
            if (item.equals(target))
            {
                count++;
            }
        }
        return count;
    }
    public static void manageTaskList()
    {
        ArrayList<String> tasks = new ArrayList<>();
        System.out.println("Порожній список: " + tasks.isEmpty());
        tasks.add("Прочитати ТЗ");
        tasks.add("Написати код");
        tasks.add("Перевірити");
        tasks.add("Зробити коміт");
        tasks.add("Здати роботу");
        tasks.add(0, "Термінова задача");
        System.out.println("Перша задача: " + tasks.get(0));
        tasks.set(0, "Термінова задача виконана");
        System.out.println("Є перевірка: " + tasks.contains("Перевірити"));
        tasks.remove("Прочитати ТЗ");
        tasks.remove(0);
        System.out.println("size=" + tasks.size() + " Масив: " + Arrays.toString(tasks.toArray()));
        tasks.clear();
        System.out.println("Після clear: " + tasks);
    }
    public static <T> ArrayList<T> deduplicate(List<T> source)
    {
        ArrayList<T> unique = new ArrayList<>();
        for (T item : source)
        {
            if (!unique.contains(item))
            {
                unique.add(item);
            }
        }
        return unique;
    }
    public static ArrayList<String> findIntersection(List<String> first, List<String> second)
    {
        ArrayList<String> result = new ArrayList<>(first);
        result.retainAll(second);
        return result;
    }
    public static ArrayList<String> findDifference(List<String> first, List<String> second)
    {
        ArrayList<String> result = new ArrayList<>(first);
        result.removeAll(second);
        return result;
    }
    public static int replaceAllValues(List<String> list, String oldValue, String newValue)
    {
        int count = 0;
        for (int i = 0; i < list.size(); i++)
        {
            if (Objects.equals(list.get(i), oldValue))
            {
                list.set(i, newValue);
                count++;
            }
        }
        return count;
    }
    public static void demonstrateTypeInference()
    {
        List<Integer> list1 = new ArrayList<>();
        var list2 = new ArrayList<Integer>();
        var names = new ArrayList<String>(List.of("Анна", "Богдан"));
        list1.add(10);
        list2.add(20);
        names.add("Станіслав");
        System.out.println(list1 + " " + list2 + " " + names);
        System.out.println("У list1 та list2 не можна додати String, а у names не можна додати Integer");
    }
    public static void demonstrateVarDiamondDanger()
    {
        var unsafeList = new ArrayList<>();
        unsafeList.add(42);
        unsafeList.add("Java");
        unsafeList.add(true);
        System.out.println("ArrayList<Object>: " + unsafeList);
        try
        {
            for (Object item : unsafeList)
            {
                Integer number = (Integer) item;
                System.out.println("Integer: " + number);
            }
        }
        catch (ClassCastException e)
        {
            System.out.println("Рядок Java не можна привести до Integer");
        }
        var safeList = new ArrayList<Integer>();
        safeList.add(42);
        System.out.println("Типізований список: " + safeList);
    }
    public static void exploreCollectionHierarchy()
    {
        Object[] collections = {new ArrayList<String>(), new LinkedList<String>(), new Vector<String>(), new Stack<String>(), new HashSet<String>(), new ArrayDeque<String>()};
        for (Object collection : collections)
        {
            System.out.println(collection.getClass().getSimpleName()
                    + " List=" + (collection instanceof List)
                    + " Set=" + (collection instanceof Set)
                    + " Queue=" + (collection instanceof Queue)
                    + " Collection=" + (collection instanceof Collection)
                    + " Iterable=" + (collection instanceof Iterable));
        }
    }
    public static <E> void printElements(Iterable<E> iterable)
    {
        Iterator<E> iterator = iterable.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
    public static <E> void printSummary(Collection<E> collection)
    {
        System.out.println("size=" + collection.size() + " empty=" + collection.isEmpty());
    }
    public static <E> E getFirstAndLast(List<E> list)
    {
        E first = list.get(0);
        E last = list.get(list.size() - 1);
        System.out.println("Перший: " + first + " Останній: " + last);
        return last;
    }
    public static void removeNegativesWithIterator(List<Integer> list)
    {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext())
        {
            if (iterator.next() < 0)
            {
                iterator.remove();
            }
        }
    }
    public static void splitEvenAndOdd(List<Integer> source, List<Integer> evens, List<Integer> odds)
    {
        Iterator<Integer> iterator = source.iterator();
        while (iterator.hasNext())
        {
            int number = iterator.next();
            if (number % 2 == 0)
            {
                evens.add(number);
            }
            else
            {
                odds.add(number);
            }
        }
    }
    public static int removeInRange(List<Integer> list, int min, int max)
    {
        int count = 0;
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext())
        {
            int number = iterator.next();
            if (number >= min && number <= max)
            {
                iterator.remove();
                count++;
            }
        }
        return count;
    }
    public static <T> void reverseInPlace(List<T> list)
    {
        for (int i = 0; i < list.size() / 2; i++)
        {
            int opposite = list.size() - 1 - i;
            T temp = list.get(i);
            list.set(i, list.get(opposite));
            list.set(opposite, temp);
        }
    }
    public static String[] mergeUniqueToArray(List<String> first, List<String> second)
    {
        var merged = new ArrayList<String>();
        for (String item : first)
        {
            if (!merged.contains(item))
            {
                merged.add(item);
            }
        }
        for (String item : second)
        {
            if (!merged.contains(item))
            {
                merged.add(item);
            }
        }
        return merged.toArray(new String[0]);
    }
    public static <T> void rotateRight(List<T> list, int k)
    {
        if (!list.isEmpty())
        {
            for (int i = 0; i < k; i++)
            {
                T last = list.remove(list.size() - 1);
                list.add(0, last);
            }
        }
    }
    public static ArrayList<Integer> parseReceiptPrices(List<String> lines)
    {
        var prices = new ArrayList<Integer>();
        for (String line : lines)
        {
            try
            {
                prices.add(Integer.parseInt(line.substring(line.indexOf(':') + 1).trim()));
            }
            catch (NumberFormatException e)
            {
                System.out.println("Не вдалося прочитати ціну: " + line);
            }
        }
        return prices;
    }
    public static void compareListPerformance()
    {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        long start = System.nanoTime();
        for (int i = 0; i < 20000; i++)
        {
            arrayList.add(0, i);
        }
        long arrayInsertTime = System.nanoTime() - start;
        start = System.nanoTime();
        for (int i = 0; i < 20000; i++)
        {
            linkedList.add(0, i);
        }
        long linkedInsertTime = System.nanoTime() - start;
        long arraySum = 0;
        start = System.nanoTime();
        for (int i = 0; i < 20000; i++)
        {
            arraySum += arrayList.get(arrayList.size() / 2);
        }
        long arrayReadTime = System.nanoTime() - start;
        long linkedSum = 0;
        start = System.nanoTime();
        for (int i = 0; i < 20000; i++)
        {
            linkedSum += linkedList.get(linkedList.size() / 2);
        }
        long linkedReadTime = System.nanoTime() - start;
        System.out.println("add(0): ArrayList=" + arrayInsertTime + " нс LinkedList=" + linkedInsertTime + " нс");
        System.out.println("get(size/2): ArrayList=" + arrayReadTime + " нс LinkedList=" + linkedReadTime + " нс");
        System.out.println("Контрольні суми: " + arraySum + ", " + linkedSum);
        System.out.println("ArrayList зсуває масив через System.arraycopy при вставці на початок, але має прямий доступ за індексом");
        System.out.println("LinkedList швидко додає вузол на початок, але для читання середини проходить по вузлах");
        System.out.println("Час залежить від JVM та навантаження, це навчальний замір");
    }
}
