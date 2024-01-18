import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class WorkingWithSets {

    public static void main(String[] args) {
        Set<Ball> set = new HashSet<>();
        set.add(new Ball("red"));
        set.add(new Ball("blue"));
        set.add(new Ball("green"));

        set.remove(new Ball("blue"));
        for (Ball ball : set) {
            System.out.println(ball);
        }

    }

    static class Ball {
        String color;

        public Ball(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return "Ball{" +
                    "color='" + color + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Ball ball = (Ball) o;
            return Objects.equals(color, ball.color);
        }

        @Override
        public int hashCode() {
            return Objects.hash(color);
        }
    }
}
