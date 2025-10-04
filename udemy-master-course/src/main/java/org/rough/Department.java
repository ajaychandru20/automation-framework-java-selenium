package org.rough;

import java.util.Objects;

public class Department {
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(stringContent, that.stringContent);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(stringContent);
    }

    public void setStringContent(String stringContent, int pageCount) {
        this.stringContent = stringContent;
        this.pageCount = pageCount;
    }

    @Override
    public String toString() {
//        return "Department{" +
//                "stringContent='" + "[" + stringContent  + "]" + '\'' +
//                '}';
//    }
        return "Book{" +
                "title='" + "[" + stringContent + "]" + '\'' + ", " + "pageCount="
                + "[" + pageCount + "]" +
                '}';
    }

    private String stringContent;
    private int pageCount;

}
