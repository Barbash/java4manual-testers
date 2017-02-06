package etl.domain;

//POJO: DTO
public class User extends Object implements Cloneable {
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (getId() != user.getId()) return false;
        return getName() != null ? getName().equals(user.getName()) : user.getName() == null;
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        return result;
    }
}

class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println(new User(1, "name").clone());
        User o1 = new User(1, "");
        User o2 = o1;
        o1.equals(o2);
    }
}
