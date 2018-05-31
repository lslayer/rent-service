package tk.lslayer.rent.model;

import org.springframework.data.annotation.Id;

import java.util.Objects;

public class RentObject {
    @Id
    private String id;

    private String name;
    private String description;

    public RentObject() {
    }

    public RentObject(String name, String description) {
        this.name = name;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RentObject)) return false;
        RentObject that = (RentObject) o;
        return Objects.equals(id, that.id) &&
                       Objects.equals(name, that.name) &&
                       Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description);
    }

    @Override
    public String toString() {
        return "RentObject{" +
                       "id='" + id + '\'' +
                       ", name='" + name + '\'' +
                       ", description='" + description + '\'' +
                       '}';
    }
}
