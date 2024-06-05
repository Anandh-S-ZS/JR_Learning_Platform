package com.util;

import com.opensymphony.xwork2.ActionContext;
import java.util.Map;

public class SessionUtil {

    public static Object getSessionAttribute(String key) {
        Map<String, Object> session = ActionContext.getContext().getSession();
        return session.get(key);
    }

    public static void setSessionAttribute(String key, Object value) {
        Map<String, Object> session = ActionContext.getContext().getSession();
        session.put(key, value);
    }
}
