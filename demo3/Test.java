package com.statics.demo.controller.common.y201903.d6;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xuwencong on 2019/3/13
 */
public class Test {
    public static void main(String[] args) throws JSONException {
        String data = "[{'username':'AllenZhang','job':'programer'},{'username':'PonyMa','job':'CEO'},{'username':'AllenZhang','job':'programer'},{'username':'JackMa','job':'CEO'}]";

        JSONArray jsonArray = new JSONArray(data);

        List<String> list = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            list.add(jsonObject.toString()); //将json每个元素存入list
        }
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            int flag = list.indexOf(jsonObject.toString());//如果有重复的，下标就和初始位置不同
            if (flag == i) {
                System.out.println("没重复");
            } else {
                System.out.println("有重复,退出");
                break;
            }
        }

    }
}
