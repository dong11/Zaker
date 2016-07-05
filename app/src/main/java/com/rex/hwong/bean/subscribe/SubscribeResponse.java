package com.rex.hwong.bean.subscribe;

import java.util.List;

/**
 * @author dong {hwongrex@gmail.com}
 * @date 16/7/5
 * @time 下午3:10
 */

public class SubscribeResponse {


    /**
     * stat : 1
     * msg : OK
     * data : {"info":{"common_api_url":"http://iphone.myzaker.com/zaker/common_api.php","readstat":"http://stat.myzaker.com/stat.php"},"message_info":{"refresh_key":"1467703442","show_key":"1398073055"},"list":[{"pk":"577b59dc9490cb377300000c","promotion_img":"http://zkres3.myzaker.com/img_upload/editor/img_upload/20160705/up_1467701710_51224.jpg","img_height":"360","img_width":"640","title":"我终于知道它为什么常年高居影史第一","end_time":"1467711180","type":"topic","pop_type":"","hide_mask":"N","ads_stat_url":"http://adm.myzaker.com/ads_stat.php?ads_id=577b59dc9490cb377300000c&position=my_subscriptions_promotion&click_stat=1","stat_read_url":"http://adm.myzaker.com/ads_stat.php?ads_id=577b59dc9490cb377300000c&position=my_subscriptions_promotion_read&action=read","tag_info":{"type":"img","text":"专题","image_url":"http://zkres.myzaker.com/data/image/mark/topic_2x.png","img_height":"26","img_width":"46","tag_position":"1"},"start_time":"1467702900","topic":{"pk":"57796ec1a07aec5e31000002","block_title":"20160705Tea Time","title":"20160705Tea Time","block_in_title":"20160705Tea Time","type":"user","skey":"1467701724","api_url":"http://iphone.myzaker.com/zaker/topic.php?app_id=660&topic_id=57796ec1a07aec5e31000002"}},{"pk":"577b2e119490cbb134000041","promotion_img":"http://zkres3.myzaker.com/img_upload/editor/img_upload/20160705/up_1467690477_29529.jpg","img_height":"360","img_width":"640","title":"光棍村的期盼：菩萨保佑我早日娶妻","end_time":"1467705600","type":"block","pop_type":"","hide_mask":"Y","ads_stat_url":"http://adm.myzaker.com/ads_stat.php?ads_id=577b2e119490cbb134000041&position=my_subscriptions_promotion&click_stat=1","stat_read_url":"http://adm.myzaker.com/ads_stat.php?ads_id=577b2e119490cbb134000041&position=my_subscriptions_promotion_read&action=read","tag_info":{"type":"img","text":"频道","image_url":"http://zkres.myzaker.com/data/image/mark/channel_2x.png","img_height":"26","img_width":"46","tag_position":"1"},"start_time":"1467691200","block_info":{"pk":"1","title":"国内新闻","stitle":"","block_title":"国内新闻","api_url":"http://iphone.myzaker.com/zaker/news.php?app_id=1&act=list","data_type":"rss","pic":"http://zkres.myzaker.com/data/image/logo/1.png?t=1461208757","large_pic":"http://zkres.myzaker.com/data/image/logo/ipad3/1.png?t=1461208757"}},{"pk":"577b49d19490cbe534000061","promotion_img":"http://zkres3.myzaker.com/img_upload/editor/img_upload/20160705/up_1467697548_3542.jpg","img_height":"360","img_width":"640","title":"2017好看的男包又被这两个牌子承包了","end_time":"1467705600","type":"block","pop_type":"","hide_mask":"N","ads_stat_url":"http://adm.myzaker.com/ads_stat.php?ads_id=577b49d19490cbe534000061&position=my_subscriptions_promotion&click_stat=1","stat_read_url":"http://adm.myzaker.com/ads_stat.php?ads_id=577b49d19490cbe534000061&position=my_subscriptions_promotion_read&action=read","tag_info":{"type":"img","text":"频道","image_url":"http://zkres.myzaker.com/data/image/mark/channel_2x.png","img_height":"26","img_width":"46","tag_position":"1"},"start_time":"1467698400","block_info":{"pk":"1067","title":"奢侈品频道","stitle":"","block_title":"奢侈品频道","api_url":"http://iphone.myzaker.com/zaker/blog.php?app_id=1067","data_type":"rss","pic":"http://zkres.myzaker.com/data/image/logo/1067.png?t=1460715585","large_pic":"http://zkres.myzaker.com/data/image/logo/ipad3/1067.png?t=1460715585"}},{"pk":"577b4e269490cba422000007","promotion_img":"http://zkres3.myzaker.com/img_upload/editor/img_upload/20160705/up_1467698708_46448.jpg","img_height":"360","img_width":"640","title":"世上最神秘的6大民族，至今不知从何而来！","end_time":"1467713280","type":"block","pop_type":"","hide_mask":"N","ads_stat_url":"http://adm.myzaker.com/ads_stat.php?ads_id=577b4e269490cba422000007&position=my_subscriptions_promotion&click_stat=1","stat_read_url":"http://adm.myzaker.com/ads_stat.php?ads_id=577b4e269490cba422000007&position=my_subscriptions_promotion_read&action=read","tag_info":{"type":"img","text":"频道","image_url":"http://zkres.myzaker.com/data/image/mark/channel_2x.png","img_height":"26","img_width":"46","tag_position":"1"},"start_time":"1467702000","block_info":{"pk":"981","title":"旅游频道","stitle":"","block_title":"旅游频道","api_url":"http://iphone.myzaker.com/zaker/blog.php?app_id=981","data_type":"rss","pic":"http://zkres.myzaker.com/data/image/logo/981.png?t=1450850826","large_pic":"http://zkres.myzaker.com/data/image/logo/ipad3/981.png?t=1450850826"}}]}
     */

    private String stat;
    private String msg;
    /**
     * info : {"common_api_url":"http://iphone.myzaker.com/zaker/common_api.php","readstat":"http://stat.myzaker.com/stat.php"}
     * message_info : {"refresh_key":"1467703442","show_key":"1398073055"}
     * list : [{"pk":"577b59dc9490cb377300000c","promotion_img":"http://zkres3.myzaker.com/img_upload/editor/img_upload/20160705/up_1467701710_51224.jpg","img_height":"360","img_width":"640","title":"我终于知道它为什么常年高居影史第一","end_time":"1467711180","type":"topic","pop_type":"","hide_mask":"N","ads_stat_url":"http://adm.myzaker.com/ads_stat.php?ads_id=577b59dc9490cb377300000c&position=my_subscriptions_promotion&click_stat=1","stat_read_url":"http://adm.myzaker.com/ads_stat.php?ads_id=577b59dc9490cb377300000c&position=my_subscriptions_promotion_read&action=read","tag_info":{"type":"img","text":"专题","image_url":"http://zkres.myzaker.com/data/image/mark/topic_2x.png","img_height":"26","img_width":"46","tag_position":"1"},"start_time":"1467702900","topic":{"pk":"57796ec1a07aec5e31000002","block_title":"20160705Tea Time","title":"20160705Tea Time","block_in_title":"20160705Tea Time","type":"user","skey":"1467701724","api_url":"http://iphone.myzaker.com/zaker/topic.php?app_id=660&topic_id=57796ec1a07aec5e31000002"}},{"pk":"577b2e119490cbb134000041","promotion_img":"http://zkres3.myzaker.com/img_upload/editor/img_upload/20160705/up_1467690477_29529.jpg","img_height":"360","img_width":"640","title":"光棍村的期盼：菩萨保佑我早日娶妻","end_time":"1467705600","type":"block","pop_type":"","hide_mask":"Y","ads_stat_url":"http://adm.myzaker.com/ads_stat.php?ads_id=577b2e119490cbb134000041&position=my_subscriptions_promotion&click_stat=1","stat_read_url":"http://adm.myzaker.com/ads_stat.php?ads_id=577b2e119490cbb134000041&position=my_subscriptions_promotion_read&action=read","tag_info":{"type":"img","text":"频道","image_url":"http://zkres.myzaker.com/data/image/mark/channel_2x.png","img_height":"26","img_width":"46","tag_position":"1"},"start_time":"1467691200","block_info":{"pk":"1","title":"国内新闻","stitle":"","block_title":"国内新闻","api_url":"http://iphone.myzaker.com/zaker/news.php?app_id=1&act=list","data_type":"rss","pic":"http://zkres.myzaker.com/data/image/logo/1.png?t=1461208757","large_pic":"http://zkres.myzaker.com/data/image/logo/ipad3/1.png?t=1461208757"}},{"pk":"577b49d19490cbe534000061","promotion_img":"http://zkres3.myzaker.com/img_upload/editor/img_upload/20160705/up_1467697548_3542.jpg","img_height":"360","img_width":"640","title":"2017好看的男包又被这两个牌子承包了","end_time":"1467705600","type":"block","pop_type":"","hide_mask":"N","ads_stat_url":"http://adm.myzaker.com/ads_stat.php?ads_id=577b49d19490cbe534000061&position=my_subscriptions_promotion&click_stat=1","stat_read_url":"http://adm.myzaker.com/ads_stat.php?ads_id=577b49d19490cbe534000061&position=my_subscriptions_promotion_read&action=read","tag_info":{"type":"img","text":"频道","image_url":"http://zkres.myzaker.com/data/image/mark/channel_2x.png","img_height":"26","img_width":"46","tag_position":"1"},"start_time":"1467698400","block_info":{"pk":"1067","title":"奢侈品频道","stitle":"","block_title":"奢侈品频道","api_url":"http://iphone.myzaker.com/zaker/blog.php?app_id=1067","data_type":"rss","pic":"http://zkres.myzaker.com/data/image/logo/1067.png?t=1460715585","large_pic":"http://zkres.myzaker.com/data/image/logo/ipad3/1067.png?t=1460715585"}},{"pk":"577b4e269490cba422000007","promotion_img":"http://zkres3.myzaker.com/img_upload/editor/img_upload/20160705/up_1467698708_46448.jpg","img_height":"360","img_width":"640","title":"世上最神秘的6大民族，至今不知从何而来！","end_time":"1467713280","type":"block","pop_type":"","hide_mask":"N","ads_stat_url":"http://adm.myzaker.com/ads_stat.php?ads_id=577b4e269490cba422000007&position=my_subscriptions_promotion&click_stat=1","stat_read_url":"http://adm.myzaker.com/ads_stat.php?ads_id=577b4e269490cba422000007&position=my_subscriptions_promotion_read&action=read","tag_info":{"type":"img","text":"频道","image_url":"http://zkres.myzaker.com/data/image/mark/channel_2x.png","img_height":"26","img_width":"46","tag_position":"1"},"start_time":"1467702000","block_info":{"pk":"981","title":"旅游频道","stitle":"","block_title":"旅游频道","api_url":"http://iphone.myzaker.com/zaker/blog.php?app_id=981","data_type":"rss","pic":"http://zkres.myzaker.com/data/image/logo/981.png?t=1450850826","large_pic":"http://zkres.myzaker.com/data/image/logo/ipad3/981.png?t=1450850826"}}]
     */

    private DataBean data;

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * common_api_url : http://iphone.myzaker.com/zaker/common_api.php
         * readstat : http://stat.myzaker.com/stat.php
         */

        private InfoBean info;
        /**
         * refresh_key : 1467703442
         * show_key : 1398073055
         */

        private MessageInfoBean message_info;
        /**
         * pk : 577b59dc9490cb377300000c
         * promotion_img : http://zkres3.myzaker.com/img_upload/editor/img_upload/20160705/up_1467701710_51224.jpg
         * img_height : 360
         * img_width : 640
         * title : 我终于知道它为什么常年高居影史第一
         * end_time : 1467711180
         * type : topic
         * pop_type :
         * hide_mask : N
         * ads_stat_url : http://adm.myzaker.com/ads_stat.php?ads_id=577b59dc9490cb377300000c&position=my_subscriptions_promotion&click_stat=1
         * stat_read_url : http://adm.myzaker.com/ads_stat.php?ads_id=577b59dc9490cb377300000c&position=my_subscriptions_promotion_read&action=read
         * tag_info : {"type":"img","text":"专题","image_url":"http://zkres.myzaker.com/data/image/mark/topic_2x.png","img_height":"26","img_width":"46","tag_position":"1"}
         * start_time : 1467702900
         * topic : {"pk":"57796ec1a07aec5e31000002","block_title":"20160705Tea Time","title":"20160705Tea Time","block_in_title":"20160705Tea Time","type":"user","skey":"1467701724","api_url":"http://iphone.myzaker.com/zaker/topic.php?app_id=660&topic_id=57796ec1a07aec5e31000002"}
         */

        private List<ListBean> list;

        public InfoBean getInfo() {
            return info;
        }

        public void setInfo(InfoBean info) {
            this.info = info;
        }

        public MessageInfoBean getMessage_info() {
            return message_info;
        }

        public void setMessage_info(MessageInfoBean message_info) {
            this.message_info = message_info;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "info=" + info +
                    ", message_info=" + message_info +
                    ", list=" + list +
                    '}';
        }

        public static class InfoBean {
            private String common_api_url;
            private String readstat;

            public String getCommon_api_url() {
                return common_api_url;
            }

            public void setCommon_api_url(String common_api_url) {
                this.common_api_url = common_api_url;
            }

            public String getReadstat() {
                return readstat;
            }

            public void setReadstat(String readstat) {
                this.readstat = readstat;
            }

            @Override
            public String toString() {
                return "InfoBean{" +
                        "common_api_url='" + common_api_url + '\'' +
                        ", readstat='" + readstat + '\'' +
                        '}';
            }
        }

        public static class MessageInfoBean {
            private String refresh_key;
            private String show_key;

            public String getRefresh_key() {
                return refresh_key;
            }

            public void setRefresh_key(String refresh_key) {
                this.refresh_key = refresh_key;
            }

            public String getShow_key() {
                return show_key;
            }

            public void setShow_key(String show_key) {
                this.show_key = show_key;
            }

            @Override
            public String toString() {
                return "MessageInfoBean{" +
                        "refresh_key='" + refresh_key + '\'' +
                        ", show_key='" + show_key + '\'' +
                        '}';
            }
        }

        public static class ListBean {
            private String pk;
            private String promotion_img;
            private String img_height;
            private String img_width;
            private String title;
            private String end_time;
            private String type;
            private String pop_type;
            private String hide_mask;
            private String ads_stat_url;
            private String stat_read_url;
            /**
             * type : img
             * text : 专题
             * image_url : http://zkres.myzaker.com/data/image/mark/topic_2x.png
             * img_height : 26
             * img_width : 46
             * tag_position : 1
             */

            private TagInfoBean tag_info;
            private String start_time;
            /**
             * pk : 57796ec1a07aec5e31000002
             * block_title : 20160705Tea Time
             * title : 20160705Tea Time
             * block_in_title : 20160705Tea Time
             * type : user
             * skey : 1467701724
             * api_url : http://iphone.myzaker.com/zaker/topic.php?app_id=660&topic_id=57796ec1a07aec5e31000002
             */

            private TopicBean topic;

            public String getPk() {
                return pk;
            }

            public void setPk(String pk) {
                this.pk = pk;
            }

            public String getPromotion_img() {
                return promotion_img;
            }

            public void setPromotion_img(String promotion_img) {
                this.promotion_img = promotion_img;
            }

            public String getImg_height() {
                return img_height;
            }

            public void setImg_height(String img_height) {
                this.img_height = img_height;
            }

            public String getImg_width() {
                return img_width;
            }

            public void setImg_width(String img_width) {
                this.img_width = img_width;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getEnd_time() {
                return end_time;
            }

            public void setEnd_time(String end_time) {
                this.end_time = end_time;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getPop_type() {
                return pop_type;
            }

            public void setPop_type(String pop_type) {
                this.pop_type = pop_type;
            }

            public String getHide_mask() {
                return hide_mask;
            }

            public void setHide_mask(String hide_mask) {
                this.hide_mask = hide_mask;
            }

            public String getAds_stat_url() {
                return ads_stat_url;
            }

            public void setAds_stat_url(String ads_stat_url) {
                this.ads_stat_url = ads_stat_url;
            }

            public String getStat_read_url() {
                return stat_read_url;
            }

            public void setStat_read_url(String stat_read_url) {
                this.stat_read_url = stat_read_url;
            }

            public TagInfoBean getTag_info() {
                return tag_info;
            }

            public void setTag_info(TagInfoBean tag_info) {
                this.tag_info = tag_info;
            }

            public String getStart_time() {
                return start_time;
            }

            public void setStart_time(String start_time) {
                this.start_time = start_time;
            }

            public TopicBean getTopic() {
                return topic;
            }

            public void setTopic(TopicBean topic) {
                this.topic = topic;
            }

            @Override
            public String toString() {
                return "ListBean{" +
                        "pk='" + pk + '\'' +
                        ", promotion_img='" + promotion_img + '\'' +
                        ", img_height='" + img_height + '\'' +
                        ", img_width='" + img_width + '\'' +
                        ", title='" + title + '\'' +
                        ", end_time='" + end_time + '\'' +
                        ", type='" + type + '\'' +
                        ", pop_type='" + pop_type + '\'' +
                        ", hide_mask='" + hide_mask + '\'' +
                        ", ads_stat_url='" + ads_stat_url + '\'' +
                        ", stat_read_url='" + stat_read_url + '\'' +
                        ", tag_info=" + tag_info +
                        ", start_time='" + start_time + '\'' +
                        ", topic=" + topic +
                        '}';
            }

            public static class TagInfoBean {
                private String type;
                private String text;
                private String image_url;
                private String img_height;
                private String img_width;
                private String tag_position;

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public String getImage_url() {
                    return image_url;
                }

                public void setImage_url(String image_url) {
                    this.image_url = image_url;
                }

                public String getImg_height() {
                    return img_height;
                }

                public void setImg_height(String img_height) {
                    this.img_height = img_height;
                }

                public String getImg_width() {
                    return img_width;
                }

                public void setImg_width(String img_width) {
                    this.img_width = img_width;
                }

                public String getTag_position() {
                    return tag_position;
                }

                public void setTag_position(String tag_position) {
                    this.tag_position = tag_position;
                }

                @Override
                public String toString() {
                    return "TagInfoBean{" +
                            "type='" + type + '\'' +
                            ", text='" + text + '\'' +
                            ", image_url='" + image_url + '\'' +
                            ", img_height='" + img_height + '\'' +
                            ", img_width='" + img_width + '\'' +
                            ", tag_position='" + tag_position + '\'' +
                            '}';
                }
            }

            public static class TopicBean {
                private String pk;
                private String block_title;
                private String title;
                private String block_in_title;
                private String type;
                private String skey;
                private String api_url;

                public String getPk() {
                    return pk;
                }

                public void setPk(String pk) {
                    this.pk = pk;
                }

                public String getBlock_title() {
                    return block_title;
                }

                public void setBlock_title(String block_title) {
                    this.block_title = block_title;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getBlock_in_title() {
                    return block_in_title;
                }

                public void setBlock_in_title(String block_in_title) {
                    this.block_in_title = block_in_title;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getSkey() {
                    return skey;
                }

                public void setSkey(String skey) {
                    this.skey = skey;
                }

                public String getApi_url() {
                    return api_url;
                }

                public void setApi_url(String api_url) {
                    this.api_url = api_url;
                }

                @Override
                public String toString() {
                    return "TopicBean{" +
                            "pk='" + pk + '\'' +
                            ", block_title='" + block_title + '\'' +
                            ", title='" + title + '\'' +
                            ", block_in_title='" + block_in_title + '\'' +
                            ", type='" + type + '\'' +
                            ", skey='" + skey + '\'' +
                            ", api_url='" + api_url + '\'' +
                            '}';
                }
            }
        }
    }

    @Override
    public String toString() {
        return "SubscribeResponse{" +
                "stat='" + stat + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
