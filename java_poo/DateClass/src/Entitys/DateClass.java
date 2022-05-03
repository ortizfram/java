package Entitys;

import java.util.Date;

public class DateClass {
  Date dateClass;

    public DateClass() {
    }

    public DateClass(Date dateClass) {
        this.dateClass = dateClass;
    }

    public Date getDateClass() {
        return dateClass;
    }

    public void setDateClass(Date dateClass) {
        this.dateClass = dateClass;
    }

    @Override
    public String toString() {
        return "DateClass{" +
                "dateClass=" + dateClass +
                '}';
    }
}
