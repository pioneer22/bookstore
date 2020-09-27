package main.java.com.example.bookstore.pojo;

import java.util.ArrayList;
import java.util.List;

public class GetClassifiedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GetClassifiedExample() {
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

        public Criteria andGetClassifiedIdIsNull() {
            addCriterion("get_classified_id is null");
            return (Criteria) this;
        }

        public Criteria andGetClassifiedIdIsNotNull() {
            addCriterion("get_classified_id is not null");
            return (Criteria) this;
        }

        public Criteria andGetClassifiedIdEqualTo(Integer value) {
            addCriterion("get_classified_id =", value, "getClassifiedId");
            return (Criteria) this;
        }

        public Criteria andGetClassifiedIdNotEqualTo(Integer value) {
            addCriterion("get_classified_id <>", value, "getClassifiedId");
            return (Criteria) this;
        }

        public Criteria andGetClassifiedIdGreaterThan(Integer value) {
            addCriterion("get_classified_id >", value, "getClassifiedId");
            return (Criteria) this;
        }

        public Criteria andGetClassifiedIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("get_classified_id >=", value, "getClassifiedId");
            return (Criteria) this;
        }

        public Criteria andGetClassifiedIdLessThan(Integer value) {
            addCriterion("get_classified_id <", value, "getClassifiedId");
            return (Criteria) this;
        }

        public Criteria andGetClassifiedIdLessThanOrEqualTo(Integer value) {
            addCriterion("get_classified_id <=", value, "getClassifiedId");
            return (Criteria) this;
        }

        public Criteria andGetClassifiedIdIn(List<Integer> values) {
            addCriterion("get_classified_id in", values, "getClassifiedId");
            return (Criteria) this;
        }

        public Criteria andGetClassifiedIdNotIn(List<Integer> values) {
            addCriterion("get_classified_id not in", values, "getClassifiedId");
            return (Criteria) this;
        }

        public Criteria andGetClassifiedIdBetween(Integer value1, Integer value2) {
            addCriterion("get_classified_id between", value1, value2, "getClassifiedId");
            return (Criteria) this;
        }

        public Criteria andGetClassifiedIdNotBetween(Integer value1, Integer value2) {
            addCriterion("get_classified_id not between", value1, value2, "getClassifiedId");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNull() {
            addCriterion("book_id is null");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNotNull() {
            addCriterion("book_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookIdEqualTo(Integer value) {
            addCriterion("book_id =", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotEqualTo(Integer value) {
            addCriterion("book_id <>", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThan(Integer value) {
            addCriterion("book_id >", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_id >=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThan(Integer value) {
            addCriterion("book_id <", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThanOrEqualTo(Integer value) {
            addCriterion("book_id <=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdIn(List<Integer> values) {
            addCriterion("book_id in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotIn(List<Integer> values) {
            addCriterion("book_id not in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdBetween(Integer value1, Integer value2) {
            addCriterion("book_id between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotBetween(Integer value1, Integer value2) {
            addCriterion("book_id not between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andClassifiedIdIsNull() {
            addCriterion("classified_id is null");
            return (Criteria) this;
        }

        public Criteria andClassifiedIdIsNotNull() {
            addCriterion("classified_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassifiedIdEqualTo(Integer value) {
            addCriterion("classified_id =", value, "classifiedId");
            return (Criteria) this;
        }

        public Criteria andClassifiedIdNotEqualTo(Integer value) {
            addCriterion("classified_id <>", value, "classifiedId");
            return (Criteria) this;
        }

        public Criteria andClassifiedIdGreaterThan(Integer value) {
            addCriterion("classified_id >", value, "classifiedId");
            return (Criteria) this;
        }

        public Criteria andClassifiedIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("classified_id >=", value, "classifiedId");
            return (Criteria) this;
        }

        public Criteria andClassifiedIdLessThan(Integer value) {
            addCriterion("classified_id <", value, "classifiedId");
            return (Criteria) this;
        }

        public Criteria andClassifiedIdLessThanOrEqualTo(Integer value) {
            addCriterion("classified_id <=", value, "classifiedId");
            return (Criteria) this;
        }

        public Criteria andClassifiedIdIn(List<Integer> values) {
            addCriterion("classified_id in", values, "classifiedId");
            return (Criteria) this;
        }

        public Criteria andClassifiedIdNotIn(List<Integer> values) {
            addCriterion("classified_id not in", values, "classifiedId");
            return (Criteria) this;
        }

        public Criteria andClassifiedIdBetween(Integer value1, Integer value2) {
            addCriterion("classified_id between", value1, value2, "classifiedId");
            return (Criteria) this;
        }

        public Criteria andClassifiedIdNotBetween(Integer value1, Integer value2) {
            addCriterion("classified_id not between", value1, value2, "classifiedId");
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