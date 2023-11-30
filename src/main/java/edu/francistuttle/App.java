package edu.francistuttle;

import com.sun.syndication.feed.synd.SyndCategoryImpl;
import com.sun.syndication.feed.synd.SyndContentImpl;
import com.sun.syndication.feed.synd.SyndEntry;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.feed.synd.SyndLinkImpl;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        try
        {
            File path = new File("C:\\Users\\ap1101037\\Desktop\\github-tran\\nasaparser\\src\\nasa.xml");

            SyndFeedInput input = new SyndFeedInput();
            SyndFeed feed = input.build(new XmlReader(path));

            System.out.println("Feed Title: " + feed.getTitle());
            System.out.println("Feed Link: " + feed.getLink());
            System.out.println("Feed Description: " + feed.getDescription());

            for(SyndEntry entry : (List<SyndEntry>) feed.getEntries())
            {
                System.out.println("\tEntry Title: " + entry.getTitle());
                System.out.println("\tEntry Link: " + entry.getLink());
                System.out.println("\tEntry Description: " + entry.getDescription());
            }
        }
        catch(Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
