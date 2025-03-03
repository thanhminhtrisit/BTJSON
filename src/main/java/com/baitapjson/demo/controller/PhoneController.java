package com.baitapjson.demo.controller;

import com.baitapjson.demo.entity.PhoneEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/phone")
public class PhoneController {
    @GetMapping
    public List<PhoneEntity> getSmartphones() {
        // Giả lập dữ liệu
        PhoneEntity pova6 = new PhoneEntity();
        pova6.setId(1L);
        pova6.setName("TECNO Pova 6 - RAM 8+8GB - 256GB");
        pova6.setBrand("TECNO");
        pova6.setPrice(5299000);
        pova6.setRating(5.0);
        pova6.setDescription("Điện thoại cấu hình mạnh, pin trâu, camera chất lượng.");
        pova6.setImages(Arrays.asList(
                "https://example.com/pova6-gray.jpg",
                "https://example.com/pova6-back.jpg",
                "https://example.com/pova6-blue.jpg"
        ));
        pova6.setPromotion("Miễn phí vận chuyển + Voucher 200K");
        pova6.setCategory("Smartphone");

        return Arrays.asList(pova6);
    }
}
