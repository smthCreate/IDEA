package sem_5.model;

abstract public class APeople {
    private int id;
    public String name;

    public APeople() {
        this.id = Index.createId();
    }

    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "id=" + id;
    }
}
