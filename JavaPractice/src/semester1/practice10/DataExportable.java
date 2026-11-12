package semester1.practice10;

public interface DataExportable
{
    String toJson();
    String toCsvRow();
}

class StudentGradeRecord implements DataExportable
{
    private final String name;
    private final int group;
    private final double gpa;

    public StudentGradeRecord(String name, int group, double gpa)
    {
        this.name = name;
        this.group = group;
        this.gpa = gpa;
    }
    @Override
    public String toJson()
    {
        return "{\"name\":\"" + name + "\",\"group\":" + group + ",\"gpa\":" + gpa + "}";
    }
    @Override
    public String toCsvRow()
    {
        return name + "," + group + "," + gpa;
    }
}

class WeatherObservation implements DataExportable
{
    private final String city;
    private final double tempC;
    private final int humidity;

    public WeatherObservation(String city, double tempC, int humidity)
    {
        this.city = city;
        this.tempC = tempC;
        this.humidity = humidity;
    }
    @Override
    public String toJson()
    {
        return "{\"city\":\"" + city + "\",\"tempC\":" + tempC + ",\"humidity\":" + humidity + "}";
    }
    @Override
    public String toCsvRow()
    {
        return city + "," + tempC + "," + humidity;
    }
}
