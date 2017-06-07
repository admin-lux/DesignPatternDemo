package com.rick.designpattern.flyweight2;

import java.util.Hashtable;

/**
 * Created by MyPC on 2017/6/7.
 */
public class ArtistFactory {
    private Hashtable<String, Artist> flyweights = new Hashtable();

    public Artist getFlyweights(String key) {
        Artist artist = (Artist) flyweights.get(key);
        if (null == artist) {
            artist = new Artist(key);
            flyweights.put(key, artist);
        }
        return artist;
    }
}
