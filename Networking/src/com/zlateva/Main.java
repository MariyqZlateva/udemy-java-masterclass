package com.zlateva;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        try {
 //           URI uri = new URI("http://username:password@myserver.com:5000/catalogue/phones?os=android#samsung");
            URI baseUri = new URI("http://username:password@mynewserver.com:5000");
            URI uri1 = new URI("/catalogue/phones?os=android#samsung"); // relative path
            URI uri2 = new URI("/catalogue/tvs?manufacturer=samsung"); // relative path
            URI uri3 = new URI("/stores/locations?zip=1234"); // relative path

            URI resolveUri1 = baseUri.resolve(uri1);
            URI resolveUri2 = baseUri.resolve(uri2);
            URI resolveUri3 = baseUri.resolve(uri3);

            URL url1 = resolveUri1.toURL();
            System.out.println("URL1 = " + url1);

            URL url2 = resolveUri2.toURL();
            System.out.println("URL2 = " + url2);

            URL url3 = resolveUri3.toURL();
            System.out.println("URL3 = " + url3);

            URI relativazedURI = baseUri.relativize(resolveUri2);
            System.out.println("Relative URI = "+ relativazedURI);



            //            URI uri = new URI("hello");

//            System.out.println("Scheme = "+ uri.getScheme());
//            System.out.println("Scheme-specific part = "+ uri.getSchemeSpecificPart());
//            System.out.println("Authority = "+ uri.getAuthority());
//            System.out.println("User info = "+ uri.getUserInfo());
//            System.out.println("Host = "+ uri.getHost());
//            System.out.println("Port = "+ uri.getPort());
//            System.out.println("Pat = "+ uri.getPath());
//            System.out.println("Query = "+ uri.getQuery());
//            System.out.println("Fragment = "+ uri.getFragment());

        } catch (URISyntaxException e) {
            System.out.println("URI Bad Syntax: " + e.getMessage());
        } catch (MalformedURLException e) {
            System.out.println("URL Malformed: " + e.getMessage());
        }
    }
}