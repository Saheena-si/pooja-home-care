package com.poojahomecare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.poojahomecare.entity.Booking;
import com.poojahomecare.service.BookingService;

@Controller
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping("/book")
    public String saveBooking(Booking booking) {

        bookingService.saveBooking(booking);

        return "redirect:/";

    }

}