



public class EatableDemo {
    public static void main(String[] args) {
        //这是一种最简单的情况
//此时如果方法体比较复杂好几行代码，那么这个{}是不能省略的
        Runnable runnable1 = () -> {
            System.out.println("第一行代码");
            System.out.println("第二行代码");
        };
    }

}

