import java.util.List;

@FunctionalInterface
public interface Conditional {
    public List<String> condition(List<String> s);
}
