package com.responsi.mvp.Network;

import com.google.gson.annotations.SerializedName;
import com.responsi.mvp.Model.Response;

import java.util.List;

public class DataResponse {

    @SerializedName("results")
    private List<Response> dataList;

    public List<Response> getDataList() {
        return dataList;
    }
}
