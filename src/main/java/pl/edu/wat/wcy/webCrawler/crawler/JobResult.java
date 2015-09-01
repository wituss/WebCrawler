package pl.edu.wat.wcy.webCrawler.crawler;

import java.io.Serializable;
import java.net.URL;
import java.util.List;

/**
 * Created by wiciu on 01.09.15.
 */
public class JobResult implements Serializable {

    /**
     * URL from which we've started
     */
    private URL originURL;

    private List<URL> discoveredURLs;

    private boolean stopConditionSatisfied;

    public URL getOriginURL() {
        return originURL;
    }

    public void setOriginURL(URL originURL) {
        this.originURL = originURL;
    }

    public List<URL> getDiscoveredURLs() {
        return discoveredURLs;
    }

    public void setDiscoveredURLs(List<URL> discoveredURLs) {
        this.discoveredURLs = discoveredURLs;
    }

    public boolean isStopConditionSatisfied() {
        return stopConditionSatisfied;
    }

    public void setStopConditionSatisfied(boolean stopConditionSatisfied) {
        this.stopConditionSatisfied = stopConditionSatisfied;
    }

}
