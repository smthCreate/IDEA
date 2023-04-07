package sem_2;

public class Cat {
    private String size;
    private Double weight;
    private Integer age;

    public Cat(String size, Double weight, Integer age) {
        this.size = size;
        this.weight = weight;
        this.age = age;
    }
    public Cat(){}

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
