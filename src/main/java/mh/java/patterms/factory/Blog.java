package mh.java.patterms.factory;

public class Blog extends Website {

    @Override
    public void createWebSite() {
        pages.add(new PostPage());
        pages.add(new ContactPage());
        pages.add(new CartPage());
        pages.add(new AboutPage());

    }
}
