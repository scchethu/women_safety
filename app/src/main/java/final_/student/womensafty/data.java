package final_.student.womensafty;

public class data {
    int id;
    String msg;
    String date;

    public data(int id, String msg, String date) {
        this.id = id;
        this.msg = msg;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
