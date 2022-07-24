package ClassTasks.dsa;

public class ArrayList implements List {
    private boolean isEmpty = true;
    private String[] elements = new String[5];
    private int size = 0;

    @Override
    public boolean isEmpty() {
        return isEmpty;
    }

    @Override
    public void add(String item) {
        elements[size] = item;
        size++;
        isEmpty = false;
    }

    @Override
    public void remove(String item) {
        for (int i = 0; i < elements.length; i++) {
            if (item == elements[i]) {
                elements[i] = null;
                size--;
                break;
            }
        }
        if (size == 0) isEmpty = true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String get(int index) {
        return elements[index];
    }
}
