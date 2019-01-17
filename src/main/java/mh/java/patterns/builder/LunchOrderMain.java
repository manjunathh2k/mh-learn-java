package mh.java.patterns.builder;

public class LunchOrderMain {

    public static void main(String[] args) {
        LunchOrderBean.Builder builder = new LunchOrderBean.Builder();

        builder.bread("wheat").condiments("corn").meat("chiken").dressing("tomato");

        LunchOrderBean lun = builder.build();

        System.out.println(lun.getBread());
        System.out.println(lun.getCondiments());
        System.out.println(lun.getMeat());
        System.out.println(lun.getDressing());


    }

}
