package xin.mengzuo.pojo;

public class Item {
    private String dayCurrentTime;

    private Integer yearMonthDay;

    private Double consume;

    private String description;

    private Integer currentMonth;

    private Short status;

    private Integer identity;

    public String getDayCurrentTime() {
        return dayCurrentTime;
    }

    public void setDayCurrentTime(String dayCurrentTime) {
        this.dayCurrentTime = dayCurrentTime == null ? null : dayCurrentTime.trim();
    }

    public Integer getYearMonthDay() {
        return yearMonthDay;
    }

    public void setYearMonthDay(Integer yearMonthDay) {
        this.yearMonthDay = yearMonthDay;
    }

    public Double getConsume() {
        return consume;
    }

    public void setConsume(Double consume) {
        this.consume = consume;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getCurrentMonth() {
        return currentMonth;
    }

    public void setCurrentMonth(Integer currentMonth) {
        this.currentMonth = currentMonth;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Integer getIdentity() {
        return identity;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }
}