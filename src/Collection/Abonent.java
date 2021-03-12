package Collection;

import java.util.Objects;

public class Abonent {
    public int number;
    public String name;

    public Abonent(int number, String name){
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Abonent abonent = (Abonent) o;
        return number == abonent.number && name.equals(abonent.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name);
    }
}
