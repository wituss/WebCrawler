package pl.edu.wat.wcy.webCrawler.workManager;

import pl.edu.wat.wcy.webCrawler.crawler.JobObject;
import pl.edu.wat.wcy.webCrawler.crawler.JobResult;

/**
 * Created by wiciu on 01.09.15.
 */
public interface WorkManager {

    JobObject getJob();

    void ReportResult(JobResult jobResult);

}
