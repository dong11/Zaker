package com.rex.hwong.bean;

import com.google.gson.annotations.SerializedName;

/**
 * @author dong {hwongrex@gmail.com}
 * @date 16/6/13
 * @time 下午10:20
 */

public class UpdateItem {
    @SerializedName("versionCode")
    private int versionCode;
    @SerializedName("versionName")
    private String versionName;
    @SerializedName("downloadUrl")
    private String downloadUrl;
    @SerializedName("releaseNote")
    private String releaseNote;

    public int getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(int versionCode) {
        this.versionCode = versionCode;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public String getReleaseNote() {
        return releaseNote;
    }

    public void setReleaseNote(String releaseNote) {
        this.releaseNote = releaseNote;
    }
}
