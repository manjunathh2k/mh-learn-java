package mh.java.patterms.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

    protected List<Page> pages = new ArrayList<Page>();

    public Website(){
        this.createWebSite();
    }

    public List<Page> getPages() {
        return pages;
    }

    public abstract void createWebSite();
}
