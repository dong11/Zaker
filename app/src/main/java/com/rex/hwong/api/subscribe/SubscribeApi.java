package com.rex.hwong.api.subscribe;

import com.rex.hwong.bean.subscribe.SubscribeResponse;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * @author dong {hwongrex@gmail.com}
 * @date 16/7/5
 * @time 下午3:26
 */

public interface SubscribeApi {
    @GET("http://iphone.myzaker.com/zaker/follow_promote.php?_appid=AndroidPhone&_bsize=720_1280&_dev=31&_lat=4.9E-324&_lng=4.9E-324&_mac=08%3A00%3A27%3A73%3Afe%3A4c&_mcode=6F530424&_net=wifi&_nudid=d02bff02f30361e5&_os=4.4.4_CustomPhone-4.4.4-API19-768x1280&_os_name=CustomPhone-4.4.4-API19-768x1280&_udid=4.4.4_CustomPhone-4.4.4-API19-768x1280.08%3A00%3A27%3A73%3Afe%3A4c&_v=6.5.6&_version=6.56&m=1466932921")
    Observable<SubscribeResponse> getSubscribe();
}
