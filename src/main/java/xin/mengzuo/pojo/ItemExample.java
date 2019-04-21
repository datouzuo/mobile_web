package xin.mengzuo.pojo;

import java.util.ArrayList;
import java.util.List;

public class ItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemExample() {
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

        public Criteria andDayCurrentTimeIsNull() {
            addCriterion("day_current_time is null");
            return (Criteria) this;
        }

        public Criteria andDayCurrentTimeIsNotNull() {
            addCriterion("day_current_time is not null");
            return (Criteria) this;
        }

        public Criteria andDayCurrentTimeEqualTo(String value) {
            addCriterion("day_current_time =", value, "dayCurrentTime");
            return (Criteria) this;
        }

        public Criteria andDayCurrentTimeNotEqualTo(String value) {
            addCriterion("day_current_time <>", value, "dayCurrentTime");
            return (Criteria) this;
        }

        public Criteria andDayCurrentTimeGreaterThan(String value) {
            addCriterion("day_current_time >", value, "dayCurrentTime");
            return (Criteria) this;
        }

        public Criteria andDayCurrentTimeGreaterThanOrEqualTo(String value) {
            addCriterion("day_current_time >=", value, "dayCurrentTime");
            return (Criteria) this;
        }

        public Criteria andDayCurrentTimeLessThan(String value) {
            addCriterion("day_current_time <", value, "dayCurrentTime");
            return (Criteria) this;
        }

        public Criteria andDayCurrentTimeLessThanOrEqualTo(String value) {
            addCriterion("day_current_time <=", value, "dayCurrentTime");
            return (Criteria) this;
        }

        public Criteria andDayCurrentTimeLike(String value) {
            addCriterion("day_current_time like", value, "dayCurrentTime");
            return (Criteria) this;
        }

        public Criteria andDayCurrentTimeNotLike(String value) {
            addCriterion("day_current_time not like", value, "dayCurrentTime");
            return (Criteria) this;
        }

        public Criteria andDayCurrentTimeIn(List<String> values) {
            addCriterion("day_current_time in", values, "dayCurrentTime");
            return (Criteria) this;
        }

        public Criteria andDayCurrentTimeNotIn(List<String> values) {
            addCriterion("day_current_time not in", values, "dayCurrentTime");
            return (Criteria) this;
        }

        public Criteria andDayCurrentTimeBetween(String value1, String value2) {
            addCriterion("day_current_time between", value1, value2, "dayCurrentTime");
            return (Criteria) this;
        }

        public Criteria andDayCurrentTimeNotBetween(String value1, String value2) {
            addCriterion("day_current_time not between", value1, value2, "dayCurrentTime");
            return (Criteria) this;
        }

        public Criteria andYearMonthDayIsNull() {
            addCriterion("year_month_day is null");
            return (Criteria) this;
        }

        public Criteria andYearMonthDayIsNotNull() {
            addCriterion("year_month_day is not null");
            return (Criteria) this;
        }

        public Criteria andYearMonthDayEqualTo(Integer value) {
            addCriterion("year_month_day =", value, "yearMonthDay");
            return (Criteria) this;
        }

        public Criteria andYearMonthDayNotEqualTo(Integer value) {
            addCriterion("year_month_day <>", value, "yearMonthDay");
            return (Criteria) this;
        }

        public Criteria andYearMonthDayGreaterThan(Integer value) {
            addCriterion("year_month_day >", value, "yearMonthDay");
            return (Criteria) this;
        }

        public Criteria andYearMonthDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("year_month_day >=", value, "yearMonthDay");
            return (Criteria) this;
        }

        public Criteria andYearMonthDayLessThan(Integer value) {
            addCriterion("year_month_day <", value, "yearMonthDay");
            return (Criteria) this;
        }

        public Criteria andYearMonthDayLessThanOrEqualTo(Integer value) {
            addCriterion("year_month_day <=", value, "yearMonthDay");
            return (Criteria) this;
        }

        public Criteria andYearMonthDayIn(List<Integer> values) {
            addCriterion("year_month_day in", values, "yearMonthDay");
            return (Criteria) this;
        }

        public Criteria andYearMonthDayNotIn(List<Integer> values) {
            addCriterion("year_month_day not in", values, "yearMonthDay");
            return (Criteria) this;
        }

        public Criteria andYearMonthDayBetween(Integer value1, Integer value2) {
            addCriterion("year_month_day between", value1, value2, "yearMonthDay");
            return (Criteria) this;
        }

        public Criteria andYearMonthDayNotBetween(Integer value1, Integer value2) {
            addCriterion("year_month_day not between", value1, value2, "yearMonthDay");
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

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthIsNull() {
            addCriterion("current_month is null");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthIsNotNull() {
            addCriterion("current_month is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthEqualTo(Integer value) {
            addCriterion("current_month =", value, "currentMonth");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthNotEqualTo(Integer value) {
            addCriterion("current_month <>", value, "currentMonth");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthGreaterThan(Integer value) {
            addCriterion("current_month >", value, "currentMonth");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("current_month >=", value, "currentMonth");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthLessThan(Integer value) {
            addCriterion("current_month <", value, "currentMonth");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthLessThanOrEqualTo(Integer value) {
            addCriterion("current_month <=", value, "currentMonth");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthIn(List<Integer> values) {
            addCriterion("current_month in", values, "currentMonth");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthNotIn(List<Integer> values) {
            addCriterion("current_month not in", values, "currentMonth");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthBetween(Integer value1, Integer value2) {
            addCriterion("current_month between", value1, value2, "currentMonth");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("current_month not between", value1, value2, "currentMonth");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("status not between", value1, value2, "status");
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