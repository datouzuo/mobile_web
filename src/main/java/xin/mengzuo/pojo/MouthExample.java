package xin.mengzuo.pojo;

import java.util.ArrayList;
import java.util.List;

public class MouthExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MouthExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andMouthIdIsNull() {
            addCriterion("mouth_id is null");
            return (Criteria) this;
        }

        public Criteria andMouthIdIsNotNull() {
            addCriterion("mouth_id is not null");
            return (Criteria) this;
        }

        public Criteria andMouthIdEqualTo(Integer value) {
            addCriterion("mouth_id =", value, "mouthId");
            return (Criteria) this;
        }

        public Criteria andMouthIdNotEqualTo(Integer value) {
            addCriterion("mouth_id <>", value, "mouthId");
            return (Criteria) this;
        }

        public Criteria andMouthIdGreaterThan(Integer value) {
            addCriterion("mouth_id >", value, "mouthId");
            return (Criteria) this;
        }

        public Criteria andMouthIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mouth_id >=", value, "mouthId");
            return (Criteria) this;
        }

        public Criteria andMouthIdLessThan(Integer value) {
            addCriterion("mouth_id <", value, "mouthId");
            return (Criteria) this;
        }

        public Criteria andMouthIdLessThanOrEqualTo(Integer value) {
            addCriterion("mouth_id <=", value, "mouthId");
            return (Criteria) this;
        }

        public Criteria andMouthIdIn(List<Integer> values) {
            addCriterion("mouth_id in", values, "mouthId");
            return (Criteria) this;
        }

        public Criteria andMouthIdNotIn(List<Integer> values) {
            addCriterion("mouth_id not in", values, "mouthId");
            return (Criteria) this;
        }

        public Criteria andMouthIdBetween(Integer value1, Integer value2) {
            addCriterion("mouth_id between", value1, value2, "mouthId");
            return (Criteria) this;
        }

        public Criteria andMouthIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mouth_id not between", value1, value2, "mouthId");
            return (Criteria) this;
        }

        public Criteria andYearMouthIsNull() {
            addCriterion("year_mouth is null");
            return (Criteria) this;
        }

        public Criteria andYearMouthIsNotNull() {
            addCriterion("year_mouth is not null");
            return (Criteria) this;
        }

        public Criteria andYearMouthEqualTo(String value) {
            addCriterion("year_mouth =", value, "yearMouth");
            return (Criteria) this;
        }

        public Criteria andYearMouthNotEqualTo(String value) {
            addCriterion("year_mouth <>", value, "yearMouth");
            return (Criteria) this;
        }

        public Criteria andYearMouthGreaterThan(String value) {
            addCriterion("year_mouth >", value, "yearMouth");
            return (Criteria) this;
        }

        public Criteria andYearMouthGreaterThanOrEqualTo(String value) {
            addCriterion("year_mouth >=", value, "yearMouth");
            return (Criteria) this;
        }

        public Criteria andYearMouthLessThan(String value) {
            addCriterion("year_mouth <", value, "yearMouth");
            return (Criteria) this;
        }

        public Criteria andYearMouthLessThanOrEqualTo(String value) {
            addCriterion("year_mouth <=", value, "yearMouth");
            return (Criteria) this;
        }

        public Criteria andYearMouthLike(String value) {
            addCriterion("year_mouth like", value, "yearMouth");
            return (Criteria) this;
        }

        public Criteria andYearMouthNotLike(String value) {
            addCriterion("year_mouth not like", value, "yearMouth");
            return (Criteria) this;
        }

        public Criteria andYearMouthIn(List<String> values) {
            addCriterion("year_mouth in", values, "yearMouth");
            return (Criteria) this;
        }

        public Criteria andYearMouthNotIn(List<String> values) {
            addCriterion("year_mouth not in", values, "yearMouth");
            return (Criteria) this;
        }

        public Criteria andYearMouthBetween(String value1, String value2) {
            addCriterion("year_mouth between", value1, value2, "yearMouth");
            return (Criteria) this;
        }

        public Criteria andYearMouthNotBetween(String value1, String value2) {
            addCriterion("year_mouth not between", value1, value2, "yearMouth");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyIsNull() {
            addCriterion("total_money is null");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyIsNotNull() {
            addCriterion("total_money is not null");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyEqualTo(Double value) {
            addCriterion("total_money =", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyNotEqualTo(Double value) {
            addCriterion("total_money <>", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyGreaterThan(Double value) {
            addCriterion("total_money >", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("total_money >=", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyLessThan(Double value) {
            addCriterion("total_money <", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyLessThanOrEqualTo(Double value) {
            addCriterion("total_money <=", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyIn(List<Double> values) {
            addCriterion("total_money in", values, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyNotIn(List<Double> values) {
            addCriterion("total_money not in", values, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyBetween(Double value1, Double value2) {
            addCriterion("total_money between", value1, value2, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyNotBetween(Double value1, Double value2) {
            addCriterion("total_money not between", value1, value2, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andMouthPercentageIsNull() {
            addCriterion("mouth_percentage is null");
            return (Criteria) this;
        }

        public Criteria andMouthPercentageIsNotNull() {
            addCriterion("mouth_percentage is not null");
            return (Criteria) this;
        }

        public Criteria andMouthPercentageEqualTo(Double value) {
            addCriterion("mouth_percentage =", value, "mouthPercentage");
            return (Criteria) this;
        }

        public Criteria andMouthPercentageNotEqualTo(Double value) {
            addCriterion("mouth_percentage <>", value, "mouthPercentage");
            return (Criteria) this;
        }

        public Criteria andMouthPercentageGreaterThan(Double value) {
            addCriterion("mouth_percentage >", value, "mouthPercentage");
            return (Criteria) this;
        }

        public Criteria andMouthPercentageGreaterThanOrEqualTo(Double value) {
            addCriterion("mouth_percentage >=", value, "mouthPercentage");
            return (Criteria) this;
        }

        public Criteria andMouthPercentageLessThan(Double value) {
            addCriterion("mouth_percentage <", value, "mouthPercentage");
            return (Criteria) this;
        }

        public Criteria andMouthPercentageLessThanOrEqualTo(Double value) {
            addCriterion("mouth_percentage <=", value, "mouthPercentage");
            return (Criteria) this;
        }

        public Criteria andMouthPercentageIn(List<Double> values) {
            addCriterion("mouth_percentage in", values, "mouthPercentage");
            return (Criteria) this;
        }

        public Criteria andMouthPercentageNotIn(List<Double> values) {
            addCriterion("mouth_percentage not in", values, "mouthPercentage");
            return (Criteria) this;
        }

        public Criteria andMouthPercentageBetween(Double value1, Double value2) {
            addCriterion("mouth_percentage between", value1, value2, "mouthPercentage");
            return (Criteria) this;
        }

        public Criteria andMouthPercentageNotBetween(Double value1, Double value2) {
            addCriterion("mouth_percentage not between", value1, value2, "mouthPercentage");
            return (Criteria) this;
        }

        public Criteria andTotalConsumIsNull() {
            addCriterion("total_consum is null");
            return (Criteria) this;
        }

        public Criteria andTotalConsumIsNotNull() {
            addCriterion("total_consum is not null");
            return (Criteria) this;
        }

        public Criteria andTotalConsumEqualTo(Double value) {
            addCriterion("total_consum =", value, "totalConsum");
            return (Criteria) this;
        }

        public Criteria andTotalConsumNotEqualTo(Double value) {
            addCriterion("total_consum <>", value, "totalConsum");
            return (Criteria) this;
        }

        public Criteria andTotalConsumGreaterThan(Double value) {
            addCriterion("total_consum >", value, "totalConsum");
            return (Criteria) this;
        }

        public Criteria andTotalConsumGreaterThanOrEqualTo(Double value) {
            addCriterion("total_consum >=", value, "totalConsum");
            return (Criteria) this;
        }

        public Criteria andTotalConsumLessThan(Double value) {
            addCriterion("total_consum <", value, "totalConsum");
            return (Criteria) this;
        }

        public Criteria andTotalConsumLessThanOrEqualTo(Double value) {
            addCriterion("total_consum <=", value, "totalConsum");
            return (Criteria) this;
        }

        public Criteria andTotalConsumIn(List<Double> values) {
            addCriterion("total_consum in", values, "totalConsum");
            return (Criteria) this;
        }

        public Criteria andTotalConsumNotIn(List<Double> values) {
            addCriterion("total_consum not in", values, "totalConsum");
            return (Criteria) this;
        }

        public Criteria andTotalConsumBetween(Double value1, Double value2) {
            addCriterion("total_consum between", value1, value2, "totalConsum");
            return (Criteria) this;
        }

        public Criteria andTotalConsumNotBetween(Double value1, Double value2) {
            addCriterion("total_consum not between", value1, value2, "totalConsum");
            return (Criteria) this;
        }

        public Criteria andIdentityIsNull() {
            addCriterion("identity is null");
            return (Criteria) this;
        }

        public Criteria andIdentityIsNotNull() {
            addCriterion("identity is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityEqualTo(Integer value) {
            addCriterion("identity =", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotEqualTo(Integer value) {
            addCriterion("identity <>", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityGreaterThan(Integer value) {
            addCriterion("identity >", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityGreaterThanOrEqualTo(Integer value) {
            addCriterion("identity >=", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityLessThan(Integer value) {
            addCriterion("identity <", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityLessThanOrEqualTo(Integer value) {
            addCriterion("identity <=", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityIn(List<Integer> values) {
            addCriterion("identity in", values, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotIn(List<Integer> values) {
            addCriterion("identity not in", values, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityBetween(Integer value1, Integer value2) {
            addCriterion("identity between", value1, value2, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotBetween(Integer value1, Integer value2) {
            addCriterion("identity not between", value1, value2, "identity");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}