package com.poojahomecare.service;

import java.util.List;

import com.poojahomecare.entity.Booking;

public interface BookingService {

    Booking saveBooking(Booking booking);

    List<Booking> getAllBookings();

}