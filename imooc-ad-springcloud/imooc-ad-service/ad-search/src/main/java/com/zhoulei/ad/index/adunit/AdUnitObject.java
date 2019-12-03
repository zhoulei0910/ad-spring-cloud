package com.zhoulei.ad.index.adunit;

import com.zhoulei.ad.index.adplan.AdPlanObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdUnitObject {

    private Long unitId;
    private Integer unitStatus;
    private Integer positionType;
    private Long planId;

    private AdPlanObject adPlanObject;

    void update(AdUnitObject newObject){
        if (null != newObject.getUnitId()){
            this.unitId = newObject.getUnitId();
        }
        if (null != newObject.getUnitStatus()){
            this.unitStatus = newObject.getUnitStatus();
        }
        if (null != newObject.getPositionType()){
            this.positionType = newObject.getPositionType();
        }
        if (null != newObject.getPlanId()){
            this.planId = newObject.getPlanId();
        }
    }
}
