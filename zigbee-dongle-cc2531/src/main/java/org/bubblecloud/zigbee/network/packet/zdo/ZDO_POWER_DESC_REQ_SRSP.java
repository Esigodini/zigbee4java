/*
   Copyright 2008-2013 ITACA-TSB, http://www.tsb.upv.es/
   Instituto Tecnologico de Aplicaciones de Comunicacion 
   Avanzadas - Grupo Tecnologias para la Salud y el 
   Bienestar (TSB)


   See the NOTICE file distributed with this work for additional 
   information regarding copyright ownership

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

package org.bubblecloud.zigbee.network.packet.zdo;

import org.bubblecloud.zigbee.network.packet.ResponseStatus;
import org.bubblecloud.zigbee.network.packet.ZToolCMD;
import org.bubblecloud.zigbee.network.packet.ZToolPacket;
import org.bubblecloud.zigbee.util.DoubleByte;

/**
 * @author <a href="mailto:chris@cd-jackson.com">Chris Jackson</a>
 */
public class ZDO_POWER_DESC_REQ_SRSP extends ZToolPacket/* implements IRESPONSE,IZDo*/ {
    /// <name>TI.ZPI1.ZDO_POWER_DESC_REQ_SRSP.Status</name>
    /// <summary>Status</summary>
    public int Status;

    /// <name>TI.ZPI1.ZDO_POWER_DESC_REQ_SRSP</name>
    /// <summary>Constructor</summary>
    public ZDO_POWER_DESC_REQ_SRSP() {
    }

    public ZDO_POWER_DESC_REQ_SRSP(int[] framedata) {
        this.Status = framedata[0];
        super.buildPacket(new DoubleByte(ZToolCMD.ZDO_POWER_DESC_REQ_SRSP), framedata);
    }

    @Override
    public String toString() {
        return "ZDO_POWER_DESC_REQ_SRSP{" +
                "Status=" + ResponseStatus.getStatus(Status) +
                '}';
    }
}
