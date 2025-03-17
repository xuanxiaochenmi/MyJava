package com.liqiang.enumdemo;

public class Test2 {
    public static void main(String[] args) {

        move(1);
        //使用枚举类
        Direction direction = Direction.RIGHT;
        move2(direction);

    }
    public static void move(int direction){
        switch (direction){
            case Constant.up -> System.out.println("向上移动 ");
            case Constant.down -> System.out.println("向下移动 ");
            case Constant.left -> System.out.println("向左移动 ");
            case Constant.right -> System.out.println("向右移动 ");

        }
    }
    public static void move2(Direction direction){
        switch (direction){
            case UP -> System.out.println("向上移动 ");
            case DOWN -> System.out.println("向下移动 ");
            case LEFT -> System.out.println("向左移动 ");
            case RIGHT -> System.out.println("向右移动 ");

        }

    }
}
