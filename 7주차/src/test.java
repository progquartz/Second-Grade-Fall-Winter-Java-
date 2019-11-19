import java.util.Objects;

public class test {
    private int a;
    private int b;

    public boolean greater(test obj){
        return (this.a > obj.a);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        test test = (test) o;
        return a == test.a &&
                b == test.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}


