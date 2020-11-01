package com.shy.day06;

import lombok.ToString;

import java.util.ArrayList;

/**
 * @ClassName ReceptTest
 * @Author shy
 * @Date 2020/10/25
 **/
public class ReceptTest {
    private static final int v1 = 10;
    private static final int v2 = 20;
    private static final int v3 = 30;
    private static final int MAX = 50;

    public static void main(String[] args) {
        ArrayList<User> uList = new ArrayList<>();
        for (int i = 1; i <= MAX; i++) {
            uList.add(new User(i));
        }
        System.out.println("未分组：");
        System.out.println(uList);
        Reception r1 = new Reception();
        Reception r2 = new Reception();
        Reception r3 = new Reception();
        //内部匿名类,更好的方式使使用Lambda表达式
        r1.setF(new Filter() {
            @Override
            public void filterUser(User u) {
                //不推荐使用常量（魔法值）直接比较
                if (u.getId() >= v1 && u.getId() < v2){
                    u.setType("v1");
                }
            }
        });
        //Lambda表达式
        r2.setF(u -> {
            if (u.getId() >= v2 && u.getId() < v3){
                u.setType("v2");
            }
        });
        for (User user : uList){
            r1.recept(user);
            r2.recept(user);
            r3.recept(user);
        }
        System.out.println("已分组：");
        for (int i = 0; i < uList.size(); i++) {
            User user = uList.get(i);
            //每9个换行
            if (i %9 == 0){
                System.out.println();
            }
            System.out.println(user + " ");
        }
    }
}

class Reception{
    Filter f;

    public Filter getF() {
        return f;
    }

    public void setF(Filter f) {
        this.f = f;
    }

    public void recept(User u){
        if (u.getType() != null){
            return;
        }
        if (f != null){
            f.filterUser(u);
        }else {
            u.setType("A");
        }
    }
}

class User{
    private String type;
    private final int id;

    public User(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return id + "-" + type;
    }
}

interface Filter{
    /**
     * 过滤用户
     * @param u 用户对象
     */
    void filterUser(User u);
}
