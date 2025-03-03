package com.baitapjson.demo.controller;

import com.baitapjson.demo.entity.CameraEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/cameralist")
public class CameraController {
    @GetMapping
    public List<CameraEntity> getCameraList() {
        List<CameraEntity> cameraList = new ArrayList<>();

        cameraList.add(new CameraEntity(
                1L,
                "Camera IP 360 Độ 3MP IMOU TA....",
                "IMOU",
                470000,
                "https://example.com/image1.jpg",
                4.9,
                "Camera giám sát ngoài trời, độ phân giải Full HD",
                2.7,
                "Camera"
        ));
        cameraList.add(new CameraEntity(
                2L,
                "Camera IP Wifi Ngoài Trời Ezviz C6N 1080p ....",
                "Ezviz",
                799000,
                "https://example.com/image2.jpg",
                4.8,
                "Camera quay quét 360°, độ phân giải Full HD",
                10,
                "Camera"
        ));

        return cameraList;
    }
}
