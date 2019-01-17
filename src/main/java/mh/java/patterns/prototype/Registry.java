package mh.java.patterns.prototype;

import java.util.*;

public class Registry {

    private Map<String, Item> items = new HashMap<String,Item>();

    public Registry(){
        loadItems();
    }

    public Item createItem(String type)
    {
        Item item = null;

        try{

            item = (Item)(items.get(type)).clone();

        }catch (CloneNotSupportedException e)
        {
                e.printStackTrace();
        }

        return item;
    }

    private void loadItems()
    {
        Movie movie = new Movie();
        movie.setTitle("Basic Movie");
        movie.setPrice(49.23);
        movie.setRuntime("2 Hours");

        items.put("Movie",movie);

        Book book = new Book();
        book.setTitle("Basic Book");
        book.setPrice(45.3);
        book.setNumberOfPages(335);

        items.put("Book",book);

    }
}
