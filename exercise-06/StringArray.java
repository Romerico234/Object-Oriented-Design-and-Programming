import java.util.Iterator;

public class StringArray implements Iterable<String>{
    private String[] StringArray;

    public StringArray(String[] values) {
        int n = values.length;
        StringArray = new String[n];
        for (int i = 0; i < n; i++) {
            StringArray[i] = values[i];
        }
    }

    public Iterator<String> iterator() {
        return new ArrayIterator();
    }

    public Iterator<String> longStringIterator() {
        return new LongStringIterator();
    }

    public class ArrayIterator implements Iterator<String> {
        int current = 0;

        public boolean hasNext() {
            return current < StringArray.length;
        }

        public String next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            return StringArray[current++];
        }
    }

    public class LongStringIterator implements Iterator<String> {
        int current = 0;

        public boolean hasNext() {
            while (current < StringArray.length) {
                if (StringArray[current].length() >= 4) {
                    return true;
                }
                current++;
            }
            return false;
        }

        public String next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            return StringArray[current++];
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        String[] values = {"one", "two", "three", "four", "five"};
        StringArray stringArray = new StringArray(values);

        System.out.println("ArrayIterator:");
        Iterator<String> iterator = stringArray.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        System.out.println("--------------------");
        
        System.out.println("LongStringIterator:");
        Iterator<String> longStringIterator = stringArray.longStringIterator();
        while (longStringIterator.hasNext()) {
            System.out.print(longStringIterator.next() + " ");
        }
        System.out.println();
    }
}
