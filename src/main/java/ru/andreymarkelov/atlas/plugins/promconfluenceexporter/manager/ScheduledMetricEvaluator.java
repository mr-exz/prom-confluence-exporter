package ru.andreymarkelov.atlas.plugins.promconfluenceexporter.manager;

public interface ScheduledMetricEvaluator {
    long getTotalAttachmentSize();
    int getTotalUsers();
    long getLastExecutionTimestamp();
    void restartScraping(int newDelay);
    int getDelay();
    void setDelay(int delay);
}
