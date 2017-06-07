package com.rick.designpattern.flyweight2;

/**
 * Created by MyPC on 2017/6/7.
 */
public class Client {

    /***
     *
     *
     *
     <?xml version="1.0"?>
     <collection>
     <cd>
     <title>Another Green World</title>
     <year>1978</year>
     <artist>Eno, Brian</artist>
     </cd>
     <cd>
     <title>Greatest Hits</title>
     <year>1950</year>
     <artist>Holiday, Billie</artist>
     </cd>
     <cd>
     <title>Taking Tiger Mountain (by strategy)</title>
     <year>1977</year>
     <artist>Eno, Brian</artist>
     </cd>
     .......

     </collection>

     *
     *
     */

    public static void main(String[] args) {

        ArtistFactory factory = new ArtistFactory();
        CD cd = new CD("Another Green World","1978",factory.getFlyweights("Eno, Brian"));

    }
}
