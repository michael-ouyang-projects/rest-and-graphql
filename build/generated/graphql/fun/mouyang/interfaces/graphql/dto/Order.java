package fun.mouyang.interfaces.graphql.dto;

import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2023-06-19T19:12:30+0800"
)
public class Order implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String title;
    private Integer price;

    public Order() {
    }

    public Order(String id, String title, Integer price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Order that = (Order) obj;
        return Objects.equals(id, that.id)
            && Objects.equals(title, that.title)
            && Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, price);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: \"" + id + "\"");
        }
        if (title != null) {
            joiner.add("title: \"" + title + "\"");
        }
        if (price != null) {
            joiner.add("price: " + price);
        }
        return joiner.toString();
    }

    public static Order.Builder builder() {
        return new Order.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2023-06-19T19:12:30+0800"
    )
    public static class Builder {

        private String id;
        private String title;
        private Integer price;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setPrice(Integer price) {
            this.price = price;
            return this;
        }


        public Order build() {
            return new Order(id, title, price);
        }

    }
}
