package com.ikuta.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

//如果集合中存储元素的数据类型为引用数据类型,那么该类型需要重写equals()方法
public class CollectionDemo05 {
    public static void main(String[] args) {
        User user1 = new User("Jack");
        User user2 = new User("Jack");
        Collection collection = new ArrayList();
        collection.add(user1);
        //重写User类中的equals()方法之后
        System.out.println("集合中是否包含name为Jack的User对象:" + collection.contains(user2));
        collection.remove(user2);
        System.out.println("集合是否为空:" + collection.isEmpty());
    }
}

class User {
    private String name;

    public User() {
        super();
    }

    public User(String name) {
        super();
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof User)) {
            return false;
        }
        User other = (User) obj;
        return Objects.equals(name, other.name);
    }

}