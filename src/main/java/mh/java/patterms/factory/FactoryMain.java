package mh.java.patterms.factory;

public class FactoryMain {
    public static void main(String[] args) {
        Website site =  WebSiteFactory.getWebsite(WebSiteType.BLOG);

        System.out.println(site.getPages());

        site = WebSiteFactory.getWebsite(WebSiteType.SHOP );

        System.out.println(site.getPages());
    }
}
