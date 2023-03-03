package data;
public class Person {
    private long id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.ZonedDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private Long height; //Поле может быть null, Значение поля должно быть больше 0
    private java.time.LocalDateTime birthday; //Поле может быть null
    private long weight; //Значение поля должно быть больше 0
    private Color hairColor; //Поле может быть null
    private Location location; //Поле может быть null
    public Person (long id, String name, Coordinates coordinates, java.time.ZonedDateTime creationDate, Long height, java.time.LocalDateTime birthday, long weight, Color hairColor, Location location){
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = creationDate;
        this.height = height;
        this.birthday = birthday;
        this.weight = weight;
        this.hairColor = hairColor;
        this.location = location;
    }
    public Long getId (){
        return id;
    }
    public String getName (){
        return name;
    }
    @Override
    public String toString (){
        return "";
    }
}
