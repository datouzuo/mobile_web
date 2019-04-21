package xin.mengzuo.pojo;

public class Mouth {
	
	private String fomat;
	
    public String getFomat() {
		StringBuffer sb = new StringBuffer();
    	sb.append(yearMouth.substring(0, 4));
    	sb.append("-");
    	sb.append(yearMouth.substring(4));
    	
    	
    	return sb.toString();
	}

    
	public void setFomat(String fomat) {
		this.fomat = fomat;
	}
	
	private Integer mouthId;

    private String yearMouth;

    private Double totalMoney;

    private Double mouthPercentage;

    private Double totalConsum;

    private Integer identity;

    public Integer getMouthId() {
        return mouthId;
    }

    public void setMouthId(Integer mouthId) {
        this.mouthId = mouthId;
    }

    public String getYearMouth() {
        return yearMouth;
    }

    public void setYearMouth(String yearMouth) {
        this.yearMouth = yearMouth == null ? null : yearMouth.trim();
    }

    public Double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Double getMouthPercentage() {
        return mouthPercentage;
    }

    public void setMouthPercentage(Double mouthPercentage) {
        this.mouthPercentage = mouthPercentage;
    }

    public Double getTotalConsum() {
        return totalConsum;
    }

    public void setTotalConsum(Double totalConsum) {
        this.totalConsum = totalConsum;
    }

    public Integer getIdentity() {
        return identity;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }
}