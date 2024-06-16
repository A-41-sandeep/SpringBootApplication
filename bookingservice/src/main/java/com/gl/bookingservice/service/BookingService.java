package com.gl.bookingservice.service;

import com.gl.bookingservice.DTO.NewBookingDTO;
import com.gl.bookingservice.entity.Booking;
import com.gl.bookingservice.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService {

    @Autowired
    BookingRepository bookingRepository;
    public String createBooking(NewBookingDTO newBookingDTO) {
        List<Integer> rids=newBookingDTO.getRids();
        rids.forEach(rid -> {
        Booking booking=new Booking();
        booking.setRid(rid);
        booking.setUid(newBookingDTO.getUid());

        bookingRepository.save(booking);
        });

        return "Booking successfully created";
    }

    public List<Booking> getBookings() {
        return bookingRepository.findAll();
    }

    public Optional<Booking> getBooking(int bid) {
        return bookingRepository.findById(bid);
    }

    public String deleteBooking(int bid) {
        bookingRepository.deleteById(bid);
        return "booking deleted";
    }
}
