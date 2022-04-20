package holiday;

public class HolidayRequest {
    public int id;
    public String employee;
    public String start;
    public String end;
    public String status;

    @Override
    public String toString() {
        return "HolidayRequest{" +
                "id=" + id +
                ", employee='" + employee + '\'' +
                ", start='" + start + '\'' +
                ", end='" + end + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
