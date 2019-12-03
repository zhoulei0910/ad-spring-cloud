package com.zhoulei.ad.index.adplan;

import com.zhoulei.ad.index.IndexAware;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
@Component
public class AdPlanIndex implements IndexAware<Long,AdPlanObject> {

    private static Map<Long,AdPlanObject> objectMap;
    static {
        objectMap = new ConcurrentHashMap<>();
    }

    @Override
    public AdPlanObject get(Long key) {
        return objectMap.get(key);
    }

    @Override
    public void add(Long key, AdPlanObject value) {
        log.info("before add:{}",objectMap);
        objectMap.put(key,value);
        log.info("after add:{}",objectMap);
    }

    @Override
    public void update(Long key, AdPlanObject value) {
        log.info("before update:{}",objectMap);
        AdPlanObject oldAdPlan = objectMap.get(key);
        if (null == oldAdPlan){
            objectMap.put(key,value);
        }else {
            oldAdPlan.update(value);
        }
        log.info("after uodate: {}",objectMap);
    }

    @Override
    public void delete(Long key, AdPlanObject value) {
        log.info("before delete:{}",objectMap);
        objectMap.remove(key);
        log.info("after delete:{}",objectMap);
    }
}
