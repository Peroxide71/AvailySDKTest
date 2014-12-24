package test;

import backend.core.*;
import backend.mobilebackend.model.AvailabilityStates;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Стас on 20.11.2014.
 */
public class Starter {
    public static void main(String[] args){
        final List<Object> objs = new ArrayList<Object>();
        objs.add("stasik.stas33@gmail.com");
        CloudBackendMessaging mCloudBackend = new CloudBackendMessaging();
        mCloudBackend.listStatuses(new CloudBackendAsync.AvailyStatusCallback() {
            @Override
            public void onReceive(Map<String, AvailabilityStates> results) {
                System.out.println(results);
            }
        }, objs);
    }
}
