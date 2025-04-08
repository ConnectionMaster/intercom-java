/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.intercom.api.resources.dataexport;

import com.intercom.api.core.ClientOptions;
import com.intercom.api.core.RequestOptions;
import com.intercom.api.resources.dataexport.requests.CancelDataExportRequest;
import com.intercom.api.resources.dataexport.requests.CreateDataExportRequest;
import com.intercom.api.resources.dataexport.requests.DownloadDataExportRequest;
import com.intercom.api.resources.dataexport.requests.FindDataExportRequest;
import com.intercom.api.resources.dataexport.types.DataExport;
import java.util.concurrent.CompletableFuture;

public class AsyncDataExportClient {
    protected final ClientOptions clientOptions;

    private final AsyncRawDataExportClient rawClient;

    public AsyncDataExportClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.rawClient = new AsyncRawDataExportClient(clientOptions);
    }

    /**
     * Get responses with HTTP metadata like headers
     */
    public AsyncRawDataExportClient withRawResponse() {
        return this.rawClient;
    }

    /**
     * To create your export job, you need to send a <code>POST</code> request to the export endpoint <code>https://api.intercom.io/export/content/data</code>.
     * <p>The only parameters you need to provide are the range of dates that you want exported.</p>
     * <blockquote>
     * <p>🚧 Limit of one active job</p>
     * <p>You can only have one active job per workspace. You will receive a HTTP status code of 429 with the message Exceeded rate limit of 1 pending message data export jobs if you attempt to create a second concurrent job.</p>
     * </blockquote>
     * <blockquote>
     * <p>❗️ Updated_at not included</p>
     * <p>It should be noted that the timeframe only includes messages sent during the time period and not messages that were only updated during this period. For example, if a message was updated yesterday but sent two days ago, you would need to set the created_at_after date before the message was sent to include that in your retrieval job.</p>
     * </blockquote>
     * <blockquote>
     * <p>📘 Date ranges are inclusive</p>
     * <p>Requesting data for 2018-06-01 until 2018-06-30 will get all data for those days including those specified - e.g. 2018-06-01 00:00:00 until 2018-06-30 23:59:99.</p>
     * </blockquote>
     */
    public CompletableFuture<DataExport> create(CreateDataExportRequest request) {
        return this.rawClient.create(request).thenApply(response -> response.body());
    }

    /**
     * To create your export job, you need to send a <code>POST</code> request to the export endpoint <code>https://api.intercom.io/export/content/data</code>.
     * <p>The only parameters you need to provide are the range of dates that you want exported.</p>
     * <blockquote>
     * <p>🚧 Limit of one active job</p>
     * <p>You can only have one active job per workspace. You will receive a HTTP status code of 429 with the message Exceeded rate limit of 1 pending message data export jobs if you attempt to create a second concurrent job.</p>
     * </blockquote>
     * <blockquote>
     * <p>❗️ Updated_at not included</p>
     * <p>It should be noted that the timeframe only includes messages sent during the time period and not messages that were only updated during this period. For example, if a message was updated yesterday but sent two days ago, you would need to set the created_at_after date before the message was sent to include that in your retrieval job.</p>
     * </blockquote>
     * <blockquote>
     * <p>📘 Date ranges are inclusive</p>
     * <p>Requesting data for 2018-06-01 until 2018-06-30 will get all data for those days including those specified - e.g. 2018-06-01 00:00:00 until 2018-06-30 23:59:99.</p>
     * </blockquote>
     */
    public CompletableFuture<DataExport> create(CreateDataExportRequest request, RequestOptions requestOptions) {
        return this.rawClient.create(request, requestOptions).thenApply(response -> response.body());
    }

    /**
     * You can view the status of your job by sending a <code>GET</code> request to the URL
     * <code>https://api.intercom.io/export/content/data/{job_identifier}</code> - the <code>{job_identifier}</code> is the value returned in the response when you first created the export job. More on it can be seen in the Export Job Model.
     * <blockquote>
     * <p>🚧 Jobs expire after two days
     * All jobs that have completed processing (and are thus available to download from the provided URL) will have an expiry limit of two days from when the export ob completed. After this, the data will no longer be available.</p>
     * </blockquote>
     */
    public CompletableFuture<DataExport> find(FindDataExportRequest request) {
        return this.rawClient.find(request).thenApply(response -> response.body());
    }

    /**
     * You can view the status of your job by sending a <code>GET</code> request to the URL
     * <code>https://api.intercom.io/export/content/data/{job_identifier}</code> - the <code>{job_identifier}</code> is the value returned in the response when you first created the export job. More on it can be seen in the Export Job Model.
     * <blockquote>
     * <p>🚧 Jobs expire after two days
     * All jobs that have completed processing (and are thus available to download from the provided URL) will have an expiry limit of two days from when the export ob completed. After this, the data will no longer be available.</p>
     * </blockquote>
     */
    public CompletableFuture<DataExport> find(FindDataExportRequest request, RequestOptions requestOptions) {
        return this.rawClient.find(request, requestOptions).thenApply(response -> response.body());
    }

    /**
     * You can cancel your job
     */
    public CompletableFuture<DataExport> cancel(CancelDataExportRequest request) {
        return this.rawClient.cancel(request).thenApply(response -> response.body());
    }

    /**
     * You can cancel your job
     */
    public CompletableFuture<DataExport> cancel(CancelDataExportRequest request, RequestOptions requestOptions) {
        return this.rawClient.cancel(request, requestOptions).thenApply(response -> response.body());
    }

    /**
     * When a job has a status of complete, and thus a filled download_url, you can download your data by hitting that provided URL, formatted like so: https://api.intercom.io/download/content/data/xyz1234.
     * <p>Your exported message data will be streamed continuously back down to you in a gzipped CSV format.</p>
     * <blockquote>
     * <p>📘 Octet header required</p>
     * <p>You will have to specify the header Accept: <code>application/octet-stream</code> when hitting this endpoint.</p>
     * </blockquote>
     */
    public CompletableFuture<Void> download(DownloadDataExportRequest request) {
        return this.rawClient.download(request).thenApply(response -> response.body());
    }

    /**
     * When a job has a status of complete, and thus a filled download_url, you can download your data by hitting that provided URL, formatted like so: https://api.intercom.io/download/content/data/xyz1234.
     * <p>Your exported message data will be streamed continuously back down to you in a gzipped CSV format.</p>
     * <blockquote>
     * <p>📘 Octet header required</p>
     * <p>You will have to specify the header Accept: <code>application/octet-stream</code> when hitting this endpoint.</p>
     * </blockquote>
     */
    public CompletableFuture<Void> download(DownloadDataExportRequest request, RequestOptions requestOptions) {
        return this.rawClient.download(request, requestOptions).thenApply(response -> response.body());
    }
}
