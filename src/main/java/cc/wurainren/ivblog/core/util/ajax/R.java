package cc.wurainren.ivblog.core.util.ajax;


import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.util.HashMap;
import java.util.Map;


/**
 * 返回数据
 *
 */
public class R  extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;

    public R() {
        put("code", 1);
        put("content", "");
        put("msg", "");
    }

    public static R error() {
        return error(0, "网络错误");
    }

    public static R error(String msg) {
        return error(0, msg);
    }

    public static R error(int code, String msg) {
        R r = new R();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }

    public static R ok(String msg) {
        R r = new R();
        r.put("msg", msg);
        return r;
    }

    public static R ok(Map<String, Object> map) {
        R r = new R();
        JSONObject.toJSONString(map,SerializerFeature.WriteMapNullValue);
        r.putAll(map);
        return r;
    }

    public static R ok() {
        R r = new R();
        r.put("msg", "成功");
        return r;
    }

    public R put(String key, Object value) {
        super.put(key, value);
        return this;
    }

    /**
     * API返回数据内容
     * @param obj
     * @return
     */
    public R content(Object obj) {
        if(obj != null) {
            super.put("content", obj);
        }
        else {
            super.put("content",null);
        }
        return this;
    }
}
