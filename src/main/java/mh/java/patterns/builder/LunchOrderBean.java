package mh.java.patterns.builder;

public class LunchOrderBean {


    public static class Builder {
        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        public Builder(){}

        public Builder bread(String _bread) {
            this.bread = _bread;
            return this;
        }

        public Builder condiments(String _condiments) {
            this.condiments = _condiments;
            return this;
        }

        public Builder dressing(String _dressing) {
            this.dressing = _dressing;
            return this;
        }

        public Builder meat(String _meat) {
            this.meat = _meat;
            return this;
        }

        public LunchOrderBean build() {
            return new LunchOrderBean(this);
        }
    }

    private final String bread;
    private final String condiments;
    private final String dressing;
    private final String meat;

    private LunchOrderBean(Builder b){
        this.bread=b.bread;
        this.condiments=b.condiments;
        this.dressing=b.dressing;
        this.meat=b.meat;
    }

        public String getBread() {
            return bread;
        }

        public String getCondiments() {
            return condiments;
        }

        public String getDressing() {
            return dressing;
        }

        public String getMeat() {
            return meat;
        }
    }

