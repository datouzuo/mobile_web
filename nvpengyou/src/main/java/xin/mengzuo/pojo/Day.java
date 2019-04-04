package xin.mengzuo.pojo;

import xin.mengzuo.config.DataUntil;

public class Day {
	
	private String fotmat;
	
    public String getFotmat() {   	
    	
    	return DataUntil.getDataFormat(yearMouthDay);
		
	}

	public void setFotmat(String fotmat) {
		this.fotmat = fotmat;
	}

	private Integer dayId;

    private String yearMouthDay;

    private Double consumePercentage;

    private Integer yearMouth;

    private Double consume;

    private Integer identity;

    public Integer getDayId() {
        return dayId;
    }

    public void setDayId(Integer dayId) {
        this.dayId = dayId;
    }

    public String getYearMouthDay() {
        return yearMouthDay;
    }

    public void setYearMouthDay(String yearMouthDay) {
        this.yearMouthDay = yearMouthDay == null ? null : yearMouthDay.trim();
    }

    public Double getConsumePercentage() {
        return consumePercentage;
    }

    public void setConsumePercentage(Double consumePercentage) {
        this.consumePercentage = consumePercentage;
    }

    public Integer getYearMouth() {
        return yearMouth;
    }

    public void setYearMouth(Integer yearMouth) {
        this.yearMouth = yearMouth;
    }

    public Double getConsume() {
        return consume;
    }

    public void setConsume(Double consume) {
        this.consume = consume;
    }

    public Integer getIdentity() {
        return identity;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }
}