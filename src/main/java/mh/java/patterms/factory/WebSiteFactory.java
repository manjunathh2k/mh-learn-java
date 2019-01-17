package mh.java.patterms.factory;

public class WebSiteFactory {

    WebSiteFactory(){}

    public static Website getWebsite(WebSiteType type)
    {
        switch (type)
        {
            case BLOG: {
                return new Blog();
            }
            case SHOP: {
                return new Shop();
            }
            default:{
                return null;
            }
        }
    }
}
