package xin.mengzuo.pojo;

import java.util.ArrayList;
import java.util.List;

public class DayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DayExample() {
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

        public Criteria andDayIdIsNull() {
            addCriterion("day_id is null");
            return (Criteria) this;
        }

        public Criteria andDayIdIsNotNull() {
            addCriterion("day_id is not null");
            return (Criteria) this;
        }

        public Criteria andDayIdEqualTo(Integer value) {
            addCriterion("day_id =", value, "dayId");
            return (Criteria) this;
        }

        public Criteria andDayIdNotEqualTo(Integer value) {
            addCriterion("day_id <>", value, "dayId");
            return (Criteria) this;
        }

        public Criteria andDayIdGreaterThan(Integer value) {
            addCriterion("day_id >", value, "dayId");
            return (Criteria) this;
        }

        public Criteria andDayIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("day_id >=", value, "dayId");
            return (Criteria) this;
        }

        public Criteria andDayIdLessThan(Integer value) {
            addCriterion("day_id <", value, "dayId");
            return (Criteria) this;
        }

        public Criteria andDayIdLessThanOrEqualTo(Integer value) {
            addCriterion("day_id <=", value, "dayId");
            return (Criteria) this;
        }

        public Criteria andDayIdIn(List<Integer> values) {
            addCriterion("day_id in", values, "dayId");
            return (Criteria) this;
        }

        public Criteria andDayIdNotIn(List<Integer> values) {
            addCriterion("day_id not in", values, "dayId");
            return (Criteria) this;
        }

        public Criteria andDayIdBetween(Integer value1, Integer value2) {
            addCriterion("day_id between", value1, value2, "dayId");
            return (Criteria) this;
        }

        public Criteria andDayIdNotBetween(Integer value1, Integer value2) {
            addCriterion("day_id not between", value1, value2, "dayId");
            return (Criteria) this;
        }

        public Criteria andYearMouthDayIsNull() {
            addCriterion("year_mouth_day is null");
            return (Criteria) this;
        }

        public Criteria andYearMouthDayIsNotNull() {
            addCriterion("year_mouth_day is not null");
            return (Criteria) this;
        }

        public Criteria andYearMouthDayEqualTo(String value) {
            addCriterion("year_mouth_day =", value, "yearMouthDay");
            return (Criteria) this;
        }

        public Criteria andYearMouthDayNotEqualTo(String value) {
            addCriterion("year_mouth_day <>", value, "yearMouthDay");
            return (Criteria) this;
        }

        public Criteria andYearMouthDayGreaterThan(String value) {
            addCriterion("year_mouth_day >", value, "yearMouthDay");
            return (Criteria) this;
        }

        public Criteria andYearMouthDayGreaterThanOrEqualTo(String value) {
            addCriterion("year_mouth_day >=", value, "yearMouthDay");
            return (Criteria) this;
        }

        public Criteria andYearMouthDayLessThan(String value) {
            addCriterion("year_mouth_day <", value, "yearMouthDay");
            return (Criteria) this;
        }

        public Criteria andYearMouthDayLessThanOrEqualTo(String value) {
            addCriterion("year_mouth_day <=", value, "yearMouthDay");
            return (Criteria) this;
        }

        public Criteria andYearMouthDayLike(String value) {
            addCriterion("year_mouth_day like", value, "yearMouthDay");
            return (Criteria) this;
        }

        public Criteria andYearMouthDayNotLike(String value) {
            addCriterion("year_mouth_day not like", value, "yearMouthDay");
            return (Criteria) this;
        }

        public Criteria andYearMouthDayIn(List<String> values) {
            addCriterion("year_mouth_day in", values, "yearMouthDay");
            return (Criteria) this;
        }

        public Criteria andYearMouthDayNotIn(List<String> values) {
            addCriterion("year_mouth_day not in", values, "yearMouthDay");
            return (Criteria) this;
        }

        public Criteria andYearMouthDayBetween(String value1, String value2) {
            addCriterion("year_mouth_day between", value1, value2, "yearMouthDay");
            return (Criteria) this;
        }

        public Criteria andYearMouthDayNotBetween(String value1, String value2) {
            addCriterion("year_mouth_day not between", value1, value2, "yearMouthDay");
            return (Criteria) this;
        }

        public Criteria andConsumePercentageIsNull() {
            addCriterion("consume_percentage is null");
            return (Criteria) this;
        }

        public Criteria andConsumePercentageIsNotNull() {
            addCriterion("consume_percentage is not null");
            return (Criteria) this;
        }

        public Criteria andConsumePercentageEqualTo(Double value) {
            addCriterion("consume_percentage =", value, "consumePercentage");
            return (Criteria) this;
        }

        public Criteria andConsumePercentageNotEqualTo(Double value) {
            addCriterion("consume_percentage <>", value, "consumePercentage");
            return (Criteria) this;
        }

        public Criteria andConsumePercentageGreaterThan(Double value) {
            addCriterion("consume_percentage >", value, "consumePercentage");
            return (Criteria) this;
        }

        public Criteria andConsumePercentageGreaterThanOrEqualTo(Double value) {
            addCriterion("consume_percentage >=", value, "consumePercentage");
            return (Criteria) this;
        }

        public Criteria andConsumePercentageLessThan(Double value) {
            addCriterion("consume_percentage <", value, "consumePercentage");
            return (Criteria) this;
        }

        public Criteria andConsumePercentageLessThanOrEqualTo(Double value) {
            addCriterion("consume_percentage <=", value, "consumePercentage");
            return (Criteria) this;
        }

        public Criteria andConsumePercentageIn(List<Double> values) {
            addCriterion("consume_percentage in", values, "consumePercentage");
            return (Criteria) this;
        }

        public Criteria andConsumePercentageNotIn(List<Double> values) {
            addCriterion("consume_percentage not in", values, "consumePercentage");
            return (Criteria) this;
        }

        public Criteria andConsumePercentageBetween(Double value1, Double value2) {
            addCriterion("consume_percentage between", value1, value2, "consumePercentage");
            return (Criteria) this;
        }

        public Criteria andConsumePercentageNotBetween(Double value1, Double value2) {
            addCriterion("consume_percentage not between", value1, value2, "consumePercentage");
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

        public Criteria andYearMouthEqualTo(Integer value) {
            addCriterion("year_mouth =", value, "yearMouth");
            return (Criteria) this;
        }

        public Criteria andYearMouthNotEqualTo(Integer value) {
            addCriterion("year_mouth <>", value, "yearMouth");
            return (Criteria) this;
        }

        public Criteria andYearMouthGreaterThan(Integer value) {
            addCriterion("year_mouth >", value, "yearMouth");
            return (Criteria) this;
        }

        public Criteria andYearMouthGreaterThanOrEqualTo(Integer value) {
            addCriterion("year_mouth >=", value, "yearMouth");
            return (Criteria) this;
        }

        public Criteria andYearMouthLessThan(Integer value) {
            addCriterion("year_mouth <", value, "yearMouth");
            return (Criteria) this;
        }

        public Criteria andYearMouthLessThanOrEqualTo(Integer value) {
            addCriterion("year_mouth <=", value, "yearMouth");
            return (Criteria) this;
        }

        public Criteria andYearMouthIn(List<Integer> values) {
            addCriterion("year_mouth in", values, "yearMouth");
            return (Criteria) this;
        }

        public Criteria andYearMouthNotIn(List<Integer> values) {
            addCriterion("year_mouth not in", values, "yearMouth");
            return (Criteria) this;
        }

        public Criteria andYearMouthBetween(Integer value1, Integer value2) {
            addCriterion("year_mouth between", value1, value2, "yearMouth");
            return (Criteria) this;
        }

        public Criteria andYearMouthNotBetween(Integer value1, Integer value2) {
            addCriterion("year_mouth not between", value1, value2, "yearMouth");
            return (Criteria) this;
        }

        public Criteria andConsumeIsNull() {
            addCriterion("consume is null");
            return (Criteria) this;
        }

        public Criteria andConsumeIsNotNull() {
            addCriterion("consume is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeEqualTo(Double value) {
            addCriterion("consume =", value, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeNotEqualTo(Double value) {
            addCriterion("consume <>", value, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeGreaterThan(Double value) {
            addCriterion("consume >", value, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeGreaterThanOrEqualTo(Double value) {
            addCriterion("consume >=", value, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeLessThan(Double value) {
            addCriterion("consume <", value, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeLessThanOrEqualTo(Double value) {
            addCriterion("consume <=", value, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeIn(List<Double> values) {
            addCriterion("consume in", values, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeNotIn(List<Double> values) {
            addCriterion("consume not in", values, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeBetween(Double value1, Double value2) {
            addCriterion("consume between", value1, value2, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeNotBetween(Double value1, Double value2) {
            addCriterion("consume not between", value1, value2, "consume");
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