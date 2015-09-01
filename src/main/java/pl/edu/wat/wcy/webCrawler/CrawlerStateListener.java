package pl.edu.wat.wcy.webCrawler;

/**
 * Created by wiciu on 01.09.15.
 */
public interface CrawlerStateListener {
    boolean stateChanged(CrawlerState newState);
}
