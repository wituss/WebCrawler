package pl.edu.wat.wcy.webCrawler;

/**
 * Created by wiciu on 01.09.15.
 */
public enum CrawlerState {
    STOPPED(0),
    RUNNING(1);

    private int stateInt;

    CrawlerState(int state) {
        this.stateInt = state;
    }
}
