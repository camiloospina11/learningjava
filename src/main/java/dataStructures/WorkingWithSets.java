package dataStructures;

import java.util.*;


public class WorkingWithSets
{
    public static void main(String[] args)
    {
        //Set<Ball> balls = new TreeSet<>();
        Set<Ball> balls = new HashSet<>();
        // set doesn't allow duplicate elements
        balls.add(new Ball("marrow"));
        balls.add(new Ball("yellow"));
        balls.add(new Ball("red"));
        balls.add(new Ball("pink"));
        balls.add(new Ball("blue"));
        System.out.println(balls);
        System.out.println("Size before delete blue color: " + balls.size());
        balls.remove(new Ball("blue"));
        System.out.println("Size after delete blue color: " + balls.size());
        balls.forEach(System.out::println);
    }

    static class Ball{
        String color;

        public Ball(String color)
        {
            this.color = color;
        }

        // without equals methods the hashset will be returning all the creates balls
        @Override
        public boolean equals(Object o)
        {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Ball ball = (Ball) o;
            return Objects.equals(color, ball.color);
        }

        @Override
        public int hashCode()
        {
            return Objects.hash(color);
        }

        @Override
        public String toString()
        {
            return "Ball{" +
                    "color='" + color + '\'' +
                    '}';
        }
    }

//    record Ball(String color){}
}
