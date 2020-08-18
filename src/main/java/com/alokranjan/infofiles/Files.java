

public final  class Files {

    private final Integer id;
    private final String name;
    private final String type;
    private final Integer size;
    private final Integer length;

    public Files(Integer id, String name, String type, Integer size, Integer length) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.size = size;
        this.length = length;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Integer getSize() {
        return size;
    }

    public Integer getLength() {
        return length;
    }




}
