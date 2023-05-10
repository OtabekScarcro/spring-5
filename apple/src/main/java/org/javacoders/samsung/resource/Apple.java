package org.javacoders.samsung.resource;

import org.javacoders.samsung.model.Device;
import org.javacoders.samsung.model.Devices;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/apple")
public class Apple {

    @RequestMapping("/devices")
    public Devices getDevices(){
        List<Device> devices = new ArrayList<Device>();
        devices.add(new Device("Ipad 2019", "Tablet"));
        devices.add(new Device("Iphone X", "SmartPhone"));

        Devices devicesList = new Devices(devices);
        return devicesList;
    }
}
