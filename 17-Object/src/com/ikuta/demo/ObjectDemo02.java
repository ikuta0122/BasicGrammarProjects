package com.ikuta.demo;

import java.util.Objects;

//重写equals()方法
public class ObjectDemo02 {
	public static void main(String[] args) {
		Address address1 = new Address("北京", "大兴区", "111111");
		Address address2 = new Address("北京", "大兴区", "111111");
		User user1 = new User("张三", address1);
		User user2 = new User("张三", address2);
		System.out.println(user1.equals(user2));
	}
}

class User {
	String name;
	Address addr;

	public User() {
		super();
	}

	public User(String name, Address addr) {
		super();
		this.name = name;
		this.addr = addr;
	}

	// 重写equals方法：当一个用户的用户名和家庭住址都相同，表示同一个用户
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || !(obj instanceof User)) {
			return false;
		}
		User other = (User) obj;
		return name.equals(other.name) && addr.equals(other.addr);
		/*return name.equals(other.name) 
		 			&& addr.city.equals(other.addr.city) 
		 			&& addr.street.equals(other.addr.street)
		 			&& addr.zipcode.equals(other.addr.zipcode);
		 这么写就不需要重写Address类中的equals()方法了，
		 因为addr.city.equals调用的equals方法是String类中的。
		 思路：通过“引用.”去访问Address类中的city，city属于String类型，所以调用的equals方法是String类中的。
		*/
	}

}

class Address {
	String city;
	String street;
	String zipcode;

	public Address() {
		super();
	}

	public Address(String city, String street, String zipcode) {
		super();
		this.city = city;
		this.street = street;
		this.zipcode = zipcode;
	}

	// 重写equals方法要彻底,Address中的equals方法也要彻底
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || !(obj instanceof Address)) {
			return false;
		}
		Address other = (Address) obj;
		return Objects.equals(city, other.city) && Objects.equals(street, other.street)
				&& Objects.equals(zipcode, other.zipcode);
	}
}