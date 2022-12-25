package wrapperLab;

import java.util.ArrayList;

public class ListWrapper {
    private String name = null;
    private ArrayList<ListWrapper> next = null;

    void splitStringToList(String input) {
        if (input.contains(".")) {
            int dotIndex = input.indexOf(".");
            String nameFromString = input.substring(0, dotIndex);
            ListWrapper firstNext = new ListWrapper();
            String secondPartOfString = input.substring(dotIndex + 1);
            if (next == null) next = new ArrayList<>();
            if (name == null) {
                name = nameFromString;
            } else {
                String nextName;
                if (secondPartOfString.contains("."))
                    nextName = secondPartOfString.substring(0, secondPartOfString.indexOf("."));
                else nextName = secondPartOfString;
                for (ListWrapper wrapper : next) {
                    String wrapperName = wrapper.getName();
                    if (wrapperName.equals(nextName)) {
                        wrapper.splitStringToList(secondPartOfString);
                        return;
                    }
                }
            }
            firstNext.splitStringToList(input.substring(dotIndex + 1));
            next.add(firstNext);
        } else {
            name = input;
        }
    }

    public String getName() {
        return name;
    }
}
