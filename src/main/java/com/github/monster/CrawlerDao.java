package com.github.monster;

import org.jsoup.nodes.Document;

import java.sql.SQLException;

public interface CrawlerDao {
    String loadOneUrl(int status) throws SQLException;

    void storeArticle(Document document, String url) throws SQLException;

    void insertArticle(String title, String content, String url) throws SQLException;

    void insertUrl(String url) throws SQLException;

    void updateUrlStatus(String url, int status) throws SQLException;

    boolean isUrlExist(String url) throws SQLException;

    boolean hasProcessed(String url) throws SQLException;
}
