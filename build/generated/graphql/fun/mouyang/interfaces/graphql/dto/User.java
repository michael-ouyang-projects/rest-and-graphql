package fun.mouyang.interfaces.graphql.dto;

import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2023-06-19T19:12:30+0800"
)
public class User implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    private Integer age;
    private java.util.List<Order> orders;

    public User() {
    }

    public User(String id, String name, Integer age, java.util.List<Order> orders) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.orders = orders;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    public java.util.List<Order> getOrders() {
        return orders;
    }
    public void setOrders(java.util.List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final User that = (User) obj;
        return Objects.equals(id, that.id)
            && Objects.equals(name, that.name)
            && Objects.equals(age, that.age)
            && Objects.equals(orders, that.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, orders);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: \"" + id + "\"");
        }
        if (name != null) {
            joiner.add("name: \"" + name + "\"");
        }
        if (age != null) {
            joiner.add("age: " + age);
        }
        if (orders != null) {
            joiner.add("orders: " + orders);
        }
        return joiner.toString();
    }

    public static User.Builder builder() {
        return new User.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2023-06-19T19:12:30+0800"
    )
    public static class Builder {

        private String id;
        private String name;
        private Integer age;
        private java.util.List<Order> orders;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public Builder setOrders(java.util.List<Order> orders) {
            this.orders = orders;
            return this;
        }


        public User build() {
            return new User(id, name, age, orders);
        }

    }
}
